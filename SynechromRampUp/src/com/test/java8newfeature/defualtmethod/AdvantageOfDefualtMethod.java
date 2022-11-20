package com.test.java8newfeature.defualtmethod;

interface I{
	public abstract void m1();
	//public abstract void m2(); // uncomment it and see the problem
}

class Test1 implements I{
	@Override
	public void m1() {}	
}

class Test2 implements I{
	@Override
	public void m1() {}	
}

class Test3 implements I{
	@Override
	public void m1() {}	
}

class Test4 implements I{
	@Override
	public void m1() {}	
}

public class AdvantageOfDefualtMethod {

}
