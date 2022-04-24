import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {
    @Test
    public void give_1_should_return_1() {

        //given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String result = fizzBuzz.play(1);
        //then
        Assert.assertEquals("1" , result);
    }

    @Test
    public void give_2_should_return_2() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String result = fizzBuzz.play(2);

        Assert.assertEquals("2" , result);
    }

    @Test
    public void give_3_should_return_fizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String result = fizzBuzz.play(3);

        Assert.assertEquals("fizz", result);
    }

    @Test
    public void give_4_return_4() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String result = fizzBuzz.play(4);

        Assert.assertEquals("4" , result);

    }

    @Test
    public void give_5_return_fuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String result = fizzBuzz.play(5);

        Assert.assertEquals("fuzz" , result);
    }

    @Test
    public void give_15_return_fizz_buzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String result = fizzBuzz.play(15);

        Assert.assertEquals("fizz Buzz" , result);
    }
}
