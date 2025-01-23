import java.util.*;
class Demo{
public static void main(String args[]){
int arr[]={10,5,4,3,9};
Arrays.sort(arr);
int size=arr.length;
//System.out.println(size);
int middle=size/2;
//System.out.println(middle);
System.out.println("After sorting array is"+Arrays.toString(arr));

if(size%2==0)
System.out.println("Medain is "+(arr[middle-1]+arr[middle])/2);

else
System.out.println("Median is "+arr[middle]);

 

}

}