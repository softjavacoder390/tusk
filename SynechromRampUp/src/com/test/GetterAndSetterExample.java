package com.test;

class A1{

	public int a ;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
	
	
}

public class GetterAndSetterExample {
	
	public static void main(String[] args) {
		
		A1 a1 = new A1();
		A1 aa = new A1();
		
		aa.a =50;
		
		if(aa.a >10){
			
		}
		
		a1.setA(10);
		
		System.out.println(a1.getA());
		
        //a1.a = +a1.a+10;
		
		a1.setA(a1.getA()+10);
		
		System.out.println(a1.getA());
		System.out.println(aa.getA());
		
	}

}
