package Core_Java.Constructor;

public class DemoDefaultCons
{
    int a;

    public DemoDefaultCons()
    {
        System.out.println("Constructor is Class name Same as method name,constructor doesnt using return type.");

        a=10;
        System.out.println(" my a value is :"+a);
    }

    public static void main(String[] args) {

        DemoDefaultCons obj=new DemoDefaultCons();


    }
}
