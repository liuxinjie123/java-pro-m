package com.mira.manager.config;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mira.manager.ext.intereceptors.LoginInterceptor;
import com.mira.manager.ext.jackson.Java8TimeModule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.filter.CommonsRequestLoggingFilter;
import org.springframework.web.servlet.config.annotation.*;

import javax.annotation.PostConstruct;
import javax.validation.Validator;
import java.nio.charset.Charset;
import java.util.List;

@Configuration
public class MvcConfig implements WebMvcConfigurer {
    @Autowired
    private ObjectMapper objectMapper;
    @Autowired
    private LoginInterceptor loginInterceptor;

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
//        registry.addRedirectViewController("/swagger/swagger-resources/configuration/ui", "/swagger-resources/configuration/ui");
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/static/admin/**").addResourceLocations("file:./frontend-admin/src/");
//        registry.addResourceHandler("/static/site/**").addResourceLocations("file:./frontend-site/src/");
    }




    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(loginInterceptor).addPathPatterns("/api/manager/**").excludePathPatterns("/manager/login");
    }


    //添加信息转换器
    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        converters.add(new StringHttpMessageConverter(Charset.forName("UTF-8")));
    }

    //JSR-303
    @Bean(name = "validator")
    public Validator createBeanValidator() {
        return new LocalValidatorFactoryBean();
    }

    @PostConstruct
    private void jacksonConfig() {
        objectMapper.registerModule(new Java8TimeModule());
        objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
    }

    @Bean
    public CommonsRequestLoggingFilter requestLoggingFilter() {
        CommonsRequestLoggingFilter filter = new CommonsRequestLoggingFilter();
        filter.setIncludeClientInfo(true);
        filter.setIncludeQueryString(true);
        filter.setIncludePayload(true);
        filter.setIncludeHeaders(true);
        filter.setMaxPayloadLength(5120);
        return filter;
    }
}
