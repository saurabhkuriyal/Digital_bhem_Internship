import java.sql.SQLOutput;
import java.util.*;
public class Main {
    public static Scanner sc=new Scanner(System.in);
    private static int AccountNumber=11111;
    private static int AccountPin=1234;
    public static float balance=10000f;
    public static String transacHist="history--->\n";

    //function for Transaction History
    public static void transactionHis()
    {
        System.out.println(transacHist);

    }

    // function for Withdraw
    public static void withdraw(){
        System.out.println("Enter amount to be withdrawn");
        float m=sc.nextInt();
        if(m<balance) {
            balance = balance - m;
            System.out.println("Withdrawal successful");
            System.out.println("Current balance Rs" + balance);
            transacHist = transacHist + m + "Rs is withdrawn\n";
        }
        else
        {
            System.out.println("Insufficient balance for this amount");
        }
    }

    // function for deposit
    public static void deposit(){
        System.out.println("Enter amount to be deposited");
        float m=sc.nextInt();
            balance = balance + m;
            System.out.println("Current Balance Rs" + balance);
            transacHist = transacHist + m + "Rs is deposited\n";

    }

    //function for transferring money
    public static void transfer(){
        System.out.println("Enter the name of the reciever");
        String name=sc.next();
        System.out.println("Enter account number of receiver");
        int n=sc.nextInt();

        System.out.println("Enter amount");
        int l=sc.nextInt();
        if(l<balance) {
            balance = balance - l;
            System.out.println("Transfer successfully");
            System.out.println("Current balance Rs" + balance);
            transacHist = transacHist + l + "Rs is sent to " + name + "\n";
        }
        else
        {
            System.out.println("Insufficient balance for this amount");
        }
    }

    public static void main(String[] args) {

        System.out.println("-----WELCOME------");
        System.out.println("Enter your Account number");
        int accNum=sc.nextInt();
        System.out.println("Enter pin");
        int aPin=sc.nextInt();

        // Authentication
        if (accNum==AccountNumber && aPin==AccountPin){
            System.out.println("-----Login successfully-----");
            int t = 0;
            while( t==0) {
                System.out.println("\nChoose one option--->");
                System.out.println("1.Transaction History\n2.Withdraw\n3.Deposit\n4.Transfer\n5.Quit");
                int n = sc.nextInt();
                switch (n) {
                    case 1:
                        transactionHis();
                        break;
                    case 2:
                        withdraw();
                        break;
                    case 3:
                        deposit();
                        break;
                    case 4:
                        transfer();
                        break;
                    case 5:
                        t=5;
                        break;
                    default:
                        System.out.println("Choose correct option");
                }
            }
        }
        else
        {
            System.out.println("Login failed");
        }

    }
}