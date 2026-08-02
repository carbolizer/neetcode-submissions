class Solution {
    public int[] replaceElements(int[] arr) {
        for (int i = 0; i < arr.length -1; i++){
            int b = i+1;
            for (int k=i+1; k < arr.length; k++){
                if (arr[k] > arr[b]){
                    b = k;
                }
            }
            arr[i] = arr[b];

        }
        arr[arr.length-1] = -1;
        return arr;



    }
}