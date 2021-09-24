programa
{
	
	funcao inicio()
	{
		real N, E, salarioTotal
		inteiro C

		escreva("Digite o numero de horas trabalhadas: ")
		leia(N)
		
		salarioTotal = N * 10
		
		se ( N > 50) {
			salarioTotal = N * 10
			E = (N-50)*20
			escreva("O seu salario esta no valor de: ",salarioTotal,"R$", "\nVoce possui horas extras no valor de: ", E,"R$")
			}
		senao {
			escreva("O seu salario esta no valor de: ", salarioTotal,"R$", "\nNao ha valor de horas extras a receber: ", E = 0.0)
			}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 492; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */