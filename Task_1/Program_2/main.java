package Test;

import java.util.Arrays;
import java.util.Scanner;

public class main2 {

	public static void main(String[] args) {
		computeString(input(), input(), input());
	}

	static String input() {
		Scanner in = new Scanner(System.in);
		return in.nextLine();
	}

	static void computeString(String a, String b, String c) {
		System.out.println(split(a)[0] + split(b)[1] + split(c)[2]);
		System.out.println(split(a)[1] + split(b)[2] + split(c)[0]);
		System.out.println(toggleCase((split(a)[2] + split(b)[0] + split(c)[1])));
	}

	static String toggleCase(String s) {
		String r = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				r += (char) (int) ((s.charAt(i)) - 32);
			} else {
				r += (char) (int) ((s.charAt(i)) + 32);
			}
		}
		return r;
	}

	static String[] split(String s) {
		String out[] = new String[3];
		int n = s.length() / 3;
		if (s.length() % 3 == 0) {

			out[0] = s.substring(0, n);
			out[1] = s.substring(n, 2 * n);
			out[2] = s.substring(2 * n);
		} else {
			if (s.length() % 3 == 2) {
				out[0] = s.substring(0, n + 1);
				out[1] = s.substring(n + 1, s.length() - (n + 1));
				out[2] = s.substring(s.length() - (n + 1));
			} else {
				out[0] = s.substring(0, n);
				out[1] = s.substring(n, s.length() - n);
				out[2] = s.substring(s.length() - n);
			}

		}
		return out;
	}
}
