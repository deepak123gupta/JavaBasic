import java.util.*;
class Magic{
public static void main(String args[]){
long number;
Scanner sc=new Scanner(System.in);
number=sc.nextLong();
long sum=0;
while(number>0){
	
long r1=number%10;
sum+=r1;
number=number/10;
}
int sum1=0;
while(sum>0){
	long r2=sum%10;
	sum1+=r2;
	sum=sum/10;
	
}
if(sum1==1)
{
	System.out.println("Its a magic number");
}
else{
	
	System.out.println("Its not magic number");
}
}
}