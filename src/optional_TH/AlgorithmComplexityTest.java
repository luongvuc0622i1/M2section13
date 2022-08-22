package optional_TH;

import java.util.Scanner;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi:");
        String inputString = input.nextLine();

        int[] frequentChar = new int[255];                   //{1}
        for (int i = 0 ; i < inputString.length() ; i++ ) {  //{2}
            int ascii = (int)inputString.charAt(i);          //{3}
            frequentChar[ascii] += 1;                        //{4}
        }

        int max = 0;                                         //{5}
        char character = (char) 255;                         //{6}
        for (int j = 0 ; j < 255 ; j++) {                    //{7}
            if (frequentChar[j] > max) {                     //{8}
                max = frequentChar[j];                       //{9}
                character = (char) j;                       //{10}
            }
        }
        System.out.println("Ký tự xuất hiện nhiều nhất là: " + character + " ,và xuất hiện " + max + " lần.");

        for (int i = 0; i < frequentChar.length ; i++) {
            System.out.println(frequentChar[i]);
        }
    }
}
