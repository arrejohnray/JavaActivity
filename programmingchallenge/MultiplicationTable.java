package programmingchallenge;

public class MultiplicationTable {
    public static void main(String[] args) {
        int range = 10;

        for(int i = 1; i <= range; i++){

            for(int j = 1; j <= range; j++){
                System.err.print("\t| " + j + " x " +i + " = " + (j * i));
            }

            System.out.println();
        }
    }
}
