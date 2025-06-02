package Day_8;

import java.util.Arrays;

public class String_method {

	public static void main(String[] args) {
		
		
		String s="   Yogendra";
		
		String a=new String("Singh");
		
		
		//length of string
		
		System.out.println(s.length());
		System.out.println("Singh".length());
		
		//concat joining 2 string
		
		System.out.println(s+" "+ a);
		System.out.println(s.concat(a));
		
		
		//trim-- remove space from left and right
		System.out.println(s.trim());
		
		
		//charAt() --returns a character from string based on index
		
		 System.out.println(a.charAt(2));
		 
		 //contains 
		 
		 System.out.println(s.contains("Yog"));
		 
		 
		 
		 //equal()    equalignorecase()   --compare string
		 
		 System.out.println(s.equals(a));
		 
		 //replace
		 System.out.println(s.replace('Y', 'o'));
		 
		 //substring()- extract substrng from main string 
		 
		 //starting index=0
		 //ending index=-1
		 
		 s="selenium";
		 System.out.println(s.substring(1,5));
		 System.out.println(s.substring(0,3));
		 
		 //toUpperCase  tolowercase
		 
		 s="Yogendra";
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		 
		
		//Split
		s="abc@gmail.com";
		String b[]=s.split("@");
		System.out.println(b[0]);
		System.out.println(b[1]);
		
		System.out.println(Arrays.toString(b));
		
		
		s="abc,123@xyz";  // abc  123   xyz
		
		String arr1[]=s.split(",");
		
		System.out.println(Arrays.toString(arr1));  //abc   123@xyz
		
		String arr2[]=s.split("@");
		System.out.println(Arrays.toString(arr2));
		
		

	}

}
