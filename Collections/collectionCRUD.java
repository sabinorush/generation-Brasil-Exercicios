package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class collectionCRUD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int op;
		Scanner ler = new Scanner(System.in);
		
		ArrayList<String> estoque = new ArrayList();
		
		do {
			System.out.println("\n-------------------------------------------------------");
			System.out.println("\n(1) Deseja adicionar produtos ao estoque? ");
			System.out.println("\n(2) Deseja remover produtos do estoque? ");
			System.out.println("\n(3) Deseja atualizar produtos do estoque? ");
			System.out.println("\n(4) Deseja mostrar todos os produtos do estoque? ");
			System.out.println("\n(0) Deseha saur do programa? ");
			System.out.println("\n-------------------------------------------------------");
			System.out.println("Digite sua opção: ");
			op = ler.nextInt();
			
			switch(op) {
			case 1:
				ler.nextLine();
				System.out.println("\nDigite o produto que deseja adicionar ao estoque: ");
				String produto = ler.nextLine();
				estoque.add(produto);
				break;
			case 2:
				ler.nextLine();
				System.out.println("\nDigite o produto que deseja remover do estoque: ");
				String produtoRemove = ler.nextLine();
				if (estoque.contains(produtoRemove)) {//Contains verifica se o produto existe no estoque.
					estoque.remove(produtoRemove); //remove o produto inserido se ele existir no estoque
				} else { 
					System.out.println("Este produto não existe no estoque"); 
					}
					break;
			case 3:
				ler.nextLine();
				System.out.println("\nDigite o produto que deseja atualizar: ");
				String verifica = ler.nextLine();
				System.out.println("\nDigite o produto que será atualizado de: '"+verifica+"'"+"\nPara: ");
				String novo = ler.nextLine();
				if(estoque.contains(verifica)) { //verifica se o produto esta no array.
					estoque.remove(verifica); 
					estoque.add(novo); 
					System.out.println("\nO produto que deseja atualizar não existe no estoque.");
				}
				break;
			case 4:
				ler.nextLine();
				System.out.println("\nProdutos do estoque: ");
				System.out.println(estoque);
				break;
				default:
					System.out.println("Finalizou o programa!");
			}
		}
		while(op!=0);
	}

}
