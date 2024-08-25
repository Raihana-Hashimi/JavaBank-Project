
public class TestCustomerAccounts {

	public static void main(String[] args) {
		AbstractBankAccount[] bankAccount = new AbstractBankAccount[5];
		
		bankAccount[0] = new Account("Sanjay Gupta",11556,300,AccountType.SAVINGS);
		bankAccount[1] = new Account("He Xai", 22338, 500,AccountType.SAVINGS);
		bankAccount[2] = new Account("Ilya Mustafana", 44559, 1000,AccountType.SAVINGS);
		
		bankAccount[3] = new CreditAccount("A.N Other", 88776, 500);
		bankAccount[4] = new CreditAccount("Another",66778,1000,500);
		
		
		showAllCreditAccounts(bankAccount);
		showAllAccounts(bankAccount);
		showAllCustomerAccounts(bankAccount);
	}
	
	
	public static void showAllCreditAccounts(AbstractBankAccount[] bankAccount) {
		System.out.println("\nAll Credit Account Types*****");
		
		for(AbstractBankAccount act: bankAccount) {
			if(act instanceof CreditAccount)
				System.out.println(act);
		}
	}
	
	public static void showAllAccounts(AbstractBankAccount[] bankAccount) {
		System.out.println("\nAll Account Types*****");
		
		for(AbstractBankAccount act: bankAccount) {
			if(act instanceof Account)
				System.out.println(act);
		}
	}
	
	public static void showAllCustomerAccounts(AbstractBankAccount[] bankAccount) {
		System.out.println("\nAll Customer Accounts*****");
		
		for(AbstractBankAccount act: bankAccount) {
			System.out.println(act);
		}
	}

}
