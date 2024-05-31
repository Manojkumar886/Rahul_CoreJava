package Core_Java;

import java.util.Arrays;

public class DemoOverloading
{

    public void arraypassing()
    {
        System.out.println(" Passing an array using overloading ,....!");
    }

    public void arraypassing(String [] colors)
    {

        System.out.println(" color update");
        int pos=3;
        String newcolor="Pink";
        colors[pos]=newcolor;
        System.out.println(Arrays.toString(colors));
    }

    public void arraypassing(int a)
    {
        a+=190;
        System.out.println("a value in method"+a);
    }
    public static void main(String[] args)
    {
        String [] colors={"Blue","Red","White","Purple","Black","Green","Yellow"};

        DemoOverloading over=new DemoOverloading();

        over.arraypassing();

        over.arraypassing(colors);

        System.out.println(Arrays.toString(colors));
        int a=10;

        over.arraypassing(a);

        System.out.println("  a value in main method"+a);

    }
}
