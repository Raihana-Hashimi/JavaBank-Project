
public interface InterfaceBankAccount {
	
	public final String BANK = "JavaBank";
	
	public void deposit(int amt);
	public void withdraw(int amt);
	public int getbalance();
	public String getBankName();

}
