package pe.edu.upc.dsd.taxiempresarial.model;


public class Servicio {

    private String cod_Servicio;
    private String fec_servicio;
    private String nom_chofer;
    private String placa_auto;
    private String modelo_auto;
	private String color_auto;
	private String est_auto;
	
	public Servicio() {
		
	}
	
	public String getCod_Servicio() {
		return cod_Servicio;
	}
	public void setCod_Servicio(String codServicio) {
		this.cod_Servicio = codServicio;
	}
	public String getFec_servicio() {
		return fec_servicio;
	}
	public void setFec_servicio(String fec_servicio) {
		this.fec_servicio = fec_servicio;
	}
	public String getNom_chofer() {
		return nom_chofer;
	}
	public void setNom_chofer(String nom_chofer) {
		this.nom_chofer = nom_chofer;
	}
	public String getPlaca_auto() {
		return placa_auto;
	}
	public void setPlaca_auto(String placa_auto) {
		this.placa_auto = placa_auto;
	}
	public String getModelo_auto() {
		return modelo_auto;
	}
	public void setModelo_auto(String modelo_auto) {
		this.modelo_auto = modelo_auto;
	}
	public String getColor_auto() {
		return color_auto;
	}
	public void setColor_auto(String color_auto) {
		this.color_auto = color_auto;
	}
	public String getEst_auto() {
		return est_auto;
	}
	public void setEst_auto(String est_auto) {
		this.est_auto = est_auto;
	}	
}

