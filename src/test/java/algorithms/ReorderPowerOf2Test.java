package algorithms;

public class ReorderPowerOf2Test {

    public static void main(String[] args) {
        testReorderedPowerOf2(1, true);
        testReorderedPowerOf2(10, false);
        testReorderedPowerOf2(16, true);
        testReorderedPowerOf2(24, false);
        testReorderedPowerOf2(46, true);
        testReorderedPowerOf2(61, true); // 16 is a power of 2, and 61 is a permutation of 16
        testReorderedPowerOf2(821, false);
        testReorderedPowerOf2(1024, true);
        testReorderedPowerOf2(4096, true);
        testReorderedPowerOf2(625, false);
    }

    private static void testReorderedPowerOf2(int number, boolean expected) {
        boolean result = ReorderPowerOf1.isPowerOfTwo(number);
        assert result == expected : "Test failed for: " + number + " Expected: " + expected + " but got: " + result;
        System.out.println("Test passed for: " + number);
    }
}
