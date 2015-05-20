
class SumArray{
	
	private int sum;
	
	synchronized int sumArray(int nums[]){
		sum = 0; //reset
		
		for(int i = 0; i < nums.length; i++){
			sum += nums[i];
			System.out.println("Running total for: " + Thread.currentThread().getName() + " is " + sum);
			try{
				Thread.sleep(10); // allows task-switch
			}
			catch(InterruptedException e){
				System.out.println("Thread interrupted.");
			}
		}
		return sum;
	}
}

class MyThreads implements Runnable{
	
	Thread thread;
	static SumArray sa = new SumArray();
	
	int a[];
	int answer;
	
	//construct a new thread
	MyThreads(String name, int nums[]){
		thread = new Thread(this, name);
		a = nums;
		thread.start();
	}
	
	@Override 
	public void run(){
		
		int sum;
		
		System.out.println(thread.getName() + " starting..");
		
		answer = sa.sumArray(a);
		
		System.out.println(thread.getName() + " terminating.");
		
	}
}

public class SynchronizedThreads {

	
	public static void main(String args[]){
		
		int a[] = { 1, 2, 3, 4, 5 };
		
		MyThreads mt1 = new MyThreads("Child #1", a);
		MyThreads mt2 = new MyThreads("Child #2", a);
		
		try{
			mt1.thread.join();
			mt2.thread.join();
		}
		catch(InterruptedException e){
			System.out.println("Main thread interrupted.");
		}
	}
}
