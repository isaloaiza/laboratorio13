
/**
 * La clase Flechas representa una flecha con longitud y color.
 */
public class Flechas {
	
	int longitud;
	String color;
	
	/**
     * El constructor predeterminado de la clase Flechas.
     * Inicializa la longitud a 18 y el color a "negro".
     */
	public Flechas() {
		longitud=18;
		color= "negro";
	}
	
	
	/**
     * El constructor de la clase Flechas que permite especificar la longitud y el color.
     *
     * @param longitud  La longitud de la flecha.
     * @param color    El color de la flecha.
     */
	
	public Flechas (int longitud, String color) {
		this.longitud=longitud;
		this.color=color;
	}
	
	/**
     * Imprime un espacio en la consola.
     */
	
	public void imprimirEspacio() {
		System.out.println();
	}
	
	/**
     * Construye la representación de la flecha en la consola.
     */
	
	public void construirFlecha() {
		for(int i=0; i < longitud; i++) {
			imprime("-");
		}
		imprime(">");
	}
	
	/**
     * Imprime un símbolo en la consola, teniendo en cuenta el color de la flecha.
     *
     * @param simbolo. El símbolo a imprimir.
     */
	
	private void imprime(String simbolo) {
		if(color.equals("negro")) {
			System.out.print(simbolo);
		}else {
			System.out.print(simbolo);
		}
			
	}
	 
	

}
