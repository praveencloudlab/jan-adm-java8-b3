package dept;

import p1.C1;

public class D1 {
	
	public void f1() {
		f4(); // valid
	}
	void f2() {
		f4(); //valid
	} // default
	protected void f3() {
		f4(); // valid
	}
	private void f4() {}
	
	public static void main(String[] args) {
		
		C1 c1=new C1();
		D2 d2=new D2();
	}

}
