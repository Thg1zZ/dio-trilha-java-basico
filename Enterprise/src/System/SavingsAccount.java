package System;

public class SavingsAccount extends Account {

    private double TaxRedempent;


    public SavingsAccount(int number, Client client, double taxRedempent) {

        this.number = number;
        this.client = client;
        this.TaxRedempent = taxRedempent;

    }

     @Override
     public void withdraw(double valor) {

        if (saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }

    }

    public void aplicarRendimento( double taxRedempent) {
        saldo += saldo * taxRedempent;
    }

    public double getTaxRedempent() {
        return TaxRedempent;
    }

    public void setTaxRedempent(double taxRedempent) {
        this.TaxRedempent = taxRedempent;
    }
}
