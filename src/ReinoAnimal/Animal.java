package ReinoAnimal;

/*
 * @author lele
 * essa classe representa um animal
 */
public class Animal {
	private String especie;
	private String sexo;
	private String dataNascimento;
	private static int contador = 0;

	public Animal(String especie, String sexo, String dataNascimento) {
		this.sexo = sexo;
		this.especie = especie;
		this.dataNascimento = dataNascimento;
		contadorPriv();
	}

	@Override
	public String toString() {
		return "Animal [especie=" + especie + ", sexo=" + sexo + ", nascimento=" + dataNascimento + ", contador="
				+ contador + "]";
	}

	public void comer() {
		System.out.println("O ANIMAL ESTA COMENDO.");
	}

	public void perfil() {
		/**
		 * 
		 * Imprime os dados do animal
		 * 
		 */
		System.out.println("O sexo do animal é:" + sexo);
		System.out.println("A espécie do animal é: " + especie);
		System.out.println("A data de nascimento do animal : " + dataNascimento);

	}

	private static void contadorPriv() {
		contador++;
	}

	public void qtdAnimais() {
		System.out.println("A qtd de animais é " + contador);
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}

}
