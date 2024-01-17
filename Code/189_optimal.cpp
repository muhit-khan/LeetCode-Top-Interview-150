class Solution {
public:
    void rotate(vector<int>& nums, int k) {
        int length = nums.size();

        // Make sure k is within the range of the array size
        k = k % length;


        //Reverse 1st k elements
        reverse(nums.begin(), nums.begin() + length - k);

        //Reverse right most elements
        reverse(nums.begin() + length - k, nums.end());
        
        // Reverse the entire array
        reverse(nums.begin(), nums.end());
    }
};