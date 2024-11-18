package Programs;

import java.util.Scanner;

public class PrintEven {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Number please");
		int num=sc.nextInt();
		if(num%2==0) 
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("Not Even");
		}

	}

}
