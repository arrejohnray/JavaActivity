import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Input word: ");
        String word = scan.nextLine();

        String reverse = "";

        for(int i = 0; i < word.length(); i++)
            reverse = word.charAt(i) + reverse;
        

        System.out.println(reverse.equalsIgnoreCase(word) ? "Palindrome" : "Not Palindrome");    

    }
}
