package programmingchallenge;

public class Palindrome2 {

    static String checkPalindrome(String w){
        String word = w.toLowerCase();
        StringBuilder palindrome = new StringBuilder();

        if(!word.isBlank()){
            //check remove char if not alpha numeric
            for(int i = 0; i <  word.length(); i++){
                if((word.charAt(i) >= 'a' && word.charAt(i) <= 'z') || (word.charAt(i) >= '0' && word.charAt(i) <= '9' )){
                    palindrome.append(word.charAt(i));
                }
        
            }

        }else{
            return "Please type a word";
        }

        return palindrome.reverse().toString() == palindrome.toString() ? "Palindrome" : "not Palindrome";
    }

    public static void main(String[] args) {

       System.out.println(checkPalindrome("A man, a plan, a canal: Panama")); 
        
    }
    
}
