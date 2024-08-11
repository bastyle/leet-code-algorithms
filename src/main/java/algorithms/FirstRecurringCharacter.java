package algorithms;

import java.util.HashSet;
import java.util.Set;

public class FirstRecurringCharacter {

	// Google Question
	// Given an array = [2,5,1,2,3,5,1,2,4]:
	// It should return 2

	// Given an array = [2,1,1,2,3,5,1,2,4]:
	// It should return 1

	// Given an array = [2,3,4,5]:
	// It should return undefined
	public static void main(String[] args) {
		char[] chars = { '2', '5', '1', '2', '3', '5', '1', '2', '4' };
		char[] chars2 = { '2', '1', '1', '2', '3', '5', '1', '2', '4' };
		char[] chars3 = { '2', '3', '4', '5' };
		System.out.println(getFirstRecurring(chars) + " == 2");
		System.out.println(getFirstRecurring(chars2) + " == 1");
		System.out.println(getFirstRecurring(chars3) + " == ' '");
		System.out.println(getFirstRecurring2(chars) + " == 2");
		System.out.println(getFirstRecurring2(chars2) + " == 1");
		System.out.println(getFirstRecurring2(chars3) + " == ' '");

	}

	/**
	 * naive method, 2 nested loops O(n^2)
	 * 
	 * @param input
	 * @return
	 */
	public static char getFirstRecurring(final char[] input) {
		int auxPos = -1;
		for (int i = 0; i < input.length; i++) {
			for (int j = i + 1; j < input.length; j++) {
				if (input[i] == input[j]) {
					if (auxPos == -1 || auxPos > j) {
						auxPos = j;
						break;
					}
				}
			}
		}
		final char retChar = auxPos != -1 ? input[auxPos] : ' ';
		System.out.printf("first recurring char %s \n", retChar);
		return retChar;
	}

	public static char getFirstRecurring2(final char[] input) {
		Set<Character> chars = new HashSet<>();
		for (char c : input) {
			if (chars.contains(c)) {
				System.out.println(c);
				return c;
			}
			chars.add(c);
		}
		return ' ';
	}

}
