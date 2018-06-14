package emailApp;

import java.util.Scanner;

public class Email {
	
	private String firstName;
	private String lastName;
	private String pass;
	private int defaultPassLength = 10;
	private String department;
	private int mailboxCap = 500;
	private String email;
	private String company = "company.com";
	
	//constructor to receive first and last name 
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		//System.out.println("Email: " + this.firstName + " " + this.lastName);
		
		//Call a method asking for the department - return the department 
		this.department = setDepartment();
	//	System.out.println("Department: " + this.department);
		
		//Return a random password
		this.pass = randomPassword(defaultPassLength);
		System.out.println("Your Password is: " + this.pass);
		
		//generate email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + company;
		//System.out.println("Your Email is: " + email);
	}
	
	//Ask for the Department
	private String setDepartment() {
		System.out.print("New Worker: " + firstName + " " + lastName + "Department Code\n1 for Sales\n2 for Customer Service\n3 for Accounting\n0 for none\nEnter department code: ");
		Scanner in = new Scanner(System.in);
		int deptChoice = in.nextInt();
		if(deptChoice == 1)
		{
			return "sales";
		}
		else if (deptChoice == 2)
		{
			return "cs";
		}
		else if (deptChoice == 3)
		{
			return "acc";
		}
		else 
		{
			return "";
		}
	}
	
	//Generate password
	private String randomPassword(int length)
	{
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&";
		char[] password = new char[length];
		for (int i=0; i<length; i++)
		{
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	//Set Mailbox capacity 
	public void setMailboxCap (int capacity) {
		this.mailboxCap = capacity;
	}
	
	//Set alternate email
	public void setAlternateEmail(String altEmail){
		this.email = altEmail;
	}
	
	//Change the password
	public void changePass(String pass) {
		
	}
	
	public int getMailCap() { return mailboxCap; }
	public String getAltEmail() { return email; }
	public String getPassword() {return pass; }
	
	public String showInfo() {
		return "Full Name: " + firstName + " " + lastName + "\n" + "Email: " + email + "\n" + "MailBox Capacity(mb): " + mailboxCap + "\n" + "Department: " + department;
				
	}
	
}
