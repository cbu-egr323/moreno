
import java.util.Scanner;
public class TriangleInput
{

    public static void main(String args[]) {
            String sA;
            String sB;
            String sC;

            boolean sAisDouble = false;
            boolean sBisDouble = false;
            boolean sCisDouble = false;


            System.out.println("Please enter 3 number lengths for each side of the" +
                    " triangle. Press enter after each number.");
            while (sAisDouble == false) {
                Scanner sideA = new Scanner(System.in);
                if (sideA.hasNextDouble() || sideA.hasNextInt()) {
                    sA = sideA.nextLine();
                    System.out.println("Side A: " + (sA));
                    sAisDouble = true;
                } else {
                    System.out.println("ERROR! Non-numerical value has been entered. (Side A)");
                }
            }
            //Insert a statement here checking if it is a valid input

            Scanner sideB = new Scanner(System.in);
            sB = sideB.nextLine();
            //Insert a statement here checking if it is a valid input
            System.out.println("Side B: " + (sB));

            Scanner sideC = new Scanner(System.in);
            sC = sideC.nextLine();
            //Insert a statement here checking if it is a valid input
            System.out.println("Side C: " + (sC));

            double test;
            try {
                test = Double.valueOf(sA);
            } catch (NumberFormatException bad) {
                System.out.println("ERROR! Non-numerical value has been entered. (Side A)");
                System.exit(0);
            }
            try {
                test = Double.valueOf(sB);
            } catch (NumberFormatException bad) {
                System.out.println("ERROR! Non-numerical value has been entered. (Side B)");
                System.exit(0);
            }
            try {
                test = Double.valueOf(sC);
            } catch (NumberFormatException bad) {
                System.out.println("ERROR! Non-numerical value has been entered. (Side C)");
                System.exit(0);
            }
            double s1 = Double.valueOf(sA);
            double s2 = Double.valueOf(sB);
            double s3 = Double.valueOf(sC);

            //System.out.println("(Just a temp test) Side A+B+C= " + (s1 + s2 + s3)); //just a temp test

            //**********************************************************************
            //*********Now determining which type of triangle*************************
            if (
                    ((s1 + s2) < s3) ||
                            ((s1 + s3) < s2) ||
                            ((s2 + s3) < s1)) {
                System.out.println("Error, not a valid triangle!");
            } else { //check if invalid, else check for what type it is
                Triangle triangle = new Triangle(s1, s2, s3);

                triangle.isEquilateral();
                triangle.isScalene();
                triangle.isIsosceles();
            }
            //Prompting the user about if they can continue or not

            //Checks for the input of the user


        }

}