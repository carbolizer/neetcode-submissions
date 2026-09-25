class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> dict1 = new HashMap<>();
        HashMap<Character, Integer> dict2 = new HashMap<>();

        // if two strings aren't the same length
        // return false
        if (s.length() != t.length()){
            return false;
        }

        char[] list1 = s.toCharArray();
        char[] list2 = t.toCharArray();
        for (char i : list1){
            if (dict1.containsKey(i)){
                int val = dict1.get(i);
                dict1.put(i, val += 1);
            }
            else{
                dict1.put(i, 1);
            }
        }

        for (char j : list2){
            if (dict2.containsKey(j)){
                int val2 = dict2.get(j);
                dict2.put(j,val2 += 1);
            }
            else{
                dict2.put(j,1);
            }
        }
        System.out.println(dict1);
        System.out.println(dict2);
        return dict1.equals(dict2);
    }
}
