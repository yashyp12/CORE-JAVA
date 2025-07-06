import java.util.*;




public class HealthApp {
    
    
    // BMI is measure of health on weight . taking our weight in kg, dividing square of our height in meter
    // wjp take weight in pounds height in inches display bmi
    // 1 pound = 0.45359237 kg , 1 inch -> 0.0254 meter
    public static void main (String []args){

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the weight in pounds");
        double kg = sc.nextDouble();
       

        System.out.println("enter the height in inhes");
        double height = sc.nextDouble();

        // we need to convert pounds into kg
        kg =  kg * 0.45359237;

        // converiting inches to meter (1 inch = 0.0254 meter)
        height = height * 0.0254;


        double bmi = kg/(height*height);

        System.out.println("Your BMI is " + " " + bmi);
    }

}
