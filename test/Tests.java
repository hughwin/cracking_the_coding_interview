import com.hughwin.cracking.Solutions;
import org.junit.Assert;
import org.junit.Test;

public class Tests {

    @Test
    public void isUniqueTest(){
        Assert.assertTrue(Solutions.isUnique("abcdefg"));
        Assert.assertFalse(Solutions.isUnique("aaabbbbccccddddee"));
    }


}
