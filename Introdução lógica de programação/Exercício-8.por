programa
{
	
	funcao inicio()
	{
		real custoFabrica, custoFinal, custoDistribuidor, custoDeImposto
	
		escreva("Informe o custo de fabrica do veiculo: ")
		leia(custoFabrica)

		custoDistribuidor = custoFabrica * 0.28
		custoDeImposto = custoFabrica * 0.45
		custoFinal = custoDeImposto + custoDistribuidor + custoFabrica

		escreva("\nCusto de fabrica de um carro é: ", custoFinal)
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 402; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */