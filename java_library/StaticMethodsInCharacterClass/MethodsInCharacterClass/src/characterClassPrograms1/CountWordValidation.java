package characterClassPrograms1;
import java.util.Scanner;
public class CountWordValidation 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the word to Count : ");
		System.out.println("--------------------------------------------------------------");
		String wordValidator = "scan next1234 uw89$% %$%";
		System.out.println("--------------------------------------------------------------");
		String word1 = wordValidator;
		char[] ch = word1.toCharArray();
		int alphabets = 0;
		int numbers = 0;
		int spaces = 0;
		int specialCharacters = 0;
		int others = 0;
		for(int i = 0; i < word1.length(); i++)
		{
			if(Character.isLetter(ch[i]))
			{
				alphabets++ ;
			}
			else if(Character.isDigit(ch[i]))
			{
				numbers++ ;
			}
			else if(Character.isSpaceChar(ch[i]))
			{
				spaces++ ;
			}
			else if((word1.contains("@") || word1.contains("#")
			           || word1.contains("!") || word1.contains("~")
			           || word1.contains("$") || word1.contains("%")
			           || word1.contains("^") || word1.contains("&")
			           || word1.contains("*") || word1.contains("(")
		               || word1.contains(")") || word1.contains("-")
			           || word1.contains("+") || word1.contains("/")
			           || word1.contains(":") || word1.contains(".")
			           || word1.contains(", ") || word1.contains("<")
			           || word1.contains(">") || word1.contains("?")
			           || word1.contains("|")))
			{
				specialCharacters++;
			}
			else
			{
				others++;
			}
		}
		System.out.println("Alphabets : "+alphabets);
		System.out.println("Spaces : "+spaces);
		System.out.println("Numbers : "+numbers);
		System.out.println("SpecialCharacters : "+specialCharacters);
		System.out.println("Others : "+others);
		System.out.println("**************************************************************");
	}
}
