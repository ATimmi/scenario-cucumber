package hellocucumber;

import java.io.Serializable;

public class AdresseModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String canal;
	private String active;
	private String pays;
	private String condition;
	
	public AdresseModel() {
	}
	
	public AdresseModel(String canal, String active, String pays, String condition) {
		super();
		this.canal = canal;
		this.active = active;
		this.pays = pays;
		this.condition = condition;
	}
	
	public String getCanal() {
		return canal;
	}
	public void setCanal(String canal) {
		this.canal = canal;
	}
	public String getActive() {
		return active;
	}
	public void setActive(String active) {
		this.active = active;
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	
	

}