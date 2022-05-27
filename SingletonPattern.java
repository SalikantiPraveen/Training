public class SingletonFactory {
    public static void main(String[] args) {
        Singleton S1=Singleton.getInstance();
        Singleton S2=Singleton.getInstance();
        Singleton S3=Singleton.getInstance();
        Singleton S4=Singleton.getInstance();
        Singleton S5=Singleton.getInstance();
        Singleton S6=Singleton.getInstance();
        if(S1==S2 && S2==S3 && S3==S4 && S4==S5 && S5==S6)
        System.out.println("Both Ojects are Equal");
        else
        System.out.println("Both Objects are not Equal");
        S1.show(1);
        S2.show(2);
        S3.show(3);
        S4.show(4);
        S5.show(5);
        S6.show(6);
    }
}
class Singleton{
    private static Singleton obj;
    private Singleton(){}
    public static Singleton getInstance(){
        if(obj==null){
    synchronized(Singleton.class){
        if(obj==null){
            obj=new Singleton();
        }
    }
}
        return obj;
    
}
    public synchronized void show(int x){
         System.out.println("objecrt"+x);
    }
}