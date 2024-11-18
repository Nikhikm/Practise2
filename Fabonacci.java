package Programs;

public class Fabonacci {

	public static void main(String[] args) 
	{
	   int num1= 1;
	   int num2= 2;
	   int num3=0;
	   
	   for(int i=0;i<=10;i++)
	   {
		   num3= num1+num2;
		   System.out.println(num3);
		   num1=num2;
		   num2=num3;
	   }
	   

	}

}
