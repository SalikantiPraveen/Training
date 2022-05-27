public class PrototypePattern {
    public static void main(String[] args) {
        Student s1=new Student(123,"Ajay",18);
        Student s2=(Student)s1.getClone();
        if(s1==s2)
        System.out.println("equal");
        else
        System.out.println("not equal");
        s2.changeName("Arun");
        s2.changeId(124);
        s1.show();
        s2.show(); 
    }
}
interface Prototype{
    public Prototype getClone();
}
class Student implements Prototype{
    private int id;
    private String name;
    private int age;
    public Student(){}
    public Student(int id,String name,int age){
        this.id=id;
        this.name=name;
        this.age=age;
    }
    public void changeId(int id){
        this.id=id;
    }
    public void changeName(String name){
        this.name=name;
    }
    public void changeAge(int age){
        this.age=age;
    }
    public void show(){
        System.out.println("Student Id:"+id+"\n"+"Student Name:"+name+"\n"+"Student Age:"+age);
    }
    public Prototype getClone(){
        return new Student(id,name,age);
    }
}