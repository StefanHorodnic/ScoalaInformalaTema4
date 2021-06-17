import java.util.Scanner;

public class Factorial {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        do {
            System.out.println("Alege un număr: ");
        }
        while (!scanner.hasNextInt());

        int n = scanner.nextInt();

        if (n >= 0) {
            int nFactorial = 1;

            for (int i = 2; i <= n; i++) {
                nFactorial = nFactorial * i;
            }

            System.out.println(n+"! = " + nFactorial);
        } else {
            System.out.println("Nu ai introdus un număr valid!");
        }
    }
}
