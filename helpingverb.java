import java.util.Scanner;
class Demo{
public static void main(String[] args){
String hverb[]={"do","does","did","is","am","are","have","has","had","was","were","can","could"};
Scanner sc=new Scanner(System.in);
String paragraph=sc.nextLine();
String pspilt[]=paragraph.split(" ");
for(int i=0;i<pspilt.length;i++){
	
	for(int j=0;j<hverb.length;j++){
		if(pspilt[i].equals(hverb[j]))
		{
			System.out.println(pspilt[i]);
			
		}
	}
}
}
}