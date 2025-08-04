// Input =  {{1,2,3,4},
// {5,6,7,8},
// {9,10,11,12},
// {13,14,15,16}};
// Output = 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10

// LOGIC - make stRow , col,endrow,endcol - endrow= n-1 , endcol=m-1 , strtrow mai stcol s endcol tk jayega and row fixed rhegi 
// right mai col same rhega endcol , i(row) i+1 to remove duplicacy and endrow tk jayega ye 
// top right bottom left mai krle , remove duplicacy and then last mai ++row,col strt , --endcol,endrow

//if row < cols = to remove duplicacy  if (startrow == endrow) { repeated elem na print ho dubara
                    // break;    mainly for odd 5*5 matrix

package TwoD_Arrays;

public class SpiralMatrix {
    public static void Spiralmatrix(int matrix[][]) {
        int startrow = 0;
        int endrow = matrix.length - 1;
        int startcol = 0;
        int endcol = matrix[0].length - 1;

        while (startrow <= endrow && startcol <= endcol) { // v imp 
            
            // for top view
            for(int j = startcol; j <= endcol; j++){ // Row fix hai: startrow
                System.out.print(matrix[startrow][j] + " ");  // Column badalta jaa raha hai: j
            }

            // for right
            for(int i = startrow + 1; i <= endrow ; i++){
                System.out.print(matrix[i][endcol] + " ");
            }

            // for bottom
            for(int j = endcol - 1; j >= startcol; j--){
                if (startrow == endrow) {
                    break;
                }
                System.out.print(matrix[endrow][j] + " ");
            }

            // for left
            for( int i = endrow - 1; i >= startrow + 1; i--){
                if (startcol == endcol) {
                    break;
                }
                System.out.print(matrix[i][startcol] +  " ");
            }

            startrow++; // bahar s andr wale matrix m jane k liy
            startcol++;
            endrow--;
            endcol--;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int matrix [][] = {{1,2,3,4},
                           {5,6,7,8},
                        {9,10,11,12},
                       {13,14,15,16}};
        Spiralmatrix(matrix);
    }
    }
