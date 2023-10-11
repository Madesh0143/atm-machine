package com.java.atmmachine;

public class User 
{
	// DATA MEMBERS DECLEARED AS PRIVATE WHILE USING JAVA-BEANS CLAUSE
	private String Name;
	private long   Acc_no;
	private String EmailId;
	private String IFSC;
	private int pin = 0000;
	private double Balance;
	private static String Bank_Name="Indian Bank";
	private final String Branch_Name="HSR Layout";
	
	// DEVELOPE A CONSRUCTORS TO INITIALIZE THE DATA
	public User(long Acc_no,String Name,String EmailId,String IFSC)
	{
		this.Acc_no    = Acc_no;
		this.Name      = Name;
		this.EmailId   =  EmailId;
		this.IFSC      = IFSC;	
	}
	
	/* CREATE A GETTER METHOD TO READ THE DATA USING JAVA-BEANS CLAUSE */
	public long getAcc_no()
	{
		return Acc_no;
	}
	public String getName()
	{
		return Name;
	}
	public String getEmailId() 
	{
		return EmailId;
	}
	public String getIFSC() 
	{
		return IFSC;
	}
	public String getBank_Name() 
	{
		return Bank_Name;
	}
	public String getBranch_Name() 
	{
		return Branch_Name;
	}
	public double getBalance()
	{
		return Balance;
	}
	public int  getpin()
	{
		return pin;
	}
	
	/* CREATE A SETTER METHOD TO UPDATE OR WRITE THE DATA USING JAVA-BEANS CLAUSE */
	public void setAcc_no(long U_Acc_no ) 
	{
		this.Acc_no = U_Acc_no;
	}
	public void setName(String U_Name ) 
	{
		this.Name = U_Name;
	}
	public void setEmailId(String U_EmailId ) 
	{
		this.EmailId = U_EmailId;
	}
	public void setIFSC(String IFSC ) 
	{
		this.IFSC = IFSC;
	}
	public void setBalance(double U_Balance) 
	{
		this.Balance = U_Balance;
	}	
}






















