import java.util.Scanner;

public class exercicioWhile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int idade, sexo, temp;
		int contPCalm=0, contFNerv=0, contMAgre = 0, contOutrosCalm=0, cont40Nerv=0, cont18Calm=0, pessoas = 0, contP=0;

		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com a sua idade: ");
		idade = leia.nextInt();
		System.out.println("\nDigite sua orienta��o sexual: 1- Feminino | 2- Masculino | 3- Outros: ");
		sexo = leia.nextInt();
		System.out.println("Voc� se considera uma pessoa: 1- Calma | 2- nervosa | 3- agressiva");
		temp = leia.nextInt();
		
		while (pessoas < 150) { //alterar para menos para teste.

			System.out.print("\nEntre com sua idade: ");
			idade = leia.nextInt();
			System.out.print("\nDigite sua orienta��o sexual: 1- Feminino | 2- Masculino | 3- Outros: ");
			sexo = leia.nextInt();
			System.out.print("Voc� se considera uma pessoa: 1- Calma | 2- nervosa | 3- agressiva");
			temp = leia.nextInt();
			
			if(sexo == 1 && temp == 2) contFNerv++; //Verifica se � Feminino e nervosa e armazena.
			if(sexo == 2 && temp == 3) contMAgre++; //Verifica se � Masculino e agressivo e armazena.
			if(sexo == 3 && temp == 1) contOutrosCalm++; //Verifica outros e calmo e armazena.
			if(temp == 2 && idade > 40) cont40Nerv++; //Verifica se � nervoso e se tem mais de 40 anos e armazena.
			if(temp == 1 && idade < 18) cont18Calm++; //Verifica se se � calmo e se tem menos de 18 anos e armazena.
			if(temp == 1) contPCalm++; //Verifica quantas pessoas s�o calmas.
			
			pessoas++; //Acrescenta mais uma pessoa ao looping.
		}
		
		System.out.printf("\nO n�mero de pessoas calmas �: "+ contPCalm);
		System.out.printf("\nO n�mero de mulheres nervosas �: "+ contFNerv);
		System.out.printf("\nO n�mero de homens agressivos �: "+ contMAgre);
		System.out.printf("\nO n�mero de pessoas com outros g�neros e que consideram calmas �: "+ contOutrosCalm);
		System.out.printf("\nO n�mero de pessoas nervosas com mais de 40 anos �: "+ cont40Nerv);
		System.out.printf("\nO n�mero de pessoas calmas com menos de 18 �: "+ cont18Calm);

	}

}
