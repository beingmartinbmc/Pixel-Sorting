package sorting;

public class MasterSorter {
	
	public static boolean sort(Pixel[] pixels, SortingMethod method, int iterations) {
		for(int i = 0; i < iterations; i++) {
			if(method == SortingMethod.BubbleSort) BubbleSort.sort(pixels);
		}
		
		return isSorted(pixels);
	}
	
	private static boolean isSorted(Pixel[] pixels) {
		for(int i = 0; i < pixels.length; i++) {
			Pixel pixel = pixels[i];
			if(i != pixel.id) return false;
		}
		return true;
	}

}
