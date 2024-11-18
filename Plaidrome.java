package Programs;

public class Plaidrome {

	static String S1= "MOM";
	static String s2 ="";
	public static void main(String[] args) 
	{
		
		for (int i=S1.length()-1;i>=0;i--)
		{
			s2= s2+S1.charAt(i);
		}
		System.out.println(s2);
		if(s2.equals(S1)) 
		{
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}

	}

}
