package powerpackage;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PowerTest {
    @Test
    public void oneRaisedToOneIsOne(){
        assertEquals(Power.of(1,1),1);
    }
    @Test
    public void twoRaisedToOneIsTwo(){
        assertEquals(Power.of(2,1),2);
    }
    @Test
    public void twoRaisedToTwoIsFour(){
        assertEquals(Power.of(2,2),4);
    }
    @Test
    public void threeRaisedToTwoIsNine(){
        assertEquals(Power.of(3,2),9);
    }
}