
class Solution {
    
    public boolean hasDuplicate(int[] nums) {
        // Create a hashset
        HashSet<Integer> numSet = new HashSet<>();

        // loop through the array
        // if the current number is already in the hashset, return true
        // else return false
        for (int i : nums){
            if (numSet.contains(i)){return true;}
            else{numSet.add(i);}
        }
        return false;
    }
}