package PracticeCuatro;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
 
public class Palindrome 
{
    public static void main(String[] args) throws FileNotFoundException 
    {
        Scanner scanner = new Scanner(new File("palindrome.csv"));
         
        scanner.useDelimiter(",");
         
        while (scanner.hasNext()) 
        {
            System.out.print(scanner.next() + "|");
        }
          
        scanner.close();
    }
}