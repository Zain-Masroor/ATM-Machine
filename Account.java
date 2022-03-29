package deskprac;

public class Account {
	
	String accNumber;
	int balance;
	
	Account(String accNumber, int balance){
		this.accNumber = accNumber;
		if(balance>=0) {
		this.balance = balance;
		}else
			throw new IllegalArgumentException("Transaction Failed: In-sufficent Balance in Account");
		}
	
		public void credit(int amount) {
			balance = balance + amount;
		}

		public void debit(int amount) {
			if(balance>amount) {
				balance -= amount;
			}
		}
						
		public void credit(Account obj, int amount) {
			balance += amount;      
			System.out.println("Transferred " + amount + " to " + this.accNumber + " and withdrawl of " 
					+ amount + " from " + obj.accNumber);
			obj.balance = obj.balance - amount;
		}

		public void debit(Account obj, int amount) {
			balance -= amount;
			obj.balance += amount;
			System.out.println("Transferred " + amount + " to " + obj.accNumber
					+ " and withdrawl of " + amount + " from " + this.accNumber);
		}
		
		
}
