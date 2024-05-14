package Core_Java.Abstraction;

public abstract class AllBank
{
    public void AllbankNames()
    {
        System.out.println("\n" +
                "Bank Name\n" +
                "Allahabad Bank\n" +
                "Andhra Bank\n" +
                "Axis Bank\n" +
                "Bank of Bahrain and Kuwait\n" +
                "Bank of Baroda - Corporate Banking\n" +
                "Bank of Baroda - Retail Banking\n" +
                "Bank of India\n" +
                "Bank of Maharashtra\n" +
                "Canara Bank\n" +
                "Central Bank of India\n" +
                "City Union Bank\n" +
                "Corporation Bank\n" +
                "Deutsche Bank\n" +
                "Development Credit Bank\n" +
                "Dhanlaxmi Bank\n" +
                "Federal Bank\n" +
                "ICICI Bank\n" +
                "IDBI Bank\n" +
                "Indian Bank\n" +
                "Indian Overseas Bank\n" +
                "IndusInd Bank\n" +
                "ING Vysya Bank\n" +
                "Jammu and Kashmir Bank\n" +
                "Karnataka Bank Ltd\n" +
                "Karur Vysya Bank\n" +
                "Kotak Bank\n" +
                "Laxmi Vilas Bank\n" +
                "Oriental Bank of Commerce\n" +
                "Punjab National Bank - Corporate Banking\n" +
                "Punjab National Bank - Retail Banking\n" +
                "Punjab & Sind Bank\n" +
                "Shamrao Vitthal Co-operative Bank\n" +
                "South Indian Bank\n" +
                "State Bank of Bikaner & Jaipur\n" +
                "State Bank of Hyderabad\n" +
                "State Bank of India\n" +
                "State Bank of Mysore\n" +
                "State Bank of Patiala\n" +
                "State Bank of Travancore\n" +
                "Syndicate Bank\n" +
                "Tamilnad Mercantile Bank Ltd.\n" +
                "UCO Bank\n" +
                "Union Bank of India\n" +
                "United Bank of India\n" +
                "Vijaya Bank\n" +
                "Yes Bank Ltd\n");
    }
    public abstract int getinterest();
}


class Indianbank extends AllBank
{

    public int getinterest()
    {
        return 10;
    }
}


class CanaraBank extends AllBank
{
    public int getinterest()
    {
        return 12;
    }
}


class TestingProcess extends AllBank
{

    public int getinterest()
    {
        return 5;
    }
    public static void main(String[] args)
    {
//        AllBank a=new AllBank() ;
//      int bankaverage=  a.getinterest();
//        System.out.println(" Average Bank Interest :"+bankaverage);

      AllBank a1=new CanaraBank(); //upcasting

      int canarabankinterest =a1.getinterest();

        System.out.println(" Canara bank interest :"+canarabankinterest);

        AllBank a2=new Indianbank();

        int indianbankinterest =a2.getinterest();
        System.out.println(" Indian bank interest :"+indianbankinterest);



    }
}