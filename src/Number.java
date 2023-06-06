
import java.util.*;
public class Number {
    public static void main(String []args)
    {
        System.out.println("\n------GUESS THE NUMBER------\n");
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        int n=random.nextInt(1,5);
        while(true)
        {
            int a;
            System.out.println("1.Start the game :");
            System.out.println("2.Quit\n");
            System.out.println("Enter your choice : ");
            int choice=sc.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.println("Enter the number :");
                    a=sc.nextInt();
                    if(a==n)
                    {
                        System.out.println("\nHurrey! Congrats you guessed the number"+a+ "right\n");
                    }
                    else if(a!=n)
                        System.out.println("\nSorry the number is incorrect!");
                    break;
                case 2:
                default:
                    return;
            }
        }
    }
}

