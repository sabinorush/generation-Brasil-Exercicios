import java.util.Scanner;

public class exercicioDoWhile1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num, somaNum=0;
		
		Scanner leia = new Scanner(System.in);
		

		do {
			System.out.print("Entre com um número: ");
			num = leia.nextInt();
			somaNum += num;
		}

		while(num != 0);
		System.out.println("A soma dos números inseridos é: " + somaNum);

	}

}
