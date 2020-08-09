package OOPS;

public class traction extends abstractions {

	traction(int a, int b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		traction tc = new traction(9,5);
		tc.sub();
		
	}

	@Override
	int sub() {		
	c=a+b;	
		System.out.println("Sub is" +c);
		return c;
		System.out.println("Changes look like");
	}

}
