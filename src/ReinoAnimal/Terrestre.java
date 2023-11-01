package ReinoAnimal;

public class Terrestre extends Animal {

	public Terrestre(String especie, String sexo, String dataNascimento, String regiao, boolean pelagem) {
		super(especie, sexo, dataNascimento);
		// TODO Auto-generated constructor stub
		this.pelagem=pelagem;
		this.regiao=regiao;
		
		
	}	
		private String regiao;
		private boolean pelagem;
		
		public String getRegiao() {
			return regiao;
		}
		public void setRegiao(String regiao) {
			this.regiao = regiao;
		}
		public boolean isPelagem() {
			return pelagem;
		}
		public void setPelagem(boolean pelagem) {
			this.pelagem = pelagem;
		}
		
		
		public void mover() {
			System.out.println("O animal terrestre está se movendo.");
		}
		/*
		 * metodo que mostra o animal se movendo
		 */
		
		public void comer() {
			System.out.println("O animal terrestre está comendo");
		}
		/*
		 * metodo que mostra que o animal esta comendo
		 */
		public void perfil () {
			super.perfil();
			System.out.println("O animal é terrestre e da região " + regiao);
			System.out.println("O animal é terresttre tem a pelagem " + pelagem);
		}
		/*
		 * metodo que mostra o perfil do animal terrestre
		 */
}
