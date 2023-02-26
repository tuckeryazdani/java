class Solution {
    public int countDigits(int num) {
        
        // Initialize output to keep track of successes
        int output = 0;
        // Set pointer equal to num
        int i = num;
        // Loop through mod 10 of num and increase output if i%10 divides num.
        while (i > 0){
            if (num % (i % 10) == 0) output ++;
            i /= 10;
        }

        return output;

    }
}
