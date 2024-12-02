package task;

public class CumulativeSum {

    public static void getAllSum(int... nums){
        int sum = 0;
        for(int num : nums){
            for(int i = 1; i <= num; i++){
                sum += i;

            }
        }

        System.out.println("The culminative sum is: " +sum);

    }

    public static void main(String[] args) {
        getAllSum(4, 5,10);
        
    }
}