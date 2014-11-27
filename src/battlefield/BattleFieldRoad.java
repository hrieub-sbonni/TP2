package battlefield;
/**
* Groupe d'étudiant en IUT, classe 322
* @author Hugues Rieublandou & Simon Bonnin
* @version 1.0
*/

public class BattleFieldRoad extends BattleFieldPieceWise {
	
	public BattleFieldRoad (int posX, int posY){
		this.posX = posX;
		this.posY = posY;
	}
	
	@Override
	public boolean isCompatible(BattleFieldPieceWise with) {
		boolean res = false;
		if(with.getClass().getName().equals("battlefield.BattleFieldRoad")){
			res=true;
		}
		else if(with.getClass().getName().equals("battlefield.BattleFieldLandScape")){
			res=true;
		}
		return res;
	}

	@Override
	public boolean isDestroyable() {
		return true;
	}

}