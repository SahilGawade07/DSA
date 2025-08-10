package Practice;

public class squareRootDecomposition {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 8 };
        int n = arr.length;
        int blockSize = (int) Math.ceil(Math.sqrt(n));
        int numBlocks = (int) Math.ceil((double) n / blockSize);

        int[] b = new int[numBlocks];
        int bIndex = 0;

        // precomputation
        for (int i = 0; i < n; i++) {
            if (i % blockSize == 0 && i != 0) {
                bIndex++;
            }
            b[bIndex] += arr[i];
        }
        System.out.println(query(arr, b, 1, 5, blockSize));

    }

    public static int query(int arr[], int b[], int l, int r, int blockSize) {
        int sum = 0;
        while (l <= r && l % blockSize != 0) {
            sum += arr[l];
            l++;
        }
        while (l + blockSize - 1 <= r) {
            sum += b[l / blockSize];
            l += blockSize;
        }
        while (l <= r) {
            sum += arr[l];
            l++;
        }
        return sum;
    }

}
