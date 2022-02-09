import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

    FizzBuzz subjectUnderTest = new FizzBuzz();

    @Test
    void helloWorld() {
        assertThat(subjectUnderTest.helloWorld()).isEqualTo("hello");
    }
}
