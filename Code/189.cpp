#include<bits/stdc++.h>
using namespace std;

class Solution {
public:
    void rotate(vector<int>& nums, int k) {
        int length = nums.size();

        // Make sure k is within the range of the array size
        k = k % length;

        vector<int> temp;

        //storing right most elements to a temporary vector
        for(int i= length-k; i<length; i++){
            temp.push_back(nums[i]);
        }

        //move elements to right
        for(int m= length-1; m >=k ; m--){
            nums[m] = nums[m-k];
        }

        // Copy elements from temp to nums
        for(int j = 0; j < k; j++) {
            nums[j] = temp[j];
        }
    }
};