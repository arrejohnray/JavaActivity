package programmingchallenge;

public class StringMethod {
    public static void stringMethod(String s){
        int length = s.length();
        String lower = s.toLowerCase();
        String upper = s.toUpperCase();
        char first = s.charAt(0);
        char last = s.charAt(length - 1);
        String subs = s.substring(2,5);


        System.out.println("The length of " + s + " is " + length);
        System.out.println("lowercase of " + s + " is " + lower);
        System.out.println("UPPERCASE of " + s + " is " + upper);
        System.out.println("The first character of " + s + " is " + first);
        System.out.println("The last character of " + s + " is " + last);
        System.out.println("The substring of " + s + " is " + subs);

        
    }

    public static void main(String[] args) {
        stringMethod("Hello World");
    }

    
}
