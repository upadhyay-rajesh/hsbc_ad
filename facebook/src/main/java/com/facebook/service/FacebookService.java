package com.facebook.service;

import com.facebook.dao.FacebookDAO;
import com.facebook.dao.FacebookDAOInterface;
import com.facebook.entity.FacebookUser;

public class FacebookService implements FacebookServiceInterface{

	public int createProfile(FacebookUser f)  {
		FacebookDAOInterface fd=new FacebookDAO();
		return fd.createProfileDAO(f);
	}

	public void viewProfile() {
		// TODO Auto-generated method stub
		
	}

	public void editProfile() {
		// TODO Auto-generated method stub
		
	}

	public void searchProfile() {
		// TODO Auto-generated method stub
		
	}

	public void viewallProfile() {
		// TODO Auto-generated method stub
		
	}

	public int deleteProfile(FacebookUser f)throws Exception {
		FacebookDAOInterface fd=new FacebookDAO();
		return fd.deleteProfileDAO(f);
		
	}

}
