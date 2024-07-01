import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Kahns_Algorithm {

    static class Edge {
        int src;
        int dest;

        Edge(int s, int d) {
            this.src = s;
            this.dest = d;
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

    public static void calcInDegree(ArrayList<Edge>[] graph, int[] inDegree){
        for (int i = 0; i<graph.length; i++){
            int vertex  = i;
            for (int j = 0; j<graph[i].size(); j++){
                Edge e = graph[i].get(j);
                inDegree[e.dest]++;
            }
        }
    }

    public static void topologicalSort(ArrayList<Edge>[] graph){
        int[] inDegree = new int[graph.length];
        calcInDegree(graph, inDegree);
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i< inDegree.length; i++){
            if (inDegree[i] == 0){
                queue.add(i);
            }
        }

        // BFS
        while (!queue.isEmpty()){
            int curr = queue.remove();
            System.out.print(curr+" ");

            // Traversing edges to decrease inDegrees
            for (int i = 0; i<graph[curr].size(); i++){
                Edge e = graph[curr].get(i);
                inDegree[e.dest]--;
                if (inDegree[e.dest] == 0){
                    queue.add(e.dest);
                }
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Edge>[] graph = new ArrayList[6];
        createGraph(graph);
        topologicalSort(graph);
    }

}



