//second largest elemnt in the array
import java.util.Scanner;

 class Array {
public static void main(String[] args) {
    
     int n;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the length of the array");
	    n=sc.nextInt();
		int arr1[]=new int[n];
		System.out.println("Enter the elements of array");
		for(int i=0;i<arr1.length;i++){
			arr1[i]=sc.nextInt();
		}
		
     int largest=arr1[0],slargest=0;
     for(int i=0;i<arr1.length;i++){
         if(largest<arr1[i]){
             slargest=largest;
             largest=arr1[i];
        }


     }
     System.out.println("Second largest number in array is :"+slargest);
}
}
 