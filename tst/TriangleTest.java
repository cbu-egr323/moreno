import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {


    @Test
    public void isEquilateralTest(){
        Triangle triangle1 = new Triangle(10, 10, 10);
        Triangle triangle2 = new Triangle(200,200, 200);
        Triangle triangle3 = new Triangle(0.1, 0.1, 0.1);

        Assert.assertEquals(triangle1.isEquilateral(), true);
        Assert.assertEquals(triangle2.isEquilateral(), true);
        Assert.assertEquals(triangle3.isEquilateral(),true);
        Assert.assertNotEquals(triangle1.isEquilateral(), false);
        Assert.assertNotEquals(triangle2.isEquilateral(),false);
        Assert.assertNotEquals(triangle3.isEquilateral(), false);
    }

    @Test
    public void isScaleneTest(){
        Triangle triangle1 = new Triangle(1, 1.1, 1.2);
        Triangle triangle2 = new Triangle(50,60, 70);
        Triangle triangle3 = new Triangle(0.3, 0.2, 0.4);


        Assert.assertEquals(triangle1.isScalene(), true);
        Assert.assertEquals(triangle2.isScalene(), true);
        Assert.assertEquals(triangle3.isScalene(),true);
        Assert.assertNotEquals(triangle1.isScalene(), false);
        Assert.assertNotEquals(triangle2.isScalene(),false);
        Assert.assertNotEquals(triangle3.isScalene(), false);
    }

    @Test
    public void isIsoscelesTest(){
        Triangle triangle1 = new Triangle(1, 1, 1.2);
        Triangle triangle2 = new Triangle(60,60, 70);
        Triangle triangle3 = new Triangle(0.3, 0.3, 0.4);


        Assert.assertEquals(triangle1.isIsosceles(), true);
        Assert.assertEquals(triangle2.isIsosceles(), true);
        Assert.assertEquals(triangle3.isIsosceles(),true);
        Assert.assertNotEquals(triangle1.isIsosceles(), false);
        Assert.assertNotEquals(triangle2.isIsosceles(),false);
        Assert.assertNotEquals(triangle3.isIsosceles(), false);


        Triangle triangle4 = new Triangle(1, 1, 1);
        Triangle triangle5 = new Triangle(60,60, 60);
        Triangle triangle6 = new Triangle(0.3, 0.3, 0.3);

        Assert.assertEquals(triangle4.isIsosceles(), true);
        Assert.assertEquals(triangle5.isIsosceles(), true);
        Assert.assertEquals(triangle6.isIsosceles(),true);
        Assert.assertNotEquals(triangle4.isIsosceles(), false);
        Assert.assertNotEquals(triangle5.isIsosceles(),false);
        Assert.assertNotEquals(triangle6.isIsosceles(), false);
    }


}
