programa

/* 1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes,
 coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:  
 a) média do salário da população;
 b) média do número de filhos;
 c) maior salário;
d) percentual de pessoas com salário até R$100,00.
*/

{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real salario, mediaSalario=0.0, somaSalario=0.0, maiorSalario=0.0, salario100=0.0
		inteiro qtdFilhos,somaFilho=0, mediaFilhos=0, i, cont100=0


		para(i= 1; i<=4; i++) {
			escreva("Digite o seu salário: ")
			leia(salario)
			escreva("Digite quantos filhos você tem: ")
			leia(qtdFilhos)
			
				se( maiorSalario < salario){ 
					maiorSalario = salario
					}
					
				se(salario <= 100) {	
				 cont100++
				
				}

			somaSalario = salario + somaSalario
			somaFilho = qtdFilhos + somaFilho
			

		}
		limpa()
		
		mediaSalario = somaSalario / 4
		mediaFilhos = somaFilho / 4
		salario100 = (cont100 * 100) / 4


		escreva("\nA media do salario da população é de: ", mat.arredondar(mediaSalario, 4))
		escreva("\nA media do numero de filhos da população é de: ", mediaFilhos)
		escreva("\nO maior salario registrador foi de: ",mat.arredondar(maiorSalario, 4))
		escreva("\n",salario100,"% de pessoas ganham até R$100,00")
		 
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 962; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */