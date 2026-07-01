public class Demo{
    public void method1(){
        System.out.println("Method1 Called");
    }

    public void method2(){
        System.out.println("Method2 Called");
    }
    
    public static void main(String[] args) {
        System.out.println("Verify");
        Demo dd = new Demo();
        dd.method1();
    }
}
