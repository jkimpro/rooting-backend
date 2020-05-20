//package com.rooting.best.config.session;
//
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//import javax.servlet.FilterChain;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRequest;
//import javax.servlet.ServletResponse;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.apache.commons.lang3.StringUtils;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.core.annotation.Order;
//import org.springframework.stereotype.Component;
//import org.springframework.util.ObjectUtils;
//import org.springframework.web.filter.GenericFilterBean;
//
//import com.google.gson.Gson;
//
//
//@Component
//@Order(1)
//public class SessionInfoFilter extends GenericFilterBean {
//
//    private Logger log = LoggerFactory.getLogger(getClass());
//
//    @Value("${ui.session.header.key}")
//    private String headerSessionKey;
//
//    @Value("${ui.session.timeout.key}")
//    private String sessionTimeoutKey;
//
//    @Value("${ui.session.timeout.min}")
//    private long sessionTimeout;
//
//    @Value("${cipher.aes256.key}")
//    private String cipherKey;
//
//    @Value("${api.except.uri}")
//    private String apiExceptUri;
//
//    @Value("${api.session.token}")
//    private String apiSessionToken;
//
//    @Override
//    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//        HttpServletRequest request = (HttpServletRequest)servletRequest;
//        HttpServletResponse response = (HttpServletResponse)servletResponse;
//        String uri = request.getRequestURI();
//        log.info("====< uri : " + uri);
//        if(isSessionUri(request)) {
//            String encSession = request.getHeader(headerSessionKey);
//            log.info("====< encSession : " + encSession);
//
//            if(ObjectUtils.isEmpty(encSession))
//                encSession = apiSessionToken;
//
//            HttpFrontRequest frontReqest = new HttpFrontRequest(request);
//
//            // TODO : session 정보 정리되면 아래 분기처리 삭제 해야됨
//            if(!ObjectUtils.isEmpty(encSession)) {
//                if(StringUtils.isBlank(encSession)) {
//                    setUnauthorizedResponse(response);
//                    return;
//                }
//
//                String decSession = null;
//                SessionVo sessionVo = new Gson().fromJson(decSession, SessionVo.class);
//                frontReqest.setSessionVo(sessionVo);
//            }
//
//            filterChain.doFilter(frontReqest, servletResponse);
//        } else {
//            filterChain.doFilter(servletRequest, servletResponse);
//        }
//    }
//
//    private boolean isSessionUri(HttpServletRequest request) {
//        String uri = request.getRequestURI();
//
//        if(ObjectUtils.isEmpty(uri))
//            return false;
//
//        if(!uri.startsWith("/web"))
//            return false;
//
//        if(isMultipart(request))
//            return false;
//
//        boolean isExcept = false;
//        List<String> exceptUris = Arrays.asList(apiExceptUri.split(":"));
//        for(String exceptUri : exceptUris) {
//            if(uri.indexOf(exceptUri) > -1) {
//                isExcept = true;
//                break;
//            }
//        }
//        if(isExcept)
//            return false;
//
//        return true;
//    }
//
//    private void setUnauthorizedResponse(HttpServletResponse response) throws IOException {
//        response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
//        response.setContentType("application/json");
//        response.getWriter().print("{\"code\":\"401\", \"message\":\"Unauthorized Access.\"}");
//        response.getWriter().flush();
//    }
//
//    private void setForbiddenResponse(HttpServletResponse response) throws IOException {
//        response.setStatus(HttpServletResponse.SC_FORBIDDEN);
//        response.setContentType("application/json");
//        response.getWriter().print("{\"code\":\"403\", \"message\":\"Session Timeout.\"}");
//        response.getWriter().flush();
//    }
//
//    private boolean isMultipart(HttpServletRequest request) {
//        boolean result = false;
//        String multipart = "multipart/form-data";
//
//        if(!StringUtils.isBlank(request.getContentType()) && request.getContentType().toLowerCase().indexOf(multipart) > -1) {
//            result = true;
//        }
//
//        return result;
//    }
//
//}