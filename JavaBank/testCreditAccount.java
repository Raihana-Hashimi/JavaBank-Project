
public class testCreditAccount {
	

	public static void main(String[] args) {
	     
		// Instantiate 3 accounts
	    // Using constructor with values
	    Account A1 = new Account("Sanjay Gupta",11556,300,AccountType.SAVINGS);
	    	// Using default constructor
		Account A2 = new Account("He Xai", 22338, 500,AccountType.SAVINGS);
		Account A3 = new Account("Ilya Mustafana", 44559, 1000,AccountType.SAVINGS);
		
		// Instantiate 2 credit accounts
		// Using default constructor
		CreditAccount C1 = new CreditAccount("A.N Other", 88776, 500);
		// Using constructor with values which will call constructor from super
		CreditAccount C2 = new CreditAccount("Another",66778,1000,500);
		
		//Set values of Instances created using default constructo
		
		// Print accounts
//		A1.print();
//		A2.print();
//		A3.print();
//		C1.print();
//		C2.print();
		System.out.println(A1);
		System.out.println(A2);
		System.out.println(A3);
		System.out.println(C1);
		System.out.println(C2);
    }
}

