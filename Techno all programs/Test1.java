
class A{
    A(){
        //super()
        System.out.println("A");
    }
}
class B extends A { 
    B(){
        //super()
        System.out.println("B");
    }
    B(String str){
        //super()
        System.out.println(str);
    }
}
class C extends B{
    C(){
        this("C");
        System.out.println("C");
    }
    C(String str){
        super("class B");
        System.out.println(str);
    
    }
}
public class Test1{
    public static void main(String[] args) {
        
        C c1 = new C();
    }
}
