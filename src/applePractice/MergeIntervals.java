package applePractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {

    public static void merger(int[][] intervals){

        Arrays.sort(intervals,(a,b)-> a[0]-b[0]);

        List<int[]> result = new ArrayList<>();

        int[] current = intervals[0];
        result.add(current);

        for (int i=1 ;i<intervals.length;i++) {

            int[] next = intervals[i];

            if (next[0]<current[1]) {

                current[1] = Math.max(current[1], next[1]);
            }
            else  {
                current = next;
                result.add(current);
            }

        }
        for (int[] rs:result){
            for (int r:rs){
                System.out.println(r);
            }
        }

    }

    static void main() {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        merger(intervals);
    }
}
