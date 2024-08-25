
public class Account extends AbstractBankAccount {
	private int bonusValue;
	private AccountType type;
	
	Account(String name, int num, int amt, AccountType type) {
		super(name, num, (amt + calculateInitialBonusValue(amt)));
		bonusValue = calculateInitialBonusValue(amt);
		this.type = type;
	}
	
	private static int calculateInitialBonusValue(int amt) {
    	if(amt >= 1 && amt <= 100)
    		return 10;
    	else if(amt <= 300)
    		return 20;
    	else
    		return 30;
    }
	    
	    //make a deposit to the balance
	    public void deposit(int amt)
	    {
	    	if(amt > 100) {
	    		balance=balance+(amt + (int)(bonusValue * 0.1));
	    	} else 
	    		balance=balance+amt;
	    	    
	    }
	    
	    @Override
	    public String toString() {
	    	return "\nAccount type:    " + this.type + super.toString();
	    }
	    
	   
	    
	    //print method 
//	    public void print() {
//	        System.out.println("\nBank Name:       " + getBankName() + 
//	        		           "\nAccount Name:    " + accountname + 
//	        		           "\nAccount Number:  " + accountnum + 
//	        		           "\nAccount Balance: " + balance);
//	      }
	    

	}
