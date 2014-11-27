package TestUnitaireBattlefield;

import battlefield.*;

public class BattleFieldLandScapeTest {

	public void testIsCompatible(){
		BattleFieldLandScape btf = new BattleFieldLandScape(1, 1);
		
		if (btf.isCompatible(new BattleFieldLandScape(0, 0)) != true) System.out.println("Erreur compatibilit� landscape-landscape!");
		else System.out.println("Compatibilit� landscape-landscape OK");
		if (btf.isCompatible(new BattleFieldRoad(0, 0)) != true) System.out.println("Erreur compatibilit� landscape-road!");
		else System.out.println("Compatibilit� landscape-road OK");
		if (btf.isCompatible(new BattleFieldWater(0, 0)) != false) System.out.println("Erreur compatibilit� landscape-water!");
		else System.out.println("Compatibilit� landscape-water OK");
	}
	
	public void testIsdestroyable(){
		BattleFieldLandScape btf = new BattleFieldLandScape(1, 1);
		
		if (btf.isDestroyable() != true) System.out.println("Erreur isDestroyable landscape!");
		else System.out.println("isDestroyable landscape OK");
	}
	
	public static void main(String[] args){
		BattleFieldLandScapeTest btfTest = new BattleFieldLandScapeTest();
		btfTest.testIsCompatible();
		btfTest.testIsdestroyable();
	}
}
