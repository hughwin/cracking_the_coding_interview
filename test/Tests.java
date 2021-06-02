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

    @Test
    public void stringPermutation(){
        Assert.assertTrue(Solutions.stringPermutation("thisisapermutation", "permutationisathis"));
        Assert.assertFalse(Solutions.stringPermutation("abcd", "defg"));
    }

    @Test
    public void stringCompression(){
        Assert.assertEquals("a2b1c5a3", Solutions.stringCompression("aabcccccaaa"));
    }

    @Test
    public void withOneSingleChar() {
        Assert.assertEquals("a", Solutions.stringCompression("a"));
    }

    @Test
    public void withThreeChars() {
        Assert.assertEquals("a3", Solutions.stringCompression("aaa"));
    }




}
