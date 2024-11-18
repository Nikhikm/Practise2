package Programs;

import java.util.Scanner;

//Write a Java Program to check if a number is Armstrong number or not.
public class armstrongDynamic 
{
	static void Armstrong(int Actnum) 
	{
		int realnum = Actnum;
		int res=0;
		while(realnum !=0) 
		{
			int rem = realnum%10;
			res = res + (rem*rem*rem);
			realnum = realnum/10;
			
		}
		if (Actnum ==res) {
			System.out.println("I am Armstrong");
		}
		else {
			System.out.println("I am not Armstrong");
		}
		
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number");
		int num=sc.nextInt();
		Armstrong(num);
		

	}

}
