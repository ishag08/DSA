package MultiDimensionalArrays;

public class SearchRowColSortedMatrix {
    public static void main(String[] args) {

    }
    public static boolean matSearch(int arr[][], int x) {
        //gfg - easy, also accepted in leetcode 74 search in 2D matrix
        //TC: O(n+m), time 2.05
        int m = arr.length, n = arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == x) return true;
            }
        }
        return false; //time: 2.05
    }


}
