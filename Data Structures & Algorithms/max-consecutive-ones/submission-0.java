class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxStreak = 0;
        int streak = 0;
        for (int i = 0; i < nums.length; i++){

            if (nums[i] == 1){
                streak++;
            }
            else if (nums[i] == 0){
                if (streak > maxStreak){
                    maxStreak = streak;
                    streak = 0;
                }
                else{
                    streak = 0;
                }
            }

        }
        if (maxStreak > streak){
            return maxStreak;
        }
        return streak;
    }
}