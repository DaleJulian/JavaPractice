

class MyThread implements Runnable{
	
	String thrdName;
	
	MyThread(String name){
		thrdName = name;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println(thrdName + " starting...");
		try{
			for(int count = 0; count < 10; count++){
				Thread.sleep(400);
				System.out.println("In " + thrdName + ", count is " + count);
			}
		}
		catch (InterruptedException e){
			System.out.println(thrdName + " interrupted.");
		}
		System.out.println(thrdName + " terminating..");
	}
}
public class SimpleMultithreading {

	public static void main(String args[]){
		System.out.println("Main thread starting..");
		
		//Construct a MyThread object
		MyThread mt = new MyThread("Child #1");
		
		//construct a thread from mt
		Thread newThrd = new Thread(mt);
	
		//start the execution of the thread
		newThrd.start();
		
		for(int i = 0; i < 50; i++){
			System.out.print(".");
			try{
				Thread.sleep(100);
			}
			catch (InterruptedException e){
				System.out.println("Main thread interrupted.");
			}
		}
		System.out.println("Main thread ending.");
	}
}
