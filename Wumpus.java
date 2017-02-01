import java.util.Random;

public class Wumpus extends Player{
	static int x = (int)(Math.random() * 19 + 0);
	static int y = (int)(Math.random() * 19 + 0);
	boolean lifeStatus = true;
	
	//use Treasure location
	public static void setLocation(int[][] board){
		board[x][y] = 3;
	}
	
	public static int getX(){
		return x;
	} 
	public static int getY(){
		return y;
	}
	
	public static void notify(int [][] board){
		if(board[Player.getX()-1][Player.getY()] == 3 || 
		   board[Player.getX()][Player.getY()+1] == 3 ||
		   board[Player.getX()+1][Player.getY()] == 3 ||
		   board[Player.getX()][Player.getY()-1] == 3){
		   	   System.out.println("There is a faint Wumpus odor");		
	   }
   }
	
   int adjacentMoveX = (int)(Math.random() * 1 + 0 );
   int adjacentMoveY = (int)(Math.random() * 1 + 0);
   
  public int getRandomSign() {
    Random rand = new Random();
    if(rand.nextBoolean()){
        return -1;
    }
    else{
        return 1;
    }
  }
	
	public void detect(int [][] board){
		if(Player.shoots()){
			if(lifeStatus == true){
					if(board[getX()-1][getY()] == 9){
						board[getX() + adjacentMoveX][getY() + adjacentMoveY * getRandomSign()] = 3;
							
					}
					if(board[getX()+1][getY()] == 9){
						board[getX() - adjacentMoveX][getY() + adjacentMoveY * getRandomSign()] = 3;
					}
					if(board[getX()][getY()-1] == 9){
						board[getX() + adjacentMoveX * getRandomSign()][getY() + adjacentMoveY] = 3;
					}
					if(board[getX()][getY()+1] == 9){
						board[getX() + adjacentMoveX * getRandomSign()][getY() - adjacentMoveY] = 3;
					}			
				}		
			else{
					for(int row = 0; row < BOARD_SIZE; row++){
						for(int col = 0; col < BOARD_SIZE; col++){
							if(board[row][col] == 3){
								board[row][col] = 0;
							}
						}
					}
					System.out.println("CONGRATULATIONS,YOU KILLED THE WUMPUS!!!");
				}
	    }
	}    
}
