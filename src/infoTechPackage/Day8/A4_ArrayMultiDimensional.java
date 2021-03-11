package infoTechPackage.Day8;

import java.util.Arrays;

public class A4_ArrayMultiDimensional {

    public static void main(String[] args) {

        int arr[] = new int[3];
        arr[0] = 2;
        arr[1] = 2;
        arr[2] = 2;
        int arr1[] = {2, 4, 6, 8};
        System.out.println(Arrays.toString(arr1));

        int arrD[][] = {{1, 3, 5, 7}, {2, 4, 6, 8}};
        System.out.println(Arrays.deepToString(arrD));
        System.out.println(arrD[1][2]);
        System.out.println(Arrays.toString(arrD[1]));
        arrD[0][2] = 100;
        System.out.println(Arrays.toString(arrD[0]));

        int arrDd[][] = new int[2][3];
        arrDd[0][0] = 21;
        arrDd[0][1] = 25;
        arrDd[0][2] = 46;
        arrDd[1][0] = 71;
        arrDd[1][1] = 29;
        arrDd[1][2] = 3;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arrD[i][j] + " ");
            }
            System.out.println();
        }
    }

    // [0][0] [0][1] [0][2]
    // [1][0] [1][1] [1][2]

}

