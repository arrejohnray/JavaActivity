package programmingchallenge;

public class SumAverage {

    public static void getSumAve(double[] nums){
        double sum = 0;
        double ave = 0;
        for(double num : nums) {
            System.out.print(num + " ");
            sum += num;
        }
        
        ave = sum / nums.length;
        System.out.println("\nSum of all number is: " + sum);
        System.out.println("Average of all number is: " + ave);
    }
    public static void main(String[] args) {
        double[] numbers = {10,13,15,65,33};

        getSumAve(numbers);
        
    }
    
}
