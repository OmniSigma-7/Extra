package bsu.comp152;

import org.junit.Test;

public class RectangleTest {
// tried to make a test method to run doesHit
//My guess on whats wrong with the code you sent before is that

    @Test
    public void doesHit(int uleftX, int uleftY, int lRightX, int lRightY) {
        model tester = new model(uleftX, uleftY, lRightX, lRightY);
        assertEquals(new String[][]{new String[]{"Rectanlge overlaps"}});

    }

    private void assertEquals(String[][] strings) {
    }
}

// What's missing is another test to make sure my code runs properly