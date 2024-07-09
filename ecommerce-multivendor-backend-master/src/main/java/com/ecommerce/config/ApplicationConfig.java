package com.ecommerce.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.ecommerce.interceptor.RequestHeaderInterceptor;


// for interceptor
@Configuration
public class ApplicationConfig implements WebMvcConfigurer {
	
	@Autowired
	private RequestHeaderInterceptor requestHeaderInterceptor;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(requestHeaderInterceptor);
	}
// This means that every HTTP request handled by the Spring MVC framework
// will pass through this interceptor.
//	Interceptors are useful for tasks like logging, authentication, adding custom headers, etc.,
//	before or after the actual execution of handler methods in controllers.
//	In this case, RequestHeaderInterceptor likely intercepts and modifies
//	HTTP headers for incoming requests.
}
