package org.phone;

public class Phone {

	public void phoneInfo(int no)
	{
	System.out.println(no);	
	}

	public void phoneInfo(float phone) 
	{
	System.out.println(phone);	

	}
	
	public static void main(String[] args) {
		Phone p=new Phone();
		p.phoneInfo(123.3f);
	}
}