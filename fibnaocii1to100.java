class Demo{

public static void main(String args[]){
int fib=0;
int fib1=-1,fib2=1;
for(int i=0;i<20;i++){

fib=fib1+fib2;
fib1=fib2;
fib2=fib;
if(fib>100){
break;
}
System.out.println(fib);
}


}

}