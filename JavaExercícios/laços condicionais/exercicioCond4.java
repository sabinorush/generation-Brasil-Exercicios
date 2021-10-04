import java.util.Scanner;

public class exercicioCond4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float n1;
		double raiz, quadrado;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite um número: ");
		n1 = leia.nextFloat();
		
		if(n1 % 2 == 0) {
			System.out.printf("Número par");
			
			raiz = Math.sqrt(n1);
			System.out.printf("Raiz Quadrada: %2.2f", raiz);
		}
		
		else if(n1 % 2 == 1) {
			System.out.println("Número Ímpar");

			quadrado = Math.pow(n1, 2);
			System.out.printf("Quadrado do valor ímpar é: %2.2f", quadrado);
		}
	}

}
