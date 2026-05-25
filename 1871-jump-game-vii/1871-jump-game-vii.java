class Solution {
    public boolean canReach(String s, int minJump, int maxJump) {
        if(s.charAt(s.length() - 1) == '1'){
            return false;
        }

        // Queue<Integer> q = new LinkedList<>();
        // q.add(0);

        // boolean[] vis = new boolean[s.length()];
        // vis[0] = true;
        // int last_visited = -1;

        // while(q.size() > 0){
        //     int index = q.poll();
        //     int start = last_visited + index + minJump;
        //     int end = Math.min(index + maxJump,s.length() - 1);

        //     for(int j = start; j<=end; j++){
        //         if(s.charAt(j) == '0'){
        //             if(j == s.length() - 1){
        //                 return true;
        //             }

        //             q.add(j);
        //             last_visited = j;
                    
        //         }
        //     }
        // }

        // return false;


        Queue<Integer> q = new LinkedList<>();
        boolean[] vis = new boolean[s.length()];
        q.add(0);
        vis[0] = true;
        int last_visited = 0;

        while(!q.isEmpty()){

            int index = q.poll();

            int start = index + minJump;
            int end = Math.min(index + maxJump,s.length()-1);

            if(last_visited > start){
                start = last_visited + 1;
            }

            if(start <= end && end == s.length() - 1 && s.charAt(end) == '0'){
                return true;
            }

            while(start <= end){
                if(!vis[start] && s.charAt(start) == '0'){
                    vis[start] = true;
                    q.add(start);
                    
                }

                start += 1;
            }

            last_visited = end;


        }

        return false;

    }
}