

class Printer{
	 static void print() {
		System.out.println("Printing....");
	}
}
class ColourPrinter extends Printer{
	
	 static void print() {
		System.out.println("Printing Colour Paper....");
	}
}



public class PrinterApp {

	public static void main(String[] args) {
		Printer p1 = new ColourPrinter();
		p1.print();
	}

}



















