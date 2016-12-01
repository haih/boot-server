/**
 * 
 */
package com.haih.testThreadLocal;

/**
 * @author haih
 *
 */
public class TestThreadLocal {

	private ThreadLocal<String> threadLocal;
	public TestThreadLocal() {
		threadLocal = new ThreadLocal<>();
		
	}
	
	public void setData(String date){
		threadLocal.set(date);
	}
	
	public String getData(){
		return threadLocal.get();
	}

	public static void main(String[] args) {
		Thread thread1 = new Thread();
		thread1.start();
	}
}
