package Programs;

import java.util.Arrays;

public class SecondLargestSorting {

	public static void main(String[] args)
	{
		int [] array = {1,5,8,9,0};
		Arrays.sort(array);
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
			
		}
		System.out.println("2nd is " + array[array.length -2]);
	}

}
