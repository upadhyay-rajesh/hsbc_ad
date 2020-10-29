package com.facebook.view;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.facebook.controller.FacebookController;
import com.facebook.controller.FacebookControllerInterface;

public class FacebookView {

	public static void main(String[] args) throws Exception {
		System.out.println("****************MAIN MENU************");
		System.out.println("press 1 to create profile");
		System.out.println("press 2 to view profile");
		System.out.println("press 3 to delete profile");
		System.out.println("press 4 to search profile");
		System.out.println("press 5 to view all profile");
		System.out.println("press 6 to edit profile");

		// take input from user using bufferedreader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter your choice");
		String c = br.readLine();
		int c1 = Integer.parseInt(c);
		
		FacebookControllerInterface fc=FacebookController.createObject();

		switch (c1) {
		case 1:
			fc.createProfile();
			break;
		case 2:
			fc.viewProfile();
			break;
		case 3:
			fc.deleteProfile();
			break;
		case 4:
			fc.searchProfile();
			break;
		case 5:
			fc.viewallProfile();
			break;
		case 6:
			fc.editProfile();
			break;
		default:
			System.out.println("wrong choice");
		}

	}

}
