package Core_Java.Overriding;

import java.util.Scanner;

public class Vehicle
{
    public String vehicleType()
    {
        return "CAR";
    }

    public void car(String carbrand,int carCC)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println(" What is your favoriate car");
        String favcar=scan.nextLine();

        if(favcar.equalsIgnoreCase(carbrand))
        {
            System.out.println(" CAR CC :"+carCC);
        }
        else
        {
            System.out.println(" NOt Equal...!");
        }
    }
}
