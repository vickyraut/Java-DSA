import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ComponentsGraph {
    static class Edge {
        int source;
        int destination;
        int weight;

        Edge(int s, int d, int w) {
            this.source = s;
            this.destination = d;
            this.weight = w;
        }
    }

    public static void bfs(ArrayList<Edge>[] graph) {
        boolean[] visited = new boolean[graph.length];
        for (int i = 0; i < visited.length; i++) {
            if (!visited[i]) {
                bfsUtils(graph, visited, i);
            }
        }
    }

    public static void bfsUtils(ArrayList<Edge>[] graph, boolean[] visited, int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int curr = queue.remove();

            if (!visited[curr]) { // visiting curr
                System.out.print(curr + " ");
                visited[curr] = true;
                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    queue.add(e.destination);
                }
            }
        }
    }

    public static void dfs(ArrayList<Edge>[] graph) {
        boolean[] visited = new boolean[graph.length];
        for (int i = 0; i < visited.length; i++) {
            if (!visited[i]) {
                dfsUtils(graph, i, visited);
            }
        }

    }

    public static void dfsUtils(ArrayList<Edge>[] graph, int curr, boolean[] visited) {
        // Visit curr
        System.out.print(curr + " ");
        visited[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!visited[e.destination]) {
                dfsUtils(graph, e.destination, visited);
            }
        }
    }

    public static void main(String[] args) {
        // We are not gonna test this code cause only need to create functions to
        // solve this in other algorithms not need to create multiple compnents to test this
//        Just understand the logic
    }
}
