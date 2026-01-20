import java.util.Scanner;
import java.util.Random;

public class GuessNum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        int number=rand.nextInt(100)+1;
        int guess,count=0;
        
        do{
            System.out.println("Guess the number:");
            guess=sc.nextInt();
            count++;

            if(guess>number){
                System.out.println("Too high");
            }
            else if(guess<number){
                System.out.println("Too Low");
            }
            else{
                System.out.println("Correct Attempt:");
            }
        }while(guess!=number);
    }
}
