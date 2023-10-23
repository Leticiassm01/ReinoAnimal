package ReinoAnimal;

public class Animal {
	public String especie;
	public String sexo;
	public String dataNascimento;
	public int contador=0;

	public Animal(String especie, String sexo, String dataNascimento, int contador) {
		this.sexo = sexo;
		this.especie = especie;
		this.dataNascimento = dataNascimento;
		this.contador = contador;
		contadorPriv();
	}

	public void comer() {
		System.out.println("O ANIMAL ESTÁ COMENDO.");
	}

	public void perfil() {
		System.out.println("O sexo do animal é:"+ sexo);
		System.out.println("A espécie do animal é: "+ especie);
		System.out.println("A data de nascimento do animal : " + dataNascimento);
		
	}
	private void contadorPriv() {
		contador++;
	}
	public void mostrarContador() {
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
