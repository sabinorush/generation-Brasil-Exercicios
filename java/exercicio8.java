import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double custoF, custoDis, custoImp, custoFinal;

		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o valor de fábrica do Carro: ");
		custoF = leia.nextFloat();
		
		custoDis = custoF * 0.28;
		custoImp = custoF * 0.45;
		custoFinal = custoF + custoDis + custoImp;
		System.out.println("O valor de fábrica para o consumidor é: " + custoFinal);
	}

}
