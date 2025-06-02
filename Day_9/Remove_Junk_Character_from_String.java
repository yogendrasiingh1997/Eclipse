package Day_9;

public class Remove_Junk_Character_from_String {

	public static void main(String[] args) {
		
		
		String a="Wel#$$%)(()come";
		a=a.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(a);
	}

}
