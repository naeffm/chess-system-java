package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		position = null; //para instanciar a peça fora do tabuleiro
		this.board = board;
	}

	protected Board getBoard() {
		return board;
	}

}
