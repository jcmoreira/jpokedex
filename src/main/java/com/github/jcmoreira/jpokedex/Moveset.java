package com.github.jcmoreira.jpokedex;

import java.util.Objects;

/**
 * A Moveset is composed by a quick {@link Move} and a charge {@link Move}.
 */
public class Moveset {

    private final Move quickMove;
    private final Move chargeMove;

    private Moveset(Move quickMove, Move chargeMove) {
        this.quickMove = quickMove;
        this.chargeMove = chargeMove;
    }

    /**
     * Builds a Moveset from a quick {@link Move} and a charge {@link Move}.
     * @param quickMove The moveset's quick move.
     * @param chargeMove The moveset's charge move.
     * @return A fully initialized moveset.
     */
    public static Moveset of (Move quickMove, Move chargeMove){
        return new Moveset(quickMove, chargeMove);
    }

    /**
     * Gets the moveset's quick move.
     * @return The moveset's quick move.
     */
    public Move quickMove(){
        return quickMove;
    }

    /**
     * Gets the moveset's charge move.
     * @return The moveset's charge move.
     */
    public Move chargeMove(){
        return chargeMove;
    }

    @Override
    public String toString() {
        return quickMove.toString() + "/" + chargeMove.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Moveset that = (Moveset) o;

        return Objects.equals(this.quickMove, that.quickMove) &&
                Objects.equals(this.chargeMove, that.chargeMove);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quickMove, chargeMove);
    }
}
