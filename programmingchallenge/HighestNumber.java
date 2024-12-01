package programmingchallenge;

public class HighestNumber {
    public static void main(String[] args) {
        int numbers[] = {1,1,-1};
     
        int highest = 0;
    
        if(numbers[0] == numbers[1] && numbers[1] == numbers[2]){
            System.out.println("All numbers are equal");
        }else{
            for(int num : numbers){
                if(num > highest)
                  highest = num;
              }
          
        }
    
    
        System.out.println("The highest number is " + highest);
    
    }
    
}
