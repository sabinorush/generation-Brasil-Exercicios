
public class exercícioVetor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A[] = {1, 0, 5, -2, -5, 7};
		int soma, i;
		
		soma = A[0] + A[1] + A[5];
		A[4] = 100;
		
		System.out.println("\nA soma o index: 0, 1, 5 é: "+ soma);
		
		for(i = 0; i < 6; i++) {
			System.out.println(A[i]);
		}
		
		
	}

}
