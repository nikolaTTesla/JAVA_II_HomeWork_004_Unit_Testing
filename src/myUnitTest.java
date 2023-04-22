import org.junit.*;

public class myUnitTest {

    //Creating new object of myMath class
    myMath testing = new myMath();
    @org.junit.Test
    public void isTriangleShape() {
        //Unit testing for isTriangleShape function
        boolean output1 = testing.isTriangleShape(22,22,22);
        Assert.assertEquals(true, output1);
    }
    @org.junit.Test
    public void triangleNumber() {
        //Unit testing for triangleNumber function
        int output2 = testing.triangleNumber(11);
        Assert.assertEquals(66, output2);
    }
    @org.junit.Test
    public void squareNumber() {
        //Unit testing for squareNumber function
        int output3 = testing.squareNumber(12);
        Assert.assertEquals(144, output3);
    }
    @org.junit.Test
    public void isSquareNumber() {
        //Unit testing for isSquareNumber function
        boolean output4 = testing.isSquareNumber(16);
        Assert.assertEquals(true, output4);
    }
    @org.junit.Test
    public void isTriangleNumber() {
        //Unit testing for isTriangleNumber function
        boolean output5 = testing.isTriangleNumber(10);
        Assert.assertEquals(true, output5);
    }
}