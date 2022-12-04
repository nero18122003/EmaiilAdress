package com.gl.service;

import java.util.Random;

import com.gl.interfaces.Credentials;
import com.gl.model.Employee;

public class CredentialService implements Credentials {

	@Override
	public String generatePassword() {
		String caps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String small = "abcdefghijklmnopqrstuvwxyz";
		String special = "!@#$%^&*><:.,";
		StringBuffer rtnValue = new StringBuffer();
		Random random = new Random();
        int rand;
		
	    for(int index=0;index<9;index++) {
	    	rand=random.nextInt(3);

	    	switch(rand) {
	    	case 0:
	    		rand = random.nextInt(caps.length());
	    		  rtnValue.append(caps.charAt(rand));
	    		break;
	    	case 1:
	    		rand = random.nextInt(small.length());
	    		  rtnValue.append(small.charAt(rand));
	    		break;
	    	case 2:
	    		rand = random.nextInt(special.length());
	    		  rtnValue.append(special.charAt(rand));
	    		break;
	    	}
	    }

		return rtnValue.toString();
	}

	@Override
	public String generateEmailAddress(String firstName, String lastName, String deparment) {
	    String rtnValue = null;
		rtnValue= firstName.toLowerCase() + lastName.toLowerCase() + "@" + deparment + ".greatlearning.com";
	    return rtnValue;
	}

	@Override
	public void showCredentials(Employee emp) {
		System.out.println(emp);
	}
   
}
