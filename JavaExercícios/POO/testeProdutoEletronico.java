package pOO;

import java.util.Scanner;

public class testeProdutoEletronico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a, b, c;

		Scanner leia = new Scanner(System.in);

		System.out.print("****************** Bem-Vinde! ******************\n");
		
		System.out.println("\nQual produto eletrônico você deseja vender? ");
		a = leia.next();
		System.out.println("\nQual o estado do produto?(seja sincero): ");
		b = leia.next();
		System.out.println("\nDigite o e-mail para receber a cotação: ");
		c = leia.next();
		produtoEletronico produtoEletronico1 = new produtoEletronico(a, b, c);
		
		System.out.print("\n---------------------------------------------------\n");
		
		produtoEletronico1.imprimir();

		System.out.print("\nProduto: " + a + "\nEstado: " + b + "\nE-mail: " + c + "\n");

	}

}
