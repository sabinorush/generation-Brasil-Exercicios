import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int idade, meses, idadeEmDias, dias;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite a sua idade em anos: ");
		idade = leia.nextInt();
		System.out.println("\nDigite a sua idade em meses: ");
		meses = leia.nextInt();
		System.out.println("\nDigite a sua idade em dias: ");
		dias = leia.nextInt();
		
		idadeEmDias = idade * 365 + meses * 30 + dias;
		
		System.out.printf("\nSua idade em dias é: " + idadeEmDias);
	}

}
