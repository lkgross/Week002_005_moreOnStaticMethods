package bsu.comp152;

import java.util.Random;

public class Main {

    // A class constant is a value you don't want to change.
    // A convention is to use all caps for a constant name.
    public static final int STANDARD_DIE = 6;

    public static void main(String[] args) {
        // Compiler complains if you try to change a constant.
        // STANDARD_DIE = 7;
        dieRoll();
        /*
         * Call the static method multiSidedDieRoll
         * passing the argument (parameter value)
         * 6 or 12 or ... other number of sides.
         */
        multiSidedDieRoll(STANDARD_DIE);
        multiSidedDieRoll(12);
        System.out.println("You rolled a " + (returnRoll(6) + returnRoll(6)));
        System.out.println("Your wages: " + returnWages(40,
                5, 20));
        System.out.println("Your wages: " + returnWages(39.5,
                0, 20));
        System.out.println(2 + Double.parseDouble("5.337"));
    }

    /**
     * Static method dieRoll -
     * Print the result of rolling a six-sided die.
     */
    public static void dieRoll() {
        Random rand = new Random();
        System.out.println("Your roll is " +
                (rand.nextInt(6) + 1));
    }

    /**
     * multiSidedDieRoll -
     * Print the result of rolling a die with sides
     * faces.
     *
     * @param sides
     */
    public static void multiSidedDieRoll(int sides) {
        Random rand = new Random();
        System.out.println("Your roll is " +
                (rand.nextInt(sides) + 1));
    }

    /**
     * returnRoll -
     * Return the result of rolling a die with sides
     * faces.
     *
     * @param sides
     * @return
     */
    public static int returnRoll(int sides) {
        Random rand = new Random();
        return rand.nextInt(sides) + 1;
    }

    /**
     * returnWages-
     * Return the wages for working an initial number of hours,
     * plus possible overtime, at a given hourly wage, where
     * you get time and a half for overtime.
     */
    public static double returnWages(double initialHours,
                                     double overTimeHours,
                                     double hourlyWage) {
        return initialHours * hourlyWage + overTimeHours * 1.5 * hourlyWage;
    }
}