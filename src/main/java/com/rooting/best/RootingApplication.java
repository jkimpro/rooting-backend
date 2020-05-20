package com.rooting.best;

import com.rooting.best.controller.mobile.RootingMobileConfig;
import com.rooting.best.controller.web.RootingWebConfig;
import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

@SpringBootApplication
public class RootingApplication {
    public static void main(String [] args){
        new SpringApplicationBuilder().bannerMode(Banner.Mode.CONSOLE).sources(RootingApplication.class).properties("spring.config.location="
                + "classpath:/domain.yml"
                + ", classpath:/application.yml"
                + ", classpath:/application.properties").run(args);
    }

    @Bean
    public ServletRegistrationBean web() {
        DispatcherServlet dispatcherServlet = new DispatcherServlet();
        AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();
        applicationContext.register(RootingWebConfig.class);
        dispatcherServlet.setApplicationContext(applicationContext);

        ServletRegistrationBean servletRegBean = new ServletRegistrationBean(dispatcherServlet);
        servletRegBean.addUrlMappings("/web/*");
        servletRegBean.setName("web");
        return servletRegBean;
    }

    @Bean
    public ServletRegistrationBean mobile() {
        DispatcherServlet dispatcherServlet = new DispatcherServlet();
        AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();
        applicationContext.register(RootingMobileConfig.class);
        dispatcherServlet.setApplicationContext(applicationContext);

        ServletRegistrationBean servletRegBean = new ServletRegistrationBean(dispatcherServlet);
        servletRegBean.addUrlMappings("/mobile/*");
        servletRegBean.setName("mobile");
        return servletRegBean;
    }

}
