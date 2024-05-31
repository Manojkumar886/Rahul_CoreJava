package Core_Java.Console_App01;

import java.util.Arrays;
import java.util.Scanner;

public class Accountdetails_informations implements bank_details_methods
{
    static Scanner scan=new Scanner(System.in);
    Account_Details []  accountdetails =new Account_Details[10];

//    constructor
    public Accountdetails_informations()
    {

        accountdetails[0]=new Account_Details("Manojkumar",78378738378l,"IDIB003E67","Elachipalayam",13500);
        accountdetails[1]=new Account_Details("Rahul",78378738379l,"IDIB003E67","Rasipuram",3500);
        accountdetails[2]=new Account_Details("Manojkumar",78378738380l,"IDIB003E67","Trichengode",11500);
        accountdetails[3]=new Account_Details("Manojkumar",78378738381l,"IDIB003E67","Gurusamipalayam",78530.89);
    }

    @Override
    public Account_Details createAccount(Account_Details accountdetails1) {

        for(int i=0;i<accountdetails.length;i++)
        {
            if(accountdetails[i]==null)
            {
                accountdetails[i]=accountdetails1;
                System.out.println(accountdetails1.getAccountHoldername()+" has been added you account in zealous bank");
                return accountdetails1;
            }
        }
        return accountdetails1;
    }

    @Override
    public void listallAccounts() {

        for(int i=0;i<accountdetails.length;i++)
        {
            System.out.println(accountdetails[i]);
        }

    }

    @Override
    public double withdraw(double withdrawamount) {
        System.out.println(" Enter your account no");
        long accountno=scan.nextLong();

        for(int i=0;i<accountdetails.length;i++)
        {
            if(accountdetails[i].getAccountNumber() == accountno)
            {
                System.out.println("current balance :"+accountdetails[i].getAccountbalance());
                if( (withdrawamount>0)&&(accountdetails[i].getAccountbalance()>=withdrawamount))
                {
                    accountdetails[i].setAccountbalance(
                            accountdetails[i].getAccountbalance()-withdrawamount
                    );
                    System.out.println(withdrawamount+" withdraw successfully");
                   break;
                }
                else
                {
                    System.out.println("Insuffient amount");
                }
            }
        }
        return withdrawamount;
    }

    @Override
    public void deposit(double depositamount)
    {
        System.out.println(" Enter your account no");
        long accountno=scan.nextLong();

        for(int i=0;i<accountdetails.length;i++)
        {
            if(accountdetails[i].getAccountNumber() == accountno)
            {
                if( (depositamount>0)) {
                    accountdetails[i].setAccountbalance(
                            accountdetails[i].getAccountbalance() + depositamount
                    );
                    System.out.println(depositamount + "added successfully");
                    System.out.println("current balance :"+accountdetails[i].getAccountbalance());
                    break;
                }
            }
        }
    }

    @Override
    public void findoneAccount(long accno)
    {
        for(int i=0;i<accountdetails.length;i++)
        {
            if(accountdetails[i].getAccountNumber()==accno)
            {
                Account_Details findaccount=accountdetails[i];
                System.out.println(accountdetails[i]);
                break;
            }
        }
    }

    @Override
    public void deleteoneAccount(long accountnumber)
    {
        for(int i=0;i<accountdetails.length;i++)
        {
            if(accountdetails[i].getAccountNumber()==accountnumber)
            {
               accountdetails[i]=null;
                break;
            }
        }

    }

    public static void main(String[] args)
    {
        Accountdetails_informations information =new Accountdetails_informations();

        do
        {
            System.out.println( "1.CreateAccount \n " +
                    "2.ListallAccountdetails \n"+
                    "3.FindAccount \n"+
                    "4.Withdraw \n"+
                    "5.Deposit \n"+
                    "6.DeleteAccount \n"+
                    "7.Exit \n which process you want to search (enter only numeric)");
            int choice=scan.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.println(" you are choose new account create \n please enter follow the details\n");
                    System.out.println(" Enter your details \n AccountHolderName\n Account Number \n Account IFSC CODE \n AccountHolderaddress \n CurrentBalance");
                    Account_Details account1=new Account_Details(scan.next(),scan.nextLong(),scan.next(),scan.next(),scan.nextDouble());
                    information.createAccount(account1);
                    break;
                case 2:
                    System.out.println("List all Account details: \n");
                    information.listallAccounts();
                    break;
                case 3:
                    System.out.println("Enter your account no");
                    long accountno=scan.nextLong();
                    information.findoneAccount(accountno);
                    break;
                case 4:
                    System.out.println("Enter your withdraw amount:");
                    double withdrawamount=scan.nextDouble();
                    information.withdraw(withdrawamount);
                    break;
                case 5:
                    System.out.println("Enter your deposit amount:");
                    double depositamount=scan.nextDouble();
                    information.deposit(depositamount);
                    break;
                case 6 :
                    System.out.println("Enter your account no");
                    long accno=scan.nextLong();
                    information.deleteoneAccount(accno);
                    break;
                default:
                    return;
            }

        }while (true);
    }
}
