class Solution {
    public String reverseParentheses(String s) {
        
       StringBuilder res = new StringBuilder();
       res.append(s);

       Stack<Integer> stack = new Stack<>();

       for(int i = 0; i<res.length(); i++){
            if(s.charAt(i) == '('){
                stack.push(i);
            }
            else if(s.charAt(i) == ')'){
                int start = stack.pop();
                int end = i;
                reverse(start,end,res);
            }
       }

       StringBuilder ans = new StringBuilder();

       for(int i = 0; i<res.length(); i++){
            if(res.charAt(i) != '(' && res.charAt(i) != ')'){
                ans.append(res.charAt(i));
            }
       }

        return ans.toString();


    }

    public static void reverse(int start,int end,StringBuilder sb){

        while(start < end){
            char temp = sb.charAt(start);
            sb.setCharAt(start,sb.charAt(end));
            sb.setCharAt(end,temp);
            start += 1;
            end -= 1;
        }



    }


}