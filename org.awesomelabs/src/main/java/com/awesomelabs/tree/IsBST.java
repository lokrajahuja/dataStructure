package com.awesomelabs.tree;

import java.util.List;

public class IsBST {
	
	public boolean isBST(Node root){
		return checkBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
	}

	private boolean checkBST(Node root, int minValue, int maxValue) {
		if(root == null){
			return true;
		}
		if(root.data <= minValue || root.data > maxValue){
			return false;
		}
		return checkBST(root.getLeft(),minValue,root.getData())
				&& checkBST(root.getRight(), root.getData(), maxValue);
	}
	
	public boolean fromRootToLeafPath(Node root, int data, List<Integer> results){
		if(root == null){
			return false;
		}
		if(root.getLeft() == null && root.getRight() == null){
			if(root.getData() == data){
				results.add(root.getData());
				return true;
			}
			else{
				return false;
			}
		}
		if(fromRootToLeafPath(root.getLeft(), data - root.getData(), results)){
			results.add(root.getData());
			return true;
		}
		if(fromRootToLeafPath(root.getRight(), data - root.getData(), results)){
			results.add(root.getData());
			return true;
		}
		return false;
	}

}
