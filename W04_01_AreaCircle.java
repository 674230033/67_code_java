import java.util.Scanner; //นำเข้าคลาส Scanner จาก package java.unil
public class W04_01_AreaCircle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // สร้างอ็อบเจ็กต์ของคลาส Scanner
        System.out.print("ป้อนค่ารัศมีวงกลม: "); // เเสดงข้อความที่ให้ผู้ใช้ป้อนค่ารัศมี
        double radius = sc.nextDouble(); // รับค่ารัศมีจากผู้ใช้เเละเก็บค่าตัวเเปรใน radius
        // double radius; // ประกาศตัวเเปรเก็บค่ารัศมี
        // radius = 34;   // กำหนดรัศมีเป็น 10

        double area;   // ประกาศตัวเเปรเก็บค่าพื้นที่
        double PI=3.14159; // ประกาศค่าคงที่ PI

        area=PI*radius*radius; // คำนวนพื้ที่ของวงกลม
        System.out.println("พื้นที่วงกลมมีรัศมีเท่ากับ "+radius+" คือ "+area);
    }
}