import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size=0;
		int max=0;
		int sec_larg=0;
		int thrd_larg= 0;
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
		System.out.println("Largest num : ");
		max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				sec_larg=max;
				max=arr[i];
			}
			else if(arr[i]>sec_larg && arr[i]!=max){
				thrd_larg=sec_larg;
				sec_larg=arr[i];
			}
			else if(arr[i]>thrd_larg && arr[i]!=sec_larg && arr[i]!=max) {
				thrd_larg=arr[i];
			}
		}
		System.out.println(max);
		System.out.println("sec_Largest num : ");
		System.out.println(sec_larg);
		System.out.println("third_Largest num : ");
		System.out.println(thrd_larg);
	}

}
