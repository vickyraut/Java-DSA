public class Shortest_Path {
    public static float shortest_path(String str) {
        float shortest_path;
        int x = 0;
        int y = 0;
        int x2 = 0;
        int y2 = 0;

        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case 'N' -> y2++;
                case 'S' -> y2--;
                case 'E' -> x2++;
                case 'W' -> x2--;
                default -> {
                    return -1.0f;
                }
            }
        }

        float x_squr = (x2 - x) * (x2 - x);
        float y_squr = (y2 - y) * (y2 - y);

        shortest_path = (float) Math.sqrt(x_squr + y_squr);

        return shortest_path;
    }

    public static void main(String[] args) {
        String path = "WNEENESENNN";
        float s_path = shortest_path(path);

        if (s_path == -1.0f) {
            System.out.println("Invalid direction in path");
        } else {
            System.out.println("Shortest path is: " + s_path);
        }
    }
}
