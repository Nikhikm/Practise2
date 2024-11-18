package Programs;

public class Numbercount {

	static int count;
	public static void main(String[] args) 
	{
		int [] num = {1,2,2,2,3,4,7,5,5,7,8};
		int find = 2;
		for(int i=0;i<num.length;i++)
		{
			if(find==num[i]) 
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
