class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for(int i = 0; i<numCourses; i++){
            list.add(new ArrayList<>());
        }

        int[] indegree = new int[numCourses];

        for(int[] arr : prerequisites){
            int a = arr[0];
            int b = arr[1];
            indegree[a] += 1;

            list.get(b).add(a);
        }

        Queue<Integer> q = new LinkedList<>();
        int[] ans = new int[numCourses];

        for(int i = 0; i<indegree.length; i++){
            if(indegree[i] == 0){
                q.add(i);
            }
        }

        int index = 0;

        while(!q.isEmpty()){

            int node = q.poll();

            ans[index] = node;
            index += 1;


            for(int ele : list.get(node)){
                indegree[ele] -= 1;

                if(indegree[ele] == 0){
                    q.add(ele);
                }
            }

        }

        for(int i = 0; i<indegree.length; i++){
            if(indegree[i] != 0){
               return new int[0];
            }
        }

        return ans;


    }
}