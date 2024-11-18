package Programs;

import java.util.Scanner;

public class SwapString 
{
	
	static void swap(String s1 , String s2) 
	{
		String s3="";
		s3=s1;
		s1=s2;
		s2=s3;
		System.out.println(s1);
		System.out.println(s2);
		
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("plese provide sytri g 1");
		String strings1=  sc.nextLine();
		System.out.println("plese provide sytri g 2");
		String strings2=  sc.nextLine();
		swap(strings1,strings2);
		

	}

}
