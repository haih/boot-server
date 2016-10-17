package com.haih.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.ModelAndView;

@SuppressWarnings("serial")
public class myDispatcherServlet extends DispatcherServlet{
		
	@Override
	protected ModelAndView processHandlerException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
	            throws Exception{
		ModelAndView exMv = null;
		return exMv;
	}
}
