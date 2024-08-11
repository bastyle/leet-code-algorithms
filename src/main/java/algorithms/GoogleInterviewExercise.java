package algorithms;

import java.util.HashSet;
import java.util.Set;

public class GoogleInterviewExercise {

	public static void main(String[] args) {
		int[] arr1 = { 6, 4, 3, 2, 1, 7 };
		System.out.println(hasPairWithSum(arr1, 9));
	}

	private static boolean hasPairWithSum(int arr[], int sum) {
		Set<Integer> complements = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			if (complements.contains(arr[i])) {
				return true;
			}
			complements.add(sum - arr[i]);
		}

		return false;
	}

}
