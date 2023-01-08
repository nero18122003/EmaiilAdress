package com.gl.currency;

import java.util.Scanner;

public class currencyDenominations {
	public static void main(String args[]) {
		
		MergeSort mergeSort = new MergeSort();
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of currency denominations");
	    int size = sc.nextInt();
	
	    int[] array = new int[size];	
	    System.out.println("Enter the  " + size + " currency denominations");
    	for(int i = 0; i < size; i++) {
		    array[i] = sc.nextInt();
		    if(array[i] <= 0) {
			  System.out.println("notes cant be zero or negative");
		      i--;
		}
	}
		
    	System.out.println("Enter the total amount you want to pay");
	    int totalAmount = sc.nextInt();
 
	    mergeSort.sort(array,0,array.length-1);
	    notesCountImplementation(array,totalAmount);
	
	}
	
	private static void notesCountImplementation(int []array,int totalAmount){
		int[] noteCounter = new int[array.length];
		// notes = 10, 52, 89 ,1
		// notes = 89, 52, 10, 1 sorting in the decreasing order
		//900
		//notes 900/89 = 10 89:10
		//amount = 900-890=10
		//10/10 = 1
		//0
		
		
			for (int i = 0; i < array.length; i++) {
				if (totalAmount >= array[i]) {
					noteCounter[i] = totalAmount / array[i];
					totalAmount = totalAmount % array[i];
//					amount = amount - noteCounter[i] * notes[i];
				}
			}
			if (totalAmount > 0) {
				System.out.println("exact amount cannot be given with the highest denomination");
			} else {
				System.out.println("Your payment approach in order to give min no of notes will be");
				for (int i = 0; i < array.length; i++) {
					if (noteCounter[i] != 0) {
						System.out.println(array[i] + ":" + noteCounter[i]);
					}
				}
			}
		
	}}





	


