package JAVAPROGRAMME.constructor;

public class methodovrldng {

	void methd() {
		
		System.out.println("Message 1");
	}
	
	void method1() {
		
		System.out.println("Method 1 message");
		
	}
}
	class ext extends methodovrldng{
	
void methd() {
	
	System.out.println("Message 2");
	super.methd();
	super.method1();
}
	void method2() {
		System.out.println("Mesaage 2 method");
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ext at = new ext();
	
		at.methd();
		
		
	}

}
