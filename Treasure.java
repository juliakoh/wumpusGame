public class Treasure extends Player{
	
	static int x = (int)(Math.random() * 19 + 0);
	static int y = (int)(Math.random() * 19 + 0);
	
	//use Treasure location
	public static void setLocation(int[][] board){
		board[x][y] = 7;
	}
	
	public static int getX(){
		return x;
	}
	
	public static int getY(){
		return y;
	}
	
	
	//use Player location and test
	public static void notify(int [][] board){
		if(board[Player.getX()-1][Player.getY()] == 7 || 
		   board[Player.getX()][Player.getY()+1] == 7 ||
		   board[Player.getX()+1][Player.getY()] == 7 ||
		   board[Player.getX()][Player.getY()-1] == 7){
		   	   System.out.println("There is a shiny glitteringness");		
	   }
   }
  
}