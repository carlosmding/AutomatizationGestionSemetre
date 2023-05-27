package co.edu.udea.gestionSemestre.calidad.stepDefinition;

import co.edu.udea.gestionSemestre.calidad.tasks.OpenThe;
import co.edu.udea.gestionSemestre.calidad.userinterfaces.UserPage;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import groovy.util.logging.Slf4j;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;


public class SimulacionGestionSemestreStepDefinition {

    @Managed(driver= "chrome")
    public WebDriver driver;

    private Actor usuario = Actor.named("Usuario");

    @Before
    public void preStage(){
        driver.manage().window().maximize();
    }

    @Given("^que he ingresado a la pagina de la aplicacion$")
    public void queHeIngresadoALaPaginaDeLaAplicacion() {
        usuario.can(BrowseTheWeb.with(driver));
    }

    @When("^agrego una fecha inicial de semestre$")
    public void agregoUnaFechaInicialDeSemestre() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^agrego una fecha final de semestre$")
    public void agregoUnaFechaFinalDeSemestre() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^agrego fecha de evaluaciones finales$")
    public void agregoFechaDeEvaluacionesFinales() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^agrego fecha del cuarenta porciento evaluado$")
    public void agregoFechaDelEvaluado(int arg1) {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^agrego fecha de validaciones$")
    public void agregoFechaDeValidaciones() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^selecciono el botón agregar$")
    public void seleccionoElBotonAgregar() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^se graba el semestre académico$")
    public void seGrabaElSemestreAcademico() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
