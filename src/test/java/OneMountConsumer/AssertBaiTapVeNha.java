package OneMountConsumer;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;

public class AssertBaiTapVeNha {
    @Test
    public void testMethod_Email() {
        String email = "tranhanghy@gmail.com";
        assertThat(email).isNotNull()
                .containsPattern("^[a-z][a-z0-9_\\.]{5,32}@[a-z0-9]{2,}(\\.[a-z0-9]{2,4}){1,2}$")
                .doesNotContain("~!#$%^&(),<>, ");
        //.isEqualToIgnoringWhitespace("tranhanghy@gmai.com");
    }

    @Test
    public void testMethod_Weight() {
        float weight = 50f;
        assertThat(weight).isNotNull()
                .isBetween(1f,200f);
    }

    @Test
    public void testMethod_Identy() {
        String[] array = new String[5];
        array[0] = "145453521";
        array[1] = "033230901";
        array[2] = "145453523";
        array[3] = "033230902";
        array[4] = "033230903";
        for (int i = 0; i < array.length; i++) {
            assertThat(array[i]).isNotEmpty()
                    .hasSize(9)
                    .containsOnlyDigits();
        }
    }
}
