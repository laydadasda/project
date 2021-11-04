package com.kuilian.books.config;

import com.kuilian.books.converter.MyConverter;
import com.kuilian.books.handlerInterceptor.MyHandlerInterceptor;
import com.kuilian.books.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;



@Configuration
public class Myconfig implements WebMvcConfigurer {
    @Bean
    public User user(){
        return new User();
    }
    @Autowired
    private MyConverter myConverter;
    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(myConverter);
    }
    @Autowired
    private MyHandlerInterceptor myHandlerInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(myHandlerInterceptor).addPathPatterns("/**");
    }
}
