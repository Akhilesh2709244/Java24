package question5;

public class Circle implements Area {
	 double radius, area;

	    Circle(double radius) {
	        this.radius = radius;
	    }
        @Override
	    public void compute() {
	        double Pi = 3.14159;
			area = Pi * radius * radius;
	    }

	    public void print() {
	        System.out.println("Area of Circle: " + area);
	    }

	    

}
