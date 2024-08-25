
public abstract class AbstractBankAccount {
	public final String BANK = "JavaBank";
	protected String accountname;
    protected int accountnum;
    protected int balance;
    
  //overloaded constructor for Account
    AbstractBankAccount(String name, int num, int amt)
    {
            accountname=name;
    	    accountnum=num;
            balance=amt;
    }
	
	abstract public void deposit(int amt);
	 public String getaccountname ( ) {
    	 
	    	return accountname;
	    }
	 
	//modifier to set the accountname
	    public void setaccountname(String name)
	    {
	    	    accountname = name;
	    }
	    
	  //accessor to get the accountnumber
	    public int getaccountnum ( ) {
	   	 
	    	return accountnum;
	    }
	    
	  //modifier to set the accountnumber
	    public void setaccountnum(int num)
	    {
	    	    accountnum = num;
	    }
	    
	  //accessor to get the account balance
	    public int getbalance ( ) {
	      	 
	    	return balance;
	    }
	    
	  //modifier to set the balance
	    public void setbalance(int num)
	    {
	    	    balance = num;
	    }
	    
	    public String getBankName() {
	    	return InterfaceBankAccount.BANK;
	    }
	    
	  //make a withdrawal from the balance
	    public void withdraw(int amt)
	    {
	    	    balance=balance-amt;
	    }
	    
	    @Override
	    public String toString() {
	    	return "\nBank Name:       " + getBankName() + 
 		            "\nAccount Name:    " + accountname + 
 		            "\nAccount Number:  " + accountnum + 
 		            "\nAccount Balance: " + balance;
	    }
}
