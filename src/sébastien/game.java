package sébastien;

import java.util.Random;
import java.util.ArrayList;



public class game {
	private int[][] gameboard;
	private Random r= new Random();
	
	public game () {
		gameboard = new int [4][4];
	}

	public void printArray(){
		for (int[] x: gameboard){
			System.out.format("%6d%6d%6d%6dn",x[0],x[1],x[2],x[3]);
		}
	}
	
	public void addNewNumber(){
		ArrayList<Integer> emptySpacesX = new ArrayList<integer>();
		ArrayList<Integer> emptySpacesY = new ArrayList<integer>();
		for(int x=0; x<4;x++){
			for(int y=0; y<4;y++){
				if(gameboard[x][y]==0){
					emptySpacesX.add(new Integer (x))
					emptySpacesY.add(new Integer (y))
				}
			}
		}
		int choice =r.nextInt(emptySpaces.sizes());
		int numberChooser =r.nextInt(10); //valeur 0-9
		int newNumber = 1 ;
		if (numberChooser == 0) {
			newNumber = 2;		
		}
		int[]coordinates=emptySpaces.get(choice);
		emptySpaces[coordinates[0]][coordinates[1]]=newNumber;
		
	}
}







