package day17;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        String[] chees = {CheesPiece.PAWN_WHITE.getName(),
                CheesPiece.PAWN_WHITE.getName(),
                CheesPiece.PAWN_WHITE.getName(),
                CheesPiece.PAWN_WHITE.getName(),
                CheesPiece.ROOK_BLACK.getName(),
                CheesPiece.ROOK_BLACK.getName(),
                CheesPiece.ROOK_BLACK.getName(),
                CheesPiece.ROOK_BLACK.getName()};

        System.out.println(Arrays.toString(chees));
    }
}