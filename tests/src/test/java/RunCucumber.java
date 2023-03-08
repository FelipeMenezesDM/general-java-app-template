import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"configs", "steps"},
        plugin = "json:target/cucumber-reports/cucumber.json",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class RunCucumber {
}
