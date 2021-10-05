programa
{
	
	funcao inicio()
	{
		real dias
		inteiro meses, idadeEmAnos, idadeEmDias, conversao
		
  

		

		escreva("\nDigite sua idade em dias: ")
		leia(dias)

		
		idadeEmAnos = (dias / 365)
		meses = (idadeEmAnos * 12)
		idadeEmDias = (idadeEmAnos * 365)
		
		escreva("\nVocê possuí: ", idadeEmAnos," Anos ou ", meses, " meses ou ", idadeEmDias, " Dias")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 373; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */