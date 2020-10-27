package com.facebook.service;

import com.facebook.entity.FacebookUser;

public interface FacebookServiceInterface {
	public int createProfile(FacebookUser f)throws Exception;
	public void viewProfile();
	public void editProfile();
	public void searchProfile();
	public void viewallProfile();
	public void deleteProfile();
}
