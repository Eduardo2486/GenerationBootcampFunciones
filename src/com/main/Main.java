package com.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Type your name: ");
		String name = input.nextLine();
		System.out.println(greetings(name));
		input.close();
	}
	public static String greetings(String greeting) {
		return "hello, "+ greeting; 
	}
}
