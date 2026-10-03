class Solution {
    public int longestValidParentheses(String s) {
       
       Stack<Integer> stack = new Stack<>();

       int len = 0;

       for(int i = 0; i<s.length(); i++){

        if(s.charAt(i) == '('){
            stack.push(i);
        }
        else{

            if(stack.size() != 0 && s.charAt(stack.peek()) == '('){
                stack.pop();
            }
            else{
                stack.push(i);
            }

        }

        int range = stack.size() == 0 ? i+1 : i - stack.peek();
        len = Math.max(len,range);

       }


        return len;


    }
}