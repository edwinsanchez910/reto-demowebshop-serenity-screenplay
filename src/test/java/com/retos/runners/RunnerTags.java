package com.retos.runners;

import net.serenitybdd.cucumber.CucumberWithSerenity;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "classpath:features/reto.feature",
        glue = "com.retos.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class RunnerTags { }
