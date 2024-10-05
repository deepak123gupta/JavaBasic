// Merge two sorted array
import java.util.Scanner;

 class Array {
public static void main(String[] args) {
    
     int i=0,j=0,k=0,n;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the length of the array");
	    n=sc.nextInt();
		int arr1[]=new int[n];
		int arr2[]=new int[n];
		int merge[]=new int[arr1.length+arr2.length];
		
	System.out.println("Enter the values of the First array");
	
	for(int i=0;i<n;i++){
	
	 arr1[i]=sc.nextInt();
	}
	
	System.out.println("Enter the values of the Second array");
	
	for(int i=0;i<n;i++){
	
	 arr2[i]=sc.nextInt();
	}

    
  
     
     
     while(i<arr1.length&&j<arr2.length){
         if(arr1[i]<=arr2[j]){
             merge[k++]=arr1[i++];
         }
         else
         {
             merge[k++]=arr2[j++];
         }
        
        
    }
     while(i<arr1.length){
         merge[k++]=arr1[i++];
     }
     while(j<arr2.length){
         merge[k++]=arr2[j++];
     }
     for(int m=0;m<merge.length;m++){
         System.out.println(merge[m]);
     }

}
 
 }