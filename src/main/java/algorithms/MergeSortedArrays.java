package algorithms;

import java.util.Arrays;

public class MergeSortedArrays {

	public static void main(String[] args) {
		int[] a = { 1, 3, 4, 10 };
		int[] b = { 4, 7, 17, 25, 45 };
		System.out.println(Arrays.toString(mergeSortedArrays(a, b)));
		System.out.println(Arrays.toString(mergeSortedArrays2(a, b)));
	}

	public static int[] mergeSortedArrays(int[] array1, int[] array2) {
		int[] mergedArrays = new int[array1.length + array2.length];
		int itemArr1 = array1[0];
		int itemArr2 = array2[0];
		int mergedIndex = 0;
		int array1Index = 0;
		int array2Index = 0;
		boolean isThereMorePosArray1 = true;
		boolean isThereMorePosArray2 = true;

		// while (itemArr1 != 0 || itemArr2 != 0) {
		while (isThereMorePosArray1 || isThereMorePosArray2) {
			if (((itemArr1 < itemArr2) && isThereMorePosArray1) || (isThereMorePosArray1 && !isThereMorePosArray2)) {
				mergedArrays[mergedIndex] = itemArr1;
				mergedIndex++;
				if (array1Index + 1 < array1.length) {
					itemArr1 = array1[array1Index + 1];
					array1Index++;
				} else {
					isThereMorePosArray1 = false;
				}
			} else {
				mergedArrays[mergedIndex] = itemArr2;
				mergedIndex++;
				if (array2Index + 1 < array2.length) {
					itemArr2 = array2[array2Index + 1];
					array2Index++;
				} else {
					isThereMorePosArray2 = false;
				}
			}

		}
		return mergedArrays;
	}

	public static int[] mergeSortedArrays2(int[] nums1, int[] nums2) {
		int n1 = nums1.length;
		int n2 = nums2.length;
		int[] result = new int[n1 + n2];
		int i = 0, j = 0, k = 0;

		while (i < n1 && j < n2) {
			if (nums1[i] <= nums2[j]) {
				result[k++] = nums1[i++];
			} else {
				result[k++] = nums2[j++];
			}
		}

		// Copy remaining elements of nums1, if any
		while (i < n1) {
			result[k++] = nums1[i++];
		}

		// Copy remaining elements of nums2, if any
		while (j < n2) {
			result[k++] = nums2[j++];
		}

		return result;
	}

}
