package Programs;

import java.util.Scanner;

public class PerfectNumber 
{
	static int div;
	static int sum;
	static void Perfect(int numb)
	{
		for(int i=1;i<6;i++) 
		{
			if(numb%i==0)
			{
				sum= sum+i;
			}
		}
		
		if(numb==sum)
		{
			System.out.println("perfect");
		}
		else {
			System.out.println("not perfect");
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter  number");
		int num=sc.nextInt();
		Perfect(num);
		

	}

}
