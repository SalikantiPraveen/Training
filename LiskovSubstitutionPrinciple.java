public class LiskovSubstitutionPrinciple {
    public static void main(String[] args) {
        Animal dog=new Dog();
        dog.speak();
        Animal cat=new Cat();
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
