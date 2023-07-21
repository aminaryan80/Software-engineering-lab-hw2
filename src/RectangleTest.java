import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleTest {

    @Test
    void computeArea() {
        Rectangle r = new Rectangle(4, 5);
        assertEquals(20, r.computeArea());
    }

    @Test
    void setWidth() {
        Rectangle r = new Rectangle(4, 5);
        assertEquals(20, r.computeArea());
        r.setWidth(10);
        assertEquals(50, r.computeArea());
    }

    @Test
    void setHeight() {
        Rectangle r = new Rectangle(4, 5);
        assertEquals(20, r.computeArea());
        r.setHeight(10);
        assertEquals(40, r.computeArea());
    }
}