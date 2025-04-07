public class Armstr {
     public static void main(String[] args) {
        
      
        int n = 153;
        int m =n;
        int digit = 0;
        double sum= 0;
        while(m>0){
            m = m/10;
            digit++;
        }
        System.out.println("the total digits are"+digit);
        m=n;
        while(m>0){
            int d = n%10;
            sum= sum+Math.pow(d,digit);
            m=m/10;
        }
        if(sum==n){
            System.out.println("numberis armstrong");

        }else{
            System.out.println("num is not armstrong number");
        }
    }
    public static void main(String[] args) {
        
        
    }
}
