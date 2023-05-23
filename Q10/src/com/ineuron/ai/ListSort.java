package com.ineuron.ai;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListSort {
	static Scanner scanner = new Scanner(System.in);
	
	static Integer num = scanner.nextInt();
	static List<Integer> list = new ArrayList<>();


	public static void main(String[] args) {

		
		System.out.println("enter the numbers you wish to add to the list array::");
		System.out.println("please press 19 to end numbers ");
while (num!=19) {
	list.add(num);	
}System.out.println(list);
	
}

	}


