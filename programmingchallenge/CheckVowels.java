package programmingchallenge;

import java.util.*;

public class CheckVowels {
    public static void checkVowels(String s){
        List<Character> listVowels = new ArrayList<>();
        List<Character> listConsonant = new ArrayList<>();
        char[] vowels = {'a','e','i','o','u'};

        CheckChar checkChar = c -> {
            boolean isVowel = false;

            for(int i = 0; i < vowels.length; i++){
                if(c == vowels[i]){
                    isVowel = true;
                    break;
                }
            }
            return isVowel;
        };

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
                if(checkChar.isVowel(s.charAt(i))) listVowels.add(s.charAt(i));
                else listConsonant.add(s.charAt(i));
                
            }
        }

        
        System.out.println("Number of vowels: " + listVowels.size());
        System.out.println("List of vowels " + listVowels);
        System.out.println("Number of consonant: " + listConsonant.size());
        System.out.println("List of consonant " + listConsonant);
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";

        System.out.println("<===== " + s + " =====>");
        checkVowels(s.toLowerCase());             
    }

    interface CheckChar{
        public boolean isVowel(char a);
    }
    
}
