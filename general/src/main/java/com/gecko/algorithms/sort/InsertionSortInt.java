package  com.gecko.algorithms.sort;

public class InsertionSortInt {
	
	public static void sort(int[] ints) {
		for(int i = 1; i < ints.length; i++) {
			for(int j = i; j > 0; j--) {
				if( isGreater(ints[j-1], ints[j]) ) {
					exchange(ints, j-1, j);
				}
			}
		}
	}
	
	private static void exchange(int[] ints, int x_index, int y_index) {
		int _tmp = ints[x_index];
		ints[x_index] = ints[y_index];
		ints[y_index] = _tmp;
	}
	
	private static boolean isGreater(int x, int y) {
		return x > y;
	}
}
