package OOPS;

public class face implements face2 {

	int a,b,c;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
face fc = new face();
fc.a=6;
fc.b=5;
fc.add();
fc.mult();
fc.sub();
		
	}

	public int sub() {
		
		c=a-b;
		System.out.println("Sub is"+c  );
		return c;
	}

	public int add() {
		c=a+b;
		System.out.println("Add is"+c);
		return c;
	}

	public int mult() {
		
		c=a*b;
		System.out.println("Multi is "+c);
		return c;
	}

}
