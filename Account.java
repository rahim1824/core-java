class Account
{
    double balance;
    void addBalance(double value)
    {
        balance=balance+value;
    }
    double getBalance()
    {
        return balance;
    }
        void withdraw(double amount)
        {
		if(amount+1000<=balance)
			balance=balance-amount;
 		else
			System.out.println("NO sufficient balance");
	}
    public static void main(String args[])
    {
       Account acc=new Account();
       acc.addBalance(1000);
       acc.addBalance(acc.getBalance()*2);
       System.out.println("before withdraw"+acc.getBalance());
	acc.withdraw(1000);
	 System.out.println("after withdraw"+acc.getBalance());

    }
    
}
