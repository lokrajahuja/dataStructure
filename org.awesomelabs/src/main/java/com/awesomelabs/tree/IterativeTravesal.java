package com.awesomelabs.tree;

import java.util.Stack;

public class IterativeTravesal {
	
	public void postOrderTravesal(Node root){
		if(root == null)
			return;
		Stack<Node> s1 = new Stack<Node>();
		Stack<Node> s2 = new Stack<Node>();
		s1.push(root);
		while(!s1.isEmpty()){
			Node node = s1.pop();
			s2.push(node);
			if(node.getLeft() != null){
				s1.push(node.getLeft());
			}
			if(node.getRight() != null){
				s1.push(node.getRight());
			}
		}
		while(!s2.isEmpty()){
			Node node = s2.pop();
			System.out.println(node.getData());
		}
	}

}
