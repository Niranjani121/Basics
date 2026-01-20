import java.util.Scanner;

public class ContainJava{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string :");
        String str1=sc.nextLine();

        if(str1.contains("Java")){
            System.out.println("The string contains Java");
        }
        else {
            System.out.println("The string doesnt contain Java");
        }
    }
    
}
