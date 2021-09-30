programa
{
	
	funcao inicio()
	{

		inteiro  maior=0, x, vetor[5]
		
		para(x=0;x<5;x++) {
		escreva("Entre com um valor: ")
		leia(vetor[x])
		
			se(maior < vetor[x]) {
				maior = vetor[x]
				}
		}
		limpa()
		escreva("Os valores inseridos foram: ")
		para(x=0;x<5;x++){
			escreva(vetor[x] + ",")
			}
		escreva("\nO maior valor inserido foi de: ", maior)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 304; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */