package System;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Bank {

    private List<Client> clients =new ArrayList<>();
    private List<Account> accounts = new ArrayList<>();


    public void addClient (Client client) {
        clients.add(client);
    }


    public List<Client> getClients() {
        return clients;
    }

    public void addAccount (Account account) {
        accounts.add(account);
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public Account findAccount(int number) {

        for (Account acc : accounts) {
            if (acc.getNumber() == number) {
                return acc;
            }
        }

        return null; // não encontrou
    }




}
