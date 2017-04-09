package org.awesomelabs.mat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.awesomelabs.tree.BSTSearching;

class LinkedListSorting {
	
	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.push(2);
		linkedList.push(1);
		linkedList.push(-5);
		linkedList.push(9);
		linkedList.push(6);
		linkedList.push(12);
		linkedList.push(4);
		System.out.println("All data");
		linkedList.printAll();
		linkedList.sort();
		System.out.println("Sorted Data");
		linkedList.printAll();
	}

}

class Node{
	
	int data;
	
	Node next;
	
	
	public Node(int data) {
		super();
		this.data = data;
		this.next = null;
	}
	public Node(int data, Node next) {
		super();
		this.data = data;
		this.next = next;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node next() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
	
}

class LinkedList{
	
	private Node head;
	
	
	public void printAll(){
		Node node = head;
		while(node != null){
			System.out.println(node.getData());
			node = node.next();
		}
		
	}
	
	public void sort() {
		Node currentNode = head.next();
		while(currentNode != null){
			Node insertionNode = head;
			while(insertionNode != currentNode){
				if(insertionNode.getData() > currentNode.getData()){
					int temp = insertionNode.getData(); 
					insertionNode.setData(currentNode.getData());
					currentNode.setData(temp);
				}
				insertionNode = insertionNode.next();
			}
			currentNode = currentNode.next();
		}
		
	}

	public void push(int data){
		if(head == null)
			head = new Node(data);
		else{
			Node currentNode = head;
			while(currentNode.next() != null){
				currentNode = currentNode.next();
			}
			currentNode.setNext(new Node(data));
		}
	}
	

	
}
