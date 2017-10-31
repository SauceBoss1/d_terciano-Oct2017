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
		int[] a1 = { 5, 10, 15, 20, 25, 30, 35, 40 };//1
		int[] a2 = { 7, 14, 21, 28, 35, 42, 49, 56 };//1
		int[] sumArr = sum(a1, a2);//2
		int appendNum = 200;//3
		int[] appendArr = append(a1, appendNum);//4
		int removeIdx = 5;//5
		int[] removeArr = remove(a2,removeIdx);//6
		int sumOfEvens = sumEven(appendArr);//7
		rotateRight(a1);
		
		//printing statements
		System.out.println(Arrays.toString(sumArr));
		System.out.println(Arrays.toString(appendArr));
		System.out.println(Arrays.toString(removeArr));
		System.out.println(sumOfEvens);
		System.out.println(Arrays.toString(a1));
		
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
		for (int i = arr.length-1; i > 0; i--) {
			arr[i] = arr[i - 1];
		}
		arr[0] = lastValue;
	}
}
