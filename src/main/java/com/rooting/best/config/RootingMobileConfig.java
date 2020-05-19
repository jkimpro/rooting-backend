package com.rooting.best.config;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.mvc.annotation.ModelAndViewResolver;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;


@Configuration
@ComponentScan
public class RootingMobileConfig extends WebMvcConfigurationSupport {
    @Autowired
    private Environment env;

    @Override
    public RequestMappingHandlerAdapter requestMappingHandlerAdapter() {
        //RequestMappingHandlerAdapter requestMappingHandlerAdapter = super.requestMappingHandlerAdapter();
        RequestMappingHandlerAdapter requestMappingHandlerAdapter = new RequestMappingHandlerAdapter();
        List<HandlerMethodArgumentResolver> argumentResolvers = new ArrayList<>();

//        //ArgumentResolver
//        RiaDataArgumentResolver riaDataArgumentResolver = new RiaDataArgumentResolver();
//        riaDataArgumentResolver.setRiaAdapter(dataMiplatformAdapter());
//        argumentResolvers.add(riaDataArgumentResolver);
//
//        RiaDatasetArgumentResolver riaDatasetArgumentResolver = new RiaDatasetArgumentResolver();
//        riaDatasetArgumentResolver.setRiaAdapter(dsMiplatformAdapter());
//        argumentResolvers.add(riaDatasetArgumentResolver);
//
//        RiaVariableArgumentResolver riaVariableArgumentResolver = new RiaVariableArgumentResolver();
//        riaVariableArgumentResolver.setRiaAdapter(variableArgumentAdapter());
//        argumentResolvers.add(riaVariableArgumentResolver);
//        requestMappingHandlerAdapter.setCustomArgumentResolvers(argumentResolvers);
//
//        // WebBinding
//        //requestMappingHandlerAdapter.setWebBindingInitializer(getConfigurableWebBindingInitializer());
//        //requestMappingHandlerAdapter.setWebBindingInitializer(egovBindingInitializer());
//
//        // ViewResolver
//        MiplatformModelAndViewResolver miplatformModelAndViewResolver = new MiplatformModelAndViewResolver();
//        miplatformModelAndViewResolver.setDefaultView("miplatformView");
//
//        List<ModelAndViewResolver> modelAndViewResolvers = new ArrayList<>();
//        modelAndViewResolvers.add(miplatformModelAndViewResolver);
//        requestMappingHandlerAdapter.setModelAndViewResolvers(modelAndViewResolvers);

        return requestMappingHandlerAdapter;
    }

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**").allowCredentials(false).allowedOrigins("*").allowedMethods("GET", "POST", "OPTIONS");
    }

//    @Bean
//    public SftpUtil sftpUtil() {
//        SftpUtil sftpUtil = new SftpUtil();
//        sftpUtil.setUrl(env.getProperty("sftp.url"));
//        sftpUtil.setUsr(env.getProperty("sftp.usr"));
//        sftpUtil.setKey(env.getProperty("sftp.key"));
//        sftpUtil.setPwd(env.getProperty("sftp.pwd"));
//        sftpUtil.setPhrase(env.getProperty("sftp.phrase"));
//        sftpUtil.setPromptPwd(Boolean.parseBoolean(env.getProperty("sftp.promptPwd")));
//        sftpUtil.setPromptPhrase(Boolean.parseBoolean(env.getProperty("sftp.promptPhrase")));
//        sftpUtil.setPromptYN(Boolean.parseBoolean(env.getProperty("sftp.promptYN")));
//        return sftpUtil;
//    }
}