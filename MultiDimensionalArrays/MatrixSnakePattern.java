package MultiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class MatrixSnakePattern {
    public static void main(String[] args) {
        int[][] arr = {{2, 6, 3, 15, 12},
                {4, 8, 0, 16, 2},
                {2, 6, 12, 7, 1}};
        System.out.println(snakePattern(arr));

    }

    static ArrayList<Integer> snakePattern(int arr[][]) { //gfg
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int m = arr.length, n = arr[0].length;
        for (int i = 0; i < m; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    ans.add(arr[i][j]);
                }
            } else {
                for (int j = n - 1; j >= 0; j--) {
                    ans.add(arr[i][j]);
                }
            }
        }
        return ans;

    }

    //leetcode 3248
    public int finalPositionOfSnake(int n, List<String> commands) {
        //int grid[][]=new int[n][n];
        int i = 0, j = 0;
        for (int k = 0; k < commands.size(); k++) {
            String cmd = commands.get(k);
            if (cmd.equals("UP")) {
                i--;
            } else if (cmd.equals("DOWN")) {
                i++;
            } else if (cmd.equals("LEFT")) {
                j--;
            } else if (cmd.equals("RIGHT")) {
                j++;
            }
        }
        int pos = (i * n) + j;
        return pos;
    }
}
