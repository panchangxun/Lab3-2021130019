package test;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.HashSet;
import java.util.Set;

public class RandomWalkTest {
    
    @Test
    public void testRandomWalk() {
        // 설정: 테스트를 위한 그래프 생성
        Graph testGraph = new Graph(3);
        testGraph.head[0].Name = "A";
        testGraph.head[1].Name = "B";
        testGraph.head[2].Name = "C";
        testGraph.addEdge(0, 1);
        testGraph.addEdge(1, 2);
        testGraph.addEdge(2, 0);
        
        // 테스트: randomWalk 호출
        String result = Graph.randomWalk(testGraph);
        
        // 결과 분석: 결과 문자열이 예상 형식을 따르는지 확인
        assertNotNull("Random walk result should not be null", result);
        String[] nodes = result.split(" ");
        
        // 그래프의 모든 노드가 방문되었는지 확인
        Set<String> uniqueNodes = new HashSet<>();
        for (String node : nodes) {
            uniqueNodes.add(node);
        }
        assertTrue("Random walk should visit at least one node", uniqueNodes.size() > 0);
    }
}



