


public class pairImpair {

	public static void main(String[] args) {
	
		long nbrAlea = Math.round(Math.random() * 100);
		
		System.out.println("Le nombre est: "+nbrAlea);
		
		if (nbrAlea > 0) {
			System.out.println("Il est positif");
		}
		if (nbrAlea < 0) {
			System.out.println("Il est négatif");
		}
		if (nbrAlea == 0) {
			System.out.println("Il est nul");
		}
		if (nbrAlea%2 == 0) {
			System.out.println("Il est pair");
		}
		else {
			System.out.println("Il est impair");
			
		}

		
	}

}
