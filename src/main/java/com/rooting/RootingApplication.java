package com.rooting;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.DispatcherServlet;

@SpringBootApplication
public class RootingApplication {
    public static void main(String [] args){
      //  new SpringApplicationBuilder().bannerMode(Banner.Mode.CONSOLE).properties().run();
        SpringApplication.run(RootingApplication.class, args);
    }

}
