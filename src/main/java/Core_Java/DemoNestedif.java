package core_java;

import java.util.Scanner;

public class DemoNestedif
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println(" Enter your age ..?");
        int age =scan.nextInt();



        if(age>=18) //outer block
        {
            System.out.println(" you are age is eligible to donate blood");
            System.out.println(" Enter your weight..?");
            int weight= scan.nextInt();
            if((weight<=45) && (weight>=18)) //inner block
            {
                System.out.println("the person eligible to donate blood (2 bottle blood)..!");
                System.out.println(" how many bottle of blood you donate?");
                int donatebottlecount =scan.nextInt();
                if(donatebottlecount==1)
                {
                    System.out.println(" you are good...!");
                }
                else if(donatebottlecount==2) {
                    System.out.println(" you are excellent...!");
                }
                else
                {
                    System.out.println(" you are criminal....!");
                }
            }
            else if(weight>45)
            {
                System.out.println(" the person  eligible to donate blood (1 bottle blood)");
            }
            else
            {
                System.out.println(" the person not eligible to donate blood....!");
            }
        }
        else
        {
            System.out.println(" your age is not eligible to donate blood");
        }

    }
}
