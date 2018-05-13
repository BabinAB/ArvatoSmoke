import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = {"steps", "hooks"},
        tags = "@all",
        dryRun = false,
        strict = false,
        monochrome = true,
        snippets = SnippetType.CAMELCASE

)
public class RunnerTest {
}