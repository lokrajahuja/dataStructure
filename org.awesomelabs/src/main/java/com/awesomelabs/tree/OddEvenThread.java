package com.awesomelabs.tree;

public class OddEvenThread {
	public static void main(String[] args) {
		
		OddEvenThread oddEvenThread = new OddEvenThread();
		Thread t = new Thread(){
			@Override
			public void run() {
				
			}
		};
		
	}
	
	private void printNumber(int n){
		for(int i=1 ; i<=n ;i++){
			System.out.println(i);
		}
	}
	
}


