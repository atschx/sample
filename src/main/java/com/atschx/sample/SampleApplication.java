package com.atschx.sample;

import com.atschx.sample.conf.ApiDispatcherServletConfig;
import com.atschx.sample.conf.AppDispatcherServletConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

@SpringBootApplication
public class SampleApplication extends SpringBootServletInitializer {


    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SampleApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(SampleApplication.class, args);
    }


    @Bean
    public ServletRegistrationBean app() {

        final ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean();


        DispatcherServlet app = new DispatcherServlet();
        app.setContextClass(AnnotationConfigWebApplicationContext.class);
        app.setContextConfigLocation(AppDispatcherServletConfig.class.getName());

        servletRegistrationBean.setServlet(app);
        servletRegistrationBean.setLoadOnStartup(1);
        servletRegistrationBean.setAsyncSupported(true);
        servletRegistrationBean.addUrlMappings("/app/**");
        servletRegistrationBean.setName("app");
        servletRegistrationBean.setOrder(2);

        return servletRegistrationBean;
    }


    @Bean
    public ServletRegistrationBean api() {

        final ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean();


        DispatcherServlet app = new DispatcherServlet();
        app.setContextClass(AnnotationConfigWebApplicationContext.class);
        app.setContextConfigLocation(ApiDispatcherServletConfig.class.getName());

        servletRegistrationBean.setServlet(app);
        servletRegistrationBean.setLoadOnStartup(1);
        servletRegistrationBean.setAsyncSupported(true);
        servletRegistrationBean.addUrlMappings("/api/**");
        servletRegistrationBean.setName("api");
        servletRegistrationBean.setOrder(2);

        return servletRegistrationBean;
    }
}
