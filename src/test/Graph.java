package test;

import java.util.Random;

public class Graph {
    public int vertexNum;
    public Vertex[] head;

    public static class Vertex {
        public String Name;
        public Edge adjacent;
    }

    public static class Edge {
        public int verAdj;
        public Edge next;
    }

    public Graph(int vertexNum) {
        this.vertexNum = vertexNum;
        this.head = new Vertex[vertexNum];
        for (int i = 0; i < vertexNum; i++) {
            this.head[i] = new Vertex();
        }
    }

    public void addEdge(int from, int to) {
        Edge edge = new Edge();
        edge.verAdj = to;
        edge.next = head[from].adjacent;
        head[from].adjacent = edge;
    }

    public static String randomWalk(Graph G) {
        Random rand = new Random();
        int r = rand.nextInt(G.vertexNum);
        StringBuffer string = new StringBuffer();
        int[][] isVisited = new int[G.vertexNum][G.vertexNum];
        for (int i = 0; i < G.vertexNum; i++) {
            for (int j = 0; j < G.vertexNum; j++) {
                isVisited[i][j] = 0;
            }
        }
        try {
            string.append(G.head[r].Name);
            string.append(" ");
            Edge p = G.head[r].adjacent;
            while (p != null) { /** 随机性欠考虑 */
                string.append(G.head[p.verAdj].Name);
                string.append(" ");
                if (isVisited[r][p.verAdj] == 0) {
                    isVisited[r][p.verAdj] = 1;
                    r = p.verAdj;
                    p = G.head[p.verAdj].adjacent;
                } else {
                    break;
                }
            }
        } catch (Exception e) {
            string.append("0");
        }
        return string.toString();
    }
}
