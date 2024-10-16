import java.util.*;
class removeDupl{
public static void main(String args[]){

int arr[]= {20,20,30,40,50,50,50};
List<Integer> arr1 = new ArrayList<Integer>();

for(int i =0;i<arr.length;i++){

for(int j=i+1;j<arr.length;j++){

if(arr[i] ==arr[j]){
 arr[j]=0;
 }
 }
 }
 int k =0,i=0;
 while (i<arr.length){
 if(arr[i] != 0){
 arr1.add(arr[i]);
 }
 i++;
 } 
 for(int a : arr){
 System.out.println(a);
 }
 System.out.print(arr1);
 }
 }