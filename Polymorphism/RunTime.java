class A{
    void printInfo(){
        System.out.println("this is from a class");
    }
}

class B extends A{
    void printInfo(){
        System.out.println("This is from b class");
    }
}

public class RunTime{

    public static void check(A obj){
        obj.printInfo();
    }

    public static void main(String... l){
        
        A a = new A();
        B b = new B();
        check(a);
        check(b); 
        if(b instanceof A){
            System.out.println("vikas");
        }
    }
}