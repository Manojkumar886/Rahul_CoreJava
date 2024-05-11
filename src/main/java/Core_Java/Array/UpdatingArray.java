package core_java.Array;

import java.util.Arrays;
import java.util.Scanner;

public class UpdatingArray
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);

        String [] iplteams= {"CSK","MI","RR","DC","RCB","KKR"};

        System.out.println(" before updating ipl teams :"+ Arrays.toString(iplteams));


        System.out.println(" which position of value you want update or replace :");
        int position=scan.nextInt();

        System.out.println(" you are choose to "+position+ " th position value is"+iplteams[position]+" \n please enter alter team name ");
        String newiplteam= scan.next();

        iplteams [ position] =newiplteam; //updation

        System.out.println("After updating ipl teams "+Arrays.toString(iplteams));

    }
}
