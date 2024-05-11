package core_java.Array;

import java.util.Scanner;

public class JAGGEDARRAY
{
    public static void main(String[] args)
    {

        Scanner scan=new Scanner(System.in);
        System.out.println("SKS HOSPITAL PATIENT DETAILS");

        int floor=3;

        String [] [] patientlist =new String[floor][];

        patientlist[0]=new String[3];
        patientlist[1]=new String[2];
        patientlist[2]=new String[4];

//        System.out.println(patientlist[2].length);

//        runtime patiend details add using loop concept

        for(int row=0;row< patientlist.length;row++)
        {
            for(int column=0;column<patientlist[row].length;column++)
            {

                System.out.println(" floor no"+row+" patient room no :"+column);
                System.out.println(" enter current room patient name:");
                patientlist[row][column]=scan.next();
            }
        }

//        printing patient details

        for(int row=0;row< patientlist.length;row++)
        {
            for(int column=0;column<patientlist[row].length;column++)
            {

                System.out.print(patientlist[row][column]+"\t");
            }
            System.out.println();
        }
    }
}
