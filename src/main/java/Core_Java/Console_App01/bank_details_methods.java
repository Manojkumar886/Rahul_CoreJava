package Core_Java.Console_App01;

public interface bank_details_methods
{
    public Account_Details createAccount(Account_Details accountdetails1);

    public void listallAccounts();

    public double withdraw(double withdrawamount);

    public void deposit(double depositamount);

    public void findoneAccount(long accno);

    public void deleteoneAccount(long accountnumber);

}
