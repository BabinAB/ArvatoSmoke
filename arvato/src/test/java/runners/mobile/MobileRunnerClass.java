package runners.mobile;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions( features = "src/test/java/features/mobile",
        glue = {"steps", "mobilehooks"},
        tags = "@mobile",
        dryRun = false,
        strict = false,
        monochrome = true,
        snippets = CucumberOptions.SnippetType.CAMELCASE)
public class MobileRunnerClass {

}
