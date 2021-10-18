package collections;

import java.util.InputMismatchException;
import java.util.Scanner;

public class excecao2 {

	//demonstra o lan�amento de uma exce��o quando ocorre uma divis�o por 0;
	public static int quociente(int numerador, int denominador) throws ArithmeticException {
		return numerador / denominador; // possibilita a divis�o por zero(0).
	} 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		boolean continuaLoop = true;
		
		do {
			try { //l� dois n�meros e calcula o quociente.
				System.out.print("\nEntre com o numerador: ");
				int numerador = leia.nextInt();
				System.out.print("\nEntre com o denominador: ");
				int denominador = leia.nextInt();
				
				int result = quociente(numerador, denominador);
				System.out.printf("\nResultado: %d / %d = %d\n", numerador, denominador, result);
				continuaLoop = false;
			}
			catch(InputMismatchException inputMismatchException) {
				System.err.printf("\nException: %s\n", inputMismatchException);
				leia.nextLine();
				System.out.println("\nVoc� deve entrar com um valor do tipo inteiro... \nPor favor, tente novamente!");
			}
			catch(ArithmeticException arithmeticException) {
				System.err.printf("\nException: %s\n", arithmeticException);
				System.out.println("N�o � poss�vel fazer divis�o com denominador zero!");
			}
		}
		while(continuaLoop);
	}

}
