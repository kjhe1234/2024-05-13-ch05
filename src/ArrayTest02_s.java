
public class ArrayTest02_s {

	public static void main(String[] args) {

		int[][] score = new int[2][3];

		int[][] array1 = {
								{10,20,30},
								{40,50,60},
								{70,80,90}
							  };
		
		// arr1 배열의 모든 원소의 총합을 구하시오.
		int[] arr1 = {10,20,30,40,50};
		int sum = 0;
//		for(int i=0;i<arr1.length;i++) { // i = 0 1 2 3 4
//			sum = sum + arr1[i];
//			
//		}
		
		// for i in arr1:
		//  sum = sum + i
		
		// 향상된 for 문
		for(int i : arr1) {
			sum = sum + i;
		}
		System.out.println(sum);
		
		
		
	}

	
}
