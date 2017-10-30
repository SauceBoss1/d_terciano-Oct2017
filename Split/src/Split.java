import java.util.*;

public class Split {
	public static void main(String[] args) {
		// String.split();
		// It's a method that acts on a string, <StringName>.split(<String sp>);
		// Where sp is the string where the string splits
		// And it returns an array
		// Example: "I like apples!".split(" ");
		// it will split at spaces and return an array of ["I","like","apples!"]
		// Example 2: "I really like really red apples".split("really")
		// it will split at the word "really" and return an array of ["I "," like ","
		// red apples!"]

		// play around with String.split! what happens if you "I reallyreally like
		// apples".split("really") ?

		String[] testCase1 = "I like apples!".split(" ");
		String[] testCase2 = "I really like really red apples".split("really");
		String[] testCase3 = "I reallyreally like apples".split("really");
		System.out.println(Arrays.toString(testCase1));
		System.out.println(Arrays.toString(testCase2));
		System.out.println(Arrays.toString(testCase3));

		System.out.println(sandwichCaseNoSpaces("applespineapplesbreadlettustomatobaconmayohambreadcheese","bread"));
		System.out.println(sandwichCaseWithSpaces("apples pineapples bread lettus tomato bread bacon mayo ham bread cheese"," "));
	}

	public static String sandwichCaseNoSpaces(String input,String split) {

		// Your task:
		/*
		 * Write a method that take in a string like
		 * "applespineapplesbreadlettustomatobaconmayohambreadcheese" describing a
		 * sandwich use String.split to split up the sandwich by the word "bread" and
		 * return what's in the middle of the sandwich and ignores what's on the outside
		 * What if it's a fancy sandwich with multiple pieces of bread?
		 */
		String inside = "";
		String[] sandwich = input.split(split);
		if (sandwich.length==3) {
			for (int i = 1; i < sandwich.length - 1; i++) {	
				inside = inside + sandwich[i];
			}
			
		} else {
			int lastPiece = 1;
			for (int i = lastPiece; i < sandwich.length - 2; i++) {
				inside = inside + sandwich[i]+"bread";
				lastPiece=i;
			}
			inside = inside + sandwich[lastPiece+1];
		}
			
		/*
		 * if(sandwhich.length==3) { for(int i=1;i<sandwich.length-1;i++) {
		 * inside=inside+sandwich[i]; } }else { for(int i=1;i<sandwhich.length;i++) {
		 * inside=inside+sandwich[i]; } }
		 */

		 //return Arrays.toString(sandwich);
		return inside;
	}
	
	/*
	 * Write a method that take in a string like
	 * "apples pineapples bread lettus tomato bacon mayo ham bread cheese"
	 * describing a sandwich use String.split to split up the sandwich at the
	 * spaces, " ", and return what's in the middle of the sandwich and ignores
	 * what's on the outside Again, what if it's a fancy sandwich with multiple
	 * pieces of bread?
	 */
	public static String sandwichCaseWithSpaces(String input,String split) {
		String[] sandwich = input.split(split);
		String result = "";
		int firstIndex = 0;
		int secondIndex = 0;
		for (int i = 0 ; firstIndex == 0 && !sandwich[0].equals("bread"); i++) {
			if (sandwich[i].equals("bread")) {
				firstIndex = i;
			}
		}
		for (int i = sandwich.length - 1; secondIndex == 0; i--) {
			if (sandwich[i].equals("bread")) {
				secondIndex = i;
			}
		}
		for (int i = firstIndex+1; i < secondIndex; i++) {
			result = result+sandwich[i]+" " ;
			/*if (!sandwich[i].equals("bread")) {
				result = result+sandwich[i]+" " ;
			}*/
		}
		return result;
		//return Arrays.toString(sandwich);
	}

}