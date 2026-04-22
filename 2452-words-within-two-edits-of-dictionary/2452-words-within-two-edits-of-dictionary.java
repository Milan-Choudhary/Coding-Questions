class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        
        List<String> ans = new ArrayList<>();

        int c = 0;
        for(String s : queries){
            for(String check : dictionary){
                c = 0;
                
                for(int i = 0; i<s.length(); i++){
                    if(s.charAt(i) != check.charAt(i)){
                        c += 1;
                    }
                }

                if(c <= 2){
                    ans.add(s);
                    break;
                }
            }
        }

        return ans;

    }
}