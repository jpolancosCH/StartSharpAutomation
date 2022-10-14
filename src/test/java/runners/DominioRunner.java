package runners;


import io.cucumber.junit.CucumberOptions;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;
import utils.datatofeature.BeforeSuite;
import utils.datatofeature.DataToFeature;
import utils.datatofeature.RunnerPersonalizado;

import java.io.IOException;

@RunWith(RunnerPersonalizado.class)
@CucumberOptions(features = {"src/test/resources/features/Dominios.feature"},
        tags = "@Regresion",
        glue = "stepdefinitions",
        plugin = {"pretty", "json:target/cucumber-reports/cucumber.json"},
        snippets = CucumberOptions.SnippetType.CAMELCASE)
public class DominioRunner {
    private DominioRunner() {
    }

    @BeforeSuite
    public static void test() throws InvalidFormatException, IOException {
        DataToFeature.overrideFeatureFiles("src/test/resources/features/Dominios.feature");
    }
}
