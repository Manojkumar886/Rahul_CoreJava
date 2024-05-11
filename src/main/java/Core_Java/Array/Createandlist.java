package core_java.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Createandlist
{
    public static void main(String[] args)
    {

        int a=10;
        System.out.println(" a value :"+a);

//        compile time memory allocation
        String [] iplteams= {"CSK","MI","RR","DC","RCB","KKR"};

//        System.out.println(" my array fivth position value :"+iplteams[5]);

//        System.out.println(" IPL FAVORIATE TIME LIST :"+ Arrays.toString(iplteams));

//        System.out.println(iplteams.length);

        for(int i=0;i< iplteams.length ;i++)
        {
            System.out.println(iplteams[i]);
//            iplteams[0]=csk;
//             [1]=mi;
        }

        Createandlist.sizeofarray();
    }

    public static void sizeofarray()
    {
        char [] companyname= new char[11];

//        companyname[0]='Z';
//        companyname[1]='E';
//        companyname[2]='A';

        for(int size=0;size< companyname.length;size++)
        {
            Scanner scan=new Scanner(System.in);

            System.out.println(" company "+size+" position letter is ");

            companyname [size] =scan.next().charAt(0);
        }

//        System.out.println(Arrays.toString(companyname));


//        FOR EACH

        for(char mycompanyname : companyname )
        {
            System.out.println(mycompanyname);
        }
    }
}
