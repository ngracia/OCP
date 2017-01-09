package EnthuwareExams.test1;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

/**
 * Created by Nestor Gracia on 1/9/2017.
 */
public class BankAccount extends Account {
    private double balance;

    public BankAccount(String id, double balance) {
        super(id);
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void main(String args []){
        Map<String, Account> myAccts = new HashMap<>();
        myAccts.put("111", new Account("111"));
        myAccts.put("111", new BankAccount("111", 2.00));

        BiFunction<String, Account, Account> bif = (a1, a2) -> a2 instanceof BankAccount? new BankAccount(a1, 300.0): new Account(a1);
        myAccts.computeIfPresent("222", bif);
        BankAccount ba = (BankAccount) myAccts.get("222");
        System.out.println(ba.getBalance());
    }
}
