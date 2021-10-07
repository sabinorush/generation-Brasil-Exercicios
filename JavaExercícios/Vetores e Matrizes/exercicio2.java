import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numeros = new int[6];
		int somaPar = 0, imparCont = 0, i;

		Scanner leia = new Scanner(System.in);

		for (i = 0; i < 6; i++) {
			System.out.print("\nEntre com um valor: ");
			numeros[i] = leia.nextInt();

			if (numeros[i] % 2 == 0) {
				somaPar += numeros[i];
			} else {
				i = imparCont++;
			}
		}

		for (i = 0; i < 6; i++) {
			if (numeros[i] % 2 == 0) {
				System.out.print("\nNumero par digitado: " + numeros[i]);
			} else {
				System.out.print("\nNumero impar digitado: " + numeros[i]+"\n");
			}
		}

		System.out.print("\nQuantidade de impar digitado: " + imparCont);
		System.out.print("\nA soma dos numeros pares: " + somaPar);
	}

}
