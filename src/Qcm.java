import java.util.Scanner;

public class Qcm {

	public static void main(String[] args) {
		
		System.out.println("Question 1 : blabla ? A : réponse A, B : réponse B");

		Scanner clavier = new Scanner(System.in);
		
		char commande = clavier.next().toUpperCase().charAt(0);
		
		
		switch (commande) {
		
		case 'A' : System.out.println("Correct");
		break;
		
		case 'B' : System.out.println("Faux");
		break;

		default : System.out.println("Erreur");
		}
		
		
		
		System.out.println("Question 2 : blabla ? A : réponse A, B : réponse B");

		
		
		char commande2 = clavier.next().charAt(0);
		
		
		switch (commande2) {
		
		case 'A' : System.out.println("Correct");
		break;
		
		case 'B' : System.out.println("Faux");
		break;

		default : System.out.println("Erreur");
		}
		
		clavier.close();
		
	}
	

}
