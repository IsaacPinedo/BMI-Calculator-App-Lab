import java.util.Scanner;

// THE UserInput CLASS IMPLEMENTS METHODS THAT ARE USED TO OBTAIN USER INPUTS FOR BMI CALCULATION.
public class UserInput {

    // OBTAINS USER INPUT FOR THE PREFERRED BMI SYSTEM.
    public String obtainBMISystem() {
        // DISPLAY THE WELCOME MESSAGE TO THE USER.
        System.out.println("Welcome to the BMI calculator app!");
        System.out.print("Please select the preferred BMI calculation system (Imperial/Metric):");

        // SCANNER THAT CAPTURES USER INPUT FOR THE PREFERRED BMI SYSTEM.
        Scanner input = new Scanner(System.in);

        // READING THE LINE OF USER INPUT FROM THE SCANNER IN TO A STRING VARIABLE.
        String bmiSystem = input.nextLine();

        // CHECKING IF A VALID BMI SYSTEM HAS BEEN ENTERED BY THE USER.
        if (!(bmiSystem.equalsIgnoreCase("Imperial") ||
                bmiSystem.equalsIgnoreCase("Metric"))) {
            // IF NOT, RETURN AN EMPTY STRING FROM THE METHOD.
            return "";
        }

        // OTHERWISE (IF NOT INVALID) RETURN THE USER ENTERED BMI SYSTEM.
        return bmiSystem;
    }

    // OBTAINS USER INPUT FOR THE WEIGHT IN POUNDS OR KILOS, BASED ON THE ENTERED BMI SYSTEM.
    public double obtainWeight(String bmiSystem) {
        // VARIABLE TO STORE THE WEIGHT VALUE.
        double weight = 0;
        // VARIABLE TO INDICATE IF THE USER INPUT IS VALID OR NOT.
        boolean isInvalidInput = true;

        // THE LOOP THAT CONTROLS OBTAINING USER INPUT FOR WEIGHT UNTIL A VALID VALUE IS ENTERED.
        while (isInvalidInput) {
            // SCANNER THAT CAPTURES USER INPUT FOR THE WEIGHT VALUE.
            Scanner input = new Scanner(System.in);

            // A SWITCH STATEMENT THAT DETERMINES IF WEIGHT SHOULD BE OBTAINED IN POUNDS OR KILOS BASED ON THE BMI SYSTEM.
            switch (bmiSystem.toUpperCase()) {
                // THE CASE OF IMPERIAL BMI SYSTEM.
                case "IMPERIAL":
                    // DISPLAY THE MESSAGE TO OBTAIN WEIGHT IN POUNDS.
                    System.out.print("\nEnter weight in Pounds:");
                    // BREAK OUT OF THE SWITCH STATEMENT.
                    break;
                // THE CASE OF METRIC BMI SYSTEM.
                case "METRIC":
                    // DISPLAY THE MESSAGE TO OBTAIN WEIGHT IN KILOS.
                    System.out.print("\nEnter weight in Kilos:");
                    // BREAK OUT OF THE SWITCH STATEMENT.
                    break;
                // THE CASE OF EMPTY BMI SYSTEM DUE TO INVALID USER INPUT.
                case "":
                    // DISPLAY THE MESSAGE TO ASK THE USER TO ENTER A VALID VALUE FOR BMI SYSTEM.
                    System.out.println("Please Enter a valid BMI System as input");
                    // BREAK OUT OF THE SWITCH STATEMENT.
                    break;
            }

            // AN IF STATEMENT THAT CHECKS IF THE USER HAS ENTERED A VALID VALUE (DOUBLE VALUE) FOR WEIGHT.
            if (input.hasNextDouble()) {
                // READ THE DOUBLE WEIGHT VALUE FROM THE SCANNER OBJECT "INPUT".
                weight = input.nextDouble();
                // SET THAT THE USER INPUT IS NOT INVALID.
                isInvalidInput = false;
            } else {
                // DISPLAY A MESSAGE ASKING THE USER TO INPUT A VALID VALUE, IN CASE OF INVALID USER INPUT.
                System.out.println("\nPlease enter a valid weight\n");
                // SET THE WEIGHT TO 0.
                weight = 0;
            }
        }

        // RETURN THE WEIGHT VALUE.
        return weight;
    }

    // Please implement the obtainHeight() method to obtains user input for the height in Inches or Meters, based on the entered BMI system
    public double obtainHeight(String bmiSystem) {
        // VARIABLE TO STORE THE HEIGHT VALUE.
        double height = 0;
        // VARIABLE TO INDICATE IF THE USER INPUT IS VALID OR NOT.
        boolean isInvalidInput = true;

        // THE LOOP THAT CONTROLS OBTAINING USER INPUT FOR HEIGHT UNTIL A VALID VALUE IS ENTERED.
        while (isInvalidInput) {
            // SCANNER THAT CAPTURES USER INPUT FOR THE HEIGHT VALUE.
            Scanner input = new Scanner(System.in);

            // A SWITCH STATEMENT THAT DETERMINES IF HEIGHT SHOULD BE OBTAINED IN POUNDS OR KILOS BASED ON THE BMI SYSTEM.
            switch (bmiSystem.toUpperCase()) {
                // THE CASE OF IMPERIAL BMI SYSTEM.
                case "IMPERIAL":
                    // DISPLAY THE MESSAGE TO OBTAIN HEIGHT IN POUNDS.
                    System.out.print("\nEnter height in inches:");
                    // BREAK OUT OF THE SWITCH STATEMENT.
                    break;
                // THE CASE OF METRIC BMI SYSTEM.
                case "METRIC":
                    // DISPLAY THE MESSAGE TO OBTAIN HEIGHT IN KILOS.
                    System.out.print("\nEnter height in meters:");
                    // BREAK OUT OF THE SWITCH STATEMENT.
                    break;
                // THE CASE OF EMPTY BMI SYSTEM DUE TO INVALID USER INPUT.
                case "":
                    // DISPLAY THE MESSAGE TO ASK THE USER TO ENTER A VALID VALUE FOR BMI SYSTEM.
                    System.out.println("\nPlease Enter a valid BMI System as input\n");
                    // BREAK OUT OF THE SWITCH STATEMENT.
                    break;
            }

            // AN IF STATEMENT THAT CHECKS IF THE USER HAS ENTERED A VALID VALUE (DOUBLE VALUE) FOR HEIGHT.
            if (input.hasNextDouble()) {
                // READ THE DOUBLE HEIGHT VALUE FROM THE SCANNER OBJECT "INPUT".
                height = input.nextDouble();
                // SET THAT THE USER INPUT IS NOT INVALID.
                isInvalidInput = false;
            } else {
                // DISPLAY A MESSAGE ASKING THE USER TO INPUT A VALID VALUE, IN CASE OF INVALID USER INPUT.
                System.out.println("Please enter a valid height");
                // SET THE HEIGHT TO 0.
                height = 0;
            }
        }

        // RETURN THE HEIGHT VALUE.
        return height;
    }
}
