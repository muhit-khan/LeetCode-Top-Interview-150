
#include<bits/stdc++.h>
using namespace std;

class Solution {
public:

    int maxProfit(vector<int>& prices) {
        int len = prices.size();

        if(len <= 2){
            return 0;
        }

        int minPrice = INT_MAX;
        int maxProfit = 0;

        for(int i = 0; i<len; i++){
           minPrice = min(minPrice, prices[i]);
           int currentProfit = prices[i] - minPrice;

           maxProfit = max(maxProfit, currentProfit);

           return maxProfit;
        }
    }
};

