class Solution {
    public List<String> generateParenthesis(int n) {
        
        
        List<String> list = new ArrayList<>();
        StringBuilder res = new StringBuilder();

        compute(0,list,res,0,0,n);

        return list;

    }

    public static void compute(int i,List<String> list,StringBuilder str,int open,int close,int n){

        if(open == n && close == n){
            list.add(str.toString());
            return;
        }

        if(open < n){
            str.append('(');
           compute(i+1,list,str,open+1,close,n); 
           str.setLength(str.length() - 1);
        }
 


        if(open > close){
            str.append(')');
            compute(i+1,list,str,open,close+1,n);
            str.setLength(str.length() - 1);
        }




    }

}