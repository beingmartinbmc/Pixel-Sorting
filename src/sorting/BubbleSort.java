package sorting;

public class BubbleSort {
	
	private static int index = 0;
	private static boolean swapsMade = false;

	public static boolean sort(Pixel[] pixels) {
		if(index+1 >= pixels.length) {
			if(swapsMade) {
				index = 0;
				swapsMade = false;
			}
			else {
				return true;
			}
		}
		Pixel p1 = pixels[index];
		Pixel p2 = pixels[index + 1];
		if(p1.id > p2.id) {
			pixels[index] = p2;
			pixels[index + 1] = p1;
			swapsMade = true;
		}
		
		index++;
		
		return false;
	}
}
