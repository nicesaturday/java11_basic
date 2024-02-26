package sec1;

public class ArrayCopy1 {
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {6,7,8,9,0};
		
		System.out.println(arr1);
		System.out.println(arr2);
		
		arr1 = arr2;
		
		System.out.println(arr1);
		System.out.println(arr2);
	}
}
