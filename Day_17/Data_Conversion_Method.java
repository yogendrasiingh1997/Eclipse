package Day_17;

public class Data_Conversion_Method {

	public static void main(String[] args) {
		
		//String--->int
		
		/*
		String s1="10";
		String s2="20";
		System.out.println(Integer.parseInt(s1)+ Integer.parseInt(s2));
		*/
		
		//String---->double
		String m1="10.5";
		String m2="30.2";
		System.out.println(Double.parseDouble(m1)+Double.parseDouble(m2));
		
		
		//int,double,char, boolean--->String

		int a=10;
		double b=10.2;
		char c='A';
		boolean d=true;
		
		String s=String.valueOf(a);
		System.out.println(a);
	}

}
