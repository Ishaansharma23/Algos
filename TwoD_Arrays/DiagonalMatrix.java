// Input =  {{1,2,3,4},
// {5,6,7,8},
// {9,10,11,12},
// {13,14,15,16}};
// Output = 68

// LOGIC - matrix[0[0],(1,1),(2,2) is primary diagonal elem , secondary = [i][matrix.length-1],(1,n-2),(2,n-3),(n-1,0) 
//  read the code


package TwoD_Arrays;

public class DiagonalMatrix {
    public static int DiagonalSum(int matrix[][]) { // brute force 
                                                    // time complexity = O(n2)
        int sum = 0;
        // for(int i = 0; i < matrix.length; i++){
        //     for(int j = 0 ; j < matrix[0].length; j++){
        //         if (i == j) {
        //             sum += matrix[i][j];
        //         }else if (i + j  == matrix.length - 1) {  (0,3): i+j = 0+3 = 3
                                                          // (1,2): i+j = 1+2 = 3
                                                          // (2,1): i+j = 2+1 = 3
                                                          // (3,0): i+j = 3+0 = 3
        //             sum += matrix[i][j];
        //         }
        //     }
        // }
        // return sum;

        for(int i = 0; i < matrix.length; i++){ // optimized code
            //pd
            sum += matrix[i][i]; // row = column 
            //sd
            if (i != matrix.length - i - 1) { // duplicacy hatata hai like 1,1 - 1 != 3-1-1= 1 Agar Primary aur Secondary same cell nahi hai, tab hi Secondary add karo.
                sum += matrix[i][matrix.length - i - 1]; //i=0, j = 3-0-1= 2 so (0,2)= last elem , 1 row
            }
        }
        return sum;
    }
    
    public static void main(String[] args) {
        int matrix [][] = {{1,2,3,4},
                           {5,6,7,8},
                        {9,10,11,12},
                       {13,14,15,16}};
        int res = DiagonalSum(matrix);
        System.out.print("diagonal sum " + res);
    }
}
