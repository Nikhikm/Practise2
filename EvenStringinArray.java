package Programs;

public class EvenStringinArray {

	public static void main(String[] args) 
	{
		String []Array= {"nikhil" ,"megha", "shwetaaaaa"};
		int max = Array[0].length();
		String longest = null;
		for (int i=0;i<Array.length;i++) 
		{
			if(Array[i].length()%2==0)
			{
				System.out.println("even string is "+ Array[i]);
			}
			else {
				System.out.println("odd string is "+ Array[i]);
			}
		}
		
		

	}

}