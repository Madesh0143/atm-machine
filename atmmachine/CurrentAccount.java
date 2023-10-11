package com.java.atmmachine;

import java.util.HashMap;
import java.util.Map;

interface Bank
{
  public void withdraw(double Amt,User u);
  public void deposite(double Amt,User u);
  public void viewstatement();	
}

// Current Account Class
public class CurrentAccount  implements Bank
{
	// Maping The Mini Statement Values And String
	Map<Double,String> ministatement = new HashMap<>();
	
	private final double minimum_balance = 500.0; 
	
	@Override
	public void withdraw(double Amt,User u) 
	{
		if((Amt>=500)&& u.getBalance()-minimum_balance>=Amt)
		{
			double bal = u.getBalance()-Amt;
			             u.setBalance(bal);              
			System.out.println("Collect Your Cash: "+Amt+"$");
			System.out.println("Balance Avaliable: "+bal+"$");
			
			ministatement.put(Amt,"Withdraw Amount"); 
		}else
			{
				System.out.println("Enter Only For 500.0$ ");
			}
	}
	
	@Override
	public void deposite(double Amt,User u) 
	{
	   if(Amt>=0)
	   {
		   double bal = u.getBalance()+Amt;
		                u.setBalance(bal);
		                
		    ministatement.put(Amt,"Deposited Amount");  
		    
		   System.out.println("Deposite Amount Successfully "+Amt+"$");
		   System.out.println("Balance Avaliable "+bal+"$");
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
