package classtest;

public class YourThread extends Thread {
	public YourThread(Runnable r){
		super(r);
		}
		public void run(){
		System.out.println("Running YourThread");
		}
		}//end of YourThread

	