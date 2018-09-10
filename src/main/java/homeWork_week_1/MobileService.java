package homeWork_week_1;

import java.util.Scanner;

public class MobileService {

	public static void main(String[] args) {
		int num;
		System.out.println("enter the first three digit of the num");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		if(num==944)
		{
		System.out.println("the service of num is BSNL");
		}
		else if(num==900)
		{
			System.out.println("the service is Airtel");
		}
		else if(num==897)
		{
			System.out.println("the service is Idea");
		}
		else if(num==630)
		{
			System.out.println("the service is Jio");
		}
		else
		{
			System.out.println("the value is invalid");
		}
		

	}

}
