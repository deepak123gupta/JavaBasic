//Find min in the array
import java.util.Scanner;

 class Array {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
	int n;
	System.out.println("Enter the length of the array");
	    n=sc.nextInt();
		int arr[]=new int[n];
	System.out.println("Enter the values of the array");
	
	for(int i=0;i<n;i++){
	
	 arr[i]=sc.nextInt();
	}

    

    
     int min=arr[0];
	 int max=arr[0];
     int j=0,k=0;
     for(int i=1;i<arr.length;i++){
         if(min>arr[i]){
            min=arr[i];
             j=i;
         }
		 if(max<arr[i]){
			 max=arr[i];
			 k=i;
		 }

     }
     System.out.println("Index of minimum elemnt is: "+j);

     System.out.println("Minimum element  "+min);
	 
	 System.out.println("Index of maximum elemnt is: "+k);

     System.out.println("maximum element  "+max);
}
}
