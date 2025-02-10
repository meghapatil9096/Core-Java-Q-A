package main;
abstract class animal
{
    public abstract void sound();
}
 class Dog extends animal
{
    public void sound()
    {
        System.out.println("Dog is barking");
    }
}
class Lion extends animal
{
    public void sound()
    {
        System.out.println("Lion is Roar");
    }
}

public class Abstraction1 {
    public static void main(String[] args) {
        animal d = new Dog();
        animal l = new Lion();

        d.sound();
        l.sound();
    }
}
