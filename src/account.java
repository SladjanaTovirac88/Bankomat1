
public class account {

	private int accountCode;
	private String nameOfUser;
	private double amount;

	public account(){
		
	}
	public account(String nameOfUser,int accountCode,double amount){
		this.nameOfUser=nameOfUser;
		this.accountCode=accountCode;
		this.amount=amount;
		
	}
	public int getAccountCode() {
		return accountCode;
	}
	public void setAccountCode(int Accountcode) {
		this.accountCode = Accountcode;
	}
	public String getNameOfUser() {
		return nameOfUser;
	}
	public void setNameOfUser(String nameOfUser) {
		this.nameOfUser = nameOfUser;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}

	

	
	
	
	
	
	
	
	
	
	

}
