package Programs;

import java.util.Scanner;

//Write a Java Program to print the sum of digits of a given integer.
public class sumOfGivenInteger
{
	static void sum(int actnum) 
	{
		int realnum= actnum;
		int count=0;
		while(realnum!=0) 
		{
			int rem = realnum%10;
			count = count+rem;
			realnum = realnum/10;
		}
		System.out.println(count);
			
		
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number");
		int num = sc.nextInt();
		sum(num);
		

	}

}
