import java.util.Scanner;

public class Ristournes {

	public static void main(String[] args) {
		
		int nombreJean;
		int prixUnite = 15;
		
		
		System.out.println("saisissez le nombre d'article");
		Scanner clavier = new Scanner(System.in); // Récupérer les valeurs entrées dans le clavier
		nombreJean = clavier.nextInt();
		clavier.close();
		
		int prixTotal = prixUnite * nombreJean;
		
		if (nombreJean >=2 && nombreJean < 5)  {
			System.out.println("Vous avez une remise de 10%. Le prix total est de: "+ (prixTotal-(prixTotal *10 / 100))+"euros.");
		} else if (nombreJean >=5 && nombreJean < 10) {
			System.out.println("Vous avez une remise de 30%. Le prix total est de: "+ (prixTotal-(prixTotal *30 / 100))+"euros.");
		} else if (nombreJean >=10) {
			System.out.println("Vous avez une remise de 50%. Le prix total est de: "+ (prixTotal-(prixTotal *50 / 100))+"euros.");
		}

	}

}
