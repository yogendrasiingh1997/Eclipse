package Day_9;

public class Count_Occurrences_of_Character_in_String {

	public static void main(String[] args) {
	
		String a="Yoooogeeenndraaaa";
		int totalcount=a.length();
		
		int total_count_after_remove=a.replace("Y", "").length();
		
		int count=totalcount-total_count_after_remove;
		
		System.out.println(count);
		}

}
