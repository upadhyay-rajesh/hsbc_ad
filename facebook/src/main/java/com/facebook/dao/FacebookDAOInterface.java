package com.facebook.dao;

import com.facebook.entity.FacebookUser;

public interface FacebookDAOInterface {
	public int createProfileDAO(FacebookUser f);

	public int deleteProfileDAO(FacebookUser f)throws Exception;
}
