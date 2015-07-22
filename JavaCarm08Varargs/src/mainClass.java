public class mainClass {

	public static void main(String[] args) {

		/**
		 * Esistono 2 tipi di polimorfismo: 
		 * 1) Polimorfismo per Metodi 
		 * 2) Polimorfismo per Dati
		 * 
		 * 1) Polimorfismo per Metodi 
		 * Overload --> Sovraccarico 
		 * Override --> Riscrittura
		 */
		Somme s = new Somme();
		int sum = s.somma(2,3,4,5,6,7,8);
		System.out.println(sum);
		

		Cittadino mt = new Cittadino("mario","toscano");
		Cittadino ft = new Cittadino("francesco","toscano");
		
		
		System.out.println(s.somma(mt,ft));
		s.somma(mt,ft);
	}

}
