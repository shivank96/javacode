import java.util.*;
public class RegexExamples 
{

public static void main(String[] args)
 {
		String str;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any string ");
		str = s.nextLine();
		//Removing all kind of symbols from the user given string 
//		str=str.replaceAll("[^a-z0-9A-Z]","");//pattern for removing symbols from a given string
//		System.out.println(str);
		//Removing spaces between string
//		str=str.replaceAll("\\s", "");//pattern for removing whitespaces from a given string
//		System.out.println(str);
		//Removing extra spaces between words from a string
//		str=str.replaceAll("\\s+"," ").trim();
//		System.out.println(str);
		//Finding number of words in a given string
		str=str.replaceAll("\\s+"," ").trim();
		String str1[]=str.split("\\s+");
		int length=str1.length;
		System.out.println(length);
		

	}

}
