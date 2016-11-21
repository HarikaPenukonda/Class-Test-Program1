package classtest;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        String s1 = new String("Test One");  
        String s2 = new String("Test One");  
        if ( s1== s2 ) {  
             System.out.println("Both are equal");  
        }  
        Boolean b = new Boolean(true);  
        Boolean b1 = new Boolean(false);  
        if ( b.equals(b1) ) {  
           System.out.println("These wrappers are equal");  
        }  


	}

}
