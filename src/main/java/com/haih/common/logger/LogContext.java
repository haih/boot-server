/**
 * 
 */
package com.haih.common.logger;

/**
 * @author haih
 *
 */
public class LogContext {
	private static InheritableThreadLocal<String> tracking = new InheritableThreadLocal<>();
	
	public static void setTrackingid(final String trackingid){
		tracking.set(trackingid);
	}
	
	public static String getTrackingid(){
		return (String) tracking.get();
	}
	
}
