import java.util.Arrays;

/*
 * Author: Derfel Terciano
 * 
 * Version:1
 * 
 * array library
 */
public class ArraysLab3 {
	
	/*Method Main will:
	 * 	Contain: 
	 * 		-integer arrays a1, a2, sumArr, appendArr, removeArr
	 * 		-int variables appendNum, removeIdx, sumOfEvens
	 * 	Carry out the following actions:
	 * 		-Declare array a1 containing the values (5, 10, 15, 20, 25, 30, 35, 40) 
	 * 		and array a2 containing the values (7, 14, 21, 28, 35, 42, 49, 56)
	 * 		-Form sumArr by calling the sum method with a1 and a2 as inputs
	 * 		-Declare int appendNum and set it to 200.
	 * 		-Form appendArr by calling the append method with a1 and appendNum as inputs
	 * 		-Declare int removeIdx and set it to 5.
	 * 		-Form removeArr by calling remove with a2 and removeIdx
	 * 		-Form sumOfEvens by calling sumEven with appendArr as the input
	 * 		-Call rotateRight with a1 as the input
	 * 	On their own lines print out (use Arrays.toString to transform arrays into a printable strings):
	 * 		-sumArr
	 * 		-appendArr
	 * 		-removeArr
	 * 		-sumOfEvens (an int you don’t need Arrays.toString)
	 * 		-a1
	 */

	public static void main(String[] args) {
		int[] a1 = { 5, 10, 15, 20, 25, 30, 35, 40 };// Task1
		int[] a2 = { 7, 14, 21, 28, 35, 42, 49, 56 };// Task1
		
		//prints original arrays
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
	
	
	/*
	 * method sum accepts two arrays of integers arr1 and arr2 and 
	 * returns an array of integers, in which every element is the sum of 
	 * the elements at that index for the arrays arr1 and arr2. Assume 
	 * arrays arr1 and arr2 have at least one element each and are the 
	 * same length.
	 */
	public static int[] sum(int[] arr1, int[] arr2) {
		int[] result = new int[arr1.length];
		for (int i = 0; i <= arr1.length - 1; i++) {
			result[i] = arr1[i] + arr2[i];
		}
		return result;
	}
	
	
	
	/*
	 * method append accepts an array of integers arr of length n and 
	 * an integer num, and returns an array of integers of length n+1 that 
	 * consists of the elements of arr with num appended to the end. Assume 
	 * array arr has at least one element.
	 * 
	 */

	public static int[] append(int[] arr, int num) {
		int[] result = new int[arr.length + 1];
		for (int i = 0; i < arr.length; i++) {
			result[i] = arr[i];
		}
		result[result.length - 1] = num;
		return result;
	}
	
	
	
	/*
	 * method remove accepts an array of integers arr and an integer 
	 * idx and returns an array of integers consisting of all of the elements 
	 * of arr except for the element at index idx (thus, the returned array has 
	 * a length of arr.length – 1). Assume arr has at least two elements.
	 * 
	 */

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
	
	
	/*
	 * method sumEven accepts an array of integers arr and returns an 
	 * integer containing the sum of the elements at the even indices of arr.  
	 * (That means elements at indices 0,2,4,6,8.) Assume arr has at least 
	 * one element.
	 */
	
	

	public static int sumEven(int[] arr) {
		int result = 0;
		for (int i = 0; i < arr.length; i += 2) {
			result += arr[i];
		}
		return result;
	}
	
	
	
	/*
	 * method rotateRight accepts an array of integers arr and does not return
	 * a value.  The rotateRight method moves each element of arr one index to the 
	 * right (element 0 goes to element 1, element 1 goes to element 2, …, element 
	 * n-1 goes to element 0).  Assume arr has at least one element.
	 */

	public static void rotateRight(int[] arr) {
		int lastValue = arr[arr.length - 1];
		for (int i = arr.length - 1; i > 0; i--) {
			arr[i] = arr[i - 1];
		}
		arr[0] = lastValue;
	}
}
