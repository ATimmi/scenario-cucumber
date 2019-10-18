package hellocucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefs {
	
	AdresseRepository adresseRepositoryToTest = new AdresseRepository();
	String active;
	String pays;
	AdresseModel adresseModel;
	AdresseModel actual;
	
	@Given("un abonné avec une adresse principale inactive en France")
	public void un_abonné_avec_une_adresse_principale_inactive_en_France() {
		actual = adresseRepositoryToTest.read("inactive_France");
	}

	@When("le conseiller connecté à FACE modifie l{string}abonné sans date d’effet")
	public void le_conseiller_connecté_à_FACE_modifie_l_abonné_sans_date_d_effet(String string) {
	    if(actual.getPays().equals("France") && actual.getCanal().equals("FACE")) actual.setCondition("sans date d’effet");
	}

	@Then("l{string}abonné modifiée est enregistrée sur l{string}abonné")
	public void l_abonné_modifiée_est_enregistrée_sur_l_abonné(String string, String string2) {
		if (actual!=null) {
			adresseModel = adresseRepositoryToTest.update(actual);
		}
	}

	@Then("un mouvement de modification d'adresse est créé")
	public void un_mouvement_de_modification_d_adresse_est_créé() {
	}

	@Given("un abonné avec une adresse principale active en Pologne")
	public void un_abonné_avec_une_adresse_principale_active_en_Pologne() {
	}

	@When("le conseiller connecté à EC modifie l{string}abonné avec date d’effet")
	public void le_conseiller_connecté_à_EC_modifie_l_abonné_avec_date_d_effet(String string) {
		if(actual!=null 
				&& actual.getPays() !=null 
				&& actual.getCanal() !=null 
				&& actual.getPays().equals("France") 
				&& actual.getCanal().equals("EC")) 
			actual.setCondition("avec date d’effet");
	}
}
