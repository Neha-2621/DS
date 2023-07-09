import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size,max= 0;
		int cnt = 1;
		System.out.println("enter size of the array : ");
		size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the elements in the array : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("elements of the array : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		max=arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max=arr[i];
				cnt++;
			}
			else
				cnt--;

		}
		System.out.println(cnt);
	}

}
