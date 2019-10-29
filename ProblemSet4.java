/**
 * Problem Set 4.
 *
 * It's time to put your skills to the test. This problem set focuses on using
 * iterative control structures. The `main` method is done for you. Lines 30-39
 * trigger each of the predefined methods, which you can think of as self-contained
 * executable pieces of logic. Write your code for each exercise in the
 * corresponding method.
 *
 * The specifications for each exercise are outlined below. Your job is to write
 * lines of code to produce answers to my questions. Each exercise requires that
 * you ask the user to enter one or more values. Your code must meet the
 * requirements set forth in this section (as well as the *Deliverables* section).
 *
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

import java.util.Scanner;

public class ProblemSet4 {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        ProblemSet4 ps = new ProblemSet4();

        // comment out or uncomment as needed

        // ps.sum();
        // ps.reverse();
        // ps.digits();
        // ps.average();
        // ps.prime();
        // ps.fibonacci();
        ps.factors();
        // ps.mario();
        // ps.luigi();
        // ps.credit();

        in.close();
    }

    /*
     * Exercise 1.
     *
     * Prompt the user to enter two integers. The first integer is a lower bound, and
     * the second integer is an upper bound.
     *
     * Compute the sum of all even integers between the lower and upper bounds,
     * including the bounds themselves.
     */

    public void sum() {

            int lowerBound = 1;
            int upperBound = 0;
            int integerSum = 0;

            System.out.println("");

            do {

              System.out.print("Lower bound: ");
              lowerBound = in.nextInt();
              System.out.print("Upper bound: ");
              upperBound = in.nextInt();

            } while (lowerBound > upperBound);

            for (int i = lowerBound; i <= upperBound; i++) {
              if (i % 2 == 0) {
                integerSum += i;
              }
            }
            System.out.printf("\n%,d\n", integerSum);
          }

    /*
     * Exercise 2.
     *
     * Prompt the user to enter a positive integer. Print the digits of this integer
     * in reverse order.
     */

    public void reverse() {

      int inputInteger;
      System.out.print("\n");

        do {

            System.out.print("Positive Integer: ");
            inputInteger = in.nextInt();

        } while (inputInteger < 1);

        String result = Long.toString(inputInteger);
        System.out.print("\n");

        for (int integer = result.length(); integer > 0; integer--) {

            if (integer==1) {
                System.out.printf("%s.\n", result.substring(integer-1, integer));

            } else {
                System.out.printf("%s, ", result.substring(integer-1, integer));
            }
        }
    }

    /*
     * Exercise 3.
     *
     * Prompt the user to enter a positive integer. Compute the sum of all of the odd
     * digits in the integer.
     */

    public void digits() {

      int inputInteger = 0;
      long number = 0;
      long sum = 0;

        System.out.print("\n");

        do {

            System.out.print("Positive integer: ");
            inputInteger = in.nextInt();

        } while (inputInteger <= 0);

        while (inputInteger > 0) {

            number = inputInteger % 10;

            if (number % 2 != 0) {

                sum += number;
                inputInteger /= 10;

            } else {

                inputInteger /= 10;
            }
        }

        System.out.println("\n" + sum + ".");
    }

    /*
     * Exercise 4.
     *
     * Prompt the user to enter a series of non-negative integers. When the user
     * enters a negative integer, you can assume he or she is done entering values.
     * What is the average of the values entered?
     */

    public void average() {

        int inputInteger = 0;
        int total = 0;
        int number = 0;

        System.out.print("\n");

        do {

            System.out.print("Non-negative integer: ");
            inputInteger = in.nextInt();
            in.nextLine();

            if (inputInteger >= 0) {
                total += inputInteger;
                number++;
            }

        } while (inputInteger >= 0);
        int average = (int) total / number;

        System.out.printf("\n%,.2f.\n", average);
    }

    /*
     * Exercise 5.
     *
     * Prompt the user to enter a non-negative integer. Is this number prime?
     */

    public void prime() {

             int inputInteger = 0;
             boolean prime = true;

             System.out.print("\n");

             do {

                 System.out.print("Non-negative integer: ");
                 inputInteger = in.nextInt();

             } while (inputInteger < 0);

             for (int number = 2; number <= inputInteger / 2; ++number) {

                 if (inputInteger % number == 0) {
                     prime = false;
                     break;
                 }
             }

             String output = (prime) ? "Prime" : "Not prime";
             System.out.printf("\n%s.\n", output);
  }

    /*
     * Exercise 6.
     *
     * Prompt the user to enter a positive integer in the range [1, 92]. If the
     * integer the user enters is called n, what is the nth Fibonacci number?
     */

    public void fibonacci() {

        int inputInteger = 0;
        int int1 = 0;
        int int2 = 1;
        int int3 = 1;

        do {

            System.out.print("Positive integer: ");
            inputInteger = in.nextInt();

        } while (inputInteger > 92 || inputInteger < 1);

        for (int number = 1; number < inputInteger; number++) {
            int3 = int1 + int2;
            int1 = int2;
            int2 = int3;
        }

        System.out.printf("\n%d.\n\n", int3);
    }


    /*
     * Exercise 7.
     *
     * Prompt the user to enter a positive integer. What are its factors?
     */

    public void factors() {

      int inputInteger = 0;

        do {

            System.out.print("Positive integer: ");
            inputInteger = in.nextInt();

        } while (inputInteger < 1);

        System.out.printf("\n1, %d", inputInteger);

        for (int number = 2; number <= inputInteger / number; number++) {

            if (inputInteger % number == 0) {

                System.out.printf(", %d, %d", number, inputInteger / number);
            }
        }
        System.out.print(".\n\n");
    }

    /*
     * Exercise 8.
     *
     * Prompt the user to enter an integer between 1 and 24 (inclusive). Print a Super
     * Mario-style half-pyramid of the specified height.
     */

    public void mario() {

    }

    /*
     * Exercise 9.
     *
     * Prompt the user to enter an odd integer between 1 and 24 (inclusive). Print a
     * Super Mario-style full pyramid of the specified height.
     */

    public void luigi() {

    }

    /*
     * Exercise 10.
     *
     * Prompt the user to enter a credit card number (not a real one!). According to
     * Luhn's algorithm, is the credit card number valid?
     */

    public void credit() {

    }
}
