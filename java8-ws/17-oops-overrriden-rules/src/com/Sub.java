package com;

class Super{
	public void f1() {}
	void f2() {}
	protected void f3() {}
	private void f4() {}
	public static void f5() {}
	public final void f6() {} 
	
}
public class Sub extends Super{
	
	void test() {
		String str;
		f6();// valid statement
	}
	
	//public final void f6() {} //invalid. can not overrrode fibal methods from super class
	
	//@Override
	//public static void f5() {} // invalid statement. static methods can not be overrridden

	
	@Override
	protected void f3() {} // public or protected
	
	@Override
	void f2() {} // public,default or protected
	
	
	@Override
	public void f1() {} // must be public

}
