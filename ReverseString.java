package Programs;

import java.util.Scanner;

public class ReverseString 
{
//	static String Newtext;
	static String reverse(String txt)
	{
		String Newtext= "";
		for(int i=txt.length()-1;i>=0;i--)
		{
			 Newtext= Newtext + txt.charAt(i);
		}
		return Newtext;
	}

	public static void main(String[] args) 
	{
		System.out.println("Please provide string");
		Scanner sc = new Scanner(System.in);
		String text =sc.nextLine();
		String reverse =reverse(text);
		System.out.println(reverse);
		

	}

}
