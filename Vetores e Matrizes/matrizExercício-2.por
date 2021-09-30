programa
{
	
	funcao inicio()
	{
		inteiro m3[3][3], l, c, soma=0

		para(l = 0; l < 3; l++) {
			para(c = 0; c < 3; c++) {
				escreva("Digite um numero para a matriz: ")
				leia(m3[l][c])
				}
			}

			soma = m3[0][0] + m3[1][1] + m3[2][2]
			escreva("A Soma da diagonal principal da matriz é: ", soma)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 318; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {m3, 6, 10, 2};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */