//Sort The Given Array
import java.util.Scanner;

 class Array {
public static void main(String[] args) {
    
     int n,temp;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the length of the array");
	    n=sc.nextInt();
		int arr1[]=new int[n];
		System.out.println("Enter the elements of array");
		for(int i=0;i<arr1.length;i++){
			arr1[i]=sc.nextInt();
		}
	
     for(int i=1;i<arr1.length;i++){
         for(int j=0;j<arr1.length-i;j++){
             if(arr1[j]>arr1[j+1]){
               temp=arr1[j];
               arr1[j]=arr1[j+1];
               arr1[j+1]=temp;             
             }
         }
     }
	 //For printing elements After sorting
	System.out.println("Elements of array after sorting");
     for(int i=0;i<arr1.length;i++){
         System.out.print(arr1[i]+" ");
     }

}
}
