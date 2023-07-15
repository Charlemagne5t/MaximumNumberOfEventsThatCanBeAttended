import java.util.*;

public class Solution {
    public int maxEvents(int[][] events) {
        Arrays.sort(events, Comparator.comparingInt(a -> a[0]));
        int count = 0;
        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>(Comparator.comparing((int[] a) -> a[1]).thenComparing((int[] a) -> a[0]));

        int j = 0;

        for (int i = 1; i <= 100_000; i++) {

            for (; j < events.length; j++) {
                if (events[j][0] == i) {
                    priorityQueue.offer(events[j]);
                } else if (events[j][0] != i) {
                    break;

                }
            }

            while (!priorityQueue.isEmpty() && priorityQueue.peek()[1] < i) {
                priorityQueue.poll();
            }

            if (!priorityQueue.isEmpty()) {
                priorityQueue.poll();
                count++;
            }
        }

        return count;
    }
}
