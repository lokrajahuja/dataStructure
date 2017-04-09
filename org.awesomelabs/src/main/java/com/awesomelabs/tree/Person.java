package com.awesomelabs.tree;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Person {

	 public static void main(String args[] ) throws Exception {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String line = br.readLine();
	        long firstInput = Long.parseLong(line);
	        long secondInput = Long.parseLong(br.readLine());
	        long counter = 1;
	        long minHalf = (firstInput > secondInput ? secondInput : firstInput)/2;
	        long result = 0;
	        while(true){
	            if(counter > minHalf){
	                break;
	            }
	            if(firstInput%counter == 0 && secondInput%counter ==0){
	                result++;
	            }
	            counter++;
	        }

	        System.out.println(result);
	    }

}