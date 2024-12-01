package programmingchallenge;

public class SumAllNum {
    
    public static void main(String[] args) {
        SumNumbers nums = (int... a) -> {
            int sum = 0;
            for(int b : a) sum +=b;
            return sum;
        };

        System.out.println("Sum of all numbers: "+ nums.getSum(1,2,3,4,5,6,7,8,9,10));
    }


    interface SumNumbers{
        public int getSum(int... a);
    }
}
