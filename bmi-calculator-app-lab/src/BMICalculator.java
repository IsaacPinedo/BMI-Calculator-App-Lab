// BMICalculator class is a utility class that's used to calculate the BMI value in both Imperial and Metric systems
public class BMICalculator {

    // DECLARING ATTRIBUTES (MEMBER VARIABLES).
    // Using the private access modifier is a core principle of encapsulation in object-oriented programming.
    // This is the entire point of private, to make the internal state of an object off-limits, forcing you to use the approved
    // public methods to modify every member variable.

    // IMPERIAL UNITS.
    private double weight_pounds;
    private double height_inches;

    // METRIC UNITS.
    private double weight_kilos;
    private double height_meters;



    // INITIALIZING ATTRIBUTES (MEMBER VARIABLES) BY USING A NO-ARGUMENT CONSTRUCTOR.
    public BMICalculator() {
        this.weight_pounds = 0;
        this.height_inches = 0;
        this.weight_kilos = 0;
        this.height_meters = 0;
    }

    // IMPLEMENTING calculateBmiImperial() METHOD BY TAKING WEIGHT AND HEIGHT TO CALCULATE AND RETURN THE BMI VALUE IN THE IMPERIAL SYSTEM.
    public double calculateBmiImperial(double weight_pounds, double height_inches) {
        this.weight_pounds = weight_pounds;
        this.height_inches = height_inches;
        return (this.weight_pounds * 703) / (Math.pow(this.height_inches, 2));
    }

    // IMPLEMENTING calculateBmiMetric() METHOD BY TAKING WEIGHT AND HEIGHT TO CALCULATE AND RETURN THE BMI VALUE IN THE METRIC SYSTEM.
    public double calculateBmiMetric(double weight_kilos, double height_meters) {
        this.weight_kilos = weight_kilos;
        this.height_meters = height_meters;
        return this.weight_kilos / Math.pow(this.height_meters, 2);
    }

    // IMPLEMENTING getBMICategory() METHOD SO THAT IT TAKES THE BMI VALUE AND RETURNS THE BMI CATEGORY BASED ON IT.
    public String getBMICategory(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal weight";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
}
