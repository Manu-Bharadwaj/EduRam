public class Runner {
    public static void main(String[] args) {
        Account myAccount =new Account();
        System.out.println(myAccount.getBalance());
        myAccount.depositAmount(10000);
        myAccount.depositAmount(12000);
        myAccount.depositAmount(9000);
        myAccount.depositAmount(9000);
        myAccount.withdrawAmount(5000);
        myAccount.withdrawAmount(5000);
        myAccount.withdrawAmount(5000);
        myAccount.withdrawAmount(5000);
        myAccount.withdrawAmount(5000);
        myAccount.showAllTransactions();
        Account myAccount2 =new Account(5000);
    }
}
