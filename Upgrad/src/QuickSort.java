import java.util.Scanner;

class QuickSort {
	static int partition(int arr[], int low, int high, int pivot) {
		int i = (low - 1);
		for (int j = low; j < high; j++) {
			if (arr[j] <= pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;
		return i + 1;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int pivot = sc.nextInt();
		int i = partition(arr, 0, n - 1, arr[pivot]);
		System.out.println(arr[pivot]);
		for (int j = i + 1; j < n; j++) {
			System.out.println(arr[j]);
		}

	}
}