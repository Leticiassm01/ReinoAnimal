package ReinoAnimal;

public class Aquatico extends Animal{

public Aquatico(String especie, String sexo, String dataNascimento, String tipoAgua, boolean escamas) {
		super(especie, sexo, dataNascimento);
		this.tipoAgua=tipoAgua;
		this.escamas=escamas;
		// TODO Auto-generated constructor stub
	}
private String tipoAgua;
private boolean escamas;


	public String getTipoAgua() {
	return tipoAgua;
}
public void setTipoAgua(String tipoAgua) {
	this.tipoAgua = tipoAgua;
}
public boolean isEscamas() {
	return escamas;
}
public void setEscamas(boolean escamas) {
	this.escamas = escamas;
}
	public void nadar() {
		System.out.println("O animal aquatico está nadando");
	}
	/*
	 * metodo que mostra o animal nadando
	 */

	public void comer() {
		System.out.println("O  animal aquativo esta comendo");
	}
	/*
	 * metodo que mostra que o animal esta comendo
	 */
	
	public void perfil() {
		super.perfil();
		System.out.println("O tipo de agua do animal é " + tipoAgua);
		System.out.println("O Animal" + escamas + " escamas.");
		
	}
	/*
	 * metodo que mostra o perfil do animal aquatico
	 */
	
}
