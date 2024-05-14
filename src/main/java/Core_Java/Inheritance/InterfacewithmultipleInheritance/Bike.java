package Core_Java.Inheritance.InterfacewithmultipleInheritance;

public interface Bike
{
    public void TwoWheelerbrands();

    public void NS();


}

interface Car extends Bike
{
    public void fourwheelerbrands();
}

interface bicycle
{
    public void withoutmotor();

}

class vehicle implements Bike,Car,bicycle
{
    public void TwoWheelerbrands()
    {
        System.out.println("Two wheeler");
    }

    public void fourwheelerbrands()
    {
        System.out.println(" FOUR WHEELER");
    }
    public void withoutmotor()
    {
        System.out.println(" good for health");
    }
    public void NS()
    {
        System.out.println(" OLD IS GOLD");
    }


    public static void main(String[] args) {

        vehicle v1=new vehicle();

        v1.NS();
        v1.fourwheelerbrands();
        v1.TwoWheelerbrands();
        v1.withoutmotor();
    }

}