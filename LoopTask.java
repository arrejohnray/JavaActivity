public class LoopTask {
    public static void main(String[] args) {
        int check_number = 10;
        int i = 1;
        String message;
        while (i <= check_number) {
            message = (i%2 == 0) ? i + " is even number" : i + " is odd number";
            System.out.println(message);

            i++;
           
        }
    }
}
