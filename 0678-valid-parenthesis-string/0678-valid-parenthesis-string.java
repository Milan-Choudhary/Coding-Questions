class Solution {
    public boolean checkValidString(String s) {
        
        ArrayDeque<Integer> q = new ArrayDeque<>();
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                stack.push(i);
            }
            else if(s.charAt(i) == '*'){
                q.addLast(i);
            }
            else{
                if(stack.size() > 0){
                    stack.pop();
                }
                else if(q.size() > 0){
                    q.pollFirst();
                }
                else{
                    return false;
                }
            }
        }

        int c = stack.size();

        while(stack.size() > 0){

            if(q.size() == 0 && stack.size() != 0){
                return false;
            }

            int val = q.pollLast();

            if(val < stack.peek()){
                return false;
            }
            
            stack.pop();

        }


        return true;
        
    }
}