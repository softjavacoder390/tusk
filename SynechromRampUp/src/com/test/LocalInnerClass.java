package com.test;

public class LocalInnerClass 
	{
		private void getValue()
		{
			// Note that local variable(sum) must be final till JDK 7
			// hence this code will work only in JDK 8
			int sum = 20;
			
			// Local inner Class inside method
			class Inner
			{
				public int divisor;
				public int remainder;
				
				public Inner()
				{
					divisor = 4;
					remainder = sum%divisor;
				}
				private int getDivisor()
				{
					return divisor;
				}
				private int getRemainder()
				{
					return sum%divisor;
				}
				private int getQuotient()
				{
					System.out.println("Inside inner class");
					return sum / divisor;
				}
			}
			
			Inner inner = new Inner();
			System.out.println("Divisor = "+ inner.getDivisor());
			System.out.println("Remainder = " + inner.getRemainder());
			System.out.println("Quotient = " + inner.getQuotient());
		}
		
		public static void main(String[] args)
		{
			LocalInnerClass outer = new LocalInnerClass();
			outer.getValue();
		}
	}

