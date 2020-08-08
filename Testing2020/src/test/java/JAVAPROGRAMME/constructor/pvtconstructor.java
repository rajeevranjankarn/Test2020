package JAVAPROGRAMME.constructor;

public class pvtconstructor {
	
	 private pvtconstructor(){
		 
		 System.out.println("Result is succesfull");
	 }
	    
	    public void disp()
	    {
	        System.out.println("disp() method called");
	    }

	    
	    public static pvtconstructor getinstance() {
	    	
	    	return new pvtconstructor();
	    }

			

	    public static void main(String args[])
	    {
	    
	    	pvtconstructor obj1 = pvtconstructor.getinstance();   	
	    	pvtconstructor obj2 = pvtconstructor.getinstance();
	 obj1.disp();
	    	
	}
}
