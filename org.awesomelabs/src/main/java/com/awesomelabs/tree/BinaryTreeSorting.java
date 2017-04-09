package com.awesomelabs.tree;

class BinaryTree {
	/**
	 * 
	 * @param data
	 * @param head
	 * @return
	 * It will add new data into BST that is head
	 * 
	 */
	public Node addNewNode(int data, Node head){
		Node newNode = new Node(data);
		if(head == null){
			head = newNode;
			return newNode;
		}
		Node headTemp = head;
		Node previousNode = null;
		while(headTemp != null){
			previousNode = headTemp;
			if(headTemp.getData() > data){
				headTemp = headTemp.getLeft();
			}
			else{
				headTemp = headTemp.getRight();
			}
		}
		if(previousNode.getData() > data){
			previousNode.setLeft(newNode);
		}
		else{
			previousNode.setRight(newNode);
		}
		return head;
	}

	public void preorderTravesal(Node head) {
		if(head != null){
			System.out.print(head.getData() +"\t");
			preorderTravesal(head.getLeft());
			preorderTravesal(head.getRight());
		}
		
	}

	public void inorderTravesal(Node head) {
		if(head != null){
			inorderTravesal(head.getLeft());
			System.out.print(head.getData() +"\t");
			inorderTravesal(head.getRight());
		}
		
	}

	public void postOrderTravesal(Node head) {
		if(head != null){
			postOrderTravesal(head.getLeft());
			postOrderTravesal(head.getRight());
			System.out.print(head.getData() +"\t");
		}
		
	}
	

}

class Node{
	
	int data;
	
	Node left;
	
	Node right;
	
	public Node(int data) {
		super();
		this.data = data;
	}
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getLeft() {
		return left;
	}
	public void setLeft(Node left) {
		this.left = left;
	}
	public Node getRight() {
		return right;
	}
	public void setRight(Node right) {
		this.right = right;
	}
	
}

public class BinaryTreeSorting{
	
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		Node head = tree.addNewNode(6, null);
		head = tree.addNewNode(4, head);
		head = tree.addNewNode(5, head);
		head = tree.addNewNode(8, head);
		head = tree.addNewNode(10, head);
		head = tree.addNewNode(3, head);
		head = tree.addNewNode(7, head);
		head = tree.addNewNode(11, head);
		head = tree.addNewNode(1, head);
		head = tree.addNewNode(2, head);
		tree.preorderTravesal(head);
		System.out.println();
		tree.inorderTravesal(head);
		System.out.println();
		tree.postOrderTravesal(head);
	}
}
