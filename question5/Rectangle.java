package question5;

public class Rectangle implements Area {

    double length, width, area;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void compute() {
        area = length * width;
    }

    public void print() {
        System.out.println("Area of Rectangle: " + area);
    }

}
