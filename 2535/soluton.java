class Solution {
    public int differenceOfSum(int[] nums) {
        
        // Initialize sums to 0
        int element_sum = 0;
        int digit_sum = 0;

        for (int i = 0;i<nums.length;i++){
            // add current integer to element_sum
            element_sum += nums[i];

            // Begin while loop to add digits by mod 10 then divide that number by 10.
            while (nums[i] > 0){
                digit_sum += nums[i]%10;
                nums[i] /= 10;
            }
        }

        // Return absolute difference.
        return Math.abs(element_sum-digit_sum);
    }
}
