

public class Mytthread extends Thread{
	
	 public void run() {
		 
		 for(int i =1;i<=10;i++) {
			 
			 try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			 
			 
			 System.out.println("Thread started...."+Thread.currentThread().getId());
		 }
		
	}
	
	public static void main(String args[]) {
		
		int a = 10/0;
		System.out.println(a);
		
		MyThread t1 = new MyThread();
		t1.start();

	
		
		
		MyThread t2 = new MyThread();
		
		t2.start();
		
		System.out.println(Thread.currentThread().getId());
		
	}

}
/*
 * Impletment 
 * 
 * 
 * 
 */