public class NeonNum {
    public static void main(String[] args) {
        int num = 1;
        int sum = 0;
         int square = num*num;
        while (square>0){
            
            int digit = square%10 ;
            sum = sum+digit;
             square = square/10;

        }
             if(sum==num){
                System.out.println(num+" is a neon number");
             }else{
                System.out.println(num+" is not a neon number");
             }


        }
        
    }
    

