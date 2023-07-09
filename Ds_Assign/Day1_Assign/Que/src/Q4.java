import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size,val= 0;
		int pos=0;
		int i= 0;
		System.out.println("enter size of the array : ");
		size = sc.nextInt();
		int arr[] = new int[size];		
		while(pos<size) {
			System.out.println("Enter the value " );
			val=sc.nextInt();
			for(i=pos-1;i>=0;i--) {
				if(val<arr[i])
					arr[i+1]=arr[i];
				else 
					break;
			}
			arr[i+1]=val;
			pos++;
		}
		System.out.println("After Rearranging : ");
		for(i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
