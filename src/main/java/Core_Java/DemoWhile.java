package core_java;

public class DemoWhile
{
    public static void main(String[] args)
    {

        int i=10;

//        ENTRY LOOP
//        while(i<=100)
//        {
//            System.out.println(i);
//
//            i+=10;
//        }


//        EXIT LOOP
        do {
            System.out.println(i);
            i+=10;
        }
        while(i>=100);

    }
}