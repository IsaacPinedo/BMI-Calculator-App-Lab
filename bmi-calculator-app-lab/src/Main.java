public class Main {
    public static void main(String[] args) {
        // DECLARING VARIABLES TO STORE THE WEIGHT AND HEIGHT VALUES.
        double weight, height;

        // DECLARING VARIABLE TO HOLD THE BMI VALUE.
        double bmi = 0;

        // DECLARING VARIABLE TO HOLD THE BMI SYSTEM VALUE OBTAINED FROM USER INPUT.
        String bmiSystem;

        // DECLARING VARIABLE TO HOLD THE BMI CATEGORY DETERMINED BY THIS BMI CALCULATOR.
        String bmiCategory;

        // DECLARING AND INITIALIZING A REFERENCE VARIABLE TO CREATE AN OBJECT OF THE UserInput() CLASS.
        UserInput userInput = new UserInput();

        // DECLARING AND INITIALIZING A REFERENCE VARIABLE TO CREATE AN OBJECT OF THE BMICalculator() CLASS.
        BMICalculator bmiCalculator = new BMICalculator();

        // INVOKING THE obtainBMISystem() OF THE USERINPUT CLASS.
        bmiSystem = userInput.obtainBMISystem();

        // DECLARING AND INITIALIZING A VARIABLE FOR KEEP RUNNING PROGRAM WHEN A INVALID INPUT OCCURS.
        boolean keep_running = true;

        while (keep_running) {
            // A SWITCH STATEMENT THAT DETERMINES HOW USER INPUT FOR WEIGHT AND HEIGHT SHOULD BE OBTAINED BASED ON THE BMI SYSTEM.
            switch (bmiSystem.toUpperCase()) {
                // THE CASE OF IMPERIAL BMI SYSTEM.
                case "IMPERIAL":
                    // INVOKING THE obtainWeight() METHOD OF THE UserInput() CLASS AND ASSIGN IT TO THE VARIABLE WEIGHT.
                    weight = userInput.obtainWeight(bmiSystem);

                    // INVOKING THE obtainHeight() METHOD OF THE UserInput() CLASS AND ASSIGN IT TO THE VARIABLE HEIGHT.
                    height = userInput.obtainHeight(bmiSystem);

                    // INVOKING THE calculateBmiImperial() METHOD OF THE BMICalculator() CLASS.
                    bmi = bmiCalculator.calculateBmiImperial(weight, height);

                    // STOP WHEN IS A VALID USER INPUT
                    keep_running = false;

                    // BREAK OUT OF THE SWITCH STATEMENT.
                    break;

                // THE CASE OF METRIC BMI SYSTEM
                case "METRIC":
                    // INVOKING THE obtainWeight() METHOD OF THE UserInput() CLASS AND ASSIGN IT TO THE VARIABLE WEIGHT.
                    weight = userInput.obtainWeight(bmiSystem);

                    // INVOKING THE obtainHeight() METHOD OF THE UserInput() CLASS AND ASSIGN IT TO THE VARIABLE HEIGHT.
                    height = userInput.obtainHeight(bmiSystem);

                    // INVOKING THE calculateBmiMetric() METHOD OF THE BMICALCULATOR CLASS.
                    bmi = bmiCalculator.calculateBmiMetric(weight, height);

                    // STOP WHEN IS A VALID USER INPUT
                    keep_running = false;

                    // BREAK OUT OF THE SWITCH STATEMENT.
                    break;

                // THE CASE OF EMPTY BMI SYSTEM DUE TO INVALID USER INPUT.
                case "":
                    // PLEASE DISPLAY A MESSAGE ASKING THE USER TO ENTER A VALID BMI SYSTEM IN CASE OF INVALID INPUT.
                    System.out.println("\nPlease Enter a valid BMI System as input\n");

                    // SETTING A NEW USER INPUT FOR bmiSystem VARIABLE.
                    bmiSystem = userInput.obtainBMISystem();

                    // BREAK OUT OF THE SWITCH STATEMENT.
                    break;
            }
        }

        // DISPLAY THE CALCULATED BMI VALUE TO THE USER.
        System.out.println("Your BMI is: " + bmi);

        // PLEASE INVOKE THE getBMICategory() METHOD OF THE BMICALCULATOR CLASS AND ASSIGN THE RESULT TO THE BMICATEGORY VARIABLE.
        bmiCategory = bmiCalculator.getBMICategory(bmi);

        // Display the BMI category to the user
        System.out.println("Your BMI category is: " + bmiCategory);
    }
}
