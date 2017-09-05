package Chapter01;

/**
 * Given an image represented by an NxN matrix, where each pixel in
 * the image is 4 bytes, write a method to rotate the image by 90
 * degrees. Can you do this in place?
 */

public class Q6 {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3, 4, 5},
                    {11,22,33,44,55},
                    {5, 4, 3, 2, 1},
                    {55,44,33,22,11},
                    {6, 7, 8, 9, 0}};

        rotateArr(a);
        System.out.println();

        rotateInPlace(a);

        for (int i=0;i<a.length;i++) {
            for (int j=0;j<a.length;j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void rotateArr(int[][] a) {
        int n = a.length;
        int[][] rotA = new int[n][n];

        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                rotA[i][j] = a[n-1-j][i];
            }
        }

        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                System.out.print(rotA[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void rotateInPlace(int[][] a) {
        int n = a.length;
        for (int i=0;i<n/2;i++) {
            for (int j=i;j<n-1-i;j++) {
                int tmp = a[i][j];
                a[i][j] = a[n-1-j][i];
                a[n-1-j][i] = a[n-1-i][n-1-j];
                a[n-1-i][n-1-j] = a[j][n-1-i];
                a[j][n-1-i] = tmp;
            }
        }
    }
}
