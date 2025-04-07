public class PrintJob implements Runnable {
	Printer printer;
	String message;

	public PrintJob(Printer printer, String message) {
		this.printer = printer;
		this.message = message;
  
	}

	public void run() {
		printer.print(message);
	}

	public static void main(String args[]) {

		Printer p1 = new Printer();

		PrintJob pj = new PrintJob(p1, "Resume print by T1 thread");

		Thread t1 = new Thread(pj,"T1");
		t1.start();
		

		PrintJob pj2 = new PrintJob(p1, "Resume print by T2 thread");

		Thread t2 = new Thread(pj2,"T2");

		t2.start();

		

		PrintJob pj3 = new PrintJob(p1, "Resume print by T3 thread");

		Thread t3 = new Thread(pj3,"T3");
		t3.start();
		}

}