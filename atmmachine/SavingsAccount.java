package com.java.atmmachine;

import java.util.HashMap;
import java.util.Map;

public class SavingsAccount implements Bank
{
	Map<Double,String> ministatement = new HashMap<>();
	
	@Override
	public void withdraw(double Amt,User u) 
	{
		if(u.getBalance()>=Amt)
		{
			double bal = u.getBalance()-Amt;
			             u.setBalance(bal);
			System.out.println("Withdraw Amount : "+Amt+"$");
			
			ministatement.put(Amt,"Withdraw Amount"); 
		}else
			{
			System.out.println(u.getBalance());
				System.out.println("Minimum Balance 500.0$");
			}
	}
	 @Override
	public void deposite(double Amt, User u) 
	 {
		 if(Amt>=0 )
		   {
			   double bal = u.getBalance()+Amt;
			                u.setBalance(bal);
			   System.out.println("Deposite Amount : "+Amt);
			   ministatement.put(Amt,"Withdraw Amount"); 
		   }else
			   {
				   System.out.println("Invalid Amount");
			   }	
	}
	 
	 @Override
		public void viewstatement() 
		{
			for(Map.Entry<Double, String> m:ministatement.entrySet())
			{
				System.out.println(m.getKey()+" "+m.getValue());
			}	
		}
}
