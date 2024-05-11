package core_java.Array;

import java.util.Scanner;

public class ReadingAnArray
{
    public static void main(String[] args)
    {
        String colors [] ={"blue","black","pink","red","violet","brown","white"};
        System.out.println(" top 3 colors available");
        for(int i=0;i<=2;i++)
        {

            System.out.println(colors[i]);
        }

        System.out.println(" odd position colors are");

        for(int i=1;i< colors.length;i+=2)
        {
            System.out.println(colors[i]);
        }

        System.out.println(" reverse order colors");

        for(int i= colors.length-1;i>=0;i--)
        {
            System.out.println(colors[i]);
        }


        Scanner scan=new Scanner(System.in);

        System.out.println(" which position of value you want check");
        int size=scan.nextInt();
        System.out.println(colors[size]);
    }
}
