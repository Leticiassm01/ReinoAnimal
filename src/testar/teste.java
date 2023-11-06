package testar;

import ReinoAnimal.Aereo;
import ReinoAnimal.Aquatico;
import ReinoAnimal.Terrestre;

public class teste {
	public static void main(String[] args) {
		
		Aquatico aquatico1 = new Aquatico("Carcharias taurus", "fEmea","7", "Agua salgada", false);
		Aquatico aquatico2 = new Aquatico("Pygocentrus nattereri", "macho","3", "água doce", true);
		
		
		Terrestre terrestre1 = new Terrestre("Felis Catus", "fEmea", "20", "Asia", true);
		Terrestre terrestre2 = new Terrestre("Hydrochoerus hydrochaeris", "macho","8", "America do Sul", true);
		
		
		Aereo aereo1 = new Aereo("Coragyps atratus", "macho", "3", "54.5");
		Aereo aereo2 = new Aereo("Amazona aestiva", "fêmea", "10", "37.9");
		
		aquatico1.comer();
		aquatico2.comer();
		terrestre1.comer();
		aereo1.comer();
		
		terrestre1.mover();
		aereo1.voar();
		 aquatico1.nadar();
		 
		
		terrestre1.qtdAnimais();
	}
}
