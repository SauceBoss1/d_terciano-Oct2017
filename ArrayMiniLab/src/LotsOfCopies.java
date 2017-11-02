import java.util.Arrays;

/*
 * Author: Derfel Terciano
 * Version: 1
 * 
 * 
 * MiniArrayLab assignment
 * 
 * 
 */
public class LotsOfCopies {

	public static void main(String[] args) {
		int num=7;
		String strMain = "APCS";
		int[] arrMain= {1,2,3,4,5};
		
		
		printEverything(num,strMain,arrMain);
		//question1
		changeMe(num,strMain,arrMain);
		System.out.println("\n\nafter the change");
		printEverything(num,strMain,arrMain);
		
		
		
		
		/*QUESTION 2
		 * Consider the code:
		 * a=startValue
		 * b=a
		 * a=newValue
		 * 
		 * What will b equal?
		 * When you set one variable to equal another and then change the original variable
		 * to something else, DOES THE SECOND VALUE CHANGE TOO OR STAY THE SAME?
		 * Try it quickly where the value you use are ints, and then arrays 
		 * 
		 * Answer: When using an int variable the second value of a changes but var b
		 * stays the same as the orginal value for a. This is also true for the arrays.
		 * 
		 */
		System.out.println("\n\nQuestion 2");
		String str ="10";
		int a =0;
		int b=0;
		a=num;
		b=a;
		a+=1;
		System.out.println(b);
		System.out.println();
		String bStr= str;
		str ="hi";
		System.out.println("bStr: "+bStr);
		
		int a2 = 0;
		int b2=0;
		a2=arrMain[3];
		b2=a2;
		a2=arrMain[3]+1;
		System.out.println(b2);
		System.out.println(a2);
		
		
	}
	public static void printEverything(int x, String str, int[] arr) {
		System.out.println(x);
		System.out.println(str);
		System.out.println(Arrays.toString(arr));
	}
	/*QUESTION 1
	 * when you pass something into a method and then CHANGE THE VALUE INSIDE THE METHOD, does
	 * the value change in the main part of your program??
	 * 
	 * 
	 * Answer: It only changes the array but not the integer variable and the string
	 */
	public static void changeMe(int x, String str, int[] arr) {
		x+=1;
		str="Hello World";
		arr[arr.length-1]=arr[0];
	}
	
}
