package com.thiagodasilva.estruturadados.tree;

public class DepthFirstSearch {

	public static <T extends Comparable<T>> void preOrder(BinaryTree<T> tree) {
		if(tree == null) {
			return;
		}

		System.out.print(tree.getValue()+ " ");

		preOrder(tree.getLeftChild());

		preOrder(tree.getRightChild());
	}

	public static <T extends Comparable<T>> void inOrder(BinaryTree<T> tree) {
		if(tree == null) {
			return;
		}

		if(tree.getLeftChild() != null){
			inOrder(tree.getLeftChild());
		}

		System.out.print(tree.getValue() + " ");

		if(tree.getRightChild() != null){
			inOrder(tree.getRightChild());
		}
	}

	public static <T extends Comparable<T>> void postOrder(BinaryTree<T> tree) {
		if(tree == null) {
			return;
		}

		if(tree.getLeftChild() != null){
			postOrder(tree.getLeftChild());
		}

		if(tree.getRightChild() != null){
			postOrder(tree.getRightChild());
		}

		System.out.print(tree.getValue() + " ");
	}

}