class Solution {
    public List<String> fizzBuzz(int n) {
        
        List<String> ans = new ArrayList<>();

        int k = 1;

        int i = 0;

        while(i < n){
            String add = "";
            if(k%3 == 0 && k%5 == 0){
                add += "FizzBuzz";
            }
            else if(k%3 == 0){
                add += "Fizz";
            }
            else if(k%5 == 0){
                add += "Buzz";
            }
            else{
                add += Integer.toString(k);
            }

           ans.add(add);

            i += 1;
            k += 1;
        }

        return ans;

    }
}