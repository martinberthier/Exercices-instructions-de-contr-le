import java.util.Scanner;

public class MenuKeys {

	public static void main(String[] args) {
		
		System.out.println("A pour afficher, Q pour quitter, C pour créer et S pour supprimer");

		Scanner clavier = new Scanner(System.in);
		
		while (true) {
			
			char commande = clavier.nextLine().toUpperCase().charAt(0);
		
			switch (commande) {
			
			case 'A' : System.out.println("Afficher");
			break;
			
			case 'Q' : System.exit(0) ; clavier.close();
			break;
	
			case 'C' : System.out.println("Créer");
			break;
			
			case 'S' : System.out.println("Supprimer");
			break;
			
			default : System.out.println("Erreur");
			}
			
		}
		
	}

}


