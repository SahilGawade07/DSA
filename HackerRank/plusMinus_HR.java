import java.io.*;
import java.util.List;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr, int n) {
        int pc = 0, nc = 0, zc = 0;

        for (int i : arr) {
            if (i < 0) {
                nc++;
            } else if (i > 0) {
                pc++;
            } else {
                zc++;
            }
        }

        // Print outside the loop (only once)
        System.out.printf("%.6f\n", (double) pc / n);
        System.out.printf("%.6f\n", (double) nc / n);
        System.out.printf("%.6f\n", (double) zc / n);
    }
}

public class plusMinus_HR {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.plusMinus(arr, n);

        bufferedReader.close();
    }
}
