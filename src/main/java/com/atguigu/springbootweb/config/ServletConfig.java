package com.atguigu.springbootweb.config;

import com.atguigu.springbootweb.servlet.Myservlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServletConfig {

    //注册servlet
    @Bean
    public ServletRegistrationBean myServlet()
    {
        ServletRegistrationBean registrationBean=new ServletRegistrationBean(new Myservlet(),"/myservlet");

        return registrationBean;
    }

}
