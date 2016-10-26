package com.github.jcmoreira.jpokedex;

/**
 * Enum representing Pokemon's families.
 * @author Joao C H Moreira
 */
public enum Family {
    BULBASAUR(1),
    CHARMANDER(4),
    SQUIRTLE(7),
    CATERPIE(10),
    WEEDLE(13),
    PIDGEY(16),
    RATTATA(19),
    SPEAROW(21),
    EKANS(23),
    PIKACHU(25),
    SANDSHREW(27),
    NIDORAN_FEMALE(29),
    NIDORAN_MALE(32),
    CLEFAIRY(35),
    VULPIX(37),
    JIGGLYPUFF(39),
    ZUBAT(41),
    ODDISH(43),
    PARAS(46),
    VENONAT(48),
    DIGLETT(50),
    MEOWTH(52),
    PSYDUCK(54),
    MANKEY(56),
    GROWLITHE(58),
    POLIWAG(60),
    ABRA(63),
    MACHOP(66),
    BELLSPROUT(69),
    TENTACOOL(72),
    GEODUDE(74),
    PONYTA(77),
    SLOWPOKE(79),
    MAGNEMITE(81),
    FARFETCHD(83),
    DODUO(84),
    SEEL(86),
    GRIMER(88),
    SHELLDER(90),
    GASTLY(92),
    ONIX(95),
    DROWZEE(96),
    HYPNO(97),
    KRABBY(98),
    VOLTORB(100),
    EXEGGCUTE(102),
    CUBONE(104),
    HITMONLEE(106),
    HITMONCHAN(107),
    LICKITUNG(108),
    KOFFING(109),
    RHYHORN(111),
    CHANSEY(113),
    TANGELA(114),
    KANGASKHAN(115),
    HORSEA(116),
    GOLDEEN(118),
    STARYU(120),
    MR_MIME(122),
    SCYTHER(123),
    JYNX(124),
    ELECTABUZZ(125),
    MAGMAR(126),
    PINSIR(127),
    TAUROS(128),
    MAGIKARP(129),
    LAPRAS(131),
    DITTO(132),
    EEVEE(133),
    PORYGON(137),
    OMANYTE(138),
    KABUTO(140),
    AERODACTYL(142),
    SNORLAX(143),
    ARTICUNO(144),
    ZAPDOS(145),
    MOLTRES(146),
    DRATINI(147),
    MEWTWO(150),
    MEW(151);

    private final int number;
    private final String name;

    Family(int number) {
        this.number = number;
        this.name = name().charAt(0) + name().substring(0).toLowerCase() + " Family";
    }

    /**
     * Gets the number representation of the family.
     * @return int representing the family.
     */
    public int number(){
        return number;
    }

    /**
     * Human readable family representation.
     * @return human readable family representation.
     */
    public String toString() {
        return name;
    }
}
