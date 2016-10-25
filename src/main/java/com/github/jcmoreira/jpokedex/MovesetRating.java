package com.github.jcmoreira.jpokedex;

import java.util.Objects;
import java.util.Optional;

/**
 * A {@link Moveset}'s rating according to <a href="https://pokemongo.gamepress.gg/">gamepress</a>
 */
public class MovesetRating {

    private String attRank;
    private String defRank;

    private MovesetRating(String attRank, String defRank){
        this.attRank = attRank;
        this.defRank = defRank;
    }

    public static MovesetRating of (String attRank, String defRank){
        return new MovesetRating(attRank, defRank);
    }

    public static MovesetRating unknown(){
        return new MovesetRating(null, null);
    };

    /**
     * The ranking when attacking a gym. May be unknown.
     * @return The ranking when attacking a gym
     */
    public Optional<String> attRank(){
        return Optional.ofNullable(attRank);
    }

    /**
     * The ranking when defending a gym. May be unknown.
     * @return The ranking when defending a gym
     */
    public Optional<String> defRank(){
        return Optional.ofNullable(defRank);
    }

    @Override
    public String toString() {
        return attRank != null ? attRank : "?" + "/" + defRank != null ? defRank : "?";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MovesetRating that = (MovesetRating) o;

        return Objects.equals(this.attRank, that.attRank) &&
                Objects.equals(this.defRank, that.defRank);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attRank, defRank);
    }
}
