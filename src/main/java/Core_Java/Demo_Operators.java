package core_java;

import java.util.Scanner;

public class Demo_Operators
{
    public static void main(String[] args)
    {
        int emp_age=39;
        int manager_age=56;

        int empmanager_age=emp_age+manager_age; //95

        empmanager_age+=5; //95+5=100

        System.out.println(empmanager_age);//100
        System.out.println(emp_age<=manager_age); //true

        System.out.println((emp_age>=manager_age) || (empmanager_age==100)); //true

        System.out.println(!(emp_age>=35));

        System.out.println(++emp_age);//40

        System.out.println(emp_age--);  //40

        System.out.println(--emp_age);//38

//        ternary oeprator

//        boolean myvalues =( emp_age !=38 )? true :false ;
//        System.out.println(myvalues);

        System.out.println("which season are you like?");
        Scanner scan=new Scanner(System.in);

        String season=scan.nextLine();


        String myvalues=
                (season.equals( "summer"))?
                        "you are like summer" :
                        (season.equals("winter"))?
                                "you are like winter":
                                "nothing to like";


        System.out.println(myvalues);

    }

}
