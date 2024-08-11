package algorithms;

import static org.junit.Assert.assertTrue;

import java.util.Random;

import org.junit.Test;

public class FirstRecurringCharacterTest {


	@Test
	public void charInput1Test() {
		assertTrue(FirstRecurringCharacter
				.getFirstRecurring2(new char[] { '2', '5', '1', '2', '3', '5', '1', '2', '4' }) == '2');
	}

	@Test
	public void charInput1Test2() {
		assertTrue(FirstRecurringCharacter
				.getFirstRecurring2(new char[] { '2', '1', '1', '2', '3', '5', '1', '2', '4' }) == '1');
	}

	@Test
	public void charInput1Test3() {
		assertTrue(FirstRecurringCharacter.getFirstRecurring2(new char[] { '2', '3', '4', '5' }) == ' ');
	}

	@Test
	public void emptyInputTest() {
		assertTrue(FirstRecurringCharacter.getFirstRecurring2(new char[] {}) == ' ');
	}

	@Test
	public void singleCharacterInputTest() {
		assertTrue(FirstRecurringCharacter.getFirstRecurring2(new char[] { 'a' }) == ' ');
	}

	@Test
	public void allSameCharactersTest() {
		assertTrue(FirstRecurringCharacter.getFirstRecurring2(new char[] { 'a', 'a', 'a', 'a' }) == 'a');
	}

	@Test
	public void longInputTest() {
		// Generate a long character array with a recurring character somewhere in the
		// middle
		char[] longInput = generateLongCharArray();
		char expected = determineExpectedRecurringChar(longInput);
		assertTrue("expected: " + expected, FirstRecurringCharacter.getFirstRecurring2(longInput) == expected);
	}

	public char[] generateLongCharArray() {
		int length = 10000; // Adjust length as needed
		char[] charArray = new char[length];
		Random random = new Random();

		// Generate random characters
		for (int i = 0; i < length - 2; i++) {
			charArray[i] = (char) (random.nextInt(26) + 'a');
		}

		// Introduce a recurring character
		char recurringChar = charArray[random.nextInt(length - 2)];
		charArray[length - 2] = recurringChar;
		charArray[length - 1] = recurringChar;

		return charArray;
	}

	public char determineExpectedRecurringChar(char[] charArray) {
		int length = charArray.length;
		for (int i = 0; i < length - 1; i++) {
			for (int j = i + 1; j < length; j++) {
				if (charArray[i] == charArray[j]) {
					return charArray[i];
				}
			}
		}
		return ' '; // No recurring character found
	}

}
