package com.facebook.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.facebook.entity.FacebookUser;
import com.facebook.service.FacebookService;
import com.facebook.service.FacebookServiceInterface;

public class FacebookController implements FacebookControllerInterface{
	private FacebookController() {
		
	}
	
	
	public static FacebookControllerInterface createObject() {
		return new FacebookController();
	}
	
	public void createProfile() {
		try {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter name");
		String name=br.readLine();
		
		System.out.println("enter Password");
		String password=br.readLine();
		System.out.println("enter Email");
		String email=br.readLine();
		System.out.println("enter Address");
		String address=br.readLine();
		//we should transfer data from one layer to other layer via entity class object here FacebookUser is entity
		FacebookUser f=new FacebookUser();
		f.setName(name);
		f.setPassword(password);
		f.setEmail(email);
		f.setAddress(address);
		
		FacebookServiceInterface fs=new FacebookService();
		int i=fs.createProfile(f);
		
		if(i>0) {
		System.out.println("profile created successfully");
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void viewProfile() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("profile viewed");
	}

	public void deleteProfile()throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter name which you want to delete");
		String name=br.readLine();
		FacebookUser f=new FacebookUser();
		f.setName(name);
		FacebookServiceInterface fs=new FacebookService();
		int i=fs.deleteProfile(f);
		if(i>0) {
			System.out.println("profile deleted successfully");
			}
		
	}

	public void editProfile() {
		System.out.println("profile edited");
	}

	public void searchProfile() {
		System.out.println("profile searched");
	}

	public void viewallProfile() {
		System.out.println("profile vv");
	}
}
