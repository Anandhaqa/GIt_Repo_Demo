public class Demo{
    public void method1(){
        System.out.println("Method1 Called");
    }

    public void method2(){
        System.out.println("Method2 Called");
    }

    public void testqa(){
        System.out.println("Method3 invoked");
    }
    
    public static void main(String[] args) {
        System.out.println("Verify");
        Demo dd = new Demo();
        dd.method1();
        dd.testqa();
    }
}
