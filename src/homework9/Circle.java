package homework9;

public class Circle {
    private String name = "Circle";
    private String colour = "White";
    private double square;
    private double perim;

    public void printInfo() {
        System.out.println("Name: " + name + "\nColour: " + colour + "\nSquare: " + square + "\nPerimetr: " + perim);
    }

    public void setLeg(double radius) {
        square = Math.PI + Math.pow(radius, 2);
        perim = Math.PI * 2 * radius;
        updateColour();
    }

    private void updateColour() {
        colour = (square > 30 ? "Blue" : "White");
    }
}
