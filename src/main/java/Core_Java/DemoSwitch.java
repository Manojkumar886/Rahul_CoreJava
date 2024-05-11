package core_java;

import java.util.Scanner;

public class DemoSwitch
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);

        System.out.println(" which programming languages you know?");

        String langauge=scan.next();

        switch (langauge)
        {
            case "java" :
                System.out.println(" wow..! you like java langauge");
                System.out.println(" which java version you know?");
                int version=scan.nextInt();
                switch (version)
                {
                    case 8:
                        System.out.println(" this is java best version compare to before java 7");
                        break;
                    case 14:
                        System.out.println(" this version currently not used in IT field..!");
                        break;
                    default:
                        System.out.println(" nothing ");
                }
                break;
            case "python":
                System.out.println("wow...! you like python langauge");
                break;
            default:
                System.out.println(langauge+ "this is currently not fair...!");
        }

//        if(langauge.equalsIgnoreCase("java"))
//        {
//            System.out.println(" wow..! you like java langauge");

//        } else if (langauge.equals("python")) {
//            System.out.println("wow...! you like python langauge");
//        }

    }
}
