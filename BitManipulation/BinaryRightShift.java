// binary RIght Shift - ye binary num ko shift kr deta hai Right ki taraf 
// 000101 >> 2 toh right k elem ht jayenge 2 spaces = 000001 

// isme spaces utni hi rhegi num k htne k bad bhi lekin bs 0 add kr denge last mai to fill the empty spaces

package BitManipulation;

public class BinaryRightShift {
  public static void main(String[] args) {
    // a >> b           -- >> ye Right side point kr rha hai means binary RIght shift hai 
      // a = 000101 (5 in decimal)
      // b = 2 , toh a >> b = 2 spaces s age shift ho = 000001 now 
      // 5 >> 2 = (000001)2 - in binary 

      // formula a >> b = a / 2^b = 5/2 ki power 2 = 2.5 
      System.out.println(5 >> 2); // Output: 1
    
  }
      

}
