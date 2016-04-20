package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.TreeMap;
import java.util.TreeSet;

public class Lab3Question6 {

	public static void main(String[] args){
		
		Path path = Paths.get("//Users/Nano/Desktop/CS203/Main/src/Practice/Text.txt");
		Charset charset = Charset.forName("UTF-8");
		
	//	int count = 0;
        int vowels = 0;
       // int consonants = 0;
        
		try(BufferedReader reader = Files.newBufferedReader(path, charset)){		

//			BufferedReader reader = Files.newBufferedReader(path, charset);

			 String words = null;

			 
			 while ((words = reader.readLine()) != null){
				 
			     for(String retval: words.split(" "))
			             for (int i = 0; i < retval.length(); i++){
			                char ch = retval.charAt(i);
			                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
			                        vowels++;
			                        System.out.println("The number is: " + i + " The Character is: " + ch);
			                }
//			                else{ 
//			                        consonants++;
//			                }
			        }
				}   

			 
		}catch(IOException e){
			
			System.out.println("No file found");
		}
		System.out.println("The vowels are: " +  vowels);
//	    System.out.println("The consonants are: " + consonants);
//	    count = vowels + consonants;
//	    System.out.println("The Totle is: " + count);
	}

}
