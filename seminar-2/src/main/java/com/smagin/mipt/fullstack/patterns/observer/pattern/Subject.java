/**
 * 
 */
package com.smagin.mipt.fullstack.patterns.observer.pattern;


public interface Subject {
	
	//methods to register user as an facebook friend observers
	public void registerAsAFriend(Observer friendRequest);
	
	//methods to unregister user from facebook friend observers
	public void unregisterFromFriend(Observer removeFriend);
	
	//method to notify observers i.e. facebook friends of change
	public void notifyFacebookFriends();
	
	//method to get updates from subject
	public Object getUpdate(Observer obj);
	
}
