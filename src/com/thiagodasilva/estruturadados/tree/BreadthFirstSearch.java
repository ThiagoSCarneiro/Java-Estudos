package com.thiagodasilva.estruturadados.tree;

import java.util.ArrayDeque;
import java.util.Queue;

import com.thiagodasilva.estruturadados.queue.Fila;

public class BreadthFirstSearch {
	
	public static <T> void BFS(BinaryTree<T> tree) {
		if (tree == null) {
            return;
        }
		
		Queue<BinaryTree<T>> fila = new ArrayDeque<BinaryTree<T>>();
		fila.offer(tree);
		
		while(!fila.isEmpty()){
		
				BinaryTree<T> currentNode = fila.poll();
				System.out.print(currentNode.getValue() + " ");
				
				if(currentNode.getLeftChild() != null) {
					fila.offer(currentNode.getLeftChild());
				}
				if(currentNode.getRightChild() != null) {
					fila.offer(currentNode.getRightChild());
				}
		}
		
		
		
		
	}
	

}
