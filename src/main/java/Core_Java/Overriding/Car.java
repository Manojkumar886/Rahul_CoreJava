package Core_Java.Overriding;

import java.util.Scanner;

public class Car extends Vehicle
{
    public String vehicleType()
    {

        return "TAXI";
    }

    public void car(String Taxibrand,int TAXiCC)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Pick up Place");
        String pickupplace=scan.nextLine();
        System.out.println(" Drop place");
        String dropplace=scan.nextLine();
        System.out.println("Enter your price");
        int price=scan.nextInt();
        if(price>=1000)
        {
            System.out.println(" YOur booking successfully");
        }
        else
        {
            System.out.println(" booking cancelled");
        }
    }
}
