import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BipartiteGraph {
    static class Edge {
        int source;
        int destination;
//        int weight;

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

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
//        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 2));
//        graph[4].add(new Edge(4, 3));

    }

    public static boolean isBipartiteGraph(ArrayList<Edge>[] graph) {
        int[] coloured = new int[graph.length];
        // color not assigned (-1)
        Arrays.fill(coloured, -1);

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < graph.length; i++) {
            if (coloured[i] == -1) {
                queue.add(i);
                coloured[i] = 0; // Assigning color 1

                while (!queue.isEmpty()) {
                    int curr = queue.remove();
                    for (int j = 0; j < graph[curr].size(); j++) {
                        Edge e = graph[curr].get(j);

                        if (coloured[e.destination] == -1) {
                            int nextColor = coloured[curr] == 0 ? 1 : 0;
                            coloured[e.destination] = nextColor;
                            queue.add(e.destination);
                        } else if (coloured[e.destination] == coloured[curr]) {
                            return false; // NOT bipartite
                        }
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ArrayList<Edge>[] graph = new ArrayList[5];
        createGraph(graph);
        System.out.println(isBipartiteGraph(graph));
    }
}
