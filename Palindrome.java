import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Input word: ");
        String word = scan.nextLine();

        String palindrome = "";

        for(int i = 0; i < word.length(); i++)
            palindrome = word.charAt(i) + palindrome;
        

        System.out.println(palindrome);

        System.out.println(palindrome.equalsIgnoreCase(word) ? "Palindrome" : "Not Palindrome");    

    }
}
