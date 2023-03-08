import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"configs", "steps"},
        plugin = "json:target/reports/application-test-report.json",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class RunCucumber {
}
