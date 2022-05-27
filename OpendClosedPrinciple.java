public class OpenClosedPrinciple {
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.speak();
        Cat cat=new Cat();
        cat.speak();
    }
}
interface Animal{
    public void speak();
}
class Dog implements Animal{
    public void speak(){
        System.out.println("bow..bow..");
    }
}
class Cat implements Animal{
    public void speak(){
        System.out.println("Meow..Meow..");
    }
}
class Lion implements Animal{
    public void speak(){
        System.out.println("Roar.....");
    }
}