package com.training.co;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args)  {
			for (int i=0;i < 7;i++) 
			{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter day number:");
		int dayNum = sc.nextInt();
		switch (dayNum) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;

		default:
			System.out.println("Invalid");
			break;
		}
		
		}
		}
	}

		