
public class Principal {
	
	/**
	 * La clase Principal es un ejemplo que muestra el uso de la clase Flechas.
	 * Crea instancias de la clase Flechas y realiza operaciones en ellas.
	 */
	Flechas flecha1, flecha2, flecha3;
	 public static void main(String [] args) {
		 
		 Principal miPrincipal= new Principal();
	 }
	 
	 /**
	  * El constructor de la clase Principal.
	  * Crea instancias de la clase Flechas y realiza operaciones en ellas.
	  */
	 public Principal() {
		 flecha1=new Flechas();
		 flecha1.construirFlecha();
		 flecha1.imprimirEspacio();
		 
		 flecha2=new Flechas();
		 flecha2.longitud=34;
		 flecha2.color="rojo";
		 flecha2.construirFlecha();
		 
		 flecha3=new Flechas(12, "negro");
		 flecha3.imprimirEspacio();
		 flecha3.construirFlecha();
		
		 
	 }

}
