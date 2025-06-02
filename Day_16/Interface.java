package Day_16;

interface shape
{
	int length=10; //final and static variable
	int width=20;  //final and static variable
	
	void circle();  //abstract method
	
	default void square()
	{
		System.out.println("this is a square...");
	}
	
	
	static void rectangle()
	{
		System.out.println("this is a rectangle...");
	}
	
	
	
	
	
	
}



public class Interface implements shape
{
	public void circle()
	{
		System.out.println("this is a circle... abstarct method");
	}
	
	void triangle()
	{
		System.out.println("this is a triangle... abstarct method");
	}
	
	
	

	public static void main(String[] args) 
	{
		//Case 1
		
		/*Interface m=new Interface();
		
		m.circle(); //abstract
		m.square(); //default
		shape.rectangle();  //static method can directly access from interface
		m.triangle();
		*/
		
		//case 2
		
		shape sh=new Interface();
		sh.circle();
		sh.square();
		shape.rectangle();
		//sh.triangle(); //we can't access 
		
		System.out.println(sh.length*sh.width);

	}

}
