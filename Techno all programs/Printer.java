
public class Printer {

	public   synchronized void print(String message) {
		System.out.println(Thread.currentThread().getName()+" is printing ....."+message);
		
		try {
			Thread.sleep(1000);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(Thread.currentThread().getName()+" has finished printing ....."+message);

	}
	
	
	
}