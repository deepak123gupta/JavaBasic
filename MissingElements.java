//Find The missing elements of array
import java.util.Scanner;

 class Array {
public static void main(String[] args) {
    
     int n,sum=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the length of the array");
	    n=sc.nextInt();
		int arr1[]=new int[n];
		
		System.out.println("Enter the elements of array");
		for(int i=0;i<arr1.length;i++){
			arr1[i]=sc.nextInt();
		}
		
	    System.out.println("Enter the expected sum");
         int exsum=sc.nextInt();    
    for(int i=0;i<arr1.length;i++ ){
     sum+=arr1[i];
    }
    System.out.println("Missing number is :"+(exsum-sum));
	
	}
}

