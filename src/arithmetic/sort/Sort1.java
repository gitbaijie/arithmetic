package arithmetic.sort;

import arithmetic.util.AreaUtils;
import arithmetic.util.PrintUtils;

public class Sort1 {

	public static void main(String[] args) {
		int[] area = AreaUtils.createRandomArea(20, 30);
		PrintUtils.printInt(area);
		PrintUtils.printInt(sort(area));

	}

	public static int[] sort(int[] area) {
		for (int i = 1; i < area.length; i++) {
			int temp = area[i];
			int j = i - 1;
			while (j >= 0 && area[j] > temp) {
				area[j + 1] = area[j];
				j--;
			}
			area[j + 1] = temp;
		}
		return area;
	}

}
