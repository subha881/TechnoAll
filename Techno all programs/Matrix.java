public class Matrix {
	public static void main(String args[]) {
		int a[][] = { { 1, 4 }, { 7, 5 } };

		int b[][] = { { 1, 4 }, { 7, 5 } };

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(a[i][j] + b[i][j] + " ");
			}
			System.out.println();
		}
	}

}