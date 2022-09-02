import java.time.LocalDateTime;
import java.util.Scanner;
public class bankDetails {
    private String account_number;
    private String name;
    private int age;
    private LocalDateTime date_of_birth;
    private String account_type;
    private long balance;
    Scanner sc=new Scanner(System.in);

    public void openaccount(){
        System.out.println("Enter Name:");
        name=sc.next();
        System.out.println("Enter Age:");
        age=sc.nextInt();
        System.out.println("Enter Date of Birth:");
        date_of_birth= LocalDateTime.parse(sc.next());
        System.out.println("Enter Account number:");
        account_number= sc.next();
        System.out.println("Enter Account type:");
        account_type= sc.next();
        System.out.println("Enter Balance:");
        balance=sc.nextLong();
        
    }
    public void showAccount(){
        System.out.println("Name of Account Holder:"+name);
        System.out.println("Age of Account Holder:"+age);
        System.out.println("Date of Birth of Account Holder:"+date_of_birth);
        System.out.println("Account number:"+account_number);
        System.out.println("Account type:"+account_type);
        System.out.println("Balance:"+balance);
    }
    public void withdrawal(){
        long amt;
        System.out.println("Enter the amount you want to withdraw:");
        amt= sc.nextLong();
        if (balance>=amt){
            balance=balance-amt;
            System.out.println(balance+"remains in your account");
        }else {
            System.out.println("Your balance is less then"+amt+"\tTransaction failed!");
        }
    }
    public void deposit(){
        long amt;
        System.out.println("Enter the amount you wan to deposit:");
        amt= sc.nextLong();
        balance=balance+amt;
        System.out.println(balance);
    }
    public  boolean search(String account_no){
        if (account_number.equals(account_no)) {
            showAccount();
            return (true);
        }
        return false;
    }
}
