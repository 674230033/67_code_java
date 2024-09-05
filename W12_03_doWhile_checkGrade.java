
package W12;

import java.util.Scanner;

public class W12_03_doWhile_checkGrade {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int Score;      // ประกาศตัวแปรเพื่อเก็บค่าที่ผู้ใช้ป้อน
        Score = kb.nextInt(); // รับค่าจากคีย์บอร์ดเก็บไว้ในตัวเเปร score


       // ให้ผู้ใช้ป้อนข้อมูลซ้ำจนกว่าจะถูกต้อง
        do {

            System.out.println("Enter your score between 1 and 100 :");
            Score = kb.nextInt(); // รับค่าจากคีย์บอร์ดเก็บไว้ในตัวเเปร score

        } while (Score <= 1 && Score > 100);   // ถ้าผู้ใช้ป้อนไม่ถูกต้องให้ป้อนใหม่
        
        // แสดงข้อมูลที่ผู้ใช้ป้อน เช่น ou entered: 75

        // ตรวจสอบเกรด
        
        if (Score <= 0) {

            System.out.println(" Please enter a value between 0 and 100");
            
        }else if (Score >= 101){

            System.out.println("Please enter a value between 0 and 100");

        }else if (Score >= 80){

            System.out.println("Grade A");

        }else if (Score >= 70) {
            
            System.out.println("Grade B");

        }else if (Score >= 60) {

            System.out.println("Grade C");

        }else if (Score >= 50){

            System.out.println("Grade D");

        }else{

            System.out.println("Grede E");
        }

        kb.close(); // ปิด Scanner object
    }
}
