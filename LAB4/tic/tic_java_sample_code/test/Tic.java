public class Tic {
	String[][] board;
	int rows;
	int cols;
	String turn;
	
	public Tic(int row, int col) {
		board = new String[row][col];
		rows = row;
		cols = col;
		turn = "X";
		for(int i = 0; i<row; i++) {
			for(int j = 0; j<col; j++) {
				board[i][j] = "_";
			}
		}
	}

	 public static int boardSize(int row,int col){
        return row*col;
    }
	public int rowNumber(){
		return this.rows;
	}

	public int colsNumber(){
		return this.cols;
	}
	public boolean isempty(int rows,int cols){
		boolean sup = true;
		for (int i = 0; i < rows ; i++) {
			for (int j = 0; j < cols; j++) {
				if (board[i][j] != "_") {
					sup = false;
					break;
				}
			}
		}
		return sup;

	}
   

}