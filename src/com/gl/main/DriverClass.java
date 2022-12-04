package com.gl.main;

import java.util.Scanner;

import com.gl.interfaces.Credentials;
import com.gl.model.Employee;
import com.gl.service.CredentialService;

public class DriverClass {
       public static void main(String[] args) {
    	   Employee emp = new Employee("Harsh","Singh");
    	   Credentials cred = new CredentialService();
    	   Scanner sc=new Scanner(System.in);
    	   System.out.println("1.Technical");
    	   System.out.println("1.Human Resource");
    	   System.out.println("1.Admin");
    	   System.out.println("1.Legal");
    	   System.out.println("Select Department ");
           int dept = sc.nextInt();
           
           switch(dept) {
           case 1:
        	   emp.setEmail(cred.generateEmailAddress(emp.getFirstName(), emp.getLastName(), "tech"));
        	   break;
           case 2:
        	   emp.setEmail(cred.generateEmailAddress(emp.getFirstName(), emp.getLastName(), "hr"));
        	   break;
           case 3:
        	   emp.setEmail(cred.generateEmailAddress(emp.getFirstName(), emp.getLastName(), "ad"));
        	   break;
           case 4:
        	   emp.setEmail(cred.generateEmailAddress(emp.getFirstName(), emp.getLastName(), "legal"));
        	   break;
           default :
        	   System.out.println("You have entered wrong choice");
           }
           emp.setPassword(cred.generatePassword());
           cred.showCredentials(emp);
           
           sc.close();
           
       }
}
