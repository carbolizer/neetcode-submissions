class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        //System.out.println(chars);
        for(char i: chars){
            switch(i){
                case('['):
                    stack.push(i);
                    //System.out.print(stack.peek());
                    break;

                case('{'):
                    stack.push(i);
                    //.out.print(stack.peek());
                    break;

                case('('):
                    stack.push(i);
                    //System.out.print(stack.peek());
                    break;


                // closed brackets

                case(']'):
                    if (stack.isEmpty()){ return false;}
                    char a = stack.peek();
                    if (a == '['){
                        stack.pop();
                        //System.out.print(stack.peek());
                    }
                    else{ return false;}
                    break;
                        
                case('}'):
                    if (stack.isEmpty()){ return false;}
                    char b = stack.peek();
                    if (b == '{'){
                        stack.pop();
                        //System.out.print(stack.peek());
                    }
                    else{ return false;}
                    break;

                case(')'):
                    if (stack.isEmpty()){ return false;}
                    char c = stack.peek();
                    if (c == '('){
                        stack.pop();
                        //System.out.print(stack.peek());
                    }
                    else{ return false;}
                    break;
            }

            

        }
        
        return stack.isEmpty();
    }
}
