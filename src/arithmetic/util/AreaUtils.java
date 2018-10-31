package arithmetic.util;

public class AreaUtils {

	public static int[] createRandomArea(int length, int maximum) {
		int[] area = new int[length];
		for (int i = 0; i < length; i++) {
			area[i] = (int) (1 + Math.random() * (maximum - 1 + 1));
		}
		return area;
	}

}
