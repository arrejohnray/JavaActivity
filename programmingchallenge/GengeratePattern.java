package programmingchallenge;

public class GengeratePattern {
    
    
    public static void main(String[] args) {
        int height = 5;
        
        for(int row = 1; row <= height; row++){
            for(int s = 1; s <= height - row; s++) System.out.print(" ");
            for(int col = 1; col <= (2 * row - 1); col++) System.out.print("*");
            System.out.println();

        }
    }
}
