
class A{
    A(){
        System.out.println("A");
    }
}
class B extends A { 
    B(){
        System.out.println("B");
    }
    B(String str){
        this();
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
class Test{
    public static void main(String[] args) {
        
        C c1 = new C("C");
    }
}
