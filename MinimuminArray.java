package Programs;

import java.util.Scanner;

public class MinimuminArray {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Length of the arrray");
		int length=sc.nextInt();
		int Array[] = new int[length];
		System.out.println("provide array elements ");
		
		for(int i=0;i<length;i++) 
		{
			System.out.println("value of"+ i +"is");
			Array[i]= sc.nextInt();
			
		}
		
		for(int i=0;i<length;i++) 
		{
			System.out.println(Array[i]);
			
		}
		
		int min=Array[0];
		for(int i=0;i<length;i++) 
		{
			if(min>Array[i])
			{
				min= Array[i];
			}
		}
		
		System.out.println("min value is "+min);

	}

}
