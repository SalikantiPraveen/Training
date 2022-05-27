public class DependencyInversionPrinciple {
    private BankCard card;
    public DependencyInversionPrinciple(BankCard card){
        this.card=card;
    }
    public void payMoney(int amount){
        card.doTransaction(amount);
    }
    public static void main(String[] args) {
        DependencyInversionPrinciple dip=new DependencyInversionPrinciple(new Creditcard());
        dip.payMoney(10000);
    }
}
interface BankCard{
    public void doTransaction(int amount);
}
class Creditcard implements BankCard{
    public void doTransaction(int amount){
        System.out.println(amount+" is debited from creditcard");
    }
}
class Debitcard implements BankCard{
    public void doTransaction(int amount){
        System.out.println(amount+" is debited from debitcard");
    }
}
