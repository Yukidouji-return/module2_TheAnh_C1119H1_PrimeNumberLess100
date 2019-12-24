import java.util.Scanner;

public class PrimeNumberless100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("please enter the number:");
        int number = sc.nextInt();
        System.out.println(" prime numbers less than " + number + " :");

        for (int i = 2; i < number; i++) {
            int count = 0;
            for (int j = 1; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(i + " ");
            }
        }


    }
}