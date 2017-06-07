/**
 * 
 */
package com.haih.server.common.interceptor;

import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author haih
 *
 */
public class TrackingInterceptor implements HandlerInterceptor {

	private final static Logger logger = LoggerFactory.getLogger(TrackingInterceptor.class);
	private final static String TRACKING_ID = "trackingID";

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		request.getHeader("TRACKING_ID");
		String trackingid = UUID.randomUUID().toString();
		request.setAttribute(TRACKING_ID, trackingid);
		response.setHeader(TRACKING_ID, trackingid);
		//insert trackingid to thread local.
		MDC.put("TRACKINGID", trackingid);
		logger.info("doFilter Tracking filter");
		return false;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

}
