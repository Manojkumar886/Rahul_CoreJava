package Core_Java.Inheritance.HierarchicalInheritance;

public class NamakkalDistrict
{
        public void famousplaces()
        {
            System.out.println("It is functioning from 01-01-1997.It consists of 8 Taluks namely Namakkal. Rasipuram, Tiruchengode , Paramathi Velur, KolliHills, Sendamangalam , Komarapalayam and Mohanur.");
        }
}


 class Trichengodetaluk extends NamakkalDistrict
{
    public void tgodefamousplaces()
    {
        System.out.println("Sankagiri Fort. Historic Sites.\n" +
                "Jain Temple. Religious Sites.\n" +
                "Sri Peria Mariamman Temple. Religious Sites.\n" +
                "Sangameswarar Temple. Religious Sites.\n" +
                "Thindal Murugan Temple. Religious Sites.\n" +
                "Siddhar Temple. Religious Sites.\n" +
                "1008 Shiva Temple Salem. Religious Sites.\n" +
                "Ardhanareeswarar Temple.");
    }

    public static void main(String[] args) {

        Trichengodetaluk taluk=new Trichengodetaluk();
        taluk.tgodefamousplaces();
        taluk.famousplaces();
    }
}

 class Rasipuramtaluk extends NamakkalDistrict
{

}

 class KumarapalayamTaluk extends NamakkalDistrict
{

}