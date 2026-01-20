import java.util.Scanner;

public class MinMaxArray { 
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n=sc.nextInt();
         int[] arr=new int[n];

         for(int i=0;1<n;i++){
            System.out.println("Enter element"+(i+1)+":");
            arr[i]=sc.nextInt();
         }
         int min=arr[0];
         int max=arr[0];

         for(int i=1;i<n;i++){
            if(arr[i]<min)min=arr[i];
            if(arr[i]>max)max=arr[i];
         }
         System.out.println("Smallest="+min);
         System.out.println("Largest="+max);

    }
    
}
