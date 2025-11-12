package Interface.ShapeCalculator;

public interface ShapeCalculator {

double pie = 22.08 / 7.0;

public abstract void areaOfSquare(double sides);
void perimeterOfSquare(double sides);

void areaOfCircle(double rad);
void areaOfTriangle(double base,double height);

public static void message(String name)
{
    System.out.println("Hey ! " + name + " Welcome to Shape Calculator");
}


}
