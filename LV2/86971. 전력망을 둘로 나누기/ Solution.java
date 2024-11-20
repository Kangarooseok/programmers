import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    static ArrayList<ArrayList<Integer>> line = new ArrayList<>();
    static Queue<Integer> queue = new LinkedList<>();
    static int result = 0;

    public int bfs(int n, int start) {
        boolean[] check = new boolean[n + 1];
        check[start] = true;
        queue.offer(start);
        int count = 1;

        while (!queue.isEmpty()) {
            int vertex = queue.poll();

            for (int i : line.get(vertex)) {
                if (!check[i]) {
                    check[i] = true;
                    queue.offer(i);
                    count++;
                }
            }
        }
        return Math.abs(n - 2 * count);

    }

    public int solution(int n, int[][] wires) {

        for (int i = 0; i < n + 1; i++) {
            line.add(new ArrayList<>());
        }

        for (int i = 0; i < wires.length; i++) {
            int to = wires[i][0];
            int from = wires[i][1];
            line.get(to).add(from);
            line.get(from).add(to);
        }

        result = Integer.MAX_VALUE;

        for (int i = 0; i < wires.length; i++) {
            int to = wires[i][0];
            int from = wires[i][1];

            line.get(to).remove((Integer) from);
            line.get(from).remove((Integer) to);

            result = Math.min(result, bfs(n, to));

            line.get(to).add(from);
            line.get(from).add(to);
        }

        return result;
    }
}