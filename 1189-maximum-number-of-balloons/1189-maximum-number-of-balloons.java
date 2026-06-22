class Solution {
    public int maxNumberOfBalloons(String text) {

        HashSet<Character> set = new HashSet<>();

        set.add('b');
        set.add('a');
        set.add('l');
        set.add('o');
        set.add('n');
        
        HashMap<Character,Integer> map = new HashMap<>();

        for(char ele : text.toCharArray()){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }

        int c = 0;
        int B = 0;
        int A = 0;
        int L = 0;
        int O = 0;
        int N = 0;

        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getKey().equals('b')){
                B = entry.getValue();
                c += 1;
            }
            else if(entry.getKey().equals('a')){
                A = entry.getValue();
                c += 1;
            }
            else if(entry.getKey().equals('l')){
                L = entry.getValue()/2;
                c += 1;
            }
            else if(entry.getKey().equals('o')){
                O = entry.getValue()/2;
                c += 1;
            }
            else if(entry.getKey().equals('n')){
                N = entry.getValue();
                c += 1;
            }

        }

        if(c != 5){
            return 0;
        }

        else if(L == 0 || O == 0){
            return 0;
        }

        int[] arr = new int[5];

        arr[0] = A;
        arr[1] = B;
        arr[2] = L;
        arr[3] = O;
        arr[4] = N;

        int m = 10_000;

        for(int num : arr){
            m = Math.min(m,num);
        }

        return m;

    }
}