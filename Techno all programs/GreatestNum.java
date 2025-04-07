public class GreatestNum {
	public static void main(String args []) {
		int a = 20;
				int b = 10;
				int c = 40;
				int greatest ;
				
				if (a >= b && a >= c) {
					System.out.print("greatest is:  "+a);
		            
		        } else if (b >= a && b >= c) {
		           System.out.print( "greatest is" +b);
		        } else {
		        	
		            System.out.print("greatest = "+c);
		        }
	}
}