package System;

public class CheckingAccount extends Account {

    protected double limit ;


    public CheckingAccount(double limit, int number, Client client) {
        this.limit = limit;
        this.client = client;
        this.number= number;
    }


    @Override
    public void withdraw(double valor) {
        if(saldo +limit >= valor) {

            saldo -= valor;
        }
        else {
            System.out.println("Insufficient balance to withdraw");
        }

    }



    public double getLimit() {
        return limit;

    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    @Override
    public String toString() {
        return "CheckingAccount{" +
                super.toString() +
                ", limit=" + limit +
                '}';
    }
}


