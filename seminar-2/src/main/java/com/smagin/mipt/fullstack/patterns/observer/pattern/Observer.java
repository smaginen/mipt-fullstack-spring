/**
 * 
 */
package com.smagin.mipt.fullstack.patterns.observer.pattern;


public interface Observer {
	
	public void update();
		
	public void setSubject(Subject sub);
}
