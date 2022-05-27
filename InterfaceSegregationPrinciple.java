import java.util.Scanner;

public class InterfaceSegregationPrinciple {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        GetString cts=new GetString();
        char ch=sc.next().charAt(0);
        String name1=char.class.getName();
        String name2=(cts.charToString(ch).getClass().getSimpleName());
        if(name1.equals(name2))
        System.out.println("Classes Are Equal");
        else
        System.out.println("Classes Are Not Equal");
    }
}
interface FlaotToInt{
    public int flaotToInt(float val);
}
interface CharTOString{
    public String charToString(char ch);
}
interface IntToDouble{
    public  double intToDouble(int val);
}
class GetInteger implements FlaotToInt{
    public int flaotToInt(float val){
        return (int)val;
    }
}
class GetString implements CharTOString{
    public String charToString(char ch){
        return String.valueOf(ch);
    }
}
class GetDouble implements IntToDouble{
    public double intToDouble(int val){
        return (double)val;
    }
}