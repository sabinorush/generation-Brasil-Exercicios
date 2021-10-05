import java.util.Scanner;

public class exercicioWhile1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade, cont21= 0, cont50= 0;
		
		Scanner leia = new Scanner (System.in);
		System.out.println("Entre com uma idade: ");
		idade = leia.nextInt();
		
		while(idade != -99) {
			if(idade <21) cont21++;//Armazena quantas vezes um numero que seja menor que 21 é inserido.
			if(idade >50) cont50++;//Armazena quantas vezes um numero que seja maior que 50 é inserido.
			System.out.println("\nEntre com uma nova idade(para sair digite -99): ");
			idade = leia.nextInt();
		
		}
		System.out.printf("\nTotal de pessoas com menos de 21 anos: %d", cont21);
		System.out.printf("\nTotal de pessoas com mais de 50 anos: %d", cont50);
		
	}

}
