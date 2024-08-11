package algorithms;

public class ReorderPowerOf1 {

    /*
     * You are given an integer n. We reorder the digits in any order (including the
     * original order) such that the leading digit is not zero.
     *
     * Return true if and only if we can do this so that the resulting number is a
     * power of two.
     *
     *
     *
     * Example 1:
     *
     * Input: n = 1 Output: true Example 2:
     *
     * Input: n = 10 Output: false
     *
     *
     * Constraints:
     *
     * 1 <= n <= 109
     */
    public static void main(String[] args) {

		/*System.out.println(String.valueOf(Math.sqrt(26)).contains("."));
		System.out.println("26 is power of 2? " + ((int) Math.sqrt(26) == Math.sqrt(26)));
		System.out.println("25 is power of 2? " + ((int) Math.sqrt(25) == Math.sqrt(25)));*/

//		System.out.println("1 is power of 2? " + isPowerOfTwo(1));
//		System.out.println("1 is power of 2? " + isPowerOfTwo(2));
//		System.out.println("1 is power of 2? " + isPowerOfTwo(26));
  //      System.out.println("1 is power of 2? " + isPowerOfTwo(25));
//        printPermutations(25);
//        printPermutations(26);
//        printPermutations(1);
//        printPermutations(81);
        printPermutations(627);
    }

    private static void printPermutations(int number) {
        char[] digits = Integer.toString(number).toCharArray();
        System.out.println(String.valueOf(digits) + " contains power of 2? " + permuteAndCheck(digits, 0));

    }

    public static boolean isPowerOfTwo(int n) {
        // reorder the number
        // in order to get all the variations of a number we have to generate its
        // permutations (in cat be implementing a recursive algorithm).
        //return (n & (n - 1)) == 0 && n > 0;
        return (int) Math.sqrt(n) == Math.sqrt(n);
    }

    private static boolean permuteAndCheck(char[] array, int k) {
        if (k == array.length) {
            return isPowerOfTwo(Integer.parseInt(new String(array)));
        }
        for (int i = k; i < array.length; i++) {
            //System.out.println("i: " + i + " k: " + k+ " array: " + new String(array));
            if (k == 0 && array[i] == '0')
                continue; // Skip leading zero
            swap(array, i, k);
            if (permuteAndCheck(array, k + 1))
                return true;
            swap(array, i, k); // backtrack
        }
        return false;
    }

    private static void swap(char[] array, int i, int j) {
        System.out.println("Swapping " + new String(array)) ;
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        System.out.println("Swapped " + new String(array)) ;
    }

}
