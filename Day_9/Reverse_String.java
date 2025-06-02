package Day_9;

public class Reverse_String {

	public static void main(String[] args) {
		
		//Approach 1
		
		//String s="welcome";
		
		//String rev="";
		
		/*for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println("reverse string is: "+rev);
*/
		
		
		//Approach 2 by converting sting to char array type
		
		/* 
		 char a[]=s.toCharArray();
		 
		for (int i=a.length-1;i>=0;i--)
		{
			rev=rev+a[i];
		}
		System.out.println("reverse string is: "+rev);

		*/
		
		//Approach 3 using string buffer class  --reverse method is only present in String Builder and Buffer class
		
		StringBuffer a= new StringBuffer ("yogendra");
		System.out.println("reverse string is: "+ a.reverse());
		
		
		////Approach 4 using string buffer class
		
		StringBuilder b= new StringBuilder ("welcome");
		System.out.println("reverse string is: "+ b.reverse());
		
				
		
		
		
		
		
		

	}

}
