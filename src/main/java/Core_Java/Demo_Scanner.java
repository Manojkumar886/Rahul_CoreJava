package core_java;

import java.util.Scanner;

public class Demo_Scanner
{
    public static void main(String[] args)
    {

        Scanner scan=new Scanner(System.in);

        System.out.println(" what is your name");

        String emp_name= scan.nextLine();
        System.out.println(" enter your id");
        int emp_id=scan.nextInt();

        System.out.println("my empname is "+emp_name);

        System.out.println(" my id is "+emp_id);

    }
}
