package ReinoAnimal;

public class Aereo extends Animal{

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
		System.out.println("O animal está voando");
	}
	
	public void comer() {
		System.out.println("O Animal aereo está comendo");
	}
	
	public void perfil() {
		super.perfil();
		System.out.println("quantidade de animais" + contador);
		System.out.println("O animal Aereo voa na altutede" + altitude);
		
	}
}
