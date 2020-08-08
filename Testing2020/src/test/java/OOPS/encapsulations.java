package OOPS;

import java.util.Set;

public class encapsulations {

	private int a,b,c;
	
	public int geta() {
		return a;
		}
	
	public int getb() {
		return b;
	}
	
	public int getc() {
		return c;
	}
	
	public int Seta(int a) {
		
		this.a=a;
		return a;
	}
public int Setb(int b) {
		
		this.b=b;
		return b;
	}
	
public int Setc(int c) {
	
	this.c=c;
	return c;
}	
	
int add() {
	
	c=a+b;
	System.out.println("Add is "+c);
	return c;
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		encapsulations es = new encapsulations();
		es.a=9;
		es.b=5;
		es.add();
		
		
	}

}
