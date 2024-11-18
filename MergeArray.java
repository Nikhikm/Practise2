package Programs;

public class MergeArray {

	public static void main(String[] args) 
	{
		int [] one = {1,2};
		int [] two = {3,4,5};
		int [] merge = new int[one.length + two.length]; //5
		
		for(int i=0; i<one.length; i++) 
		{
			merge[i] = one[i];  // 1,2
		}
		
		for (int i=0;i<two.length;i++)
		{
			merge[one.length + i] = two[i];
			
		}
		
		for(int i=0; i<merge.length; i++) 
		{
			System.out.println(merge[i] );
		}

	}

}
