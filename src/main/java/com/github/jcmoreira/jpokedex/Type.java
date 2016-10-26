package com.github.jcmoreira.jpokedex;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;


/**
 * Enum representing Pokemon's and Pokemon Move's types
 * @author Joao C H Moreira
 */
public enum Type {
    NORMAL(1, "Normal"),
    FIGHTING(2, "Fighting"),
    FLYING(3, "Flying"),
    POISON(4, "Poison"),
    GROUND(5, "Ground"),
    ROCK(6, "Rock"),
    BUG(7, "Bug"),
    GHOST(8, "Ghost"),
    STEEL(9, "Steel"),
    FIRE(10, "Fire"),
    WATER(11, "Water"),
    GRASS(12, "Grass"),
    ELECTRIC(13, "Electric"),
    PSYCHIC(14, "Psychic"),
    ICE(15, "Ice"),
    DRAGON(16, "Dragon"),
    DARK(17, "Dark"),
    FAIRY(18, "Fairy");

    private final int number;
    private final String name;
    private Set<Type> weaknesses;
    private Set<Type> strengths;

    static {
        NORMAL.strengths = EnumSet.noneOf(Type.class);
        NORMAL.weaknesses = EnumSet.of(FIGHTING);

        FIGHTING.strengths = EnumSet.of(NORMAL);
        FIGHTING.weaknesses = EnumSet.of(FLYING, PSYCHIC, FAIRY);

        FLYING.strengths = EnumSet.of(GRASS, FIGHTING, BUG);
        FLYING.weaknesses = EnumSet.of(ELECTRIC, ICE, ROCK);

        POISON.strengths = EnumSet.of(GRASS, FAIRY);
        POISON.weaknesses = EnumSet.of(GROUND, PSYCHIC);

        GROUND.strengths = EnumSet.of(FIRE, ELECTRIC, POISON, ROCK, STEEL);
        GROUND.weaknesses = EnumSet.of(WATER, GRASS, ICE);

        ROCK.strengths = EnumSet.of(FIRE, ICE, FLYING, BUG);
        ROCK.weaknesses = EnumSet.of(WATER, GRASS, FIGHTING, GROUND, STEEL);

        BUG.strengths = EnumSet.of(GRASS, PSYCHIC, DARK);
        BUG.weaknesses = EnumSet.of(FLYING, FIRE, ROCK);

        GHOST.strengths = EnumSet.of(PSYCHIC, GHOST);
        GHOST.weaknesses = EnumSet.of(GHOST, DARK);

        STEEL.strengths = EnumSet.of(FAIRY, ICE, ROCK);
        STEEL.weaknesses = EnumSet.of(FIGHTING, FIRE, GROUND);

        FIRE.strengths = EnumSet.of(STEEL, BUG, ICE, GRASS);
        FIRE.weaknesses = EnumSet.of(GROUND, ROCK, WATER);

        WATER.strengths = EnumSet.of(FIRE, GROUND, ROCK);
        WATER.weaknesses = EnumSet.of(ELECTRIC, GRASS);

        GRASS.strengths = EnumSet.of(WATER, GROUND, ROCK);
        GRASS.weaknesses = EnumSet.of(FLYING, POISON, BUG, FIRE, ICE);

        ELECTRIC.strengths = EnumSet.of(WATER, FLYING);
        ELECTRIC.weaknesses = EnumSet.of(GROUND, GRASS, STEEL, DRAGON);

        PSYCHIC.strengths = EnumSet.of(FIGHTING, POISON);
        PSYCHIC.weaknesses = EnumSet.of(BUG, GHOST, DARK);

        ICE.strengths = EnumSet.of(GRASS, GROUND, FLYING, DRAGON);
        ICE.weaknesses = EnumSet.of(FIRE, FIGHTING, ROCK, STEEL);

        DRAGON.strengths = EnumSet.of(DRAGON);
        DRAGON.weaknesses = EnumSet.of(ICE, DRAGON, FAIRY);

        DARK.strengths = EnumSet.of(PSYCHIC, GHOST);
        DARK.weaknesses = EnumSet.of(FIGHTING, FAIRY, BUG);

        FAIRY.strengths = EnumSet.of(FIGHTING, DRAGON, DARK);
        FAIRY.weaknesses = EnumSet.of(POISON, STEEL);
    }

    Type(int number, String name) {
        this.number = number;
        this.name = name;
    }

    /**
     * Gets the number representation of the type.
     * @return int representing the type.
     */
    public int number() {
        return number;
    }

    /**
     * Check if this type is weak to target type.
     * @param type Type to check weakness against.
     * @return true if this type is weak to target type.
     */
    public boolean isWeakTo(Type type) {
        return weaknesses.contains(type);
    }

    /**
     * Check if this type is strong to target type.
     * @param type Type to check strength against.
     * @return true if this type is strong to target type.
     */
    public boolean isStrongTo(Type type) {
        return strengths.contains(type);
    }

    /**
     * Get all this type's weaknesses.
     * @return an immutable Set containing all this type weaknesses.
     */
    public Set<Type> weaknesses() {
        return Collections.unmodifiableSet(weaknesses);
    }

    /**
     * Get all thys type's strenghts.
     * @return an immutable Set containing all this type weaknesses.
     */
    public Set<Type> strengths() {
        return Collections.unmodifiableSet(strengths);
    }

    /**
     * Human readable type representation.
     * @return human readable type representation.
     */
    public String toString() {
        return name;
    }

}
