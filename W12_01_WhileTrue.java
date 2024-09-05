package W12;

public class W12_01_WhileTrue {
    public static void main(String[] args) {

      int i = 1;      // กำหนดค่าเริ่มต้น
      while (true) { 
          System.out.print(i+" ");
          i++;        //เพิ่มค่า i ทีละ 1
          
          if (i >= 1001){
            break;
          }
      }                
                      // วนลูปไปเรื่อยๆ  ใช้ while (true) {
                      // update รอบ
                      // แสดงข้อความพร้อมกับค่า count
                      // ตรวจสอบเงื่อนไข ถ้ารอบมากกว่าหรือเท่ากับ 1000 ให้ออกจากลูป
                      // ออกจากลูป
        // if(i >= 100) break;

    }
}