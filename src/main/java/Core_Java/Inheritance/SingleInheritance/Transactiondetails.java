package Core_Java.Inheritance.SingleInheritance;

public class Transactiondetails extends BankDetails
{

    String transactiondetails=" today total transaction limit is over..!";//global variable

    public static void main(String[] args)
    {
        Transactiondetails transaction=new Transactiondetails();

        System.out.println(transaction.transactiondetails);

        transaction.BankAccoutdetails();

        System.out.println(balance);//
//
//        BankDetails bank=new BankDetails();
//
//        bank.transactiondetails
//
    }

}
