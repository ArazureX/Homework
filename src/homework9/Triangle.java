package homework9;

public class Triangle {
    private String name = "Triangle";
    private String colour = "White";
    private double square;
    private double perim;

    public void printInfo(){
        System.out.println("Name: " + name + "\nColour: " + colour +  "\nSquare: "+ square+ "\nPerimetr: " + perim);
    }

    public void setLeg(double legFirst , double legSecond, double legThird, double heightToFirstLeg) {
        square = 0.5 * legFirst * heightToFirstLeg;
        perim = legFirst + legSecond + legThird;
        updateColour();
    }

    private void updateColour() {
        colour = (square > 30 ? "Blue" : "White");
    }
}
