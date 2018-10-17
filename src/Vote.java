import java.util.Scanner;


public class Vote {

	public static void main(String[] args) {
		
		System.out.println("Entrez votre âge");
		
		Scanner clavier = new Scanner(System.in); // Récupérer les valeurs entrées dans le clavier
		
		int age = clavier.nextInt();
		
		clavier.close();
		
		if (age>=18) {
			System.out.println("Vous avez le droit de voter.");
		} if (age>=100) {
			System.out.println("Vous êtes très vieux.");
		}else {
			System.out.println("Vous devez avoir 18 ans pour voter.");
		}

	}

}
