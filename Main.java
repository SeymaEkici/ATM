import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String username, password;
        int right = 3;
        int select;
        int balance = 3000;

        while ( right > 0 ){
            System.out.println("Enter the user name: ");
            username = input.next();
            System.out.println("Enter the password: ");
            password = input.next();

            if (username.equals("patika") && password.equals("sheima")){

                System.out.println("Welcome to the Patika Bank!");

                do {
                    System.out.println("1-Deposit\n" + "2-Withdraw money\n" + "3-Balance inquiry\n" + "4-Exit");
                    System.out.println("Please enter a number which you want to do: ");
                    select = input.nextInt();

                    switch (select){
                        case 1:
                            System.out.println("Enter the amount of money: ");
                            int price = input.nextInt();
                            balance += price;
                            break;

                        case 2:
                            System.out.println("Enter the amount of money: ");
                            price = input.nextInt();
                            balance -= price;
                            break;

                        case 3:
                            System.out.println("The balance is: " + balance);
                            break;
                    }

                }while (select != 4);
                System.out.println("Come again!");
                break;

            }else {
                right--;
                System.out.println("Incorrect credentials. Please try again!");

                if (right == 0){
                    System.out.println("This account be blocked! Please have a contact with the bank.");
                }else {
                    System.out.println("Remaining right: " + right);
                }
            }
        }
    }
}
