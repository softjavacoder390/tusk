package com.test.java8newfeature.defualtmethod;

interface I1 {
	default void m1() {

		System.out.println("default method");
	}
	// public int hashCode();

	/*
	 * default int hashCode(){ System.out.println("default method"); return 0; }
	 */

	/*default String toString() {
		System.out.println("default method");
		return null;
	}*/
	
	/*default void run(){
		
	}
*/
}

public class AdvantageOfDefualtMethodCase1 implements I1 {

	/*public int hashCode() {
		System.out.println("default method");
		return 0;
	}*/

	public void m1() {
		System.out.println("m1 calling");
	}

	public static void main(String[] args) {

		AdvantageOfDefualtMethodCase1 t = new AdvantageOfDefualtMethodCase1();
		t.m1();

		I1 t1 = new AdvantageOfDefualtMethodCase1();
		t1.m1();
		
		

	}

}
