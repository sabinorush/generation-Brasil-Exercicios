programa
/* Elaborar um programa que efetue a leitura sucessiva de valores numéricos e
apresente no final o total do somatório, a média e o total de valores lidos. O programa
deve fazer as leituras dos valores enquanto o usuário estiver fornecendo valores
positivos. Ou seja, o programa deve parar quando o usuário fornecer um valor
negativo.*/

{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real num, soma = 0.0, media = 0.0
		inteiro cont = 0
		
		escreva("Digite um numero: ")
		leia(num)

		enquanto(num >= 0) {
			se(num >= 0) {
				soma = soma + num
				cont++
				}
		escreva("Digite um numero: ")
		leia(num)
			}	
		limpa()
		
		media = soma / cont
		escreva("\nA soma dos números digitados é: ", mat.arredondar(soma, 2))
		escreva("\nA quantidade de números digitados é: ", cont)
		escreva("\nA média dos números digitados é: ", mat.arredondar(soma, 2))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 578; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */