package week1.day2.assignments;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		int len=arr.length;

		for (int i = 0; i < len-1; i++) {
			// System.out.println(arr[i]);

			for (int j = i+1; j < len; j++) {

				if(arr[i]==arr[j]) {
					System.out.println(arr[i]+" "+"is duplicate in array");
					break;
				}
			}

		}
	}

}



