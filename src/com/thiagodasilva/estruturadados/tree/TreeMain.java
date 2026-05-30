package com.thiagodasilva.estruturadados.tree;

import com.thiagodasilva.estruturadados.tree.DepthFirstSearch;

public class TreeMain {

	public static void main(String[] args) {
		DepthFirstSearch profundidade = new DepthFirstSearch();
		BreadthFirstSearch largura = new BreadthFirstSearch();
		
		BinaryTree<String> NodeRaiz = new BinaryTree<String>("A");
		BinaryTree<String> NodeB = new BinaryTree<String>("B");
		BinaryTree<String> NodeC = new BinaryTree<String>("C");
		BinaryTree<String> NodeD = new BinaryTree<String>("D");
		BinaryTree<String> NodeE = new BinaryTree<String>("E");
		BinaryTree<String> NodeF = new BinaryTree<String>("F");
		BinaryTree<String> NodeG = new BinaryTree<String>("G");

		NodeRaiz.setLeftChild(NodeB);
		NodeB.setLeftChild(NodeC);
		NodeB.setRightChild(NodeD);
		
		NodeRaiz.setRightChild(NodeE);
		NodeE.setLeftChild(NodeF);
		NodeE.setRightChild(NodeG);
		
		System.out.println("Arvore Binaria");
		System.out.println(NodeRaiz.toString()+ "\n"+ NodeB.toString()+ "\n" + NodeE.toString());
		
		
		System.out.println("## Profundidade DSF ##");
		System.out.print("Pre-Order: ");
		profundidade.preOrder(NodeRaiz);
		System.out.print("\n Pre-Order: ");
		profundidade.inOrder(NodeRaiz);
			System.out.print("\n Post-Order: ");
		profundidade.postOrder(NodeRaiz);
		
		System.out.println("## \n \n Largura BFS ##");
		largura.BFS(NodeRaiz);
		
		
	}

}
