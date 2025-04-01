package Mypackage;

import java.util.Locale;
import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner le = new Scanner(System.in);

        System.out.print("Digite o parametro 1: ");
        int parametroUm = le.nextInt();

        System.out.print("Digite o parametro 2: ");
        int parametroDois = le.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException ex) {
            System.out.println("Erro: O segundo parâmetro deve ser maior que o primeiro.");
        } finally {
            le.close();
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
        }

        int contagem = parametroDois - parametroUm;

        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo número " + i);
        }
    }
}
