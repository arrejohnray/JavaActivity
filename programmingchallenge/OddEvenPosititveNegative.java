package programmingchallenge;

public class OddEvenPosititveNegative {
    static String oddEven(int num){

        return num % 2 == 0 ? "even" : "odd";
      }

    
  public static void main(String... $args) {


    int num = 21;

    System.out.println(num == 0 ? "The number is zero" : num > 0 ? num + " is a positive " + oddEven(num) +" number" : num + " is a negative " + oddEven(num) +" number");

  }
    
}
