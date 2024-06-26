//numberGuess
    import java.util.Random;
    import java.util.Scanner;

    public class guss {
    
        public static void main(String[] args) {
            Scanner sc =  new Scanner(System.in);
            Random random = new Random();
            int toguess;
            int guess;
            toguess = random.nextInt(10);

            while (true) {
                System.out.println("Enter a Guess Number" );
                guess =  sc.nextInt();
                
                if (guess > toguess) {
                    System.out.println("________________Your guess is too High______________");
                } else if (guess<toguess) {
                    System.out.println("________________Your guess is too Low___________________ ");
                } else if (guess == toguess) {
                    System.out.println("------- < You got it bro, Guess Right Number > ---------");
                   return;
                }
            }
        
        }
    }  


