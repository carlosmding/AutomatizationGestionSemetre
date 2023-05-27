package co.edu.udea.gestionSemestre.calidad.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class UserPage extends PageObject {
    public static final Target SIMULAR = Target.the("SIMULAR").locatedBy("//*[@id=\"creditos\"]/div/div[1]/div[4]/div/div[2]/div/a[1]");
}
