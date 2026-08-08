class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        StringBuilder res = new StringBuilder();

        HashMap<Character,Character> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();

        for(int i = 0; i<s.length(); i++){

            if(!map.containsKey(s.charAt(i))){

                if(set.contains(t.charAt(i))){
                    return false;
                }
                
                map.put(s.charAt(i),t.charAt(i));
                res.append(map.get(s.charAt(i)));
            }
            else{
                res.append(map.get(s.charAt(i)));
            }

            set.add(t.charAt(i));

        }

        String ans = res.toString();

        return ans.equals(t);


    }
}