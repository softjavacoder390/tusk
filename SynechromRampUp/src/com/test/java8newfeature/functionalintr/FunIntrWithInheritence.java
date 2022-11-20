
package com.test.java8newfeature.functionalintr;

@FunctionalInterface
public interface FunIntrWithInheritence {
 public void m1();
}

//@FunctionalInterface
//in case of inheritence also same rule will be applied
interface B extends FunIntrWithInheritence {
	public void m2();
}