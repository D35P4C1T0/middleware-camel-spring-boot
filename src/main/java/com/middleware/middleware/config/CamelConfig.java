package com.middleware.middleware.config;

import org.apache.camel.component.servlet.CamelHttpTransportServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

//@Configuration
//public class CamelConfig {
//    @Bean
//    public ServletRegistrationBean<CamelHttpTransportServlet> camelServletRegistrationBean() {
//        return new ServletRegistrationBean<>(new CamelHttpTransportServlet(), "/*");
//    }
//}