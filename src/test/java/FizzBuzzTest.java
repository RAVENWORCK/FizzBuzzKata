import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {
    @Test
    public void give_1_should_return_1() {

        //given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        int result = fizzBuzz.play(1);
        //then
        Assert.assertEquals(1 , result);
    }

    @Test
    public void give_2_should_return2() {

    }
}
