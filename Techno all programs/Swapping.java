public class Swapping{
	public static void main (String args []) {
		int a = 20;
		int b = 10;
		a = a + b; // a now becomes 30 (20 + 10)
        b = a - b; // b now becomes 20 (30 - 10)
        a = a - b;
		
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		
	}
	
}
