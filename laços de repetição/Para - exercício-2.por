programa
/* Desenvolver um sistema que efetue a soma de todos os números ímpares que são
múltiplos de três e que se encontram no conjunto dos números de 1 até 500. */
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		inteiro num
		real soma=0.0
		

		para(num=1; num<=500; num++) {

			se(num % 2 != 0 e num % 3 == 0) {
				soma = soma + num
				}
			}

		escreva("A soma dos numeros impares multiplos de 3 é: ", soma)
	}
}


/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 445; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */