package com.thiagodasilva.estruturadados.tree;

public class TreeMain {

	public static void main(String[] args) {
		DepthFirstSearch profundidade = new DepthFirstSearch();

		BinaryTree<String> minhaArvore = new BinaryTree<>("D");

		minhaArvore.insert("B");
		minhaArvore.insert("A");
		minhaArvore.insert("C");
		minhaArvore.insert("F");
		minhaArvore.insert("E");
		minhaArvore.insert("G");

		System.out.println("--- Métricas Iniciais ---");
		System.out.println("Total de nós (Size): " + minhaArvore.size());
		System.out.println("Altura da árvore (Height): " + minhaArvore.height());

		System.out.print("\nÁrvore em ordem (In-Order): ");
		profundidade.inOrder(minhaArvore);
		System.out.println();


		System.out.println("\n--- Removendo o nó 'B' (Nó com dois filhos: A e C) ---");
		minhaArvore = minhaArvore.delete("B");

		System.out.print("Árvore após deleção (In-Order): ");
		profundidade.inOrder(minhaArvore);
		System.out.println("\nNovo tamanho (Size): " + minhaArvore.size());
		
	}
}
