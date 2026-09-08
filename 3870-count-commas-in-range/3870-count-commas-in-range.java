class Solution {
    public int countCommas(int n) {
        
    //   int num = n;

    //   int c = 0;

    //   while(n > 0){
    //     n = n/10;
    //     c += 1;
    //   }

    //   if(c <= 3){
    //     return 0;
    //   }

    //   int ans = compute(num,c);

    int c = 0;
    int count = 0;

    for(int i = 1000; i<=n; i++){
        int val = i;
        int num = i;
        c = 0;
        while(val > 0){
            val = val/10;
            c += 1;
        }

        if(c%3 != 0){
            count += c/3;
        }

        else if(c%3 == 0){
            count += c/3 - 1;
        }

    }

    return count;


    }

    // public static int compute(int num;int power){

    //     while(power/3 > 0){
    //         int multiply = power/3;
            

    //     }


    // }
}