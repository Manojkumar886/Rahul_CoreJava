package Core_Java.Constructor;

public class ParameterizedConstructor
{
    String MobileBrand;
    int mobileprice;
    Long MobileNumber;

    public ParameterizedConstructor(String MobileBrand,int MobilePrice,long MobileNumber)
    {
       this.MobileBrand=MobileBrand;
       mobileprice=MobilePrice;
       this.MobileNumber=MobileNumber;


    }

    public static void main(String[] args)
    {

        ParameterizedConstructor obj=new ParameterizedConstructor("Oneplus",21000,9789355676l);

        System.out.println("Mobile price"+obj.mobileprice);
        System.out.println("Mobile Brand"+obj.MobileBrand);
    }
}
