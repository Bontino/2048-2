package sébastien;


public class tooh{
	public static void main(String[] args){
		game g=new game();
		g.printArray();
		for(int x=0; x<11;x++){
			g.addNewNumber();
			g.printArray();
		}
	}
}
