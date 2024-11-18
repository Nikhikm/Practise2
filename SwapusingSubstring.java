package Programs;

public class SwapusingSubstring {

	public static void main(String[] args) 
	{
		String S1 = "nikhil";
		String S2= "Shweta";
		 S1= S1+S2;
		System.out.println(S1);
		S1 = S1.substring(0, S1.length()-S2.length());
		System.out.println(S2);
		S2 = S1.substring(S2.length());
		System.out.println(S1);
				
				

	}

}
