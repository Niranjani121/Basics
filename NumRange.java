import java.util.Scanner;

public class NumRange{
      public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number(1-100) :");
        int num=sc.nextInt();
  
        if( num>=1 && num<=50 ){
            System.out.println("The number is in the lowers half");
        }
        else if( num>=51 && num<=100 ){
            System.out.println("The Number is in upper half");
        }
        else{
            System.out.println("Invalid Number");
        }
      }
}