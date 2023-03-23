import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"configs", "steps"},
        plugin = {"pretty", "json:reports/integration/default.json"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class RunCucumberTests {
}
