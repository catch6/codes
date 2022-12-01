package net.wenzuo.codes.designpattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Catch
 * @since 2022-04-12
 */
public class PieceFactory {

    private static final Map<String, Piece> MAP = new HashMap<>();

    public static Piece getPiece(String color) {
        Piece piece = MAP.get(color);
        if (piece != null) {
            return piece;
        }
        piece = new Piece(color);
        MAP.put(color, piece);
        return piece;
    }

}