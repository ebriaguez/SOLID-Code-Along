public class AreaCalculator {
    private Shape shape;

    public void calculate() {
        shape.calculate();
    }
    private void squareArea(Double height, Double width) {
        System.out.println(height * width);
    }

    private void circleArea(Double radius) {
        System.out.println(radius * radius * 3.14);
    }
}
