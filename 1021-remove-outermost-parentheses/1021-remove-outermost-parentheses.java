class Solution {
    public String removeOuterParentheses(String s) {
        
        Stack<Integer> stack = new Stack<>();

        StringBuilder res = new StringBuilder();

        for(int i = 0; i<s.length(); i++){

            if(s.charAt(i) == '('){
                stack.push(i);
                if(stack.size() > 1){
                    res.append('(');
                }
            }
            else{
                stack.pop();

                if(stack.size() != 0){
                    res.append(')');
                }
                
            }

        }

        return res.toString();

    }
}