public class CheckingAccount extends Account {
	private boolean isOverBalance;
	private double checkFunds; // my checking funds
	CheckingAccount(){
		super();
	}
	
	CheckingAccount(int id,double annualInterestRate,double balance){
		super(id, annualInterestRate,balance);
	}
	
	@Override
	public void withdraw(double money){
		if(getBalance() < money){
			isOverBalance = true;
		}
		else{
			setBalance(getBalance()-money);
			checkFunds = money;
		}
		
	}
	
	@Override
	public String toString(){
		if(isOverBalance) 
			return "Insufficient funds!\n" + super.toString();
		else
			return super.toString() + "\nTime of transaction: " + getDate() + "\nYou check: " + checkFunds ;
	}
	
			
	
}
