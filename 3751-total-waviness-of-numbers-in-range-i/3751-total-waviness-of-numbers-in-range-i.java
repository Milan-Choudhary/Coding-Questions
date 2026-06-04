class Solution {
    public int totalWaviness(int num1, int num2) {
        
        int count = 0;

        for(int i = num1; i<=num2; i++){
            count += compute(i);
        }

        return count;        

    }

    public static int compute(int num){
        if(num <= 99){
            return 0;
        }

        
        int c = 0;
        int ahead = num%10;
        num = num/10;
        int current = num%10;
        num = num/10;
        int prev = num%10;

        if(current < ahead && current < prev){
            c += 1;
        }
        else if(current > ahead && current > prev){
            c += 1;
        }

        while(num >= 10){
            ahead = current;
            current = prev;
            num = num/10;
            prev = num%10;

            if(current < ahead && current < prev){
            c += 1;
            }
            else if(current > ahead && current > prev){
                c += 1;
            }
            
        }


        return c;

    }

}