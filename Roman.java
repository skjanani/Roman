package janani;
import java.util.Scanner;
public class Roman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str;
int i,l;
System.out.println("enter the Roman");
Scanner ja=new Scanner(System.in);
str=ja.next();
String s[]={"I","II","III","IV","V","VI","VII","VIII","IX","X","XI","XII","XIII","XIV","XV","XVI","XVII","XVIII","XIX","XX"};
l=s.length;
for(i=0;i<l;i++){
	if(str.equals(s[i])){
		System.out.println(i+1);
	}
}
	}

}
