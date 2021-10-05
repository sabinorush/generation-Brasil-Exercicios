import java.util.Scanner;

public class exercicioWhile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int idade, contF, m, outros, sexo, temp;
		int contPCalm=0, contFNerv=0, contHAgre = 0, contOutrosCalm=0, cont40Nerv=0, cont18Calm=0, pessoas = 0, contP=0;


		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com a sua idade: ");
		idade = leia.nextInt();
		System.out.println("\nDigite sua orientação sexual: 1- Feminino | 2- Masculino | 3- Outros: ");
		sexo = leia.nextInt();
		System.out.println("Você se considera uma pessoa: 1- Calma | 2- nervosa | 3- agressiva");
		temp = leia.nextInt();
		while (pessoas < 150) { // alterar para menos para teste.

			System.out.print("\nEntre com sua idade: ");
			idade = leia.nextInt();
			System.out.print("\nDigite sua orientação sexual: 1- Feminino | 2- Masculino | 3- Outros: ");
			sexo = leia.nextInt();
			System.out.print("Você se considera uma pessoa: 1- Calma | 2- nervosa | 3- agressiva");
			temp = leia.nextInt();
			
			if(sexo == 1 && temp == 2) contFNerv++; //verifica se é Femino e Nervosa e armazena.
			if(sexo == 2 && temp == 3) contHAgre++; //veriica se é Masculino e agressivo e armazena.
			if(sexo == 3 && temp == 1) contOutrosCalm++; //verifica outros e calmo e armazena.
			if(temp == 2 && idade > 40) cont40Nerv++; //verifica se é nervoso e se tem mais de 40 anos e armazena.
			if(temp == 1 && idade < 18) cont18Calm++; //verifica se se é calmo e se tem menos de 18 anos e armazena.
			if(temp == 1) contPCalm++; //verifica quantas pessoas são calmas.
			
			pessoas++; //acrescenta mais uma pessoa ao looping.
			
		}
		System.out.printf("\nO número de pessoas calmas é: "+ contPCalm);
		System.out.printf("\nO número de mulheres nervosas é: "+ contFNerv);
		System.out.printf("\nO número de homens agressivos é: "+ contHAgre);
		System.out.printf("\nO número de pessoas com outros gêneros e que consideram calmas é: "+ contOutrosCalm);
		System.out.printf("\nO número de pessoas nervosas com mais de 40 anos é: "+ cont40Nerv);
		System.out.printf("\nO número de pessoas calmas com menos de 18 é: "+ cont18Calm);

	}

}
