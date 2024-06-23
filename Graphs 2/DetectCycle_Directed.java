import java.util.ArrayList;

public class DetectCycle_Directed {
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

    public static void createGraph(ArrayList<Edge>[] graph) {
        // Initializing Empty Arraylist at every place in graph
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

//        CYCLE EXIST

//        graph[0].add(new Edge(0, 2));
//
//        graph[1].add(new Edge(1, 0));
//
//        graph[2].add(new Edge(3, 0));
//
//        graph[3].add(new Edge(3, 0));


//        CYCLE NOT EXIST

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 3));
        graph[2].add(new Edge(2, 3));
    }

    public static boolean detectCycle(ArrayList<Edge>[] graph) {
        boolean[] visited = new boolean[graph.length];
        boolean[] stack = new boolean[graph.length];

        for (int i = 0; i < visited.length; i++) {
            if (!visited[i]) {
                return detectCycleUtils(graph, i, visited, stack);
            }
        }

        return false;
    }

    public static boolean detectCycleUtils(ArrayList<Edge>[] graph, int curr, boolean[] visited, boolean[] stack) {
        visited[curr] = true;
        stack[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (stack[e.destination]) { // Cycle Exist
                return true;
            }

            if (!visited[e.destination] && detectCycleUtils(graph, e.destination, visited, stack)) {
                return true;
            }
        }

        stack[curr] = false;
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Edge>[] graph = new ArrayList[5];
        createGraph(graph);

        System.out.println(detectCycle(graph));
    }
}
