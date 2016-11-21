package classtest;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread t1= new MyThread();
		YourThread t2 = new YourThread(t1);
		t2.start();
		}
		}//end of class

	


