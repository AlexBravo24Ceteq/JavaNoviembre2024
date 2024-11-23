package com;

public class Licuadora extends TarjetadeControl{
	
	private String motror;
	private String materialBaso;
	private String  materialCuchilla;
	private boolean cuchillaRepuesto;
	
	public Licuadora() {}

	public Licuadora(String marca, String modelo, int velocidades, double prcio, String motror, String materialBaso,
			String materialCuchilla, boolean cuchillaRepuesto) {
		super(marca, modelo, velocidades, prcio);
		this.motror = motror;
		this.materialBaso = materialBaso;
		this.materialCuchilla = materialCuchilla;
		this.cuchillaRepuesto = cuchillaRepuesto;
	}
	
	public String getMotror() {
		return motror;
	}
	
	public void setMotror(String motror) {
		this.motror = motror;
	}
	
	public String getMaterialBaso() {
		return materialBaso;
	}
	
	public void setMaterialBaso(String materialBaso) {
		this.materialBaso = materialBaso;
	}
	
	public String getMaterialCuchilla() {
		return materialCuchilla;
	}
	
	public void setMaterialCuchilla(String materialCuchilla) {
		this.materialCuchilla = materialCuchilla;
	}
	
	public boolean isCuchillaRepuesto() {
		return cuchillaRepuesto;
	}
	
	public void setCuchillaRepuesto(boolean cuchillaRepuesto) {
		this.cuchillaRepuesto = cuchillaRepuesto;
	}
	
	@Override
	public String toString() {
		return "Licuadora [motror=" + motror + ", materialBaso=" + materialBaso + ", materialCuchilla=" + materialCuchilla
				+ ", cuchillaRepuesto=" + cuchillaRepuesto + ", toString()=" + super.toString() + "]";
	}

}
