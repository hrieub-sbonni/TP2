package exception;


public class ExceptionColonneCase extends Exception {

	private static final long serialVersionUID = 1L;

	public ExceptionColonneCase(int l){
	    System.out.println("Indice de la colonne invalide : " + l);
	  }  
}
