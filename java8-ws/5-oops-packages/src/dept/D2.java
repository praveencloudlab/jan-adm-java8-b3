package dept;

public class D2 {
	
	public static void main(String[] args) {

		D1 d1=new D1();
		d1.f1();
		d1.f2(); // D2 class belongs to same package of D1 class
		d1.f3(); // D2 class belongs to same package of D1 class
		//d1.f4(); // invalid
	}

}
