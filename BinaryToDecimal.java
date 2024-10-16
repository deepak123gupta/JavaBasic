import java.util.Scanner;

class Demo{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	//Covert binary number into decimal;
/* int binary_number=1001;
int unit_digit,ans=0,pw=1;
while(binary_number>0){

 unit_digit=binary_number%10;
 ans+=(unit_digit*pw);
 binary_number/=10; 
 pw*=2;
}
System.out.println(ans); */


//covert Decimal number into binary
 System.out.println("Enter the Decimal number");
int D_number=sc.nextInt();
System.out.println("Binary number is: ");
while(D_number>0){
	System.out.print(D_number%2);
	D_number=D_number/2;
}
}
}