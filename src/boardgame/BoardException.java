package boardgame;

public class BoardException extends RuntimeException{
	//adicionando o numero da versão
	private static final long serialVersionUID = 1L;
	
	//construtor que recebe a mensagem
	public BoardException(String msg) {
		super(msg);
	}
}
