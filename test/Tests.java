import com.hughwin.cracking.Solutions;
import org.junit.Assert;
import org.junit.Test;

public class Tests {

    @Test
    public void isUniqueTest(){
        Assert.assertTrue(Solutions.isUnique("abcdefg"));
        Assert.assertFalse(Solutions.isUnique("aaabbbbccccddddee"));
    }

    @Test
    public void isUniqueNoExtraSpace(){
        Assert.assertTrue(Solutions.isUniqueNoExtraSpace("abcdefg"));
        Assert.assertFalse(Solutions.isUniqueNoExtraSpace("aaabbbbccccddddee"));
    }


}
