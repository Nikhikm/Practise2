package Programs;

public class Armstrong {

	public static void main(String[] args)
	{
		int actnum = 371;
		int res =0;
		int num=actnum;
		while(num%10 !=0) 
		{
			 int rem = num %10 ;
			 res= res + (rem*rem*rem);
			 num = num/10;
		}
		if(actnum == res) {
			System.out.println("armstrong");
		}else {
			System.out.println("non armstrong");
		}
		
	}

}
