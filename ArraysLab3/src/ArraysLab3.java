import java.util.Arrays;

/*
 * Author: Derfel Terciano
 * 
 * Version:1
 * 
 * array library
 */
public class ArraysLab3 {

	public static void main(String[] args) {
		int[] a1 = { 5, 10, 15, 20, 25, 30, 35, 40 };// Task1
		int[] a2 = { 7, 14, 21, 28, 35, 42, 49, 56 };// Task1
		
		// print original arrays

		System.out.println("Orginal arrays: \n");
		System.out.println("Array 1: " + Arrays.toString(a1));
		System.out.println("Array 2: " + Arrays.toString(a2));

		int[] sumArr = sum(a1, a2);// Task2
		int appendNum = 200;// Task3
		int[] appendArr = append(a1, appendNum);// Task4
		int removeIdx = 5;// Task5
		int[] removeArr = remove(a2, removeIdx);// Task6
		int sumOfEvens = sumEven(appendArr);// Task7
		rotateRight(a1);

		// printing statements result
		System.out.println("results after using the methods:\n");
		System.out.println("sumArr: " + Arrays.toString(sumArr));
		System.out.println("appendArr: " + Arrays.toString(appendArr));
		System.out.println("removeArr: " + Arrays.toString(removeArr));
		System.out.println("sumOfEvens: " + sumOfEvens);
		System.out.println("rotateRight: " + Arrays.toString(a1));

	}

	public static int[] sum(int[] arr1, int[] arr2) {
		int[] result = new int[arr1.length];
		for (int i = 0; i <= arr1.length - 1; i++) {
			result[i] = arr1[i] + arr2[i];
		}
		return result;
	}

	public static int[] append(int[] arr, int num) {
		int[] result = new int[arr.length + 1];
		for (int i = 0; i < arr.length; i++) {
			result[i] = arr[i];
		}
		result[result.length - 1] = num;
		return result;
	}

	public static int[] remove(int[] arr, int idx) {
		int[] result = new int[arr.length - 1];
		for (int i = 0; i < arr.length; i++) {
			if (i < idx) {
				result[i] = arr[i];
			} else if (i > idx) {
				result[i - 1] = arr[i];
			}
		}
		return result;
	}

	public static int sumEven(int[] arr) {
		int result = 0;
		for (int i = 0; i < arr.length; i += 2) {
			result += arr[i];
		}
		return result;
	}

	public static void rotateRight(int[] arr) {
		int lastValue = arr[arr.length - 1];
		for (int i = arr.length - 1; i > 0; i--) {
			arr[i] = arr[i - 1];
		}
		arr[0] = lastValue;
	}
}
