import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FizzBuzzTest {

    @Test
    public void should_returnNumbers_whenNotAMultiplierOf3or5(){
        FizzBuzz game = new FizzBuzz();
        List<String> numberList = game.getNumbers();

        Assert.assertEquals("1",numberList.get(0));
    }
}
