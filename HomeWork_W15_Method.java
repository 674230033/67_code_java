import java.util.Scanner;

public class HomeWork_W15_Method {
    static int calculate(int factorial) {
        int num = 1;
        System.out.print("Factorial for " + factorial + " is ");

        for (int i = 1; i <= factorial; i++) {
            System.out.print(i);
            if (i < factorial) {
                System.out.print(" x ");
            } else {
                System.out.print(" = ");
            }
            num = num * i;
        }
        factorial = num;
        return factorial;
    }

    public static void main(String[] args) {
        Scanner mj = new Scanner(System.in);
        System.out.print("Enter Numbar ");
        int factorial = mj.nextInt();
        System.out.println(calculate(factorial));
    }
}