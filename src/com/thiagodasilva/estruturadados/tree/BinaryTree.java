package com.thiagodasilva.estruturadados.tree;

public class BinaryTree {
	
	private Object node;
	private Object rightChield;
	private Object leftChield;
	
	public BinaryTree(Object node) {
		this.node = node;
		this.leftChield = null;
		this.rightChield = null;
	}
	
	
	public Object getNode() {
		return node;
	}

	public void setNode(Object node) {
		this.node = node;
	}

	public Object getRightChield() {
		return rightChield;
	}

	public void setRightChield(BinaryTree tree, Object value) {
		if(tree.getRightChield() == null) {
			this.rightChield = value;
		}else {
			BinaryTree newNode = new BinaryTree(value);
			newNode.setRightChield(tree, rightChield);
			tree.setRightChield(newNode, newNode.node);
		}
		
	}

	public Object getLeftChield() {
		return leftChield;
	}

	public void setLeftChield(BinaryTree tree, Object value) {
		if(tree.getLeftChield() == null) {
			this.leftChield = value;
		}else {
			BinaryTree newNode = new BinaryTree(value);
			newNode.setLeftChield(tree, leftChield);
			tree.setLeftChield(newNode, newNode.node);
		}
	}


	@Override
	public String toString() {
		return "BinaryTree [node=" + node + ", leftChield=" + leftChield + ", rightChield=" + rightChield +"]";
	}


	
	

}
