public class PrimeNum {
	public static void main(String args[])
	{
		int no = 5;
		boolean isprime = true;
		for (int i = 2;i<no/2;i++)
			if(no%i==0)
			{
				isprime=false;
				
			}
	
if (isprime)
{
	System.out.println(no+ " is prime a no");
}
else {
	System.out.println(no+" is not a prime no");
}
	

}
}