/**
 * 
 */
package com.smagin.mipt.fullstack.patterns.observer.pattern;


public class FacebookFriend implements Observer {
	
	private String friendName;
	private Subject facebookPost;
	
	public FacebookFriend(String friendName){
		this.friendName = friendName;
	}

	@Override
	public void update() {
		String comment = (String) facebookPost.getUpdate(this);
		if(comment == null){
			System.out.println(friendName+":: No new comment");
		}else{
			System.out.println(friendName+":: New comment::"+comment);
		}
	}

	@Override
	public void setSubject(Subject facebookPost) {
		this.facebookPost = facebookPost;
	}

}
