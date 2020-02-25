package tudelft.gettingstarted;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GettingStartedTest {

    @Test // JUnit framework
    public void addFiveTo20() {  // this is a method public void add5to20 {...}
        int result = new GettingStarted().addFive(20);
        Assertions.assertEquals(25,result);
    }

//    UNCOMMENT THE CODE BELOW, AND FILL THE GAPS!

    @Test
    public void addFiveToOne() {
        int result = new GettingStarted().addFive(1);
        Assertions.assertEquals(6, result);
    }

    @Test
    public void addFiveToMinus20() {
        int result = new GettingStarted().addFive(-20);
        Assertions.assertEquals(-15,result);
    }
}
