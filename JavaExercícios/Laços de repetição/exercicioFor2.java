import java.util.Scanner;

public class exercicioFor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, par=0, impar=0, num;
		
		Scanner leia = new Scanner (System.in);
		
		for(i = 1; i <= 10; i++) {
			System.out.printf("\nEntre com um número: ");
			num = leia.nextInt();
			
			if(num % 2 == 0) {
				par ++;

			}
			if(num % 2 == 1) {
				impar ++ ;
			}

		}
		System.out.println("\n" + par + " Numeros pares");
		System.out.println("\n" + impar + " Numeros impares");

	}

}
