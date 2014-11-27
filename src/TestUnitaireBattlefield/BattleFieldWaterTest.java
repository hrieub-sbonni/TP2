package TestUnitaireBattlefield;

import battlefield.*;

public class BattleFieldWaterTest {

	public void testIsCompatible(){
		BattleFieldWater btf = new BattleFieldWater(1, 1);
		
		if (btf.isCompatible(new BattleFieldLandScape(0, 0)) != false) System.out.println("Erreur compatibilit� water-landscape!");
		else System.out.println("Compatibilit� water-landscape OK");
		if (btf.isCompatible(new BattleFieldRoad(0, 0)) != false) System.out.println("Erreur compatibilit� water-road!");
		else System.out.println("Compatibilit� water-road OK");
		if (btf.isCompatible(new BattleFieldWater(0, 0)) != true) System.out.println("Erreur compatibilit� water-water!");
		else System.out.println("Compatibilit� water-water OK");
	}
	
	public void testIsdestroyable(){
		BattleFieldWater btf = new BattleFieldWater(1, 1);
		
		if (btf.isDestroyable() != false) System.out.println("Erreur isDestroyable water!");
		else System.out.println("isDestroyable water OK");
	}
	
	public static void main(String[] args){
		BattleFieldWaterTest btfTest = new BattleFieldWaterTest();
		btfTest.testIsCompatible();
		btfTest.testIsdestroyable();
	}
}