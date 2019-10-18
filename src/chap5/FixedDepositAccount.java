
package chap5;

public class FixedDepositAccount extends BankAccount{

    private FixedDepositAccount(int accountNo, String accountName, double balance) {
        super(accountNo, accountName, balance);
    }
    
    public static FixedDepositAccount createFDA(int accountNo, String accountName, double balance){
        if (balance >= 1000) {
            return new FixedDepositAccount(accountNo, accountName, balance);
        } else {
            return null;
        }
    }

    @Override
    public void deposit(double amount) {
        System.out.println("ฝากเงินบัญชีเงินฝากประจำ จำนวน : "+amount);
        double bal = getBalance() + amount;
        if (amount >= 500) {
            setBalance(bal);
        } else {
            System.out.println("ฝากเงินไม่ได้ครับ ยอดฝากขั้นต่ำ >= 500");
        }
    }

}
