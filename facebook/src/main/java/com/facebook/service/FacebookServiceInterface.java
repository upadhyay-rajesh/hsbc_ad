package com.facebook.service;

import com.facebook.entity.FacebookUser;

public interface FacebookServiceInterface {
	public int createProfile(FacebookUser f);
	public void viewProfile();
	public void editProfile();
	public void searchProfile();
	public void viewallProfile();
	public int deleteProfile(FacebookUser f)throws Exception;
}
