package com.haih.server.utils;

import javax.servlet.http.Cookie;

public class CookieUtil {

	public static String getCookie(Cookie[] cookies,String cookieName) {
		String cookieValue = null;
		
		if(null != cookies && cookies.length > 0){
			for (Cookie cookie : cookies) {
				if(cookieName.equals(cookie.getName())){
					cookieValue = cookie.getValue();
				}
			}
		}
		return cookieValue; 
	}
	
	public static Cookie generateCookie(String cookieName, String cookieValue){
		Cookie cookie = new Cookie(cookieName, cookieValue);
		cookie.setHttpOnly(true);
		cookie.setSecure(true);
		cookie.setPath("/");
		cookie.setMaxAge(-1);
		
		return cookie;
	}
}
