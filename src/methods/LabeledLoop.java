package methods;

public class LabeledLoop {

	public static void main(String[] args) {

		int i, j;
		outer: for (i = 1; i <= 5; i++) {
			System.out.println(i);
			inner: for (j = 100; j <= 500; j += 100) {
				System.out.println(j);

				if (j == 400) {
					break inner;
				}
			}
		}
	}
}
