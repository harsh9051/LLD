import java.util.*;
public class Main {
    public static class Pair{
        char ch;
        int c;
        Pair(char ch, int cost){
            this.ch = ch;
            this.c = cost;
        }
    }

    public static int row;
    public static int col;
    public static int directions[][] = {{0,1},{1,0},{-1,0},{0,-1}};
    public static List<List<Integer>> ans = new ArrayList<>();
    public static String num = "";
    public static int ed = 0;
    public static int nodes = 0;
    public static HashMap<Character, List<Pair>> map = new HashMap<>();
    public static HashMap<String, Long> store = new HashMap<>();
    public static void main(String[] args) {


//        String source = "abcd", target = "acbe";
//        char original[] = {'a','b','c','c','e','d'};
//        char changed[] = {'b','c','b','e','b','e'};
//        int cost[] = {2,5,5,1,2,20};
//
//
//        System.out.println(minimumCost(source, target, original, changed, cost));
//        System.out.println(store);

        String ans = "1747239457000";
        System.out.println(ans.length());

        String ans1 = "1747224956987";
        System.out.println(ans1.length());

    }

    public static long minimumCost(String source, String target, char[] original, char[] changed, int[] cost) {
        long sum = 0;
        for(int i = 0; i < original.length; i++){
            char start = original[i];
            char end = changed[i];
            if(!map.containsKey(start)){
                map.put(start, new ArrayList<>());
            }
            Pair p = new Pair(end, cost[i]);
            map.get(start).add(p);
        }

        for(int i = 0; i < source.length(); i++){
            char start = source.charAt(i);
            char end = target.charAt(i);
            if(start == end)continue;
            if(!map.containsKey(start))return -1;
            String ans = String.valueOf(start) + String.valueOf(end);
            if(store.containsKey(ans)){
                sum = sum + store.get(ans);
                continue;
            }
            long val = helper(start, end);
            if(val == -1)return -1;
            else{
                store.put(ans, val);
            }
            sum = sum + val;
        }

        return sum;
    }

    public static long helper(char start, char end){

        Queue<Pair> que = new PriorityQueue<>((a,b) -> Integer.compare(a.c, b.c));
        que.add(new Pair(start, 0));
        Set<Character> seen = new HashSet<>();
        while(!que.isEmpty()){
            int n = que.size();
            for(int i = 0; i < n; i++){
                Pair temp = que.poll();
                if(temp.ch == end)return temp.c;
                if(!seen.contains(temp.ch)){
                    seen.add(temp.ch);
                    for(Pair curr : map.get(temp.ch)){
                        if(!seen.contains(curr.ch)){
                            int dis = curr.c + temp.c;
                            que.add(new Pair(curr.ch, dis));
                        }
                    }
                }
            }
        }

        return -1;

    }

}