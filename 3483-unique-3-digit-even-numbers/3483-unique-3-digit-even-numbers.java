class Solution {
    public int totalNumbers(int[] digits) {

        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i<digits.length; i++){
            if(digits[i] == 0){
                continue;
            }
            int digit = digits[i]*100;

            for(int j = 0; j<digits.length; j++){

                if(i == j){
                    continue;
                }

                digit += digits[j]*10;

                for(int k = 0; k<digits.length; k++){
                    if(k == i || k == j || digits[k]%2 != 0){
                        continue;
                    }

                    digit += digits[k];

                    set.add(digit);

                    digit -= digits[k];

                }

                digit -= digits[j]*10;

            }

        }

        return set.size();
        
    }
}