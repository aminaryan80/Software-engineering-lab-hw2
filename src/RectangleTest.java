import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleTest {

    @Test
    void computeArea() {
        Rectangle r = new Rectangle(4, 5);
        assertEquals(20, r.computeArea());
    }
}