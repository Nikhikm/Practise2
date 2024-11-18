package Programs;

public class LargestStringinArray {

	public static void main(String[] args) 
	{
		String []Array= {"nikhil" ,"megha", "shwetaaaaa"};
		int max = Array[0].length();
		String longest = null;
		for (int i=0;i<Array.length;i++) 
		{
			if(Array[i].length()>max)
			{
				max = Array[i].length();
				longest= Array[i];
			}
		}
		
		System.out.println(max);
		System.out.println(longest);
		

	}

}
