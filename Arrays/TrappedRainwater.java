//trapped rainwater

// find the water trapped between the buildings

// Input =  {4, 2, 0, 6, 3, 2, 5};
// Output = Trapped Water: 11

// LOGIC -  calc left max boundary array bna kr same right max nikalo loop chala kr 
// - fir ek loop chalao trapped water count krne k liye jisme : waterlevel nikalna hai or fir trappedwater
// - waterlevel = minimum of left max and right max (batata hai ki kisi position (point) pe paani kitna bhar sakta hai, agar uske dono sides me high walls hain.)
// - trappedwater = (waterlvl - height)* width (Trapped Water woh paani hai jo actually kisi index pe rukta hai, jo humare water level se kam hota hai.)

// Time Complexity = O(n)

package Arrays;

public class TrappedRainwater {
    public static int Rainwater(int height[]) {
        // Calculate left max bound - array
        int leftmax[] = new int[height.length];
        leftmax[0] = height[0]; // leftmax[0] = 4 as height[0] = 4
        for (int i = 1; i < height.length; i++) {
            leftmax[i] = Math.max(height[i], leftmax[i - 1]); // i-1 or height[i] m so jo bda hai, that is leftmax[i]
        }

        // Calculate right max bound - array
        int rightmax[] = new int[height.length];
        rightmax[height.length - 1] = height[height.length - 1]; // height.length-1 assign krdiya hai isliye loop -2 se chalu hoga
        for (int i = height.length - 2; i >= 0; i--) { // idx 0 tak pahuchna hai isliye i >= 0
            rightmax[i] = Math.max(height[i], rightmax[i + 1]); // i+1 isliye kyunki h.len -1 ko right wali index se compare krna hai 
        }

        int trappedWater = 0;
        // Loop to calculate the trapped water
        for (int i = 0; i < height.length; i++) {
            // Water level = min of leftmax bound, rightmax bound
            int Waterlvl = Math.min(leftmax[i], rightmax[i]);

            // Trapped water = water level - height[i]
            trappedWater += Waterlvl - height[i]; // Accumulating the trapped water
        }

        return trappedWater; // Return the total trapped water
    }

    public static void main(String[] args) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        int result = Rainwater(height); // Call Rainwater function
        System.out.println("Trapped Water: " + result); // Print the result
    }
}
