package Day_14;

class a
{
	int a=100;
	
	void display()
	{
		System.out.println(a);
	
	}
}

class b extends a  //inheritance
{
	int b=200;
	
	void show()
	{
		System.out.println(b);
	}
}

class c extends b
{
	int c=300;
	
	void print()
	{
		System.out.println(c);
	}
}

public class Inheritance_Types {

	public static void main(String[] args) 
	{

		/*
		 b bobj=new b();
		 
		System.out.println(bobj.a);
		System.out.println(bobj.b);
		
		bobj.display();
		bobj.show();
		*/
		
		c cobj=new c();
		
		System.out.println(cobj.a);
		System.out.println(cobj.b);
		System.out.println(cobj.c);
		
		cobj.display();
		cobj.show();
		cobj.print();
	}

}
