package Core_Java.Inheritance.MultilevelInheritance;

public class Animal
{
    public void eat()
    {
        System.out.println("What will an animal eat?\n" +
                "Some eat green plans and plant products and are called herbivores like cow and deer. Some feed on flesh of other animals and are called carnivores. Like lion. Some animals eat both plants and animals and are called omnivores, like humans, rat etc.");
    }
}


class dog extends Animal
{

    public void bark()
    {
        System.out.println("Dogs bark when their family and petparents come home, when they are playing, when they are excited, when they are left alone, when a stranger approaches their territory, when they want attention, etc., and their bark sounds different depending on the context.");
    }
}

class labrator extends dog
{
    public void playfreedom()
    {
        System.out.println("On average in India, a Labrador Retriever puppy price from a reputable breeder ranges between Rs 9,000 to Rs 50,000 or even higher. Often puppies coming from champion bloodlines or exceptional pedigrees like ones working in the Police workforce, come with exceptionally higher prices.");
    }

    public static void main(String[] args)
    {
        labrator lab=new labrator();

        lab.playfreedom();
        lab.bark();
        lab.eat();

    }
}