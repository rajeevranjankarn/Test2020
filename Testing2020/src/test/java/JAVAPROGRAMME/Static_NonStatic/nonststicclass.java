package JAVAPROGRAMME.Static_NonStatic;


public class nonststicclass {

		
		int a=20;
		static int b=40;
		
		 class student{
			
			void apple() {
				
				System.out.println("Value of static variable is" +b);
			System.out.println("Value of nonst metod" +a);	
			}
		}		
		student std = new student();
			
		

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			nonststicclass st= new nonststicclass();
		 st.std.apple();
		//st.std.mango(st);
		}




}
