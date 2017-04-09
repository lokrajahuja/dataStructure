package org.awesomelabs.mat;

public class MatrixPathCount {

	public static void main(String[] args) {
		
		int[][] mat = {{2,3,4},{1,2,5},{1,2,5}};
		int count = findPaths(mat);
		System.out.println("Total no of path "+count);
	}

	private static int findPaths(int[][] mat) {
		int rows = mat.length;
		if(rows > 0){
			int cols = mat[0].length;
			int[][] matrix = new int[rows][cols];
			for(int i = 0 ; i < cols ;i++){
				matrix[0][i] = 1;
			}
			for(int i = 0 ; i < rows ;i++){
				matrix[i][0] = 1;
			}
			for(int i =1; i< rows ;i ++){
				for(int j=1 ; j< cols ;j++){
					matrix[i][j] = matrix[i-1][j] + matrix[i][j-1];
				}
			}
			return matrix[rows-1][cols-1];
		}
		return 0;
	}

}

