package correcter;

import java.util.Arrays;
import java.util.Random;

public class Distorter {
    Random rnd = new Random();
    String rndSet = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz ";

    public char[] distort(char[] input, int distortion) {
        char[] output = Arrays.copyOf(input, input.length);

        for (int i = 0; i < input.length; i += distortion) {
            int distortedChar = rnd.nextInt(distortion);
            int pickedChar = rnd.nextInt(rndSet.length());
            if (i + distortedChar < input.length) {
                while (rndSet.charAt(pickedChar) == input[i + distortedChar]) {
                    pickedChar = rnd.nextInt(rndSet.length());
                }
                output[i + distortedChar] = rndSet.charAt(pickedChar);
            }
        }

        return output;
    }
}
