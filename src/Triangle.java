
public class Triangle
{

    private boolean isEquilateral = false;
    private boolean isScalene = false;
    private boolean isIsosceles = false;
    private boolean isNotTriangle = true;
    //private boolean invalidTri = false;
    private double s1;
    private double s2;
    private double s3;

    //******************************************************************
    public Triangle(double sideA, double sideB, double sideC){
        this.s1 = sideA;
        this.s2 = sideB;
        this.s3 = sideC;
    }
    //******************************************************************
    public boolean isNotTriangle(){
        //*********Now determining which type of triangle*************************
        if (
                ((s1 + s2) < s3) ||
                        ((s1 + s3) < s2) ||
                        ((s2 + s3) < s1)) {
            System.out.println("The triangle is invalid");
        }else {
            isNotTriangle = false;
        }
        return  isNotTriangle;
    }
    //******************************************************************
    //All three sides are the same
    public boolean isEquilateral() {
        if ((s1 == s2) && (s2 == s3) )  {
            isEquilateral = true;
            System.out.println("The triangle is EQUILATERAL!");
        }
        return isEquilateral;
    }
    //******************************************************************
    //None of the sides are equal
    public boolean isScalene() {
        if ( (s1 != s2) && (s1 != s3) && (s2 != s3)) {

            isScalene = true;
            System.out.println("The triangle is SCALENE!");
        }
        return isScalene;
    }
    //******************************************************************

    public boolean isIsosceles() {
        if (
                ( (s1 == s2) || (s1 != s3) ) ||
                ( (s1 == s3) || (s1 != s2) ) ||
                ( (s2 == s3) || (s2 != s1) ) ) {
            isIsosceles = true;
            System.out.println("The triangle is ISOSCELES!");
        }
        return isIsosceles;
    }

}