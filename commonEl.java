import java.util.*;
class commonEl{
public static void main(String args[]){

int arr1[]={3,4,2,5,7,6,8};
int arr2[]= {77,55,3,2,33,6,44};
int arr3[] = {11,22,3,6,2,87};

Arrays.sort(arr1);
Arrays.sort(arr2);
Arrays.sort(arr3);
for(int i=0;i<arr1.length;i++){
for(int j=0;j<arr2.length;j++){
if(arr1[i] == arr2[j]){
for(int k=0;k<arr3.length;k++){
if(arr1[i] == arr3[k]){
System.out.println(arr1[i]);}
}
}


}
}

}
}
