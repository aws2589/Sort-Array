
public class SortArray {

	public static String [] sort(String[] numbers) {
	
		String min ="";
		int minIdx=0;
		
		for (int i=0; i<numbers.length-1; i++) {
			int oldMinIdx = i;
			min = numbers[i];
			
			for (int j=i+1; j<numbers.length; j++) {
				if(Double.parseDouble(min)>Double.parseDouble(numbers[j])) {
					min = numbers[j];
					minIdx = j;
				
				}
			}
			swap(numbers, minIdx, oldMinIdx, min);
		
		}
		return numbers;
	}
	private static void swap(String []numbers, int minIdx, int oldMinIdx, String min) {
		String temp = numbers[oldMinIdx];
		numbers[oldMinIdx] = min;
		numbers[minIdx] = temp;
	}

}
