package W10;

import java.util.Scanner;

public class W10_04_titlesStatus {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println(" ระบุเพศ (male/Female): ");
        String gender = kb.next();

        System.out.println(" ระบุอายุ: ");
        int age = kb.nextInt();

        System.out.println(" สถานะ (single/married): ");
        String Married = kb.next();

        if (gender.equalsIgnoreCase("male")) {

            System.out.println(" ผู้ชาย ");

            if (age < 15) {
                System.out.println(" ด.ช. ");
            } else {
                System.out.println(" นาย ");
            }
        } else {

            if (age < 15) {
                System.out.println(" ด.ญ.");
            } else if (Married.equalsIgnoreCase("Married")) {
                System.out.println(" นาง ");
            } else {
                System.out.println(" นางสาว ");
            }

        }

    }
}
