programa
{
	
	funcao inicio()
	{
		inteiro lancamento[10], somalanc=0, maior=0, x, contmaior=0
		real medialanc
		
		para(x=0;x<10;x++) {
			escreva("\nEntre com o lancamento: ")
			leia(lancamento[x])
			enquanto(lancamento[x]<1 ou lancamento[x]>6)
			{
				escreva("\nEntre com um novo lancamento: ")
				leia(lancamento[x])
			}
			somalanc += lancamento[x]

			se(maior < lancamento[x])
			{
					maior = lancamento[x]
			}
		}
		para(x=0;x<10;x++)
		{
			se(lancamento[x] == maior) 
			{
				contmaior++
			}	
		}
		limpa()
		medialanc = somalanc / 10
		escreva("\nMedia de lancamentos: ", medialanc)
		escreva("\nO maior valor inserido foi: ", maior)
		escreva("\nO maior valor apareceu: ", contmaior, " vezes")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 427; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {lancamento, 6, 10, 10}-{somalanc, 6, 26, 8}-{maior, 6, 38, 5}-{x, 6, 47, 1}-{contmaior, 6, 50, 9}-{medialanc, 7, 7, 9};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */