package com.haih.server.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.haih.server.common.interceptor.TrackingInterceptor;

public class WebConfiguration extends WebMvcConfigurerAdapter{
	
	@Autowired
	TrackingInterceptor trackingInterceptor;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(trackingInterceptor).addPathPatterns("/**").excludePathPatterns("/health");
	}

}
