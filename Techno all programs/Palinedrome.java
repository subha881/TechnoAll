public class Palinedrome {
    public static void main(String[] args) {
        int num = 121;
        int temp = num;
        int sum= 0;
        while(num>0){
            int digit = num %10;
            sum = sum*10+digit;
            num = num/10;

        }
        if(sum==temp){
            System.out.println(temp+" is a palinedrome number");
        }else{
            System.out.println(temp+" is not a palindrome number");
        }
         
    
            
        }


       


    }
    

