package assignment;

import java.util.Scanner; 

public class Matrix {
	

	
		private int row;
		private int cols;
		private int row1;
		private int cols1;
		int arr[][];
		int arr2[][];
		
		
		int result[][];

		Scanner sc = new Scanner(System.in);

		public void  Matrix(int row, int cols, int row1, int cols1) {
			this.row = row;
			this.cols = cols;
			this.row1 = row1;
			this.cols1 = cols1;
			arr = new int[row][cols];
			arr2 = new int[row1][cols1];
			result = new int[row][cols];
		}

		void getrow() {
			System.out.println("For first matrix:");
			System.out.println("Rows are: " + row);
			System.out.println("For second matrix:");
			System.out.println("Rows are: " + row1);

		}

		void getcols() {
			System.out.println("For first matrix :");
			System.out.println("Cols are: " + cols);
			System.out.println("For second matrix:");
			System.out.println("Cols are: " + cols1);

		}

		void setEle() {
			System.out.println("Enter the values for arr1");
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < cols; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			System.out.println("Enter the values for arr2");
			for (int i = 0; i < row1; i++) {
				for (int j = 0; j < cols1; j++) {
					arr2[i][j] = sc.nextInt();
				}
			}
		}

		void AddArr() {
			if (row != row1 || cols != cols1) {
				System.out.println("Matrices cannot be added");

			} else {

				for (int i = 0; i < row; i++) {
					for (int j = 0; j < cols; j++) {
						result[i][j] = arr[i][j] + arr2[i][j];
					}
				}
			}
		
				System.out.println("after addition matrix is:");
				for(int i = 0; i < row; i++) {
					for (int j = 0; j < cols; j++) {
						System.out.print(result[i][j] + "\t\t");
					}
					System.out.println();
				}
}
		}

		

	
	


