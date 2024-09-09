package W13;

public class W13_03_Array_CountOddEven {
    public static void main(String[] args) {
        int [] number = {2, 3, 5, 7, 9, 11, 4, 6, 8, 5, 13, 31, 47, 29, 53, 10, 12, 14, 16, 18, 20};
        
        int countOdd = 0;
        int countEven = 0;

        for (int i = 0; i < number.length ; i++) {
            System.out.print(number[i] + "  ");
            if (number[i] % 2 == 0) {

                countEven++;
                
            } else {
                  countOdd++;  
            }
        }
        System.out.println("\n Amount of all number : " + number.length);
        System.out.println(" Amount of Odd number : " + countOdd);
        System.out.println(" Amount of Even number : " + countEven);
    }
}
