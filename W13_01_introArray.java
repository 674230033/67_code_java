package W13;

public class W13_01_introArray {
    public static void main(String[] args) {
        // ปรกาศตัวเเปรชนิด Array เเบบที่1 - รู้จำนวนข้อมูลล่วงหน้า

        String [] colors = {"Purple","Cyan","Blue","Green","Yellow","Orange","Red"};
        int [] banks = {20, 50, 100, 500, 1000};
        char [] alphabets = {'A','B','C','D','E'};

        System.out.println("The first color is " + colors[0]);

        System.out.println("The third alphabets is " + alphabets [2]);
        
        System.out.println("colors in the array are:");
        for (int n = 6; n > -1; n--) {
            System.out.print(colors[n] + " ");
        }

        System.out.println("Banks in the array are:");     
        for (int n = 0; n < banks.length ; n++) {
            System.out.print(banks[n] + " ");

        }
        }
    }
