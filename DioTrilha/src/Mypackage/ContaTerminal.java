package Mypackage;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner le=new Scanner (System.in);
		
		int numero;
		String afirmativo, agencia, NomedoCliente="Julia MI";
		Double saldo=237.48;
		
		System.out.print("Possui Cadastro S/N?");
		afirmativo=le.next();
		le.nextLine();
		
		
		
		if(afirmativo.equalsIgnoreCase("S")) {
		
		System.out.println("Por favor, digite sua Agencia");
		agencia=le.nextLine();
		
		System.out.print("Numero da conta :");
		numero=le.nextInt();
		
		System.out.print("Olá "+NomedoCliente+",obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque");
		
		}else {
			
			System.out.print("Entre em contato com 000-000-000");
		}
		
			
			le.close();
			
			
		}
		
		

	}


