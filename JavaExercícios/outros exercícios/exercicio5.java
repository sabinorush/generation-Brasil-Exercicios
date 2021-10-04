import java.util.Scanner;

class exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double n1, n2, n3, n1x2, n2x3, n3x5, media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite a primeira nota: ");
		n1 = leia.nextFloat();
		System.out.println("\nDigite a segunda nota: ");
		n2 = leia.nextFloat();
		System.out.println("\nDigite a terceira nota: ");
		n3 = leia.nextFloat();
		
		n1x2 = n1*2;
		n2x3 = n2*3;
		n3x5 = n3*5;
		media = (n1x2+n2x3+n3x5)/3;
		
		System.out.printf("\nSua média é dê: %2.1f", media);
		
		n1 = Math.sqrt(n2);
		n2 = Math.pow(n3, 3);
		n3 = (n1 % n2);
	}

}
