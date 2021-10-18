package collections;

public class excecao1 {

	public static void main(String[] args) {

		String frase = null;
		String novaFrase = null;
		
		try {
			novaFrase =  frase.toUpperCase();
		}
		catch(NullPointerException exception) {//captura de uma poss�vel exce��o
			System.out.println("\nA frase inicial est� nula, para solucionar tal problema, foi lhe atribu�do um valor padr�o.");
			frase = "Frase vazia";
			novaFrase = frase.toUpperCase();
		}
		System.out.println("\nFrase antiga: "+frase);
		System.out.println("Frase nova: "+novaFrase);
	}

}
