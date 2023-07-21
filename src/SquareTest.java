import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SquareTest {
    @Test
    void computeArea() {
        Square square = new Square(5);
        assertEquals(25, square.computeArea());
    }
}