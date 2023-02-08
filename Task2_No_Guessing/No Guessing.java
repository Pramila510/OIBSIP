import java.util.Random;
import java.util.Scanner;

public class Noguessing {
    static int guess;
    static int number;
    static int point=0;
    public static void numberGuessingGame(){
        Scanner s=new Scanner(System.in);
        number=1+(int)(100*Math.random());
        int k=5;
        int i;
        System.out.println("Number gussing game rules:\n 1-The number is choosen between 1 TO 100\n 2-Total number of attempts is five/5");
        for(i=0;i<k;i++){
            System.out.println("Enter the guess number: ");
            guess=s.nextInt();
            if(number ==guess){
                System.out.println("CONGRATULATIONS!"+"You Guessed the number is");
                rounds();
                break;
            }
            else if(number>guess&&i!=k-1){
                System.out.println("The number is "+"Greater than "+guess);
            }
            else if(number<guess&&i!=k-1){
                System.out.println("The number is "+"Less than "+guess);
            }
        }
        if(i==k){
            System.out.println("YOU HAVE EXHAUSTED YOUR LIMIT: ");
            System.out.println("The number was "+number);
            rounds();
        }
    }
    public static void rounds(){
        System.out.println("DO YOU WANT TO PLAY ONE MORE ROUND \n ENTER 1-YES\n ENTER 2-NO");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        if(a==1){
            numberGuessingGame();

        }
        else{
            System.out.println("PLAY NEXT TIME THANKS FOR PLAYING!");
            if(number==guess){
                point++;
                System.out.println("TOTAL ATTEMPT NUMBER "+point+"+ POINT IS: "+point);
            }
            else{
                System.out.println("Your point is: "+point);
            }
            System.out.println("Total score is: "+point*2);
        }
    }
        public static void main(String args[]){
            System.out.println("NAME:NUMBER GUESSING GAME");
            numberGuessingGame();
        
    }
    
}
