package battlefield;
/**
* Groupe d'étudiant en IUT, classe 322
* @author Hugues Rieublandou & Simon Bonnin
* @version 1.0
*/ 

public abstract class BattleFieldPieceWise {
	
	int posX;
	int posY;
	/**
	 *  @return position x de la case cible 
	 */
	public int getPosX() {
		return posX;  
	}
	/**
	 * @param position x de la case cible 
	 */
	public void setPosX(int posX) {
		this.posX = posX;
	}
	/**
	 *  @return position y de la case cible 
	 */
	public int getPosY() {
		return posY;
	}
	/**
	 *  @param position y de la case cible 
	 */
	public void setPosY(int posY) {
		this.posY = posY;
	}
	
	public boolean equals(BattleFieldPieceWise bt){
		return (posX == bt.posX && posY == bt.posY && this.getClass().getName() == bt.getClass().getName());		
	}
	
	/** 
	 * @param une autre case à comparer avec la case cible 
	 * @return un boolean qui dit si oui ou non elles sont compatibles 
	 */
	public abstract boolean isCompatible(BattleFieldPieceWise with);
	
	/** 
	 * @return un boolean qui dit si oui ou non la case peut être détruite 
	 */
	public abstract boolean isDestroyable();
}


