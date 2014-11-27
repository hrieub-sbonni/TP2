package battlefield;
/**
* Groupe d'étudiant en IUT, classe 322
* @author Hugues Rieublandou & Simon Bonnin
* @version 1.0
*/

public class BattleFieldWater extends BattleFieldPieceWise {
	
	public BattleFieldWater (int posX, int posY){
		this.posX = posX;
		this.posY = posY;
	}
	@Override
	public boolean isCompatible(BattleFieldPieceWise with) {
		
		return (with.getClass().getName().equals("battlefield.BattleFieldWater"));		
	}

	@Override
	public boolean isDestroyable() {
		return false;
	}
	
	
}
