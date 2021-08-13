import java.util.ArrayList;
import java.util.Date;

public class Account {

    private double balance;
    private int noOfWithdrawls;
    private ArrayList<String> transactions;

    public Account() {
        balance = (Math.random()*1000)+10000;
        noOfWithdrawls = 0;
        transactions = new ArrayList<String>();
        transactions.add("Account Created on "+ new Date());

    }

    public Account(double balance)
    {
        if (balance>10000) {
            this.balance = balance;
            noOfWithdrawls = 0;
            transactions = new ArrayList<String>();
            transactions.add("Account Created on " + new Date());
        }
        else throw new RuntimeException("Balance Must be > 10000");
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getNoOfWithdrawls() {
        return noOfWithdrawls;
    }

    public void setNoOfWithdrawls(int noOfWithdrawls) {
        this.noOfWithdrawls = noOfWithdrawls;
    }

    public ArrayList<String> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<String> transactions) {
        this.transactions = transactions;
    }

    public String depositAmount(double depositAmount) {

        String message = "";
        if (depositAmount > 0) {
            balance = balance + depositAmount;
            recordTransaction(depositAmount, "Debited");
            message = "Amount " + depositAmount + "deposited";
        }
        else
            message = "Amount cannot be -Ve!!";
        System.out.println(message);

        return  message;


        }
    public String withdrawAmount(double withdrawAmount) {

        String message = "";
        if (withdrawAmount < balance) {
            balance = balance - withdrawAmount;
            noOfWithdrawls++;
            recordTransaction(withdrawAmount, "Credited");
            message="Withdrew Amount " + withdrawAmount ;
            if (noOfWithdrawls > 3) {
                double fee = (withdrawAmount * 0.005);
                balance = balance - fee;
                recordTransaction(withdrawAmount, "Withdrawal Fee");
                message+= " & charged fee of " +fee;
            }
        }
//        if (withdrawAmount<0)
//            message = "Amount cannot be -Ve!!";
       else
            message = "Insufficient Balance";
        System.out.println(message);

        return  message;


    }




    public void recordTransaction(double depositAmount,String operation)
    {
        transactions.add("Amoutn of Rs " + depositAmount + " "+ operation + " from your account at "+ new Date());

    }
    public void showAllTransactions()
    {
        System.out.println(transactions.toString());
    }
}
