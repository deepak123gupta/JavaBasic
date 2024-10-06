//Two sum problems
import java.util.Scanner;

 class Array {
public static void main(String[] args) {
    
     int n,sum=0,flag=1;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the length of the array");
	    n=sc.nextInt();
		int arr1[]=new int[n];
		
		System.out.println("Enter the elements of array");
		for(int i=0;i<arr1.length;i++){
			arr1[i]=sc.nextInt();
		}

 System.out.println("Enter the target or Enter the sum ");
 int target=sc.nextInt();
 for(int i=0;i<arr1.length;i++){
     for(int j=i+1;j<arr1.length;j++){
         if(target==arr1[i]+arr1[j]){
			 System.out.println("two Elemnts is  which sum is equal to target sum are: "+arr1[i]+"+"+arr1[j]+"="+target);}
        }
}
}
}

