package W15;
public class W15_04_method_findMaxMin {
    
    // 1) Method สำหรับหาค่ามากที่สุด
    static int findMax(int a, int b){
       // if (a > b) {
       //     return a;
       // }else{
       //     return b;
       // }
       return (a > b) ? a : b;
       }
       
    // 2) Method สำหรับหาค่าน้อยที่สุด
    static int findMin(int a, int b){
    //    if (a < b) {
    //        return a;
    //    }else{
    //        return b;
    //   }
    return (a < b) ? a : b;
    }

    // 3) Method สำหรับหาค่ามากที่สุด โดยรับค่า 3 ตัว
static int findMax(int a, int b, int c){
    int Max = a;
    if (b > Max){
        Max = b;
    }if (c > Max){
        Max = c;
    }
    return Max;
}

    // 4) Method สำหรับหาค่าน้อยที่สุด โดยรับค่าเป็น array
    static int findMin(int[] number) {
    int Min = number[0];
    for (int i = 0; i < number.length; i++) {
        if (number[i] < Min){
            Min = number[i];
        }
    }
    displayArray(number);
    return Min;
    }

    // 5) Method สำหรับแสดงค่าใน array ทั้งหมด
    static void displayArray(int [] number){
        for (int i = 0; i < number.length; i++){
            System.out.print(number[i] + " ");
        }
        System.out.println();

    }
    


    public static void main(String[] args) {
        // 1) Method สำหรับหาค่ามากที่สุด

        System.out.println("ค่ามากที่สุดของ [10, 20] = " + findMax(10,20));

        // 2) Method สำหรับหาค่าน้อยที่สุด

        System.out.println("ค่าน้อยที่สุดของ [10, 20] = " + findMin(10,20));

        // 3) Method สำหรับหาค่ามากที่สุด โดยรับค่า 3 ตัว

        System.out.println("ค่ามากที่สุดของ [10, 20, 15] = " + findMax(10,20,15));
        
        // 4) Method สำหรับหาค่าน้อยที่สุด โดยรับค่าเป็น array
       int[] number = {10, 20, 30, 40, 50};
        // displayArray(number);
       System.out.println("Min Number in Array is " + findMin(number));

        // 5) Method สำหรับแสดงค่าใน array ทั้งหมด


    }
}

// method ที่มีชื่อเดียวกัน แต่มีพารามิเตอร์ต่างกันได้ เรียกว่า Method Overloading
// การเรียกใช้ method ที่มีชื่อเดียวกัน จะขึ้นอยู่กับพารามิเตอร์ที่ส่งเข้าไป
// ถ้ามี method ที่มีชื่อเดียวกัน และมีพารามิเตอร์ต่างกัน จะต้องมีการส่งพารามิเตอร์ตามที่ method ต้องการ
