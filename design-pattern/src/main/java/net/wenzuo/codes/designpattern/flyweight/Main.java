package net.wenzuo.codes.designpattern.flyweight;

/**
 * @author Catch
 * @since 2022-04-12
 */
public class Main {

    public static void main(String[] args) {
        Piece blackPiece = PieceFactory.getPiece("黑色");
        Piece whitePiece = PieceFactory.getPiece("白色");

        blackPiece.display(new Location(1, 1));
        whitePiece.display(new Location(2, 2));
    }

}