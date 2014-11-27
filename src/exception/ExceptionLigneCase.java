package exception;


public class ExceptionLigneCase extends Exception {

	private static final long serialVersionUID = 1L;

	public ExceptionLigneCase(int l){
	    System.out.println("Indice de la ligne invalide : " + l);
	  }  
}
