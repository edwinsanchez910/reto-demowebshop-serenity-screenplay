<<<<<<< HEAD
package com.choucair.retos.runners;
=======
package com.example.retos.runners;
>>>>>>> b1603cb (feat: automate end-to-end purchase flow in Demo Web Shop)

import net.serenitybdd.cucumber.CucumberWithSerenity;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
<<<<<<< HEAD
        features = "classpath:features/reto_choucair.feature",
        glue = "com.choucair.retos.stepdefinitions",
=======
        features = "classpath:features/reto.feature",
                glue = "com.example.retos.stepdefinitions",
>>>>>>> b1603cb (feat: automate end-to-end purchase flow in Demo Web Shop)
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class RunnerTags { }
