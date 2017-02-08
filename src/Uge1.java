import java.util.*;

public class Uge1 {
	public static int fak(int x) {
		if (x < 0 ) x = -x;
		if (x == 1) return 1;
		return x * fak(x - 1);
	}

	public static int fib(int x) {
		if (x <= 2)
			return 1;
		return fib(x - 1) + fib(x - 2);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Vælg et tal til fakultet: ");
		int n = input.nextInt();
		System.out.println(n + "! = " + fak(n));

		System.out.println("Vælg et tal til fibonacci: ");
		n = input.nextInt();
		System.out.println("Fibonnaci nummer " + n + ": " + fib(n));

		input.close();
	}
}
