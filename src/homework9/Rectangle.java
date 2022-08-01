package homework9;

public class Rectangle {
    private String name = "Rectangle";
    private String colour = "White";
    private double square;
    private double perim;

    public void printInfo(){
        System.out.println("Name: " + name + "\nColour: " + colour + "\nSquare: "+ square+ "\nPerimetr: " + perim);
    }
    public void setLeg(double legFirst , double legSecond) {
        square = legFirst * legSecond;
        perim = (legFirst *2 ) + (legSecond*2);
        updateColour();
    }
    private void updateColour() {
        colour = (square > 30 ? "Blue" : "White");
    }
}
