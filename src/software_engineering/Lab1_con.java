package software_engineering;

import java.util.Random;

public class Lab1_con {
    private static int vertexNum = 5; // 예시로 5개의 정점
    private static Node[] head; // 정점 배열

    static {
        // 초기화 예시
        head = new Node[vertexNum];
        for (int i = 0; i < vertexNum; i++) {
            head[i] = new Node();
            head[i].Name = "Node" + i;
            // 인접 리스트 초기화 등 추가 설정
        }
    }

    public static String randomWalk() {
        Random rand = new Random();
        int r = rand.nextInt(vertexNum);
        StringBuilder string = new StringBuilder();
        int[][] isVisited = new int[vertexNum][vertexNum];
        
        for (int i = 0; i < vertexNum; i++) {
            for (int j = 0; j < vertexNum; j++) {
                isVisited[i][j] = 0;
            }
        }
        
        try {
            string.append(head[r].Name).append(" ");
            Edge p = head[r].adjacent;
            while (p != null) {
                string.append(head[p.verAdj].Name).append(" ");
                if (isVisited[r][p.verAdj] == 0) {
                    isVisited[r][p.verAdj] = 1;
                    r = p.verAdj;
                    p = head[p.verAdj].adjacent;
                } else {
                    break;
                }
            }
        } catch (Exception e) {
            string.append("0");
        }
        return string.toString();
    }

    static class Node {
        String Name;
        Edge adjacent;
    }

    static class Edge {
        int verAdj;
        Edge next;
    }
}
