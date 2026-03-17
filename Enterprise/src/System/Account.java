package System;

import java.util.ArrayList;
import java.util.List;

public abstract  class Account {

    protected double saldo;
    protected int number;
    public  Client client;


    public double deposit(double value) {

        return saldo += value;
    }

    public int getNumber() {
        return number;
    }

    public double getSaldo() {
        return saldo;
    }

    public void transfer(Account contaDestino, double valor) {

        this.withdraw(valor);
        contaDestino.deposit(valor);

    }

    public abstract void withdraw(double valor);


    public String toString() {
        return "Account{" +
                "number=" + number +
                ", saldo=" + saldo +
                ", client=" + client +
                '}';
    }
}

