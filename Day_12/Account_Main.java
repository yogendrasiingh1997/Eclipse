package Day_12;

public class Account_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Account ac=new Account();
	
	ac.setAcno(202100);
	ac.setAmount(20.2);
	ac.setName("Yogendra");
	
	
	
	System.out.println("account no is: "+ac.getAcno());
	
	System.out.println("account balnace is " +ac.getAmount());
	
	System.out.println("account name is :"+ac.getName());
		
	}

}
