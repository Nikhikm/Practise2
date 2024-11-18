package Programs;

import java.util.Scanner;

public class LargestnumberinArray {

	public static void main(String[] args) 
	{
		System.out.println("Enter array length");
		Scanner sc = new Scanner(System.in);
		int length =sc.nextInt();
		int array[]= new int[length];
		
		System.out.println("please enter the arrayelements ");
		for(int i=0;i<length;i++) 
		{
			array[i]=sc.nextInt();
		}
		
		for(int i=0;i<length;i++) 
		{
			System.out.println(array[i]);
		}
		
		int max = array[0];
		for(int i=0;i<length;i++) 
		{
			if(array[i]>max) 
			{
				max= array[i];
			}
		}
        System.out.println("The maximum is");
		System.out.println(max);
	}

}
