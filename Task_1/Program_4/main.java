package Test;

import java.util.Arrays;
import java.util.Scanner;

public class main4 {

	public static void main(String[] args) {

		System.out.println(Arrays.toString(convertChar((inputArray()))));

	}

	static int[] inputArray() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Size :");
		int n = Integer.parseInt(in.nextLine());
		int a[] = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = Integer.parseInt(in.nextLine());

		return a;
	}

	static char[] convertChar(int a[]) {
		int c[] = a.clone();
		sort(c);
		char out[] = new char[a.length];
		for (int i = 0; i < a.length; i++) {
			out[indexOf(a, c[i])] = (char) (97 + i);
		}
		return out;
	}

	static int indexOf(int a[], int n) {

		for (int i = 0; i < a.length; i++) {
			if (a[i] == n)
				return i;
		}
		return -1;
	}

	static int[] sort(int a[]) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1; j++) {
				if (a[j] > a[j + 1]) {
					a[j] = a[j] + a[j + 1];
					a[j + 1] = a[j] - a[j + 1];
					a[j] = a[j] - a[j + 1];
				}
			}
		}

		return a;
	}

}
