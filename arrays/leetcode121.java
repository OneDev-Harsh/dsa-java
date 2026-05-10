class leetcode121{

    static int maxProfit(int[] prices){
        int max=0;  
        for(int i=0; i<prices.length; i++){
            for(int j=i; j<prices.length; j++){
                if(prices[j]-prices[i]>max) max=prices[j]-prices[i];
            }
        }
        return max;
    }

    static int optimal(int[] price){
        int min=price[0];
        int profit=0;
        for(int i=0; i<price.length; i++){
            int cost=price[i]-min;
            profit = Math.max(cost, profit);
            min = Math.min(price[i], min);
        }
        return profit;
    }

    public static void main(String[] args) {
        int a[] = {7,6,4,3,1};
        System.out.println(optimal(a));
    }
}