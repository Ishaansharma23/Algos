 package Arrays;

 
public class AssQues {
    // qs -1 LOOP S PTA LGA RHE HAI KI EK NUMBER 2 BAR AYE TO TRUE RETURN KRDO
    public static Boolean Twice(int nums[]) {
        for(int i = 0; i < nums.length; i++) {
            int count = 0;
            for(int j = i; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
            if (count >= 2) {
                return true;
            }
        }
        return false;
    }

    // qs -2 BINARY SEARCH S INDEX NIKALNA (PIVOT ROTATED ARRAY HAI)
    public static int FindIndex(int nums[], int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            // Step 1: Direct match
            if (nums[mid] == target) {
                return mid;
            }

            // Step 2: Left half is sorted
            if (nums[start] <= nums[mid]) {
                // Target lies in left half
                if (nums[start] <= target && target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            // Step 3: Right half is sorted
            else {
                // Target lies in right half
                if (nums[mid] < target && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return -1; // Target not found
    }

    // qs - 3 MAX PROFIT NIKAL RHE HAI JISME HUMARA BP KM HO OR SELLING JYADA 
    public static int Buy(int prices[]) {
        int buyPrice = Integer.MAX_VALUE; // sbse km rkhni hai humne buyprice
        int maxProfit = 0; // max profit of the day

        for(int i = 0; i < prices.length ; i++){
            if (buyPrice < prices[i]) { // profit niklega 
                int profit = prices[i] - buyPrice; // selling price - buyprice
                maxProfit = Math.max(maxProfit, profit);
            } else { 
                buyPrice = prices[i]; //+infinity < 7 - nahi, isliye buyprice ki val 7 krdo humne khrid lia stock 
            }
        }
        return maxProfit;
    }

    // qs - 4 TRAPPED RAINWATER NIKALO
    public static int TrapWater(int[] height) {
        int leftmax[] = new int[height.length];
        leftmax[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            leftmax[i] = Math.max(height[i], leftmax[i - 1]);
        }

        int rightmax[] = new int[height.length];
        rightmax[height.length - 1] = height[height.length - 1];
        for (int i = height.length - 2; i >= 0; i--) {
            rightmax[i] = Math.max(height[i], rightmax[i + 1]);
        }

        int trappedwater = 0;
        for (int i = 0; i < height.length; i++) {
            int waterlvl = Math.min(leftmax[i], rightmax[i]);
            trappedwater += (waterlvl - height[i]);
        }
        return trappedwater;
    }

    // qs - 5 TRIPLETS SUM TO ZERO
    public static void Triplets(int numbers[]) {
        for(int i = 0; i < numbers.length; i++) {
            for(int j = i + 1 ; j < numbers.length; j++) {
                for(int k = j + 1 ; k < numbers.length ; k++){
                    if (numbers[i] + numbers[j] + numbers[k] == 0) {
                        System.out.println(numbers[i] + " " + numbers[j] + " " + numbers[k]);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {   
        int nums[] = {4,5,6,7,0,1,2};
        int prices[] = {4,5,6,7,0,1,2};
        int height[] = {4, 2, 0, 3, 2, 5};
        int numbers[] = {-1, 0, 1, 2, -1, -4}; 
        int target = 4;

        System.out.println("Twice method output: " + Twice(nums)); 
        System.out.println("FindIndex method output: " + FindIndex(nums, target));
        System.out.println("Buy method output: " + Buy(prices));
        System.out.println("TrapWater method output: " + TrapWater(height));
        System.out.println("Triplets that sum to zero:");
        Triplets(numbers);
    }
}
