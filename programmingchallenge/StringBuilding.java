package programmingchallenge;

public class StringBuilding {

    public static void printString(String s){
        StringBuilder sentence = new StringBuilder();
        if(s.length() >= 10){
            sentence.append(s);
            System.out.println("<===== " + sentence + " =====>");
            System.out.println("Length: " + sentence.length());
            System.out.println("First character: " + sentence.charAt(0));
            System.out.println("First occurrence of letter a: " + sentence.indexOf("a"));
            System.out.println("Substring: " + sentence.substring(3, 6));
            System.out.println("Append 123: " + sentence.append("123"));
            System.out.println("Insert xyz: " + sentence.insert(4, "xyz"));
            System.out.println("Delete index 2 to 4: " + sentence.delete(2, 4));
            System.out.println("Delete char at 8: " + sentence.deleteCharAt(8));
            System.out.println("Reverse: " + sentence.reverse());

        }else{
            System.out.println("Enter at least 10 character word or sentence");
        }

    }

    public static void main(String[] args) {
        printString("Hello World");
    }
    
}
