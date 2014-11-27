package TestUnitaireBattlefield;
import java.util.HashMap;

import exception.ExceptionLigneCase;
import battlefield.*;


public class BattleFieldMatrixTest {
	
	public void testGetter(){
		
		//creation matrice
		BattleFieldLandScape btf1 = new BattleFieldLandScape(0, 0);
		BattleFieldLandScape btf2 = new BattleFieldLandScape(0, 1);
		BattleFieldLandScape btf3 = new BattleFieldLandScape(1, 0);
		BattleFieldLandScape btf4 = new BattleFieldLandScape(1, 1);
		
		HashMap<Integer, HashMap<Integer, BattleFieldPieceWise>> mat = new HashMap<Integer, HashMap<Integer, BattleFieldPieceWise>>();
		
		HashMap<Integer, BattleFieldPieceWise> ligne0 = new HashMap<Integer, BattleFieldPieceWise>();
		ligne0.put(0, btf1);
		ligne0.put(1, btf2);
		
		mat.put(0, ligne0);
		
		HashMap<Integer, BattleFieldPieceWise> ligne1 = new HashMap<Integer, BattleFieldPieceWise>();
		ligne1.put(0, btf3);
		ligne1.put(1, btf4);
		
		mat.put(1, ligne1);
		
		BattleFieldMatrix<BattleFieldPieceWise> matrice = new BattleFieldMatrix<BattleFieldPieceWise>(mat);
		
		//test
		
		try {
			if(matrice.get(0, 0).equals(btf1)) System.out.println("Getter (0,0) OK!");
			else System.out.println("Erreur Getter (0,0)!");
			
			if(matrice.get(0, 1).equals(btf2)) System.out.println("Getter (0,1) OK!");
			else System.out.println("Erreur Getter (0,1)!");
			
			if(matrice.get(1, 0).equals(btf3)) System.out.println("Getter (1,0) OK!");
			else System.out.println("Erreur Getter (1,0)!");
			
			if(matrice.get(1, 1).equals(btf4)) System.out.println("Getter (1,1) OK!");
			else System.out.println("Erreur Getter (1,1)!");
			
			
		} catch (ExceptionLigneCase e) {
			e.printStackTrace();
		}		
	}
	
	public void testSetter(){
		//creation matrice
		BattleFieldLandScape btf1 = new BattleFieldLandScape(0, 0);
		BattleFieldLandScape btf2 = new BattleFieldLandScape(0, 1);
		BattleFieldLandScape btf3 = new BattleFieldLandScape(1, 0);
		BattleFieldLandScape btf4 = new BattleFieldLandScape(1, 1);
		BattleFieldWater btf5 = new BattleFieldWater(1, 1);
				
		HashMap<Integer, HashMap<Integer, BattleFieldPieceWise>> mat = new HashMap<Integer, HashMap<Integer, BattleFieldPieceWise>>();
				
		HashMap<Integer, BattleFieldPieceWise> ligne0 = new HashMap<Integer, BattleFieldPieceWise>();
		ligne0.put(0, btf1);
		ligne0.put(1, btf2);
				
		mat.put(0, ligne0);
				
		HashMap<Integer, BattleFieldPieceWise> ligne1 = new HashMap<Integer, BattleFieldPieceWise>();
		ligne1.put(0, btf3);
		ligne1.put(1, btf4);
				
		mat.put(1, ligne1);
		BattleFieldMatrix<BattleFieldPieceWise> matrice = new BattleFieldMatrix<BattleFieldPieceWise>(mat);
				
		//test
		try {
			matrice.set(0, 0, btf5);
			if(matrice.get(0, 0).equals(btf5)) System.out.println("Setter OK!");
			else System.out.println("Erreur Setter!");
				
			} catch (ExceptionLigneCase e) {
				e.printStackTrace();
			}
	}	
	
	public void testExists(){
		//creation matrice
		BattleFieldLandScape btf1 = new BattleFieldLandScape(0, 0);
		BattleFieldLandScape btf2 = new BattleFieldLandScape(0, 1);
		BattleFieldLandScape btf3 = new BattleFieldLandScape(1, 0);
		BattleFieldLandScape btf4 = new BattleFieldLandScape(1, 1);

				
		HashMap<Integer, HashMap<Integer, BattleFieldPieceWise>> mat = new HashMap<Integer, HashMap<Integer, BattleFieldPieceWise>>();
				
		HashMap<Integer, BattleFieldPieceWise> ligne0 = new HashMap<Integer, BattleFieldPieceWise>();
		ligne0.put(0, btf1);
		ligne0.put(1, btf2);
				
		mat.put(0, ligne0);
				
		HashMap<Integer, BattleFieldPieceWise> ligne1 = new HashMap<Integer, BattleFieldPieceWise>();
		ligne1.put(0, btf3);
		ligne1.put(1, btf4);
				
		mat.put(1, ligne1);
		BattleFieldMatrix<BattleFieldPieceWise> matrice = new BattleFieldMatrix<BattleFieldPieceWise>(mat);
		
		//test
		
		try {
			if(matrice.exists(0, 0)) System.out.println("exists(0,0) OK!");
			else System.out.println("Erreur exists(0,0)");
			
			if(matrice.exists(1, 1)) System.out.println("exists(1,1) OK!");
			else System.out.println("Erreur exists(1,1)");
			

			if(!matrice.exists(2, 1)) System.out.println("exists(2,1) OK!");
			else System.out.println("Erreur exists(2,1)");
			
			
			
		} catch (ExceptionLigneCase e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
	
	public static void main(String[] args){
		BattleFieldMatrixTest btmTest = new BattleFieldMatrixTest();
		
		btmTest.testExists();
		btmTest.testGetter();
		btmTest.testSetter();
	
	}
}

