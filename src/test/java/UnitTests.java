import org.testng.Assert;
import org.testng.annotations.Test;

public class UnitTests {

    //a>0, b>0
    @Test
    public void positiveSumTest1() {
        Calculator calc = new Calculator();

        Assert.assertEquals(calc.sum(2,3),5, "Тестовый комментарий...");

    }

    //a=0, b=0
    @Test
    public void positiveSumTest2() {
        Calculator calc = new Calculator();

        Assert.assertEquals(calc.sum(0,0),0);

    }

    //a<0, b>0
    @Test
    public void positiveSumTest3() {
        Calculator calc = new Calculator();

        Assert.assertEquals(calc.sum(-2,3),1);

    }

    //a<0, b<0
    @Test
    public void positiveSumTest4() {
        Calculator calc = new Calculator();

        Assert.assertEquals(calc.sum(-2,-3),-5);

    }

    //a>0, b>0
    @Test
    public void positiveDivTest() {
        Calculator calc = new Calculator();

        Assert.assertEquals(calc.div(4,2),2);
    }

    //a>0, b=0
    @Test
    public void negativeDivTest() {
        final Calculator calc = new Calculator();

        Assert.assertThrows(java.lang.ArithmeticException.class, () -> calc.div(4, 0));
    }

    //a>0, b>0
    @Test
    public void positiveDoubleDivTest1() {
        Calculator calc = new Calculator();

        Assert.assertEquals(calc.divFractionalNum(6.1,2.5), 2.44);
    }

    //a<0, b>0
    @Test
    public void positiveDoubleDivTest2() {
        Calculator calc = new Calculator();

        Assert.assertEquals(calc.divFractionalNum(-6.1,2.5), -2.44);
    }

    //a<0, b<0
    @Test
    public void positiveDoubleDivTest3() {
        Calculator calc = new Calculator();

        Assert.assertEquals(calc.divFractionalNum(-6.1,-2.5), 2.44);
    }

    //a>0, b=0
    @Test
    public void negativeDoubleDivTest1() {
        Calculator calc = new Calculator();

        Assert.assertThrows(java.lang.IllegalArgumentException.class, () -> calc.divFractionalNum(6.1,0));
    }

    //a=0, b=0
    @Test
    public void negativeDoubleDivTest2() {
        Calculator calc = new Calculator();

        Assert.assertThrows(java.lang.IllegalArgumentException.class, () -> calc.divFractionalNum(0.0,0.0));
    }

    //a>0, b>0
    @Test
    public void positiveDoubleSqrtTest1() {
        Calculator calc = new Calculator();

        Assert.assertEquals(calc.squareRoot(4), 2);
    }

    //a=0, b=0
    @Test
    public void positiveDoubleSqrtTest2() {
        Calculator calc = new Calculator();

        Assert.assertEquals(calc.squareRoot(0), 0);
    }

    //a<0
    @Test
    public void negativeDoubleSqrtTest() {
        Calculator calc = new Calculator();

        Assert.assertThrows(java.lang.IllegalArgumentException.class, () -> calc.squareRoot(-4));
    }
}
