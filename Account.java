import java.util.Date;
public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	Account(){
		
	}
	
	Account(int id, double annualInterestRate, double balance){
		this.id = id;
		this.annualInterestRate = annualInterestRate;
		this.balance = balance;
	}
	
	//accessor methods
	public int getId(){
		return id;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public double getAnnualInterestRate(){
		return annualInterestRate;
	}
	//mutator methods
	public void setId(int id){
		this.id = id;
	}
	
	public void setBalance(double balance){
		this.balance = balance;
	}
	
	public void setAnnualInterestRate(double IR){
		annualInterestRate = IR;
	}
	
	public String getDate(){
		dateCreated = new Date();
		return dateCreated.toString(); //current time
	}
	
	public double getMonthlyInterestRate(){
		return annualInterestRate / 12;
	}
	
	public double getMonthlyInterest(){
		return balance * annualInterestRate / 12;
	}
	
	public void withdraw(double money){
		balance -= money;
	}
	
	public void deposit(double money){
		balance += money;
	}
	
	public String toString(){
		return "Your balance:" + getBalance() + "\nMonthly Interest:$" + Math.floor(getMonthlyInterest()*100)/100;
	}
}
