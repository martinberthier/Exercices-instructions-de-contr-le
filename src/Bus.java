
public class Bus {

	public static void main(String[] args) {
		
		int nbrPassager = 10;
		
		for (int i = 0; i < 20; i++) {
			
			nbrPassager = nbrPassager + 3;
			
			System.out.println("Nombre total de passager à l'arrêt " + (i+1) + " : "+nbrPassager);
		}
		

	}

}
