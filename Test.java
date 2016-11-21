package classtest;

public class Test extends MyTest{
    public void myTest() { 
        System.out.println("Printing myTest in Test class"); 
  } 
  public static void myStat() { 
        System.out.println("Printing myStat in Test class"); 
  } 


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	       MyTest mt = new Test(); 
	       mt.myTest(); 
	       mt.myStat(); 


	}

}
