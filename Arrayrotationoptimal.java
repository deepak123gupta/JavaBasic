import java.util.*;
class Demo{
public static void reverse(int arr[], int start,int end){


while(start<end){
int temp=arr[start];
    arr[start]=arr[end];
    arr[end]=temp;
    start++;
    end--;

}

}

public static void rotate(int arr[],int k,int n){

//if k is greate than the array size
k=k%n;

//reverse elemnts which present before a k
reverse(arr,0,k-1);

//reverse elemnts which present afer a k
reverse(arr,k,n-1);

//reverse whole array

reverse(arr,0,n-1);




}

public static void main(String args[]){
int arr[]={1,2,3,4,5,6,7};
int k=2;
int n=arr.length;
System.out.println("Orginal Array is "+Arrays.toString(arr));
rotate(arr,k,n);
System.out.println("After rotation array is "+Arrays.toString(arr));

}

}