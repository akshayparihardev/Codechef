import java.util.*;
import java.lang.*;
import java.io.*;

class Title_Case
{
	public static String convertToTitleCase(String S){
	    String words[] = S.split(" ");
	    
	    StringBuilder str = new StringBuilder();
	    
	    for(int i = 0 ; i < words.length ; i++){
	        
	        if(isAcronym(words[i])){
	            str.append(words[i]);
	        }else{
	           str.append(toTitleCase(words[i])); 
	        }
	        
	        if(i < words.length - 1){
	            str.append(" ");
	        }
	    }
	    return str.toString();
	}
	
	public static boolean isAcronym(String word){
	    for (int i = 0 ; i < word.length() ; i++){
	        char c = word.charAt(i);
	        if(!Character.isUpperCase(c)){
	            return false;
	        }
	    }
	    return true;
	}
	
	public static String toTitleCase(String word){
        
        if(word.isEmpty()){
            return word;
        }
        
        char firstLetter = Character.toUpperCase(word.charAt(0));
        String restOfWord = word.substring(1).toLowerCase();
        
        return firstLetter + restOfWord;
	}
	
	
	
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		scanner.nextLine();
        
        while (T--> 0){
            String S = scanner.nextLine();
            
            System.out.println(convertToTitleCase(S));
        }
	}
}
