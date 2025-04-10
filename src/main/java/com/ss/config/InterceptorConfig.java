package com.ss.config;

import com.ss.interceptor.JwtValidateInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer {
    @Autowired
    private JwtValidateInterceptor jwtValidateInterceptor;
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        InterceptorRegistration registration=registry.addInterceptor(jwtValidateInterceptor);
        registration.addPathPatterns("/**")
                .excludePathPatterns(
                        "/student/classScore",
                        "/student/chart/{id}",
                        "/student/list",
                        "/student/excellentScore",
                        "/student/maxRank",
                        "/student/scorecharts/{sno}",
                        "/student/lessonCharts/{sno}",
                        "/student/lessonArrange/{sno}",
                        "/student/lessonCount/{sno}",
                        "/student/getTeacher/{sclass}",
                        "/student/getHonor/{sno}",
                        "/student/getHonor1/{sno}",
                        "/student/Interest/{sno}",
                        "/student/tag/{sno}",
                        "/teacher/list",
                        "/student/getMBTI/{sno}",
                        "/student/getTechnique/{sno}",
                        "/student/AdvantageCount/{sno}",
                        "/student/Advantage/{sno}",
                        "/student/employment/{sno}",
                        "/error"
                );
    }
}
