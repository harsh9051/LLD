import java.util.*;
public class Main {
    public static HashSet<String> set = new HashSet<>();
    public static void main(String[] args) {
        int edges[][] = {{0,1},{0,2},{2,3},{2,4},{2,5}};
        System.out.println(Arrays.toString(sumOfDistancesInTree(6, edges)));
    }

    public static int[] sumOfDistancesInTree(int n, int[][] edges) {
        int[] ans = new int[n];
        HashMap<Integer, List<List<Integer>>> map = new HashMap<>();
        HashMap<String, Integer> distance = new HashMap<>();
        for(int ed[] : edges){
            if(!map.containsKey(ed[0]))
                map.put(ed[0], new ArrayList<>());
            List<Integer> temp = List.of(ed[1],1);
            List<List<Integer>> t = map.get(ed[0]);
            t.add(temp);
            map.put(ed[0], t);

            if(!map.containsKey(ed[1]))
                map.put(ed[1], new ArrayList<>());
            List<Integer> temp1 = List.of(ed[0],1);
            List<List<Integer>> t1 = map.get(ed[1]);
            t1.add(temp1);
            map.put(ed[1], t1);

            String s1 = ed[0] + "->" + ed[1];
            String s2 = ed[1] + "->" + ed[0];
            distance.put(s1, 1);
            distance.put(s2, 1);
        }

        int k = 0;
        for(int i = 0; i < n; i ++){
            int sum = 0;
            for(int j = 0; j < n; j++){
                if(i != j){
                    if(!distance.containsKey(i+"->"+j) || !distance.containsKey(j+"->"+i)){
                        //bfs call
                        boolean seen[] = new boolean[n];
                        int di = bfs(map, seen, i, j);
                        distance.put(i+"->"+j, di);
                        distance.put(j+"->"+i, di);
                        sum += di;
                    }else{
                        sum += distance.getOrDefault(i+"->"+j,0);
                    }
                }
            }
            ans[k++] = sum;
        }

        return ans;
    }

    public static int bfs(HashMap<Integer, List<List<Integer>>> map, boolean seen[], int start, int target){
        Queue<int[]> que = new LinkedList<>();
        que.add(new int[]{start,0});
        while(!que.isEmpty()){
            int curr[] = que.poll();
            if(!seen[curr[0]]){
                seen[curr[0]] = true;
                for(List<Integer> temp : map.get(curr[0])){
                    if(temp.get(0) == target)return curr[1] + temp.get(1);
                    else if(!seen[temp.get(0)]){
                        int distance = curr[1] + temp.get(1);
                        que.add(new int[]{temp.get(0), distance});
                    }
                }
            }
        }
        return 0;
    }
}