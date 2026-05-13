class Solution {
    public String convertToBase7(int num) {
        if(num == 0){
            return "0";
        }
        
        String ans = "";
        ArrayList<String> list = new ArrayList<>();
        if(num < 0){
            ans += "-";
        }
        
        while(num != 0){

            list.add(Integer.toString(Math.abs((num%7))));

            num = num/7;

        }

        for(int i = list.size() - 1; i>=0; i--){
            String val = list.get(i);
            ans += val;
        }

        return ans;

    }

}