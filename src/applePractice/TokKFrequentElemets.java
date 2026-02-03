package applePractice;

import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Queue;

public class TokKFrequentElemets {

    static void main() {

        int[] ints = topKFrequent(new int[]{1, 1, 1, 1, 2, 2, 3}, 2);

        for (int j = 0 ; j<ints.length;j++){
            System.out.println(ints[j]);
        }

    }

    public static int[] topKFrequent(int[] nums, int k) {

        int[] res = new int[k];
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i:nums) {
            map.put(i, map.getOrDefault(i,0)+1);
        }
        Queue<Integer> queue = new PriorityQueue<>((a,b)->map.get(a)-map.get(b));

        for (int key:map.keySet()){
            queue.add(key);
            if (queue.size()>k){
                queue.poll();
            }
        }
        while (k-->0){
            res[k] = queue.poll();
        }
        return res;
    }
}
