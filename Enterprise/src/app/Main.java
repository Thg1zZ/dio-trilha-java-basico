package app;

import java.util.Scanner;
import System.Client;
import System.CheckingAccount;
import System.SavingsAccount;
import System.Bank;

public class Main {

    public static void main(String[] args) {

        var bank = new Bank();

        var client1 = new Client("Thiago Gomes","21232323232",1);
        var client2 = new Client("Maria Silva","99999999999",2);

        bank.addClient(client1);
        bank.addClient(client2);

        CheckingAccount account1 = new CheckingAccount(500,1001,client1);
        SavingsAccount account2 = new SavingsAccount(2001,client2,0.02);

        bank.addAccount(account1);
        bank.addAccount(account2);

        account1.deposit(1000);
        account1.transfer(account2,300);

        System.out.println(account1.getSaldo());
        System.out.println(account2.getSaldo());

        System.out.println(bank.findAccount(1001));

        System.out.println(account2);
    }
}