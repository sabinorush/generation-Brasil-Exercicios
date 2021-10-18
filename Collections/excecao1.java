package collections;

public class excecao1 {

	public static void main(String[] args) {

		String frase = null;
		String novaFrase = null;
		
		try {
			novaFrase =  frase.toUpperCase();
		}
		catch(NullPointerException exception) {//captura de uma possível exceção
			System.out.println("\nA frase inicial está nula, para solucionar tal problema, foi lhe atribuído um valor padrão.");
			frase = "Frase vazia";
			novaFrase = frase.toUpperCase();
		}
		System.out.println("\nFrase antiga: "+frase);
		System.out.println("Frase nova: "+novaFrase);
	}

}
