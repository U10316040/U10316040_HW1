import java.util.Scanner;
public class AccountTest {

	public static void main(String[] args) { 
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your id : ");
		int id = input.nextInt();
		Account myAccount = new Account(id,0.45,20000); //Initial balance is 20000
		
		if (id == 1122){
			SavingsAccount myAccount2 = new SavingsAccount(id,0.45,20000);
			CheckingAccount myAccount3 = new CheckingAccount(id,0.45,myAccount2.getBalance());
			System.out.println(myAccount.toString());
			while(true){
				System.out.println("Do you want to deposit,withdraw or check(D/W/C):");
				String choice = input.next();
				switch(choice){
			
				case "D":
					System.out.println("Deposit: ");
					double save= input.nextDouble();
					myAccount2.deposit(save);
					System.out.println(myAccount2.toString());
					break;
				case "W":
					System.out.println("Withdraw: ");
					double out= input.nextDouble();
					myAccount2.withdraw(out);
					System.out.println(myAccount2.toString());
					break;
				case"C":
					System.out.println("Check: ");
					double check = input.nextDouble();
					myAccount3.withdraw(check);
					System.out.println(myAccount3.toString());
					break;
				default:
					System.out.println("Error item! You should choose D/W/C ! ");
					break;
				}
				if (choice.equals("D")||choice.equals("W")||choice.equals("C"))
					break;
			}
		}	
		else{
			System.out.println("Invalid id"); //input error code
		}
	
	}

}

