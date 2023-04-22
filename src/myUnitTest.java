import org.junit.*;

public class myUnitTest {

    @org.junit.Test
    public void test() {
        //Creating new object of myMath class
        myMath testing = new myMath();

        //Unit testing for isTriangleShape function
        boolean output1 = testing.isTriangleShape(22,22,22);
        Assert.assertEquals(true, output1);

        //Unit testing for isTriangleShape function
        int output2 = testing.triangleNumber(11);
        Assert.assertEquals(66, output2);

        //Unit testing for squareNumber function
        int output3 = testing.squareNumber(12);
        Assert.assertEquals(144, output3);

        //Unit testing for isSquareNumber function
        boolean output4 = testing.isSquareNumber(16);
        Assert.assertEquals(true, output4);

        //Unit testing for isTriangleNumber function
        boolean output5 = testing.isTriangleNumber(10);
        Assert.assertEquals(true, output5);
    }
}