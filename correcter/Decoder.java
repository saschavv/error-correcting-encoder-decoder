package correcter;

public class Decoder {
    public char[] decode(char[] input, int distortion) {
        char[] output = new char[input.length / distortion];

        for (int i = 0; i < (input.length - distortion + 1); i += distortion) {
            for (int j = 0; j < distortion; j++) {
                for (int k = (distortion - 1); k > j; k--) {
                    if (input[i + j] == input[i + k]) {
                        output[i / distortion] = input[i + j];
                        break;
                    }
                }
            }
        }

        return output;
    }
}
