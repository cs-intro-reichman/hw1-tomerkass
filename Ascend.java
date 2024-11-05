// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int lim = Integer.parseInt(args[0]);
		int a = (int)(Math.random() * lim);
		int b = (int)(Math.random() * lim);
		int c = (int)(Math.random() * lim);
		int maybeMin = Math.min(a, b);
		int min = Math.min(maybeMin, c);
		int maybeMax = Math.max(a, b);
		int max = Math.max(maybeMax, c);
		int mid = a + b + c - max - min;
		System.out.println(a + " " + b + " " + c);
		System.out.println(min + " " + mid + " " + max);
	}
}
