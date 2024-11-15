package programmingchallenge;

public class Calendar {
    public static void main(String[] args) {
        int month = 2;

        switch (month) {
            case 1:

                System.out.println("<===== January =====>");
                for(int i = 1; i <= 31; i++){
                    if(i % 7 == 0)
                      System.out.print(i+" "+"\n");
                    else
                      System.out.print(i+" ");
                      
                  }
                break;
            case 2:

                System.out.println("<===== February =====>");
                for(int i = 1; i <= 28; i++){
                    if(i % 7 == 0)
                    System.out.print(i+" "+"\n");
                    else
                    System.out.print(i+" ");
                    
                }
                break;
            case 3:

                System.out.println("<===== March =====>");
                for(int i = 1; i <= 31; i++){
                    if(i % 7 == 0)
                    System.out.print(i+" "+"\n");
                    else
                    System.out.print(i+" ");
                    
                }
                break;
            case 4:

                System.out.println("<===== April =====>");
                for(int i = 1; i <= 30; i++){
                    if(i % 7 == 0)
                    System.out.print(i+" "+"\n");
                    else
                    System.out.print(i+" ");
                    
                }
                break;
            case 5:

                System.out.println("<===== May =====>");
                for(int i = 1; i <= 31; i++){
                    if(i % 7 == 0)
                    System.out.print(i+" "+"\n");
                    else
                    System.out.print(i+" ");
                    
                }
                break;
            case 6:
                System.out.println("<===== June =====>");
                for(int i = 1; i <= 30; i++){
                    if(i % 7 == 0)
                    System.out.print(i+" "+"\n");
                    else
                    System.out.print(i+" ");
                    
                }
                break;
            case 7:

                System.out.println("<===== July =====>");
                for(int i = 1; i <= 31; i++){
                    if(i % 7 == 0)
                    System.out.print(i+" "+"\n");
                    else
                    System.out.print(i+" ");
                    
                }
                break;
            case 8:

                System.out.println("<===== August =====>");
                for(int i = 1; i <= 31; i++){
                    if(i % 7 == 0)
                    System.out.print(i+" "+"\n");
                    else
                    System.out.print(i+" ");
                    
                }
                break;
            case 9:

                System.out.println("<===== September =====>");
                for(int i = 1; i <= 30; i++){
                    if(i % 7 == 0)
                    System.out.print(i+" "+"\n");
                    else
                    System.out.print(i+" ");
                    
                }
                break;
            case 10:

                System.out.println("<===== October =====>");
                for(int i = 1; i <= 31; i++){
                    if(i % 7 == 0)
                    System.out.print(i+" "+"\n");
                    else
                    System.out.print(i+" ");
                    
                }
                break;
            case 11:

                System.out.println("<===== November =====>");
                for(int i = 1; i <= 30; i++){
                    if(i % 7 == 0)
                    System.out.print(i+" "+"\n");
                    else
                    System.out.print(i+" ");
                    
                }
                break;
            case 12:

                System.out.println("<===== December =====>");
                for(int i = 1; i <= 31; i++){
                    if(i % 7 == 0)
                    System.out.print(i+" "+"\n");
                    else
                    System.out.print(i+" ");
                    
                }
                break;
            default:
                System.out.println("invalid input");
                break;
        }



        System.out.println("\n<===== End of Program =====>");

    }
    
}
