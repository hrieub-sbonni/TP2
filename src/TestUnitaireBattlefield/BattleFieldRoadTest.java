package TestUnitaireBattlefield;

import battlefield.*;

public class BattleFieldRoadTest {

	public void testIsCompatible(){
		BattleFieldRoad btf = new BattleFieldRoad(1, 1);
		
		if (btf.isCompatible(new BattleFieldRoad(0, 0)) != true) System.out.println("Erreur compatibilit� road-landscape!");
		else System.out.println("Compatibilit� road-landscape OK");
		if (btf.isCompatible(new BattleFieldRoad(0, 0)) != true) System.out.println("Erreur compatibilit� road-road!");
		else System.out.println("Compatibilit� road-road OK");
		if (btf.isCompatible(new BattleFieldWater(0, 0)) != false) System.out.println("Erreur compatibilit� road-water!");
		else System.out.println("Compatibilit� road-water OK");
	}
	
	public void testIsdestroyable(){
		BattleFieldRoad btf = new BattleFieldRoad(1, 1);
		
		if (btf.isDestroyable() != true) System.out.println("Erreur isDestroyable road!");
		else System.out.println("isDestroyable road OK");
	}
	
	public static void main(String[] args){
		BattleFieldRoadTest btfTest = new BattleFieldRoadTest();
		btfTest.testIsCompatible();
		btfTest.testIsdestroyable();
	}
}