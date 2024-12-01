package programmingchallenge;

public class CountWords {

    public static int countWords(String s){
        int count = 0;
        boolean isWord = false;

        for(int i = 0; i < s.length(); i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                if(!isWord){
                    isWord = true;
                    count++;
                }
            }else{
                isWord = false;
            }

        }

        return count;
    }

    public static void main(String[] args) {
        String sentence = "Hello World";
        System.out.println("Number of words: " + countWords(sentence));
    }
}