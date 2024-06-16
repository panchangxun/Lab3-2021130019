package software_engineering;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class RandomWalkTest {

    @Test
    public void testRandomWalkCase1() {
        String result = Lab1_con.randomWalk();
        assertNotNull(result); // 결과가 null이 아닌지 확인
        assertFalse(result.isEmpty()); // 결과가 비어있지 않은지 확인
        System.out.println("실제 출력: " + result);
    }

    @Test
    public void testRandomWalkCase2() {
        String result = Lab1_con.randomWalk();
        assertNotNull(result);
        assertFalse(result.isEmpty());
        System.out.println("실제 출력: " + result);
    }

    @Test
    public void testRandomWalkCase3() {
        String result = Lab1_con.randomWalk();
        assertNotNull(result);
        assertFalse(result.isEmpty());
        System.out.println("실제 출력: " + result);
    }

    @Test
    public void testRandomWalkCase4() {
        String result = Lab1_con.randomWalk();
        assertFalse(result.equals("0")); // 결과가 "0"이 아닌지 확인
        System.out.println("실제 출력: " + result);
    }
}
