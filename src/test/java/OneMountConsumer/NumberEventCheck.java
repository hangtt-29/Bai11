package OneMountConsumer;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NumberEventCheck {
    Caculator c = new Caculator();

    //AssertEquals là xác minh giá trị mong đợi và giá trị thực tế bằng nhau
    @Test
    public void AssertEqualsExplam() {
        //Test will pass
        assertEquals(5, c.Sum(3, 2));
    }

    @Test
    public void AssertEqualsExplam01() {
        assertEquals(3, c.Sub(5, 2));
    }

    @Test
    public void AssertEqualsExplam1() {
        //Test will failed
        assertEquals(5, c.Sum(3, 4));
    }

    @Test
    public void AssertNotEqualsExplam() {
        //Test sẽ Pass
        assertNotEquals(5, c.Sum(2, 4));
    }

    @Test
    public void AssertNotEqualsExplam1() {
        //Test sẽ Failed
        assertNotEquals(5, c.Sum(2, 3));
    }

    @Test
    //ssertArrayEquals() được áp dụng đối với mảng, nó khẳng định rằng mảng mong đợi và mảng thực tế là bằng nhau
    public void assertArrayEqualsExplam() {
        int array1[] = {1, 2, 3};
        int array2[] = {1, 2, 3};
        assertArrayEquals(array1,array2);
    }

    @Test
    //AssertNull là khẳng định object là null. AssertNot Null là khẳng định object đó là not null
    public void asserNull_asserNotNull() {
        String str1 = null;
        String str2 = "Trần Hằng";
        assertNull(str1);
        assertNotNull(str2);
    }

    @Test
    //AssertTrue là đùng để xác minh điều kiện phải trả về là true
    //assertFail dùng để xác minh điều kiện phải trả về là false
    public void asserTrue_assertFailed() {
        assertTrue(5 > c.Sum(2, 2));
        assertFalse(5 > c.Sum(3, 4));
        assertTrue(5 == c.Sub(8, 3));
        assertFalse(8 > c.Sub(10, 1));

    }

    @Test
    //assertSame() khẳng định 2 object có cùng tham chiếu tới chính xác đến cùng 1 object
    public void assertSame_asserNotSame() {
        String str1 = "Trần Hằng";
        String str2 = str1;
        String str3 = "Trần Hà";
        assertSame(str1, str2);
        assertNotSame(str1, str3);
    }


}
