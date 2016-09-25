import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class EmptyTest {
    @Test
    public void shouldBeAbleToTest() {
        assertThat(1, is(1));
    }
}
