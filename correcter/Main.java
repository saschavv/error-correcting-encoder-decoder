package correcter;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int distortion = 3;
        Encoder encdr = new Encoder();
        Distorter dstrtr = new Distorter();
        Decoder dcdr = new Decoder();
        char[] input = sc.nextLine().toCharArray();

        print(input);

        input = encdr.encode(input, distortion);
        print(input);

        input = dstrtr.distort(input, distortion);
        print(input);

        input = dcdr.decode(input, distortion);
        print(input);
    }

    private static void print(char[] input) {
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i]);
        }
        System.out.println();
    }
}
