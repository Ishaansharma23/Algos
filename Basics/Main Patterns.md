<!-- 
public class Java {
// hollow rectangle

    public static void Hollow_Rectangle(int totRows , int totCols) {
        for(int i = 1; i<=totRows ; i++){
            for(int j = 1; j <= totCols ; j++){
                if (i ==1 || i == totRows || j == 1 || j == totCols) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
// to print inverted / rotated pyramid 
    public static void InvertedPyramid(int n) {
        //  rows/ lines
        for(int i = 1; i <= n; i++){
            // for spaces
            for(int j = 1 ; j <= n-i ; j++){
                System.out.print(" ");
            }
            // stars
            for(int stars = 1; stars <= i ; stars++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
// Inverted half Pyramid with Numbers
    public static void HalfPyramid(int n) {
        for(int i = 1; i <= n ; i++){
            for(int j = 1; j<=n-i+1 ; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
// FLoyds triange
    public static void FloydsTriangle(int n ) {
        int num = 1;
        for(int i = 1; i <= n ; i++){
            for(int j = 1; j <= i ; j++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
// 0-1 Triangle Pattern 
    public static void TrianglePattern(int n) {
        // for lines / rows / outer loop
        for(int i= 1; i <= n ; i++){
            //for inner loop / columns
            for(int j = 1 ; j <= i ; j++){
                if ((i + j) %2 == 0) {
                    System.out.print("1" + " ");
                }else {
                    System.out.print("0" + " ");
                }
            }
            System.out.println();
        }
    }
// butterfly Pattern Code ----- IMP
public static void Butterfly(int n) {
    //1st half
    for(int i = 1; i <= n ; i++){
        //stars - i
        for(int j = 1; j <= i ; j++){
            System.out.print("*");
        }
        //spaces -- 2*(n-i)
        for(int j = 1; j <= 2*(n-i); j++){
            System.out.print(" ");
        }
        //stars
        for(int j =1 ; j <= i ; j++){
            System.out.print("*");
        }   
        System.out.println();
    }
    // 2 half
    for(int i = n; i >= 1 ; i--){
        //stars - i
        for(int j = 1; j <= i ; j++){
            System.out.print("*");
        }
        //spaces -- 2*(n-i)
        for(int j = 1; j <= 2*(n-i); j++){
            System.out.print(" ");
        }
        //stars
        for(int j =1 ; j <= i ; j++){
            System.out.print("*");
        }   
        System.out.println();
    }
}

// solid Rhombus
    public static void SolidRhombus(int n) {
        for(int i = 1; i <= n; i++){
            //space 
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            // stars
            for(int j = 1; j <= n ; j++){
                System.out.print("*");
            }

            // no need for spaces
            System.out.println();
        }
    }
//Hollow Rhombus 
    public static void HollowRhombus(int n ) {
        for(int i = 1; i <= n ; i++){
            //spaces
            for(int j = 1; j <=(n-i) ; j++){
                System.out.print(" ");
            }
            //boundaryRectange
            for(int j =1 ; j<=n ; j++){
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

// Diamond Pattern 

    public static void DiamondPattern(int n) {
        for(int i = 1; i <=n ; i++){
            //spaces - n-i
            for(int j = 1; j <= n-i ; j++){
                System.out.print(" ");
            }
            //stars
            for(int j = 1 ; j <= 2 * i - 1  ; j++){
                System.out.print("*");
            }
            System.out.println();;
        }
    }
    public static void main(String[] args) {
        // Hollow_Rectangle(4, 5);
        // InvertedPyramid(6);
        // HalfPyramid(5);
        // FloydsTriangle(5);
        // TrianglePattern(5);
        // Butterfly(4);
        // SolidRhombus(5);
        // HollowRhombus(5);
        DiamondPattern(5);
    }
} -->