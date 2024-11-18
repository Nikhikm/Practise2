package Programs;

import java.util.Scanner;

public class FindEveninArray 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter length of the array");
		int length =sc.nextInt();
		int Array[]= new int[length];
		System.out.println("Please enter array elements");
		for(int i=0;i<Array.length;i++) 
		{
			Array[i]= sc.nextInt();
		}
		
		for(int i=0;i<Array.length;i++) 
		{
			if(Array[i]%2==0) 
			{
				System.out.println(Array[i]+ "is even number");
			}
			else
			{
				System.out.println(Array[i]+ "is odd number");
			}
		}
	}

}
