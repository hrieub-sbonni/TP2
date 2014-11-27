package battlefield;
import java.util.HashMap;

import exception.*;


/**
* Groupe d'étudiant en IUT, classe 322
* @author Hugues Rieublandou & Simon Bonnin
* @version 1.0
*/

public class BattleFieldMatrix<GenericData extends BattleFieldPieceWise> {
	
	private HashMap<Integer, HashMap<Integer,GenericData> > mat ;
	
	
	
	/**
	 * @param mat HashMap contenant les BattleFieldPiesceWises
	 * @return la matrice créée
	*/
	public BattleFieldMatrix(HashMap<Integer, HashMap<Integer, GenericData>> mat) {
		this.mat = mat;
	}

	/**
	 * @param numeroLigne de la case
	 * @param numeroColonne de la case
	 * @return l'adresse de la case
	 * @throws ExceptionLigneCase si l'indice la ligne est invalide (<0)
	 * @throws ExceptionColonneCase si l'indice la colonne est invalide (<0)
	 */
	public GenericData get(int numeroLigne, int numeroColonne) throws ExceptionLigneCase{

		try {
			if (numeroColonne < 0) throw new ExceptionColonneCase(numeroColonne);
			if (numeroLigne < 0) throw new ExceptionLigneCase(numeroLigne);
		} 
		catch (ExceptionColonneCase e) {
				e.printStackTrace();
			}
		if (exists(numeroLigne, numeroColonne)){
			return (mat.get(numeroLigne).get(numeroColonne));
		}
		else return null;
	}
	
	/**
	 * @param numeroLigne de la case
	 * @param numeroColonne de la case
	 * @param data la donnée générique contenue dans la case
	 * @throws ExceptionLigneCase si l'indice la ligne est invalide (<0)
	 * @throws ExceptionColonneCase si l'indice la colonne est invalide (<0)
	 */
	public void set(int numeroLigne, int numeroColonne, GenericData data) throws ExceptionLigneCase{
		try {
			if (numeroColonne < 0) throw new ExceptionColonneCase(numeroColonne);
			if (numeroLigne < 0) throw new ExceptionLigneCase(numeroLigne);
		} 
		catch (ExceptionColonneCase e) {
				e.printStackTrace();
		}
		
		if (exists(numeroLigne, numeroColonne)){
			mat.get(numeroLigne).put(numeroColonne, data);
		}
	}
	
	/**
	 * @param numeroLigne de la case
	 * @param numeroColonne de la case
	 * @return vrai(true) si la case existe faux(false) dans le cas contraire
	 * @throws ExceptionLigneCase si l'indice la ligne est invalide (<0)
	 * @throws ExceptionColonneCase si l'indice la colonne est invalide (<0)
	 */
	public boolean exists(int numeroLigne, int numeroColonne) throws ExceptionLigneCase{
		
		try {
			if (numeroColonne < 0) throw new ExceptionColonneCase(numeroColonne);
			if (numeroLigne < 0) throw new ExceptionLigneCase(numeroLigne);
		} 
		catch (ExceptionColonneCase e) {
				e.printStackTrace();
		}
		
		if (mat.containsKey(numeroLigne)) {
			return (mat.get(numeroLigne).containsKey(numeroColonne));
		}
		else return false;
	}
}