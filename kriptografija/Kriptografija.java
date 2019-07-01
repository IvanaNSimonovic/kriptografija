package kriptografija;

import java.util.Scanner;

public class Kriptografija {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		int[] nizN = new int[N];
		for (int i = 0; i < N; i++) {
			nizN[i] = sc.nextInt();
		}
		sc.nextLine();
		String poruka = sc.next();
		int M = (int) Math.ceil((double) poruka.length() / N);

		char[][] mat = new char[N][M];
		int k = 0;

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				int br = nizN[j];
				mat[br - 1][i] = poruka.charAt(k);

				k++;
				if (k == poruka.length())
					break;
			}

		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				System.out.print(mat[i][j]);
			}
		}

		sc.close();
	}
}
