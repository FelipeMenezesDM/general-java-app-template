import br.com.felipemenezesdm.Example;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExampleTest {
    @Test
    public void exampleTestOne() {
        Example example = new Example();
        Assertions.assertThat(example.getString()).isIn("", "teste");
    }
}
