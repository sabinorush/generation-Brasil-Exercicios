import java.util.Scanner;

public class exercicioCond3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int idade = 0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre a sua idade: ");
		idade = leia.nextInt();
		
		
		if (idade >= 18) {
			System.out.println("Adulto");
		}
		
		else if(idade <= 17 && idade >= 15) {
			System.out.println("Juvenil");
		}
		else if (idade <= 14 && idade < 15) {
			System.out.println("Infantil");
		}
		else if (idade <= 10) {
			System.out.println("Infantil");
		}

	}

}
