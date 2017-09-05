package Chapter01;

/**
 * Write an algorithm such that if an element in an MxN matrix is 0,
 * its entire row and column are set to 0.
 */

public class Q7 {

    public static void main(String[] args) {

        int[][] arr = {{0,2,3,4,5},
                       {1,2,3,4,5},
                       {5,4,3,0,1},
                       {5,4,3,2,1},
                       {6,7,8,9,0}};

        setZero(arr);

        for (int i=0;i<arr.length;i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void setZero(int[][] arr) {
        boolean[] rows = new boolean[arr.length];
        boolean[] columns = new boolean[arr[0].length];

        for (int i=0;i<arr.length;i++) {
            for (int j=0;j<arr[0].length;j++) {
                if (arr[i][j] == 0) {
                    rows[i] = columns[j] = true;
                }
            }
        }

        for (int i=0;i<arr.length;i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (rows[i] || columns[j]) {
                    arr[i][j] = 0;
                }
            }
        }
    }
}
