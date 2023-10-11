package com.java.atmmachine;

import java.util.Scanner;

public class Machine
{
    public void processing(User u) 
    {
    	Scanner sc = new Scanner(System.in);
    	CurrentAccount CA = new CurrentAccount();
    	SavingsAccount SA = new SavingsAccount();
    	
    	while(true)
		{
    		System.out.println("!...Welcome To Atm Machine...!");
			System.out.println("1. Withdraw Amount");
			System.out.println("2. Deposit Amount");
			System.out.println("3. Check Balance");
			System.out.println("4. Mini Statement");
			System.out.println("5. Display Profile");
			System.out.println("6. LogOut");
			System.out.print("Enter Options: ");
			
			int optins = sc.nextInt();
			
			// THIS OPTION IS ONLY WITHDRAW AMOUNT FROM CURRENT OR SAVINGS ACCOUNT
			if(optins==1)
			{
				System.out.println("*** Withdraw Amount ***");
				System.out.println("A. Current Account \t B. Savings Account ");
				 
				 System.out.print("Enter Options: ");
				 char chiose = sc.next().charAt(0);
				 if(chiose == 'A'|| chiose == 'a')
				 {
					 
					  System.out.print("** Current Account ** \nEnter Withdraw Amount : ");
					  double amount = sc.nextDouble();
					  
					  if(amount>=0)
					  {
						  CA.withdraw(amount, u);	  
					  }
					                
				 }else if (chiose == 'B'|| chiose == 'b')
					 {  
					     System.out.print("** Savings Account ** \nEnter Withdraw Amount : ");
						  double amount = sc.nextDouble();
						  
						  if(amount>=0)
						  {
							  SA.withdraw(amount, u);
						  }	
					 }else {System.out.println("Invalid Options");}
				
			}// THIS OPTION IS ONLY FOR DEPOSITE AMOUNT FROM ACCOUNT
			else if (optins==2)
				{
				     System.out.println("*** Deposit Amount ***");
					 System.out.println("A. Current Account \t B. Savings Account ");
					 
					 System.out.print("Enter Options: ");
					 
					 char ch = sc.next().charAt(0);
					 if(ch == 'A'|| ch == 'a')
					  {
						 System.out.print("** Current Account ** \nEnter Deposit Amount : ");
						  double amount = sc.nextDouble();
						       
						  CA.deposite(amount, u);
					                
					  }else if (ch == 'B'|| ch == 'b')
						 {
						  System.out.print("** Savings Account ** \nEnter Deposit Amount : ");
						  double amount = sc.nextDouble();
						       
						  SA.deposite(amount, u);
						 }else {System.out.println("Invalid Options");}
						     
			     }
			else if (optins==3)
				{
				 System.out.println("*** Check Balance ***");
				 System.out.println("A. Current Account \tB. Savings Account ");
				 
				 System.out.print("Enter Options: ");
				 
				 char ch = sc.next().charAt(0);
				 if(ch == 'A'|| ch == 'a')
				  {
					 System.out.print("** Current Account **");
					 System.out.println("Check Balance : "+u.getBalance()+"$");
					 
					            
				  }else if (ch == 'B'|| ch == 'b')
					 {
					  System.out.print("** Savings Account **");
					  System.out.println("Check Balance : "+u.getBalance()+"$");
					  
					 }else {System.out.println("Invalid Options");}
					      
				}
		   else if (optins == 4)
				{
			        System.out.println("*** Mini Statement ***");
					System.out.println("...Mini Satement... \n A. Savings Account \t B. Current Account");
					
					System.out.print("Enter Options : ");
					char ch = sc.next().charAt(0);
					 if(ch == 'A'|| ch == 'a')
					  {
						 System.out.println("!!..Mini_Statement Savings Account..!!");
						 SA.viewstatement();	  
					                
					  }else if (ch == 'B'|| ch == 'b')
						 {
						  System.out.println("!!..Mini_Statement Current Account..!!");
						  CA.viewstatement();
						 }			
				}
			else if (optins==5)
				{
				    System.out.println("*** Display Profile ***");
			        System.out.println("Account No : "+u.getAcc_no());
			        System.out.println("Name : "+u.getName());
			        System.out.println("Email_Id : "+u.getEmailId());
			        System.out.println("IFSC Code :"+u.getIFSC());
			        System.out.println("Balance : "+u.getBalance());
			        System.out.println("Bank Name : "+u.getBank_Name());
			        System.out.println("Branch : "+u.getBranch_Name());
			        System.out.println("---------------------");
		
				}else if (optins==6)
					{
						 System.out.println("!!.Thank You For Using ATM Machine.!!");
						 System.out.println("<< Collect your ATM Card >>");
				         System.exit(0);
					}else {System.out.println("Invalid Options");}		
			}	
		}
	
	
  public static void main(String[] args) 
  {
		Scanner sc = new Scanner(System.in);
		 
		User u = new User(1234, "Madesh", "madesh@gmail.com", "IFSC00056");
		 
		System.out.print("ACCOUNT NO: ");
		long Ac_No = sc.nextLong();
		     
		System.out.print("ATM PIN: ");
		int password = sc.nextInt();
		
		if (Ac_No==u.getAcc_no())
		{
			if(password== u.getpin())
			{
				System.out.println(".!.Validation Success.!.");
			    Machine M = new Machine();
			            M.processing(u);
			}else
				{	
				  System.out.println("Wrong Atm Pin..!");
				}
		}else 
			{
				System.out.println("Wrong Account_No..!");
		    }
  }
}
