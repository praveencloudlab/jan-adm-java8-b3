package p1;

import dept.D1;
import dept.D2;

public class C1 extends D1{

	public static void main(String[] args) {
		D1 d1=new D1(); // shift  + ctrl + O => organize imports
		D2 d2=new D2();
		C2 c2=new C2();
		
		
		d1.f1(); // public 
		//d1.f2(); // default ==> invalid
		//d1.f3(); // protected ==> invalid
		 //d1.f4(); // invalid
		// protected data is available to only sub class obejcts
		// Here C1 is sub class of D1 class
		
		C1 c1=new C1();
		c1.f3(); // valid
		//c1.f2(); // invalid
		//c1.f4(); // invalid
		
		
		
	}
	
}
