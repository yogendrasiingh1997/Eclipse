package Day_9;

public class Check_String_Palindrome {

	public static void main(String[] args) {
		
		String a="nitin";
		String org=a;
		String rev="";
		
		for(int i=a.length()-1;i>=0;i--)
		{
			rev=rev+a.charAt(i);
		}
		
		
		
		if(org.equals(rev))
		{
			System.out.println("String is palindrom");
		}
		else
		{
			System.out.println("String is not palindrom");
		}
	}

}
