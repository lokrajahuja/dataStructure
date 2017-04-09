package com.awesomelabs.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BSTLevelTravesal {
	
	public void traversal(Node root){
		if(root == null)
			return;
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		while(!q.isEmpty()){
			Node node = q.poll();
			System.out.println(node.data);
			if(node.getLeft() != null){
				q.add(node.getLeft());
			}
			if(node.getRight() != null){
				q.add(node.getRight());
			}
		}
}

	
}