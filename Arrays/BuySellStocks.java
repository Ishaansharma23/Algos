// Buy and Sell Stocks

// you r given an array of prices\[i] is the price of given stock on the ith day  you want to maximize your profit by choosing an single day to buy stocks and choosing a different day in future to sell that stock return the max profit you recieve from this transaction  if cant recieve profit return -1

// Input =  {7,1,5,3,6,4};
// Output = the max profit = 5

// LOGIC - 
// formula to find profit = selling price - buying price
// hume maxprofit nikalna hai = 0 starting mai , buyprice = minimum chahiye toh  +infinty > prices[i]krke nikal lenge 
// loop chalayenge jisme agr buyprice (+infi) bda h current price s toh buying price = prices[i] yani current price hojayega hmara buying price
// agr buyprice chota hai current price se toh hum profit nikalenge aur maxprofit update karenge ki pehle to maxprofit= 0 bda hai ya profit jo nikla hai use maxprofit mai store kr lenge
// aise krke final maxprofit ajayega 
// Agar profit kabhi positive nahi hota, matlab price hamesha girta raha ya same raha, toh maxProfit zero rahega. Agar tum chahte ho ki "agar profit nahi hua toh -1 return karo" toh last mein isko aise check kar sakte ho:
// Time Complexity = O(n) kyuki 1 loop chala hai 

package Arrays;

public class BuySellStocks {
    public static void main(String[] args) {
        
        int prices[] = {7,1,5,3,6,4};
        int buyPrice = Integer.MAX_VALUE; // sbse km rkhni hai humne buyprice
        int maxProfit = 0; // max profit of the day
    
        for(int i = 0; i < prices.length ; i++){
            if (buyPrice < prices[i]) { // profit niklega 
                int profit = prices[i] - buyPrice; // selling price - buyprice
                maxProfit = Math.max(maxProfit, profit);
            } else { 
                buyPrice = prices[i]; //+infinty < 7 - nahi, isliye buyprice ki val 7 krdo humne khrid lia stock 
            }
           

        }
        System.out.println("the max profit = " + maxProfit);
    }
}
