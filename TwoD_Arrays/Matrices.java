// 1 2 3 4 5 6 7 8 9 - input
// 1 2 3 - output
// 4 5 6 
// 7 8 9 
package TwoD_Arrays;

import java.util.Scanner;

public class Matrices {
    public static boolean Search(int matices[][], int key) { // To search or find the Element in the matrix
        for(int i = 0; i < matices.length; i++){// for rows
            for(int j = 0; j < matices[0].length; j++){ //  for columns
                if (matices[i][j] == key) {
                    System.out.print("The Key is at matrix (" + i + "," + j + ")");
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int matices[][] = new int[3][3];
        // int n = 3; // number of rows 
        // int m = 3; // number of columns
        int n = matices.length;
        int m = matices[0].length; //  for colums

        
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < n; i++){// for rows
            for(int j = 0; j < m; j++){ //  for columns
                matices[i][j] = sc.nextInt();
            }
        }

        //output
        for(int i = 0; i < n; i++){// for rows
            for(int j = 0; j < m; j++){ //  for columns
                System.out.print(matices[i][j] + " ");
            }
            System.out.println();
        }
        
     Search(matices, 6);
     sc.close();
    }
}
