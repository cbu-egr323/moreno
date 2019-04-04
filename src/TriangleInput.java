
import java.util.Scanner;
public class TriangleInput
{

    public static void main(String args[]) {
            String sA = "";
            String sB = "";
            String sC = "";
            double test;

            boolean sAisDouble = false;
            boolean sBisDouble = false;
            boolean sCisDouble = false;

            
            System.out.println("Please enter 3 number lengths for each side of the" +
                    " triangle. Press enter after each number.");
            while (sAisDouble == false) {
                Scanner sideA = new Scanner(System.in);
                sA = sideA.nextLine();
                try {
                    test = Double.valueOf(sA);
                    if(test <= 0) {
                        throw new NumberFormatException();
                    }
                    System.out.println("Side A: " + (sA));
                    break;
                } catch (NumberFormatException bad) {
                    System.out.println("ERROR! Non-numerical value has been entered. (Side A)");
                    System.out.println("Please Enter a valid number");
                }
            }

            //If the user successfully puts a integer / double, then proceed off the while loop
            sAisDouble = true;


            //Moving on to sideB
        while (sBisDouble == false) {
            Scanner sideB = new Scanner(System.in);
            sB = sideB.nextLine();
            try {
                test = Double.valueOf(sB);
                if(test <= 0) {
                    throw new NumberFormatException();
                }
                System.out.println("Side B: " + (sB));
                break;
            } catch (NumberFormatException bad) {
                System.out.println("ERROR! Non-numerical value has been entered. (Side B)");
                System.out.println("Please Enter a valid number");
            }
        }

        //If the user successfully puts a integer / double, then proceed off the while loop
        sBisDouble = true;


            //Moving on to side C
        while (sCisDouble == false) {
            Scanner sideC = new Scanner(System.in);
            sC = sideC.nextLine();
            try {
                test = Double.valueOf(sC);
                if(test <= 0) {
                    throw new NumberFormatException();
                }
                System.out.println("Side C: " + (sC));
                break;
            } catch (NumberFormatException bad) {
                System.out.println("ERROR! Non-numerical value has been entered. (Side C)");
                System.out.println("Please Enter a valid number");
            }
        }

        //If the user successfully puts a integer / double, then proceed off the while loop
        sCisDouble = true;


            double s1 = Double.valueOf(sA);
            double s2 = Double.valueOf(sB);
            double s3 = Double.valueOf(sC);

            //resets all of the conditions before restarting the system again.
            sAisDouble = false;
            sBisDouble = false;
            sCisDouble = false;


            //**********************************************************************
            //*********Now determining which type of triangle*************************

                Triangle triangle = new Triangle(s1, s2, s3);
                boolean canContinue = triangle.isNotTriangle(); //Checks to see if it is a valid triangle


                //If the user enters in a valid triangle, then see what it does here
                if(canContinue == false) {
                    triangle.isEquilateral();
                    triangle.isScalene();
                    triangle.isIsosceles();
                }
            }
            //Prompting the user about if they can continue or not

            //Checks for the input of the user


        }

