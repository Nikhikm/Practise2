package Programs;

import java.util.Scanner;

public class ProgramTest
{
	static boolean flag;
	static void primeChecks(int num ) 
	{
		if(num<=0)
		{
			flag= false;
		}
		
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				flag=false;
			}
		}
		if(flag==false)
		{
			System.out.println("Given number is not a Prime");
		}
		else 
		{
			System.out.println("Given number is a Prime");
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please provide the number");
		int value=sc.nextInt();
		primeChecks(value);
	}

}
