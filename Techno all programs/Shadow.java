public class Shadow {
   static int x = 90;//this will be shadowed at the line 6
    public static void main(String[] args) {
        System.out.println(x);//output 90
        int x = 40;//class variable at the line 2 by shadowed by this
        System.out.println(x);//output 40
fun();
    }
    static void fun(){
        System.out.println(x);
    }
    
}
