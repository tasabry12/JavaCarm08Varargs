
public class Somme {

	/** Firma di un metodo è data da: 
	* - identificare (nome del metodo) e 
	* - dalla lista di parametri
	* 
	* La lista dei parametri a sua volta può essere:
	* - Tipale: tipi della lista di parametri
	* - Posizionale: posizione della lista dei parametri
	* - Numerico: numero di parametri
	*/
	
	public int somma(int a, int b){
		return a+b;
	}
	
	public int somma(int a, int b, int c){
		return a+b+c;
	}
	
	public double somma(double a, int b){
		return a+b;
	}
	
	public double somma(int a, double b){
		return a+b;
	}
	/**
	 *  Varargs
	 *  Supponiamo di voler creare un metodo "somma" in cui non si ha il vincolo del numero di parametri da passare
	 *  supponiamo di voler sommare degli interi e siano in mumero di "n"
	 */
	
	public int somma (int... numeri){
		int risultato = 0;
		/**
		 * si inizializza una variabile a zero e poi si usa il for each in questo modo
		 */
		for(int t:numeri){
			risultato +=t;			
		}
		return risultato;
		
	}
	
	/**
	 *  Varargs può anche essere esteso agli oggetti
	 *  restituisce un vettore di cittadini e passo quanti cittadini voglio
	 */
	
	public Cittadino[] somma (Cittadino... cittadini){
		Cittadino[] citta=new Cittadino[cittadini.length];
        int i=0;
		for(Cittadino c:cittadini){
			citta[i]=c;		
			i++;
		}
		return citta;
		
	}
	

}
