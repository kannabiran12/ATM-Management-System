import java.util.*;
class Atmcal{
    float Balance;
    int PIN=5674;

    public void checkpin(){
        System.out.println("Enter your pin:");
        Scanner sc=new Scanner(System.in);
        int enterpin=sc.nextInt();
        if(enterpin==PIN){
            menu();
        }
        else{
            System.out.println("Enter a valid pin");
        }
    }
    public void menu(){
        System.out.println("Enter your Choice:");
        System.out.println("1.Check A/C Balance:");
        System.out.println("2.Withdraw Money:");
        System.out.println("3.Deposite Money:");
        System.out.println("4.EXIT");

        Scanner sc=new Scanner(System.in);
        int opt=sc.nextInt();

        if(opt==1){
            checkBalance();
        }
        else if(opt==2){
            withDrawMoney();
        }
        else if(opt==3){
            depositeMoney();
        }
        else if(opt==4){
            return;
        }
        else{
            System.out.println("Enter a valid choice");
            menu();
        }
    }
    public void checkBalance(){
        System.out.println("Balance:"+Balance);
        menu();
    }
    public void withDrawMoney(){
        System.out.println("Enter Amount to WithDraw:");
        Scanner sc=new Scanner(System.in);
        float amount=sc.nextFloat();
        if(amount>Balance){
            System.out.println("Insufficient Balance");
        }
        else{
            Balance=Balance-amount;
            System.out.println("Money withdtrawl Succesfully");
        }
        menu();
    }
    public void depositeMoney(){
        System.out.println("Enter the Amount:");
        Scanner sc=new Scanner(System.in);
        float amount=sc.nextFloat();
        Balance=Balance+amount;
        System.out.println("Money Deposited Successfully:");
        menu();
    } 
}
public class Atm{
    public static void main(String []args){
        Atmcal obj=new Atmcal();
        obj.checkpin();
    }
}