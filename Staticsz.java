package Programs;

class Base
{
	int a;
   	 void trip ()
   	{
   		System.out.println("Yes");
   	}
}

class Second extends Base
{
	void trip() 
	{
		System.out.println("No");
		super.trip();
	}
}

public class Staticsz {

	public static void main(String[] args)
	{
     	Second s = new Second();
     	s.trip();
      
	}

}
