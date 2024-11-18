package Programs;

import java.util.Scanner;

public class DynamicArray {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the length of array");
		int leng=sc.nextInt();
		int[] array = new int[leng];
		System.out.println("enter the elements in the array");
		for(int i=0;i<leng;i++) 
		{
			array[i]=sc.nextInt();
		}
		
		System.out.println("array elements are");
		for(int i=0;i<leng;i++)
		{
			System.out.println(array[i]);
		}
		

	}

}
