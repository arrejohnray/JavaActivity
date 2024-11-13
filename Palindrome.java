public class Palindrome {
    public static void main(String[] args) {
        String word = "Ana ANA";

        String reverse = "";

        for(int i = 0; i < word.length(); i++)
            reverse = word.charAt(i) + reverse;
        


        if (reverse.equalsIgnoreCase(word)) 
            System.out.println("Palindrome");
        else 
            System.out.println("Not palindrome");
    }
}
