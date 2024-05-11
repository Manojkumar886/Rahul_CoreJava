package core_java;

public class DemoForloop
{
    public static void main(String[] args)
    {
        System.out.println(" please your output is 10 -1 reverse order nos");

//        for(int i=10 ; i>=1 ; --i)
//        {
//            System.out.println(i);
//        }

        for(int linecount=1 ; linecount<=5 ;linecount++)
        {
            for(int starcount= 1 ; starcount <=linecount ;starcount++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }

// odd or even no...!
        for(int i=1;i<=10 ;i++)
        {
            if(i%2!=0)
            {
                System.out.println(" this is even number :"+i);
            }
        }

    }
}
