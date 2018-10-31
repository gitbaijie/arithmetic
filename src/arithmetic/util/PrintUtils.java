package arithmetic.util;

public class PrintUtils {

	public static void printInt(int[] area) {
		for (int i = 0; i < area.length; i++) {
			System.out.print(area[i]);
			if (i != area.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println();
	}

}
