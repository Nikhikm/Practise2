package Programs;

import java.util.Scanner;

public class ParticularStringLength {
	static int count;

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the length of array");
		int leng=sc.nextInt();
		String[] array = new String[leng];
		System.out.println(array.length);
		System.out.println("enter the elements in the array");
		for(int i=0;i<array.length;i++) 
		{
			array[i]=sc.nextLine();
		}
		
		System.out.println("Particular string length is");
		int length=sc.nextInt();
		for(int i=0;i<array.length;i++)
		{
			if(array[i].length()==length)
			{
				System.out.println(array[i]);
				count++;
			}
			
		}
		System.out.println(count);
	}

}
