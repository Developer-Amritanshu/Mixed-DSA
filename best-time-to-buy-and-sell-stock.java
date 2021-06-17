class Solution {
    public int maxProfit(int[] price) {
    int prefixMin[] = new int[price.length];
    
    prefixMin[0] = price[0];
    for(int i =1;i<price.length;i++){
      prefixMin[i] = Math.min(prefixMin[i-1],price[i]);
    }

//     Print Prefix Min
//     for(int p:prefixMin){
//       System.out.print(p+" ");
//     }

//     System.out.println();

    int profit =0; // Max Profit

    int currentProfit = 0;
    for(int i =1;i<price.length;i++){
      currentProfit = price[i] - prefixMin[i-1];
      profit = Math.max(profit,currentProfit);
    }
    return profit;
    }
}
