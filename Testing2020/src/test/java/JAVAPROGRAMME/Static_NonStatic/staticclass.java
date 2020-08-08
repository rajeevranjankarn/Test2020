package JAVAPROGRAMME.Static_NonStatic;

public class staticclass {

	
	int a=20;
	static int b=40;
	
	static class student{
		
		void apple(staticclass x) {
			
			System.out.println("Value of static variable is" +b);
		System.out.println("Value of nonst metod" +x.a);	
		}
		
		
		static void mango(staticclass x) {
			
			System.out.println("Value of static variable is" +b);
			System.out.println("Value of nonst metod" +x.a);	
		}
	}		
		student std = new student();
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		staticclass st= new staticclass();
	st.std.apple(st);
	st.std.mango(st);
	}


}