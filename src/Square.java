public class Square implements Shape {
    private int length;

    public Square(int length) {
        this.length = length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int computeArea() {
        return this.length * this.length;
    }
}