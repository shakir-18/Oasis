import java.util.*;

public class Main {
    static void transaction(String s)
    {
        int[] balance=new int[5];
        balance[0]=100000;
        balance[1]=100000;
        balance[2]=100000;
        balance[3]=100000;
        balance[4]=100000;
        Scanner sc =new Scanner(System.in);
        while (true) {
            System.out.println("Enter the type of transaction : \n1.Deposit\n2.Withdraw");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the amount : ");
                    int amount1 = sc.nextInt();
                    if (Objects.equals(s, "Shakir")) {
                        balance[0] += amount1;
                        System.out.println("Deposit Successful! Total balance ="+balance[0]);
                    }
                    else if (Objects.equals(s, "Sameer")) {
                        balance[1] += amount1;
                        System.out.println("Deposit Successful! Total balance ="+balance[1]);
                    }
                    else if (Objects.equals(s, "Apsar")) {
                        balance[2] += amount1;
                        System.out.println("Deposit Successful! Total balance ="+balance[2]);
                    }
                    else if (Objects.equals(s, "Farhan")) {
                        balance[3] += amount1;
                        System.out.println("Deposit Successful! Total balance ="+balance[3]);
                    }
                    else if (Objects.equals(s, "Sravan")) {
                        balance[4] += amount1;
                        System.out.println("Deposit Successful! Total balance ="+balance[4]);
                    }
                    break;
                case 2:
                    System.out.println("Enter the amount : ");
                    int amount = sc.nextInt();
                    if (Objects.equals(s, "Shakir"))
                        if (amount <= balance[0]) {
                            balance[0] -= amount;
                            System.out.println("Withdraw Successful! Total balance ="+balance[0]);
                        }
                        else
                            System.out.println("Insufficient balance :");
                    else if (Objects.equals(s, "Sameer"))
                        if (amount <= balance[1]){
                            balance[1] -= amount;
                            System.out.println("Withdraw Successful! Total balance ="+balance[1]);
                        }
                        else
                            System.out.println("Insufficient balance :");
                    else if (Objects.equals(s, "Apsar"))
                        if (amount <= balance[2]) {
                            balance[2] -= amount;
                            System.out.println("Withdraw Successful! Total balance ="+balance[2]);
                        }
                        else
                            System.out.println("Insufficient balance :");
                    else if (Objects.equals(s, "Farhan"))
                        if (amount <= balance[3]) {
                            balance[3] -= amount;
                            System.out.println("Withdraw Successful! Total balance ="+balance[3]);
                        }
                        else
                            System.out.println("Insufficient balance :");
                    else if (Objects.equals(s, "Sravan"))
                        if (amount <= balance[4]) {
                            balance[4] -= amount;
                            System.out.println("Withdraw Successful! Total balance ="+balance[4]);
                        }
                            else
                            System.out.println("Insufficient balance :");
                    break;
                case 3:
                default:
                    System.out.println("Wrong transaction chosen !\n");
                    return;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<String ,Integer> h=new HashMap<>();
        h.put("Shakir",1810);
        h.put("Sameer",1706);
        h.put("Apsar",105);
        h.put("Farhan",2403);
        h.put("Sravan",505);
        System.out.println("-----Welcome to the ATM banking-----");
        while(true)
        {
            System.out.println("1.Login");
            System.out.println("2.Quit");
            System.out.print("Enter your choice : \n");
            int c=sc.nextInt();
            sc.nextLine();
            switch(c)
            {
                case 1:
                    System.out.println("---------Welcome to Login page---------\n");
                    System.out.println("Enter the login details correctly!\n");
                    System.out.println("---->Enter Username : ");
                    String name=sc.nextLine();
                    System.out.println("---->Enter the password :");
                    int password=sc.nextInt();
                    if(h.containsKey(name)) {
                        if (h.get(name) == password) {
                            System.out.println("\nYou are logged in!\n");
                            transaction(name);
                            System.out.println("Thank you ! Login again to make transactions!\n");
                        } else {
                            System.out.println("\n   Incorrect password ! Try again...");
                            break;
                        }
                    }
                    else
                    {
                        System.out.println("User doesn't exist !");
                        break;
                    }
                    break;

                case 2:
                default:
                    return;

            }
        }
    }
}