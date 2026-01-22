import java.util.Scanner;

public class NumCheck {
    public static void main(String[] args)
    {
        Scanner sca=new Scanner(System.in);
        System.out.println("Enter a number :");
        int num=sca.nextInt();

        if(num>0){
            System.out.println("Positive number");
        }
        else if(num<0){
            System.out.println("Negative Number");
        }
        else{
            System.out.println("The number is Zero");
        }
        sca.close();
    }
}
