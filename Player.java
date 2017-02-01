public class Player extends Board{
	
	static int x;
	static int y;
	boolean alive;
	int arrows;
	boolean treasure;
	static String command;
	
	public Player(){
		alive = true;
		arrows = 8;
		treasure = false;	
	}
	
	public static int getX(){
		return x;
	}
	
	public static int getY(){
		return y;
	}
	
	public static void moveUp(int[][] board){
		board[getX()][getY()] = 0;
		board[getX()+1][getY()] = 9;
		//setX(getX()+1);
	}
	
	public static void moveDown(int[][] board){
		board[getX()][getY()] = 0;
		board[getX()-1][getY()] = 9;
		//setX(getX()-1);
	}
	public static void moveLeft(int[][] board){
		board[getX()][getY()] = 0;
		board[getX()][getY()-1] = 9;
		//setY(getY()-1);
	}
	public static void moveRight(int[][] board){
		board[getX()][getY()] = 0;
		board[getX()][getY()+ 1] = 9;
		//setY(getY()+1);
	}
	
	
	public static void runWumpusGame(int[][] board){
	   if(command.equals("u")){
    		moveUp(board);
    		Treasure.notify();
    		Wumpus.notify();
       }
	   if(command.equals("d")){
	    	moveDown(board);
	    	Treasure.notify();
	    	Wumpus.notify();
	   }
	   if(command.equals("l")){
	  	    moveLeft(board);
	  	    Treasure.notify();
	  	    Wumpus.notify();
	   }
	   if(command.equals("r")){
	  	  moveRight(board);
	  	  Treasure.notify();
	  	  Wumpus.notify();
	   }
   }
	 
	public static void enterCommand(int [][] board){
		command = EasyIn.getString();
	    
		 while(!command.equals("q")){
		  
		    if(!command.equals("u") && !command.equals("d") 
		      && !command.equals("l") && !command.equals("r") ){
		       System.out.println("Invalid command. Please try again.");
		       System.out.println("Enter a command: u, d, l, r, or q");
			       command = EasyIn.getString();
		        }
		    else{
		    	runWumpusGame(board);
			    System.out.println("Enter a command: u, d, l, r, or q");
			    command = EasyIn.getString();
		      }
	     }   

	     if(command.equals("q")){
	    	 System.out.println("Quit. Game over.");
	     }
	}
	
	
	
	
	
	
}