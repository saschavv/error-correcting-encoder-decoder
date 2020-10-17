package correcter;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String rndSet = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz ";
        char[] input = sc.nextLine().toCharArray();
        Random rnd = new Random();

        for (int i = 0; i < input.length; i += 3) {
            int index = rnd.nextInt(3);
            int pickedChar = rnd.nextInt(rndSet.length());
            if (i + index < input.length) {
                while (pickedChar == input[i + index]) {
                    pickedChar = rnd.nextInt(rndSet.length());
                }
                input[i + index] = rndSet.charAt(pickedChar);
            }
        }

        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i]);
        }
        System.out.println();
    }
}
