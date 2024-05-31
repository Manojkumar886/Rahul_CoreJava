package Core_Java.Overriding;

public class TestConnection extends Car
{
    public static void main(String[] args)
    {
        Car details1=new Car();
        details1.vehicleType();
        details1.car("Omni",600);

        Vehicle v2=new Vehicle();
        v2.car("BMW",8000);
        v2.vehicleType();

        Vehicle v1=new Car();
        v1.vehicleType();
        v1.car("OMNI2",900);

    }
}
