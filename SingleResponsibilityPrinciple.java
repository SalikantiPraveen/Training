public class SingleResponsibilityPrinciple {
    public static void main(String[] args) {
        BankService bs=new BankService();
        bs.deposite(1000,"ABC");
        NotificationService notification=new NotificationService();
        notification.sendOTP("mobile");
        Loan loan=new Loan();
        loan.getLoan("carloan");

    }
}
class BankService{
    public long deposite(long amount,String account){
        System.out.println(amount+"$ is credited to "+account+" account");
        return 0;
    }
    public long withdraw(long amount,String account){
        System.out.println(amount+"$ is debited from "+account+" account");
        return 0;
    }
}
class NotificationService{
    public void sendOTP(String type){
        if(type.equals("email"))
        System.out.println("otp sent through email");
        else if(type.equals("mobile"))
        System.out.println("otp sent through mobile");
        else System.out.println("not available");
    }
}
class Loan{
    public void getLoan(String type){
        if(type.equals("homeloan"))
        System.out.println("homeloan is sanctioned");
        else if(type.equals("carloan"))
        System.out.println("car loan is sanctioned");
        else if(type.equals("goldloan"))
        System.out.println("gold loan is sanctioned");
    }
}