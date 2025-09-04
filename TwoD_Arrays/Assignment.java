package TwoD_Arrays;

import java.util.Scanner;

public class Assignment {


    public static void Matrix(int arr[][]) {

        Scanner sc = new Scanner(System.in);        // taking input from user
        int n = arr.length;
        int m  = arr[0].length;
        System.out.println("Enter the elements of the matrix");

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[i][j] = sc.nextInt();   // input lere hai matrix ka 
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
    public static void Count(int arr[][]) {
        int count = 0;
        int n = arr.length;
        int m = arr[0].length;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(arr[i][j] == 7) {
                    System.out.println(arr[i][j] + " ");
                    count++;
                }
            }
            System.out.println("the count = " + count);
        }
        
    }

    public static int Sum(int arr[][]) {
        int sum =  0;
        int rowindex= 1;
        for(int j = 0 ; j < arr[0].length ; j++){
            sum += arr[rowindex][j];
        }
        return sum;
    }

    public static void Transpose(int arr[][]) {
        int row = arr.length;
        int cols = arr[0].length; // main arr ki rows / cols

        // create transpose matrix
        int transpose[][] = new int[cols][row];

        // loop it 
        for(int i = 0; i < row ; i++){
            for(int j = 0; j < cols ; j++){
                transpose[j][i] = arr[i][j];
            }
        }
        // print transpose matrix
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }


    }
    public static void main(String[] args) {
        // int arr[][] = { {4,7,8}
        //                 ,{8,8,7} 
                    // };
        int arr[][] = {
            {1,4,9}
            ,{11,4,3}
            ,{2,2,3}
        };
        // Count(arr);
        // System.out.println(Sum(arr));
        // Transpose(arr);

        Matrix(arr);
        
    }
}
