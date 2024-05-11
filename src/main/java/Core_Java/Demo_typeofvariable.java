package core_java;

import java.util.Scanner;

public class Demo_typeofvariable
{
    static int emp_exp=2; //static variable

    double emp_salary=3.6; //global variable
    public void sample()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println(" enter your contact no");
        long contactno=scan.nextLong(); //local variable
        System.out.println(contactno+" this is my personal number");
//called global variable -yes
        System.out.println("ey emp salary is "+emp_salary);//global
//        called static variable
        System.out.println(" my experience :"+emp_exp);//static
    }

    public static void main(String[] args)
    {
        String student_name="Rahul"; //Instance variable

        System.out.println("my name is "+student_name);

//        object syntex
//        classname objectname=new classname();

        Demo_typeofvariable obj=new Demo_typeofvariable();

        obj.sample();

        System.out.println("Thank you");
        //called global variable -yes
        System.out.println("ey emp salary is "+obj.emp_salary);//global variable

//        called static variable
        System.out.println(" my experience :"+emp_exp);//static

    }

}
