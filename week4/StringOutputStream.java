/*
 * Author : Yanilda	
 * Desc   : StringOutputStream demo
 * Created: 2.19.19 week 4
 */
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Scanner;


public class StringOutputStream {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		StringWriter  fullnameSW = new StringWriter();
		PrintWriter   fullnamePW = new PrintWriter(fullnameSW);
		
		
		System.out.println("Please enter \"firstname lastname\": ");
		String word1 = input.next();
		String word2 = input.next();
		
		fullnamePW.print(word2 +"  ,  "+word1);
		
		String fullname = fullnameSW.toString();
		
		System.out.println(fullname);		
	}

}
