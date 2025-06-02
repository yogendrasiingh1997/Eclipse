package Day_15;


class bank
{
	double roi()
	{
		return 0;
	}
}

class ICICI
{
	double roi()
	{
		return 10.5;
	}
}

class SBI
{
	double roi()
	{
		return 11.5;  //method is same but change in implementation c/d overriding 
	}
}

public class Overriding_Demo {

	public static void main(String[] args) 
	{
		bank b=new bank();
		System.out.println(b.roi());
		
		
		ICICI c=new ICICI();
		System.out.println(c.roi());
		
		
		SBI d=new SBI();
		System.out.println(d.roi());
		
				
				
	}

}
