package ProjectATM;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        AtmOperationInterfce op=new AtmOperationImp();
        int atmnumber=12345;
        int atmpin=123;
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome To ATM Machine !!!");
        System.out.print("Enter Atm Number : ");
        int atmNumber=sc.nextInt();
        System.out.print("Enter Pin: ");
        int pin=sc.nextInt();
        if((atmnumber==atmNumber)&&(atmpin==pin)){
            while(true){
                System.out.println("1.View Available Balance\n2.Withdraw Amount\n3.Deposit Amount\n4.View Ministatement\n5.Exit");
                System.out.print("Enter Choice : ");
                int ch=sc.nextInt();
                if(ch==1){
                    op.viewBalance();

                }
                else if(ch==2){
                    System.out.print("Enter Withdraw Amount: ");
                    double withdrawAmount=sc.nextDouble();
                    op.withdrawAmount(withdrawAmount);

                }
                else if(ch==3){
                    System.out.print("Enter Deposit Amount: ");
                    double depositAmount=sc.nextDouble();//5000
                    op.depositAmount(depositAmount);


                }
                else if(ch==4){
                    op.viewMiniStatement();

                }
                else if(ch==5){
                    System.out.println("Collect Your ATM Card\n Thank You For Using ATM Machine!!");
                    System.exit(0);
                }
                else
                {
                    System.out.println("Please Enter The Correct Choice");
                }
            }
        }
        else{
            System.out.println("Incorrect ATM Number or Pin");
            System.exit(0);
        }
        sc.close();


    }
}
