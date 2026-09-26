class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        
        StringBuilder res = new StringBuilder();

        HashMap<String,String> map = new HashMap<>();

        for(int i = 0; i<knowledge.size(); i++){

            map.put(knowledge.get(i).get(0),knowledge.get(i).get(1));

        }

        int i = 0;


        while(i < s.length()){

            int j = i+1;
            StringBuilder list = new StringBuilder();

            while(s.charAt(i) == '(' && s.charAt(j) != ')'){
                
                list.append(s.charAt(j));
                j += 1;

            }

            if(j != i + 1){
                String use = list.toString();
                if(map.containsKey(use)){
                    res.append(map.get(use));
                }
                else{
                    res.append('?');
                }
                i = j + 1;
            }
            else{
                res.append(s.charAt(i));
                i += 1;
            }

        }


        return res.toString();

    }
}