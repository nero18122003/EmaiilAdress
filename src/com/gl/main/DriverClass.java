package com.gl.main;
import java.util.Scanner;

public class DriverClass {
	
	
			public static void main(String[] args) {
			

				System.out.println("Enter the size of array");
				
				Scanner sc = new Scanner(System.in);
				int size = sc.nextInt();
				
				System.out.println("Enter the  " + size + " elements");
				
				int[] array = new int[size];
				
				for(int i = 0; i < size; i++) {
					array[i] = sc.nextInt();
				}
				
				System.out.println("Enter the total number of target that needs to be achived");
				int numberOfTarget = sc.nextInt();
				 if(numberOfTarget == 0)
				 {
					 System.out.println("enter more than zero");
				 }
				
				while(numberOfTarget > 0)
				{
					int flag = 0;
				System.out.println("Enter the value of target");
				int target = sc.nextInt();
				
				long sum = 0;
				
				for(int i = 0;i < size;i++)
				{
				    sum = sum + array[i];
				    if(sum >= target)
				    {
				    	System.out.println("Target achived after " + (i+1) + " transactions");
				    	flag = 1;
				    break;
				    }
				}
				if(flag == 0)
				{
				   System.out.println("Given target is not acvhived");
				}
				
				   numberOfTarget--;
				}
					sc.close();
				
	  
	}
	}


