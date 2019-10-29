import java.util.Scanner;
public class snt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();
        if (number<2)
            System.out.println(number+ " is not a prime");
        else {
            int i =2;
            boolean check = true;
            for ( ; i < number;i++){
                if (number % i ==0){
                    check = false;
                   break;
                }
            }
            if (check == true)
                System.out.println(number + " is a prime");
            else
                System.out.println(number + " is not a prime");
            }
        }
    }

