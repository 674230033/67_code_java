package W15;
import java.util.Scanner;
public class W15_02_method_calculator {
    // ทั้งหมดเป็น method ที่มีการรับค่าและคืนค่า
    // 1) Method สำหรับบวกเลข
    static int add ( int a, int b){
        return a + b;
    }

    // 2) Method สำหรับลบเลข
    static int subtract ( int a, int b){
        return a - b;
    }

    // 3) Method สำหรับคูณเลข
    static int multiply ( int a, int b){
        return a * b;
    }

    // 4) Method สำหรับหารเลข
    static int devide ( int a, int b){
        return a / b;
    }   

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter the First Number ");
        int a = kb.nextInt();
        System.out.print("Enter the Second Number ");
        int b = kb.nextInt();
        // 1) Method สำหรับบวกเลข

        System.out.println("ผลบวกของเลข = " + add (a , b));

        // 2) Method สำหรับลบเลข

        System.out.println("ผลลบของเลข = " + subtract(a , b));

        // 3) Method สำหรับคูณเลข

        System.out.println("ผลคูณของเลข = " + multiply(a , b));

        // 4) Method สำหรับหารเลข

        System.out.println("ผลหารของเลข = " +  devide(a , b));

    }


}