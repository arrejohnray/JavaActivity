package task;
public class BasicArithemticOperator {

    public static double addNum(double num1, double num2){
        double sum = 0;
        sum = num1 + num2;
        return sum;
    }

    public static double subtractNum(double num1, double num2){
        double diff = 0;
        diff = num1 - num2;
        return diff;
    }

    public static double multiplyNum(double num1, double num2){
        double prod = 0;
        prod = num1 * num2;
        return prod;
    }


    public static double divideNum(double num1, double num2){
        double quot = 0;
        quot = num1 / num2;
        return quot;
    }




    
    public static void main(String[] args) {
        double num1 = 10; 
        double num2 = 12;

        System.out.println(num1+" + "+ num2+" = " + addNum(num1, num2));
        System.out.println(num1+" - "+ num2+" = " + subtractNum(num1, num2));
        System.out.println(num1+" * "+ num2+" = " + multiplyNum(num1, num2));
        System.out.println(num1+" / "+ num2+" = " + divideNum(num1, num2));



    }
}
