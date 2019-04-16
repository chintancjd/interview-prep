/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BST<Integer> intBST = new BST<Integer>();
		intBST.addNode(10);
		intBST.addNode(5);
		intBST.addNode(7);
		intBST.addNode(3);
		intBST.addNode(15);
		intBST.addNode(13);
		intBST.addNode(18);
		intBST.addNode(17);
		intBST.printInOrder();
	}
	
	public static class BSTNode<T extends Comparable<T>>{
		private T val;
		private BSTNode left,right;
		public BSTNode(T val){
			this.val = val;
		}
		public BSTNode(T val, BSTNode left, BSTNode right){
			this.val = val;
			this.left = left;
			this.right = right;
		}
		public int compareTo(BSTNode<T> node){
			int cmp = this.val.compareTo(node.val);
			return cmp;
		}
	}
	
	// add, delete, search
	public static class BST<T extends Comparable<T>> {
		private BSTNode<T> root;
		public BST(){
		}
		public void addNode(T val){
			if (this.root == null){
				this.root = new BSTNode(val);
				return;
			}
			BSTNode curr = root;
			while (curr != null){
				BSTNode node = new BSTNode(val);
				int cmp = node.compareTo(curr);
				if (curr.left == null && cmp == -1){
					curr.left = new BSTNode(val);
					return;
				}
				if (curr.right == null && cmp == 1){
					curr.right = new BSTNode(val);
					return;
				}
				if (cmp == -1){
					curr = curr.left;
				} else {
					curr = curr.right;
				}
			}
		}
		
		public T searchNode(T val){ return val;}
		
		public void delNode(BSTNode node){
			
		}
		
		public void printInOrder(){
			BSTNode curr = this.root;
			recurseInOrder(curr);
		}
		
		private void recurseInOrder(BSTNode node){
			if (node == null){
				return;
			}
			recurseInOrder(node.left);
			System.out.println(" -- "+ node.val + " -- ");
			recurseInOrder(node.right);
		}
		
	}
	

}
