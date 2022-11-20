
package com.test.java8newfeature.defualtmethod;


interface DefaultMethodInInterfaceCase1 {
 public void m1();
 //default void m2(); // unmcomment and check errors
  //static void m2();  unmcomment and check errors
 
}


interface B extends DefaultMethodInInterfaceCase1 {
	public void m2();
}