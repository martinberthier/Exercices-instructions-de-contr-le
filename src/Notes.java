
public class Notes {

	public static void main(String[] args) {
	
		double [] notes = {12, 5, 17, 8, 10.5, 16, 18, 2, 20, 0}; 
		
//		OptionalDouble moyenne = Arrays.stream(notes).average();
//		System.out.println("La moyenne est :" + moyenne);
// 		La moyenne est :OptionalDouble[10.85]
		
		  double sommeTotale = 0; 
		  
		  for(int i=0; i<notes.length; i++){
		    sommeTotale = sommeTotale + notes[i];
		  }
		  double moyenne = sommeTotale/notes.length;
		  System.out.println("La note moyenne est :" + moyenne);
		  
		  int echec = 0;
		  int insuffisant = 0;
		  int satisfaisant = 0;
		  int parfait = 0;
		  
		  for (int i = 0; i<notes.length; i++) {
		  if (notes[i] <=5) {
			  
			echec++;
			 
		  } else if (notes[i] <=10){
			  
			  insuffisant++;
			  
		  } else if (notes[i] <=15){
			  
			  satisfaisant++;
			  
		  } else{
			  
			  parfait++;
			  
		  }
		}
		  
		  System.out.println("Il y a " + echec+" mentions Echec");
		  System.out.println("Il y a " + insuffisant+" mentions Insuffisant");
		  System.out.println("Il y a " + satisfaisant+" mentions Satisfaisant");
		  System.out.println("Il y a " + parfait+" mentions Parfait");
		  
	}

}
