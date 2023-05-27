package co.edu.udea.gestionSemestre.calidad.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/resources/features/gestion_semestre.feature",
        glue="co.edu.udea.gestionSemestre.calidad.stepdefinition",
        snippets = SnippetType.CAMELCASE
)
public class SimulacionGestionSemestre {
}
