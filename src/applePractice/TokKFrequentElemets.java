package applePractice;

import java.util.*;

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
        while (k -->0){
            res[k] = queue.poll();
        }
        return res;
    }

//    //time complexity O(n log K)
//    List<Integer> topKFrequent(int[] nums, int k) {
//
//        Map<Integer, Integer> freqMap = new HashMap<>();
//        for(int num : nums ){
//            freqMap.put(num, freqMap.getOrDefault(num,0)+1);
//        }
//        Queue<Integer> queue = new PriorityQueue<>((a,b) -> freqMap.get(a)- freqMap.get(b));
//
//        for(int key: freqMap.keySet()){
//            queue.offer(key);
//            if (queue.size() > k){
//                queue.poll();
//            }
//        }
//
//        List<Integer> res = new ArrayList<>();
//        while(!queue.isEmpty()){
//            res.add(queue.poll());
//        }
//
//        return res;
//    }
}
