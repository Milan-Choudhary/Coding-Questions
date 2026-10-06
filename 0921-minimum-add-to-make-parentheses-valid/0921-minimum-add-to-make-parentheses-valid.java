class Solution {
    public int minAddToMakeValid(String s) {
        
        Stack<Integer> stack = new Stack<>();
        int ans = 0;

        for(int i = 0; i<s.length(); i++){

            if(s.charAt(i) == '('){
                stack.push(i);
            }
            else{

                if(stack.size() == 0){
                    ans += 1;
                }
                else{
                    stack.pop();
                }

            }

        }

        ans += stack.size();

        return ans;


    }
}