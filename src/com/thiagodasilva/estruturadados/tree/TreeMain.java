package com.thiagodasilva.estruturadados.tree;

public class TreeMain {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree("a");
		tree.setLeftChield(tree, "b");
		tree.setRightChield(tree, "c");
		
		BinaryTree treeB = new BinaryTree(tree.getLeftChield());
		treeB.setLeftChield(treeB, "d");
		treeB.setRightChield(treeB, "e");
		
		BinaryTree treeD = new BinaryTree(treeB.getLeftChield());
		treeD.setLeftChield(treeD,"f");
		
		BinaryTree treeF = new BinaryTree(treeD.getLeftChield());

		System.out.println(tree.toString() + "\n" + treeB.toString()+ "\n" + treeD.toString()+ "\n" + treeF.toString());
	}

}
