class Solution {
    public int[] plusOne(int[] digits) {

        if(digits[digits.length-1] != 9){
            digits[digits.length - 1] += 1;
            return digits;
        }

        ArrayList<Integer> list = new ArrayList<>();

        int add = 1;
        int i = digits.length - 1;
        
        while(i >= 0){
            int val = digits[i];
            if(val == 9){
                list.add(0);
            }
            else{
                val += 1;
                add -= 1;
                list.add(val);
            }

            i -= 1;
            if(add == 0){
                break;
            }


        }

        if(i == -1 && add != 0){
            list.add(1);
        }
        else{
            while(i >= 0){
                list.add(digits[i]);
                i -= 1;
            }
        }

        int[] res = new int[list.size()];

        int index = 0;
        for(int k = list.size()-1; k>=0; k--){
            res[index++] = list.get(k);
        }

        return res;


    }
}