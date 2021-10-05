programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real M, E, P

		escreva("Qual o peso do tomate: ")
		leia(P)
		
		E = P - 50
		M = E * 4

		se (P > 50) {
			escreva("O peso do tomate esta acima do permitido, a multa no valor de: ", mat.arredondar(M, 2),"R$ sera aplicada"  )
			}
		senao {
			escreva( "Multa: ", M = 0.0," R$\nExcesso: ", E = 0.0)
			}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 388; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */