package com.gl.interfaces;

import com.gl.model.Employee;

public interface Credentials {
	public String generatePassword();
    public String generateEmailAddress(String firstName,String lastName,String deparment);
	void showCredentials(Employee emp);
}
