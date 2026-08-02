class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> record = new Stack<>();
        for (int i=0; i < operations.length; i++){
            switch(operations[i]){
                case "+":
                    int a = record.pop();
                    int b = record.peek();
                    record.push(a);
                    record.push(a+b);
                    break;
                case "D":
                    int top = record.peek();
                    int doubleScore = top * 2;
                    record.push(doubleScore);
                    break;

                case "C":
                    record.pop();
                    break;
                default:
                    int num = Integer.parseInt(operations[i]);
                    record.push(num);
                    break;

            }
        }
        
        // calculate the sum
        int sum = 0;
        while(!record.isEmpty()){
            sum += record.pop();
        }
        return sum;
    }
}