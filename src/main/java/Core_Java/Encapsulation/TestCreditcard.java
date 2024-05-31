package Core_Java.Encapsulation;

public class TestCreditcard
{
    public static void main(String[] args)
    {
        Creditcard card1=new Creditcard();

        card1.setCardnumber(865654567556l);
        card1.setCardaddress("Elachipalayam");
        card1.setCardbalance(45000);

        System.out.println(card1.getCardnumber());
        System.out.println(card1.getCardaddress());
        System.out.println(card1.getCardbalance());

        Creditcard card2=new Creditcard(79373873876l,"Namakkal",90000.0f);

        System.out.println(card2);
//        System.out.println(card2.getCardbalance());
//        System.out.println(card2.getCardnumber());
//        System.out.println(card2.getCardaddress());

    }
}
