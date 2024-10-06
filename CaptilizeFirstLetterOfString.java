import java.util.Scanner;
import java.util.Scanner;
class Demo{
public static void main(String[] args){
String str;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a String");
str=sc.nextLine();

if(str==null){
	System.out.println("Empty");
}
else{
String words[]=str.split(" ");
StringBuilder CaptalizeString=new StringBuilder();



for(String word:words){
String str1=Character.toUpperCase(word.charAt(0))+word.substring(1);
CaptalizeString.append(str1+" ");


}
System.out.println(CaptalizeString);
}
}
}