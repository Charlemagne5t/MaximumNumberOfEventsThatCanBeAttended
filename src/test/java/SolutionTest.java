import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.xml.transform.SourceLocator;

public class SolutionTest {
    @Test
    public void maxEventsTest1(){
        int[][] events = {
                {1,2},
                {2,3},
                {3,4}
        };
        int expected = 3;
        int actual = new Solution().maxEvents(events);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxEventsTest2(){
        int[][] events = {
                {1,2},
                {2,3},
                {3,4},
                {1,2}
        };
        int expected = 4;
        int actual = new Solution().maxEvents(events);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxEventsTest3(){
        int[][] events = {
                {1,2},
                {1,2},
                {3,3},
                {1,5},
                {1,5}
        };
        int expected = 5;
        int actual = new Solution().maxEvents(events);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxEventsTest4(){
        int[][] events = {
                {1,5},
                {1,5},
                {1,5},
                {2,3},
                {2,3}
        };
        int expected = 5;
        int actual = new Solution().maxEvents(events);

        Assertions.assertEquals(expected, actual);
    }

}
