package com.awesomelabs.tree;

import java.util.ArrayList;
import java.util.List;

public class BSTSearching {
	
	public Node searchNode(Node head, int data){
		if(head == null){
			return null;
		}
		if(head.getData() == data){
			return head;
		}
		if(head.getData() > data){
			return searchNode(head.getLeft(),data);
		}
		else{
			return searchNode(head.getRight(),data);
		}
	}
	
	public int height(Node head){
		if(head == null)
			return 0;
		return max(height(head.getLeft()) , height(head.getRight())) + 1;
	}
	
	public int size(Node head){
		if(head == null){
			return 0;
		}
		return size(head.getLeft()) + size(head.getRight()) + 1;
	}
	
	public boolean sameBinaryTree(Node root1, Node root2){
		if(root1 == null && root2 == null)
			return true;
		if(root1 == null || root2 == null)
			return false;
		return ((root1.getData() == root2.getData()) && sameBinaryTree(root1.getLeft(), root2.getLeft()) && sameBinaryTree(root1.getRight(), root2.getRight()));
	}
	
	private int max(int height1, int height2) {
		if(height1 > height2) return height1; else return height2;
	}

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
		BSTSearching bSTSearching = new BSTSearching();
	/*	System.out.println(bSTSearching.searchNode(head, 4).getData());
		System.out.println(bSTSearching.searchNode(head, 99));
		System.out.println(bSTSearching.searchNode(head, 8).getData());*/
		/*System.out.println(bSTSearching.height(head));
		System.out.println(bSTSearching.size(head));*/
	/*	
		BinaryTree tree2 = new BinaryTree();
		Node head2 = tree2.addNewNode(6, null);
		head2 = tree2.addNewNode(4, head2);
		head2 = tree2.addNewNode(5, head2);
		head2 = tree2.addNewNode(8, head2);
		head2 = tree2.addNewNode(10, head2);
		head2 = tree2.addNewNode(3, head2);
		head2 = tree2.addNewNode(50, head2);
		head2 = tree2.addNewNode(11, head2);
		head2 = tree2.addNewNode(1, head2);
		head2 = tree2.addNewNode(2, head2);
		//System.out.println(bSTSearching.sameBinaryTree(head, head2));
*/	
		/*IsBST bst = new IsBST();
		List<Integer> results = new ArrayList<>();
		boolean b= bst.fromRootToLeafPath(head, 16, results);
		System.out.println(b);
		if(b){
			for(Integer data : results)
				System.out.println(data);
		}*/
		/*BSTLevelTravesal bSTLevelTravesal = new BSTLevelTravesal();
		bSTLevelTravesal.traversal(head);*/
		IterativeTravesal it = new IterativeTravesal();
		it.postOrderTravesal(head);
	}

}
