import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int linha, coluna, cont = 0;
		int [][] matriz = new int[3][3];
		
		Scanner leia = new Scanner(System.in);
		
		for(linha = 0;linha < 3;linha++) {
			for(coluna = 0;coluna < 3;coluna++) {
				System.out.printf("Digite o valor de: [%d][%d]: ", linha+1, coluna+1);
				matriz[linha][coluna] = leia.nextInt();
				if(matriz[linha][coluna] >10) {
					cont++;
				}
			}
		}
		System.out.printf("\nA matriz possui %d numeros maiores que 10.\n" , cont);
	}

}
