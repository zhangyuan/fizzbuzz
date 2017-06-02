import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class FizzBuzzTest {
    @Test
    public void should_return_1_given_1_and_1() throws Exception {
        FizzBuzz fizzBuzz = new FizzBuzz(1);
        assertArrayEquals(new String[]{"1"}, fizzBuzz.perform());
    }

    @Test
    public void should_return_Fizz_given_1_and_3() throws Exception {
        FizzBuzz fizzBuzz = new FizzBuzz(3);
        assertArrayEquals(new String[]{"1", "2", "Fizz"}, fizzBuzz.perform());
    }

    @Test
    public void should_return_Buzz_given_1_and_3() throws Exception {
        FizzBuzz fizzBuzz = new FizzBuzz(5);
        assertArrayEquals(new String[]{"1", "2", "Fizz", "4", "Buzz"}, fizzBuzz.perform());
    }

    @Test
    public void should_return_FizzBuzz_given_1_and_15() throws Exception {
        FizzBuzz fizzBuzz = new FizzBuzz(15);
        assertArrayEquals(new String[]{
                "1", "2", "Fizz",
                "4", "Buzz", "Fizz",
                "7", "8", "Fizz",
                "Buzz", "11", "Fizz",
                "13", "14", "FizzBuzz"
        }, fizzBuzz.perform());
    }
}
