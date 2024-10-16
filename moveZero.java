import java.util.*;

class moveZero{
public static void main(String args[]){

int arr[] = {0,4,5,6,333,66,45,0,666,544,0,32,55};
int arr1[]= new int[arr.length];
int k=0,count=0;

for(int i=0;i<arr.length;i++){

if(arr[i] !=0 ){
arr1[k++] = arr[i];
}
else {
count++;
}
}

while(k<arr.length){
arr1[k++]=0;
}
for(int a:arr1){
System.out.print(" "+a);
}
}}
