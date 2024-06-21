import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph_Traversals {
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

    public static void createGraph(ArrayList<Edge>[] graph) {
        // Initializing Empty Arraylist at every place in graph
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // 0 -vertex
        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        // 1 - vertex
        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));

        // 2 - vertex
        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));

        // 3 - vertex
        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));

        // 4 - vertex
        graph[4].add(new Edge(4, 2, 2));
        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 2));

        // 5 - vertex
        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));

        // 6 - vertex
        graph[6].add(new Edge(6, 5, 1));
    }

    public static void bfs(ArrayList<Edge>[] graph) { // TC = O(V+E)
        Queue<Integer> queue = new LinkedList<>();
        boolean visited[] = new boolean[graph.length];
        // Add source 0
        queue.add(0);

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

    public static void dfs(ArrayList<Edge>[] graph, int curr, boolean visited[]) { // TC = O(V+E)
        // Visit curr
        System.out.print(curr + " ");
        visited[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!visited[e.destination]) {
                dfs(graph, e.destination, visited);
            }
        }
    }

    public static boolean isPath(ArrayList<Edge>[] graph, int src, int dest, boolean[] visited) { // TC = O(V+E)
        if (src == dest) {
            return true;
        }
        // Add curr to visited
        visited[src] = true;

        for (int i = 0; i < graph[src].size(); i++) {
            Edge edge = graph[src].get(i);
            int neighbour = edge.destination;
            // if neighbor knows the route to destination
            if (!visited[neighbour] && isPath(graph, neighbour, dest, visited)) {
                return true;
            }
        }

        // Otherwise
        return false;
    }

    public static void main(String[] args) {
        int v = 7;
        ArrayList<Edge>[] graph = new ArrayList[v];
        System.out.println("I am BFS");
        createGraph(graph);
        bfs(graph);
        System.out.println();
        System.out.println("I am DFS");
        dfs(graph, 0, new boolean[7]);
        System.out.println();
        System.out.println(isPath(graph, 0, 5, new boolean[7]));
    }
}
