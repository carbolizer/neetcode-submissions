class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        // have a local max and a global max of consecutive 1's
        int localMax = 0;
        int globalMax = 0;
        for (int i : nums){
            if (i == 1){
                localMax++;
            }
            else{
                if (localMax >= globalMax){
                    globalMax = localMax;
                }
                localMax = 0;
            }

        }
        if (localMax >= globalMax){
            globalMax = localMax;
        }
        return globalMax;
    }
}