import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class FizzBuzzTest {

    public static final String FIZZ_BUZZ = "FizzBuzz";
    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    private FizzBuzz game;
    @Before
    public void before(){
        game = new FizzBuzz();
    }
    @Test
    public void should_returnNumbers_whenNotAMultiplierOf3or5(){
        game = new FizzBuzz();
        List<String> numberList = game.getNumbers();

        Assert.assertEquals("1",numberList.get(0));
        Assert.assertEquals("5",numberList.get(4));
    }
    @Test
    public void should_returnFizz_whenMultiplierOf3(){
        game = new FizzBuzz();
        List<String> numberList = game.getNumbers();

        Assert.assertEquals(FIZZ,numberList.get(2));
        Assert.assertEquals(FIZZ,numberList.get(5));

    }

    @Test
    public void should_returnFizz_whenMultiplierOf5(){
        game = new FizzBuzz();
        List<String> numberList = game.getNumbers();

        Assert.assertEquals(BUZZ,numberList.get(4));
        Assert.assertEquals(BUZZ,numberList.get(9));

    }

    @Test
    public void should_returnFizz_whenMultiplierOf3or5(){
        game = new FizzBuzz();
        List<String> numberList = game.getNumbers();

        Assert.assertEquals(FIZZ_BUZZ,numberList.get(14));
        Assert.assertEquals(FIZZ_BUZZ,numberList.get(29));

    }
}
