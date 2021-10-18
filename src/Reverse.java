import java.util.*;
class Reverse
{
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your Name:");
		String name=sc.next();
		
		for(int i=name.length(); i>0; i--){
			char ch=name.charAt(i-1);
		System.out.println(ch);
		}
	}
}