package com.thiagodasilva.estruturadados.tree;

public class BinaryTree<T> {
	
	private T value;
	private BinaryTree<T> rightChild;
	private BinaryTree<T> leftChild;
	
	public BinaryTree(T value) {
		this.value = value;
		this.leftChild = null;
		this.rightChild = null;
	}
	
	
	public T getValue() {
		return value;
	}

	public void setNode( T value) {
		this.value = value;
	}

	public BinaryTree<T> getRightChild() {
		return rightChild;
	}

	public void setRightChild(BinaryTree<T> child) {
		this.rightChild = child;
	}

	public BinaryTree<T> getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(BinaryTree<T> child) {
		this.leftChild = child;
	}


	@Override
    public String toString() {
        return "BinaryTree [value=" + value + 
               ", leftChild=" + (leftChild != null ? leftChild.getValue() : "null") + 
               ", rightChild=" + (rightChild != null ? rightChild.getValue() : "null") + "]";
    }

}
