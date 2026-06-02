package com.thiagodasilva.estruturadados.tree;

public class BinaryTree<T extends Comparable<T>> {

	private T value;
	private BinaryTree<T> rightChild;
	private BinaryTree<T> leftChild;

	public BinaryTree(T value) {
		this.value = value;
		this.leftChild = null;
		this.rightChild = null;
	}

	public int size() {
		int tamanhoEsquerda = (leftChild != null) ? leftChild.size() : 0;
		int tamanhoDireita = (rightChild != null) ? rightChild.size() : 0;

		return 1 + tamanhoEsquerda + tamanhoDireita;
	}

	public int height() {
		int alturaEsquerda = (leftChild != null) ? leftChild.height() : 0;
		int alturaDireita = (rightChild != null) ? rightChild.height() : 0;

		return 1 + Math.max(alturaEsquerda, alturaDireita);
	}

	public void insert(T newValue) {
		int comparacao = newValue.compareTo(this.value);

		if (comparacao < 0) {
			// Se for menor, vai para a esquerda
			if (this.leftChild == null) {
				this.leftChild = new BinaryTree<>(newValue);
			} else {
				this.leftChild.insert(newValue);
			}
		} else if (comparacao > 0) {
			// Se for maior, vai para a direita
			if (this.rightChild == null) {
				this.rightChild = new BinaryTree<>(newValue);
			} else {
				this.rightChild.insert(newValue);
			}
		}
	}


	public BinaryTree<T> delete(T valueToDelete) {
		int comparacao = valueToDelete.compareTo(this.value);

		if (comparacao < 0) {
			if (leftChild != null) {
				leftChild = leftChild.delete(valueToDelete);
			}
			return this;
		} else if (comparacao > 0) {
			if (rightChild != null) {
				rightChild = rightChild.delete(valueToDelete);
			}
			return this;
		} else {

			if (leftChild == null) {
				return rightChild; // Se a esquerda é nula, retorna o da direita (pode ser nulo também)
			}
			if (rightChild == null) {
				return leftChild;  // Se a direita é nula, retorna o da esquerda
			}

			T menorValorDaDireita = rightChild.findMin();

			this.value = menorValorDaDireita;

			this.rightChild = rightChild.delete(menorValorDaDireita);

			return this;
		}
	}

	private T findMin() {
		if (leftChild == null) {
			return this.value;
		}
		return leftChild.findMin();
	}

	public T getValue() {
		return value;
	}

	public void setNode(T value) {
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