package W13;

import java.util.Scanner;

public class W13_02_introArray {
    public static void main(String[] args) {
        //ประกาศตัวเเปรชนิด Array เเบบที่ 2 - ไม่รู้จำนวนข้อมูลล่วงหน้า
        String [] brandCars = new String[10];

        Scanner kb = new Scanner(System.in);
        // กำหนดค่าให้กับ Array
        brandCars[0] = "Nissan";
        brandCars[1] = "Mclaren";
        brandCars[2] = "Bugatti";
        
        //เเสดงผลลัพท์โดยใช้ loop
        System.out.println("==============================");
        System.out.println("Old Brand of cars in the array are: ");

        for (int n = 0 ; n < brandCars.length ; n++) {
            System.out.print(brandCars[n] + " / ");
        
        }

        System.out.println("\n\nPlease enter the brand of cars in the 3rd car:");
        for (int n = 0; n < brandCars.length; n++) {
            System.out.println("Enter brand " + (n+1) + ": ");
            brandCars[n] = kb.next();
        }

        brandCars[5] = "Mazda";
        System.out.println("\nBrand of cars in the array are:");
        for (String car : brandCars){
            System.out.print(car + " / ");
       
        }


        brandCars[9] = "BMW";
        System.out.println("\nBrand of cars in the array are:");
        for (String car : brandCars){
            System.out.print(car + " / ");

        }
        
    }

}
