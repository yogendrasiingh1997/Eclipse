package Day_12;

public class Adder {
	
	int a=10, b=20;
	
	void sum()   //1
	{
		System.out.println(a+b);
	}

	
	void sum(int x, int y) //2 parameter is present
	{
		System.out.println(x+y);
	}
	
	
	void sum(int x, double y)//3 different data type
	{
		System.out.println(x+y);
	}
	
	
	void sum(double x, int y) //4 different order
	{
		System.out.println(x+y);
	}
	
	
	void sum(int a, int b, int c) //3 parameter is present
	{
		System.out.println(a+b+c);
	}
}
