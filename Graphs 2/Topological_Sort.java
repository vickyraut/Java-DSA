import java.util.ArrayList;
import java.util.Stack;

public class Topological_Sort {
    static class Edge {
        int source;
        int destination;
        int weight;

        Edge(int s, int d) {
            this.source = s;
            this.destination = d;
//            this.weight = w;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
    }

    // TC=O(V+E)
    public static void topologicalSort(ArrayList<Edge>[] graph) {
        boolean[] visited = new boolean[graph.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < visited.length; i++) {
            if (!visited[i]) {
                topologicalSortUtils(graph, i, visited, stack);
            }
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }

    public static void topologicalSortUtils(ArrayList<Edge>[] graph, int curr, boolean[] visited, Stack<Integer> stack) {
        visited[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);

            if (!visited[e.destination]) {
                topologicalSortUtils(graph, e.destination, visited, stack);
            }

        }
        stack.push(curr);
    }

    public static void main(String[] args) {
        ArrayList<Edge>[] graph = new ArrayList[6];
        createGraph(graph);
        topologicalSort(graph);
    }
}
