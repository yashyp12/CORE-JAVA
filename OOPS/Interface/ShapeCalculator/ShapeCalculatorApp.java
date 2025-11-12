package Interface.ShapeCalculator;

public class ShapeCalculatorApp implements ShapeCalculator {


    @Override
    public void areaOfCircle(double rad){
        double area = pie * (rad*rad);
        System.out.println(area);
    }


    @Override
    public void areaOfSquare(double sides) {
        double areaSquare = sides * sides;
        System.out.println(areaSquare);
    }

    @Override
    public void perimeterOfSquare(double sides) {

        double perimeterSquare = sides * sides;
        System.out.println(perimeterSquare);
    }

    @Override
    public void areaOfTriangle(double base, double height) {
        double areaTriangle = base*height;
        System.out.println(areaTriangle);
    }
}
