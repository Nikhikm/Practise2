package Programs;

import java.util.Arrays;

import org.apache.poi.hpsf.Array;

public class SecondLargest {

	static int max;
	static int secondmax;
	public static void main(String[] args) 
	{
		int [] array = {45,78,90,65,9};
		array[0]= max;
		
		for(int i=0;i<array.length;i++)
		{
			if(array[i]>max)
			{
				max= array[i];
			}
		}
		System.out.println(max);
		for(int i=0;i<array.length;i++)
		{
			if(array[i]>secondmax && array[i]!=max)
			{
				secondmax= array[i];
			}
		}
		
		System.out.println(secondmax);
	}

}
