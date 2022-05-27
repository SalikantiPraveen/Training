import java.util.Scanner;

interface Polygon{
    public String getFigure();
}

class Traingle implements Polygon{
    public String getFigure(){
        return "Traingle";
    }
}

class Square implements Polygon{
    public String getFigure(){
        return "Square";
    }
}
class Pentagon implements Polygon{
    public String getFigure(){
        return "Pentagon";
    }
}
public class FactoryPattern {
    public Polygon getObject(int sides){
         switch(sides){
             case 3:return new Traingle();
             case 4:return new Square();
             case 5:return new Pentagon();
             default:return null;
         }
    }
    public static void main(String[] args) {
        FactoryPattern obj=new FactoryPattern();
        Scanner sc=new Scanner(System.in);
        Polygon p=null;
        p=obj.getObject(sc.nextInt());
        System.out.println(p.getFigure());
    }
}