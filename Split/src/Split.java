import java.util.*;
 
public class Split{
	public static void main(String[] args) {
		//String.split();
		//It's a method that acts on a string, <StringName>.split(<String sp>);
		//Where sp is the string where the string splits
		//And it returns an array
		// Example: "I like apples!".split(" "); 
		//it will split at spaces and return an array of ["I","like","apples!"]
		// Example 2: "I really like really red apples".split("really")
		//it will split at the word "really" and return an array of ["I "," like "," red apples!"]

		//play around with String.split! what happens if you "I reallyreally like apples".split("really") ?

		String[] testCase1= "I like apples!".split(" ");
		String[] testCase2= "I really like really red apples".split("really");
		String[] testCase3="I reallyreally like apples".split("really");
		System.out.println(Arrays.toString(testCase1));
		System.out.println(Arrays.toString(testCase2));
		System.out.println(Arrays.toString(testCase3));
		
		

		System.out.println(sandwhichCaseNoSpaces("applespineapplesbreadlettustomatobaconmayohambreadcheese"));
	}
	public static String sandwhichCaseNoSpaces(String input){
 
		//Your task:
		/*Write a method that take in a string like "applespineapplesbreadlettustomatobaconmayohambreadcheese" describing a sandwich
		* use String.split to split up the sandwich by the word "bread" and return what's in the middle of the sandwich and ignores what's on the outside
		* What if it's a fancy sandwich with multiple pieces of bread?
		*/
		String inside ="";
		String[] sandwhich = input.split("bread");
		for(int i=1;i<sandwhich.length-1;i++) {
			inside=inside+sandwhich[i];
			}
		/*if(sandwhich.length==3) {
			for(int i=1;i<sandwhich.length-1;i++) {
				inside=inside+sandwhich[i];
				}
		}else {
			for(int i=1;i<sandwhich.length;i++) {
				inside=inside+sandwhich[i];
			}
		}*/
	
		//return Arrays.toString(sandwhich);
		return inside;
	}

	/*Write a method that take in a string like "apples pineapples bread lettus tomato bacon mayo ham bread cheese" describing a sandwich
	* use String.split to split up the sandwich at the spaces, " ", and return what's in the middle of the sandwich and ignores what's on the outside
	* Again, what if it's a fancy sandwich with multiple pieces of bread?
	*/
}