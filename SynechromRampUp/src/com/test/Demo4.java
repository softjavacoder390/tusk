package com.test;

import java.io.IOException;

class Employeeee{
	public void method1()  throws IOException
{
}
}


 class SoftwareDeveloper extends Employeeee
{
public void method1() throws NullPointerException
{
}

}

public class Demo4 {

	public static void main(String[] args) {
		
		try {
			
			ClassLoader c= null;
			Class.forName("com.mysql.jdbc.Driver");
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println(Demo4.class.getClassLoader().toString());
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
