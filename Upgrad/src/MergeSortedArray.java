import java.util.Arrays;
import java.util.Scanner;

public class MergeSortedArray {
	public static void main(String ss[]) {
		Scanner scanner = new Scanner(System.in);
		int sizeArray1 = scanner.nextInt();
		int sizeArray2 = scanner.nextInt();
		int sortedArray1[] = getArrayInput(sizeArray1, scanner);
		int sortedArray2[] = getArrayInput(sizeArray2, scanner);
		scanner.close();
		System.out.println(Arrays.toString(mergeBothInDescendingOrder(sortedArray1, sortedArray2)));
	}

	private static int[] mergeBothInDescendingOrder(int[] arr1, int[] arr2) {
		int n1 = arr1.length;
		int n2 = arr2.length;
		int[] arr3 = new int[n1 + n2];
		int i = n1 - 1, j = n2 - 1, k = 0;

		while (i >= 0 && j >= 0) {
			if (arr1[i] > arr2[j])
				arr3[k++] = arr1[i--];
			else
				arr3[k++] = arr2[j--];
		}

		while (i >= 0)
			arr3[k++] = arr1[i--];

		while (j >= 0)
			arr3[k++] = arr2[j--];

		return arr3;
	}

	private static int[] getArrayInput(int sizeArray1, Scanner scanner) {
		int arrTemp[] = new int[sizeArray1];
		for (int i = 0; i < sizeArray1; i++) {
			arrTemp[i] = scanner.nextInt();
		}
		return arrTemp;
	}
}