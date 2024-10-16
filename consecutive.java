class consecutive{
public static void main(String args[]){

int arr [] = {55,1,3,44,2,4,88,5};
int min = arr[0];
for(int i=0;i<arr.length;i++){

if(arr[i]<min){
min = arr[i];
}
}
System.out.println(min);
for(int i=0;i<arr.length;i++){
for(int j=0;j<arr.length;j++){
	if(min+1 == arr[j]){
		min = arr[j];
		System.out.println(min);
	}
}
}
}
}
