import java.util.ArrayList;

public class DetectCycle_Undirected {

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
        // graph[0].add(new Edge(0, 2, 1));
        graph[0].add(new Edge(0, 3, 1));

        // 1 -vertex
        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 2, 1));

        // 2 -vertex
        // graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 1, 1));

        // 3 -vertex
        graph[3].add(new Edge(3, 0, 1));
        graph[3].add(new Edge(3, 4, 1));

        // 4 -vertex
        graph[4].add(new Edge(4, 3, 1));
    }

    public static boolean detectCycle(ArrayList<Edge>[] graph) {
        boolean[] visited = new boolean[graph.length];
        for (int i = 0; i < visited.length; i++) {
            if (!visited[i]) {
                if (detectCycleUtils(graph, i, visited, -1)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean detectCycleUtils(ArrayList<Edge>[] graph, int curr, boolean[] visited, int parent) {
        visited[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);

            // Case 3 - if Node is not visited after visiting it detected cycle
            if (!visited[e.destination]) {
                if (detectCycleUtils(graph, e.destination, visited, curr)) {
                    return true;
                }
            }

            // Case 1 - if node is visited but it is not parent
            else if (visited[e.destination] && e.destination != parent) {
                return true;
            }

            // Case 2 - if node is visited and it is parent then [Do nothing eat 5 star]
        }

        // At end if any condition is not true return false
        return false;
    }


    public static void main(String[] args) {
        int v = 5;
        ArrayList<Edge>[] graph = new ArrayList[v];
        createGraph(graph);
        System.out.println(detectCycle(graph));
    }
}
