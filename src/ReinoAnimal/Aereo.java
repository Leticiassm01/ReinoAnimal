package ReinoAnimal;
/**
 * 
 * 
 * Essa classe é responsavel pela especificação de um animal aereo.
 * 
 * 
 * @author Leticia stephanie
 *
 */

public class Aereo extends Animal{
	
	/**
	 * Construtor da classe de animais aereos
	 * @param especie
	 * @param sexo
	 * @param dataNascimento
	 * @param altitude
	 */

	public Aereo(String especie, String sexo, String dataNascimento, String altitude) {
		super(especie, sexo, dataNascimento);
		// TODO Auto-generated constructor stub
		this.altitude=altitude;
	}
	private String altitude;
	public String getAltitude() {
		return altitude;
	}
	public void setAltitude(String altitude) {
		this.altitude = altitude;
	}
	
	public void voar() {
		System.out.println("O animal aereo está voando");
	}
	/*
	 * metodo que mostra o animal voando
	 */
	
	public void comer() {
		System.out.println("O Animal aereo está comendo");
	}
	/*
	 * metodo que mostra que o animal esta comendo
	 */
	
	public void perfil() {
		super.perfil();
		System.out.println("quantidade de animais" + getContador());
		System.out.println("O animal Aereo voa na altutede" + altitude);
		
	}
	/*
	 * metodo que mostra o perfil do animal aereo
	 */
}
