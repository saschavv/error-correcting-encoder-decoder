package correcter;

public class Encoder {
    public char[] encode(char[] input, int distortion) {
        char[] out = new char[input.length * distortion];

        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < 3; j++) {
                out[i * distortion + j] = input[i];
            }
        }

        return out;
    }
}
