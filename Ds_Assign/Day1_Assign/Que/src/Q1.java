import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size, ele, cnt = 0;
		int pos = -1;
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
		System.out.println("\n enter the num to search postion : ");
		ele = sc.nextInt();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ele)
				pos = i;
		}
		if (pos != -1)
			System.out.println(ele + " found at position " + pos);
		else
			System.out.println("Element not found in the array!!!");
	}

}
