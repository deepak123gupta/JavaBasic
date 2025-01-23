import java.util.*;
class Demo{

public static void main(String args[]){

int arr[]={8,3,4,9,11};
int arr1[]=arr.clone();
int rank[]={1,2,3,4,5};
Arrays.sort(arr1);
int rank1[]=rank.clone();
for(int i=0;i<arr.length;i++){
  for(int j=0;j<arr.length;j++){
    if(arr1[i]==arr[j]){
     rank1[j]=rank[i];
      
 }
}

}
System.out.println(Arrays.toString(arr));
System.out.println(Arrays.toString(rank1));

}

}