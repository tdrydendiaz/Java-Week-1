import java.util.ArrayList;
import java.util.Optional;

public class Runner {
	private static final int ArrayList = 0;
	static int n1 = 2;
	static int n2 = 87;
	static String operator = "+";
	static int i = 1;
	static int t = 2;
	static ArrayList<Integer> tenList = new ArrayList<Integer>();

	public static void main(String[] args) {
		System.out.println("Hello World");
		String Welcome = "Hello World";
		System.out.println(Welcome);

		method1();
		method2();
		method3();
		addition(4, 2);
		multiplication(3, 6);
		division(5, 2);
		subtraction(4, 3);
		checkString();
		calculatorContinued(n1, n2, operator);
		printNumbers();
		printbigNumbers();
		ten();
		array1();
		array2();
		yello();
		Ten();
		Words();
		divi(tenList);
		ques5stream();
		ques7stream();
		// ques8stream();
		System.out.println(ques5stream());
		System.out.println(ques7stream());

		// check(1);

	}

	public static void method1() {

		System.out.println(n1 + n2);

	}

	public static void method2() {
		System.out.println(n1 - n2);

	}

	public static void method3() {
		System.out.println(n1 * n2);

	}

	public static void addition(int n1, int n2) {
		System.out.println(n1 + n2);

	}

	public static void multiplication(int n1, int n2) {
		System.out.println(n1 * n2);
	}

	public static void division(float n1, float n2) {
		System.out.println(n1 / n2);
	}

	public static void subtraction(int n1, int n2) {
		System.out.println(n1 - n2);

	}

	public static void checkString() {
		String s1 = "Tania";
		String home = "London";

		if (s1.equals(s1))
			System.out.println("it matches");
		else
			System.out.println("it doesn't match");
	}

	public static void calculatorContinued(int n1, int n2, String operator) {

		if (operator == "+") {
			System.out.println(n1 + n2);
		} else if (operator == "*") {
			System.out.println(n1 * n2);
		} else if (operator == "/") {
			System.out.println(n1 / n2);
		} else if (operator.equals("-")) {
			System.out.println(n1 - n2);
		} else {
			System.out.println("not accepted");
		}

	}

	public static void printNumbers() {
		for (int i = 0; i < 10; i++)
			System.out.println(i);
	}

	public static void printbigNumbers() {
		for (int i = 100; i < 999; i++)
			System.out.println(i);
	}

	public static void ten() {
		if (i == 1)
			System.out.println("One");
	}

	public static int ques6(int input, int counter) {

		for (int i = 0; i <= input; i++) {
			if (input % 5 == 0) {
				counter++;
			}
		}
		return counter;
	}

	public static void array1() {
		int[] array1 = new int[100];
		for (int i = 0; i <= array1.length; i++) {
			System.out.println(i);
		}
	}

	public static void array2() {
		int[] array2 = new int[900];
		for (int i = 100; i <= array2.length + 100; i++) {
			System.out.println(i);
		}
	}

	public static void yello() {
		ArrayList<Integer> intList = new ArrayList<Integer>();
		System.out.println(intList.size());
		intList.add(9);
		System.out.println(intList.size());
		System.out.println(intList.get(0));
		System.out.println(intList.contains(9));
	}

	public static void Ten() {

		for (i = 0; i <= 10; i++) {
			{
				tenList.add(i);
			}

		}
		System.out.println(tenList);
		System.out.println(tenList.contains(2));

	}

	public static void Words() {
		ArrayList<String> wordList = new ArrayList<String>();
		wordList.add("red");
		wordList.add("blue");
		wordList.add("yellow");
		wordList.add("green");
		wordList.add("pink");
		System.out.println(wordList);
		System.out.println(wordList.contains("blue"));

	}

	public static ArrayList<Integer> divi(ArrayList<Integer> tenList) {
		for (int i = 0; i < tenList.size(); i++) {

			if (tenList.get(i) % 5 == 0) {

				tenList.set(i, tenList.get(i) * 10);

			}

		}
		System.out.println(tenList);
		return tenList;

	}
	// Create a method that checks for a specific word in a list of Strings and
	// returns the

	// number of times that word occurs.
	public static long ques5stream() {

		ArrayList<String> wordList = new ArrayList<String>();
		wordList.add("red");
		wordList.add("blue");
		wordList.add("yellow");
		wordList.add("green");
		wordList.add("pink");

		return wordList.stream().filter(s -> s.equals("blue")).count();

	}
	// Create a method that checks a list of numbers and returns the LARGEST value

	public static Optional<Integer> ques7stream() {
		return tenList.stream().max(Integer::compare);
	}

	// Create a method that removes all ODD values from a list of Numbers.

	// public static List<Integer> ques8stream(ArrayList<Integer>, tenList) {
	// return tenList.stream().filter(i -> i % 2 ==0).collect(Collectors.toList());

}
