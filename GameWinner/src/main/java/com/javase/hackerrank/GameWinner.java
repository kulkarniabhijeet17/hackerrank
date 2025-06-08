package com.javase.hackerrank;

public class GameWinner {
	public static String gameWinner(String colors) {
		int wendyMoves = 0;
		int bobMoves = 0;

		for (int i = 1; i < colors.length() - 1; i++) {
			if (colors.charAt(i) == 'w' && colors.charAt(i - 1) == 'w' && colors.charAt(i + 1) == 'w') {
				wendyMoves++;
			} else if (colors.charAt(i) == 'b' && colors.charAt(i - 1) == 'b' && colors.charAt(i + 1) == 'b') {
				bobMoves++;
			}
		}

		if (wendyMoves > bobMoves) {
			return "wendy";
		} else if (bobMoves > wendyMoves) {
			return "bob";
		} else {
			return "wendy";
		}
	}

	public static void main(String[] args) {
		String test1 = "wwwbbbbww";
		String test2 = "wbwbwb";
		String test3 = "wwwbbb";

		System.out.println(gameWinner(test1)); // Output: wendy
		System.out.println(gameWinner(test2)); // Output: wendy
		System.out.println(gameWinner(test3)); // Output: wendy
	}
}