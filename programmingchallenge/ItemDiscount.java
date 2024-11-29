package programmingchallenge;

public class ItemDiscount {

    public static void main(String[] args) {
        double price = 130.00;

        GetDiscount disc10 = num -> num - (num * .10);
        GetDiscount disc20 = num -> num - (num * .20);
        GetDiscount disc50 = num -> num - (num * .50);
        
        System.out.println("Price: " +price+ " 10% discount: "+ disc10.getDiscount(price));
        System.out.println("Price: " +price+ " 20% discount: "+ disc20.getDiscount(price));
        System.out.println("Price: " +price+ " 50% discount: "+ disc50.getDiscount(price));
    }
    
     interface GetDiscount {
        public double getDiscount(double a);
    
    }
    
}

//create an program that will compute for discounted items, use interface and lambda expression for 10%, 20%, and 50%