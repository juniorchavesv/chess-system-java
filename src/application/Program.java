package application;

import boardgame.Board;
import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {
		
		ChessMatch chessMatch = new ChessMatch();
		
		// INTEFACE USUARIO = UI
		UI.printBoard(chessMatch.getPieces());
		
		
	}

}
