package com.github.jcmoreira.jpokedex;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import static com.github.jcmoreira.jpokedex.Type.*;

/**
 * Enum representing Moves
 *
 * @author Joao C H Moreira
 */
public enum Move {
    WRAP(13, "Wrap", NORMAL, 20, 25, 4000),
    HYPER_BEAM(14, "Hyper Beam", NORMAL, 100, 120, 5000),
    DARK_PULSE(16, "Dark Pulse", DARK, 33, 45, 3500),
    SLUDGE(18, "Sludge", POISON, 25, 30, 2600),
    VICE_GRIP(20, "Vice Grip", NORMAL, 20, 25, 2100),
    FLAME_WHEEL(21, "Flame Wheel", FIRE, 25, 40, 4600),
    MEGAHORN(22, "Megahorn", BUG, 100, 80, 3200),
    FLAMETHROWER(24, "Flamethrower", FIRE, 50, 55, 2900),
    DIG(26, "Dig", GROUND, 33, 70, 5800),
    CROSS_CHOP(28, "Cross Chop", FIGHTING, 100, 60, 2000),
    PSYBEAM(30, "Psybeam", Type.PSYCHIC, 25, 40, 3800),
    EARTHQUAKE(31, "Earthquake", GROUND, 100, 100, 4200),
    STONE_EDGE(32, "Stone Edge", ROCK, 100, 80, 3100),
    ICE_PUNCH(33, "Ice Punch", ICE, 33, 45, 3500),
    HEART_STAMP(34, "Heart Stamp", Type.PSYCHIC, 25, 20, 2550),
    DISCHARGE(35, "Discharge", ELECTRIC, 33, 35, 2500),
    FLASH_CANNON(36, "Flash Cannon", STEEL, 33, 60, 3900),
    DRILL_PECK(38, "Drill Peck", FLYING, 33, 40, 2700),
    ICE_BEAM(39, "Ice Beam", ICE, 50, 65, 3650),
    BLIZZARD(40, "Blizzard", ICE, 100, 100, 3900),
    HEAT_WAVE(42, "Heat Wave", FIRE, 100, 80, 3800),
    AERIAL_ACE(45, "Aerial Ace", FLYING, 25, 30, 2900),
    DRILL_RUN(46, "Drill Run", GROUND, 33, 50, 3400),
    PETAL_BLIZZARD(47, "Petal Blizzard", GRASS, 50, 65, 3200),
    MEGA_DRAIN(48, "Mega Drain", GRASS, 20, 15, 3200),
    BUG_BUZZ(49, "Bug Buzz", BUG, 50, 75, 4250),
    POISON_FANG(50, "Poison Fang", POISON, 20, 25, 2400),
    NIGHT_SLASH(51, "Night Slash", DARK, 25, 30, 2700),
    BUBBLE_BEAM(53, "Bubble Beam", WATER, 25, 30, 2900),
    SUBMISSION(54, "Submission", FIGHTING, 33, 30, 2100),
    LOW_SWEEP(56, "Low Sweep", FIGHTING, 25, 30, 2250),
    AQUA_JET(57, "Aqua Jet", WATER, 20, 25, 2350),
    AQUA_TAIL(58, "Aqua Tail", WATER, 50, 45, 2350),
    SEED_BOMB(59, "Seed Bomb", GRASS, 33, 40, 2400),
    PSYSHOCK(60, "Psyshock", Type.PSYCHIC, 33, 40, 2700),
    ANCIENT_POWER(62, "Ancient Power", ROCK, 25, 35, 3600),
    ROCK_TOMB(63, "Rock Tomb", ROCK, 25, 30, 3400),
    ROCK_SLIDE(64, "Rock Slide", ROCK, 33, 50, 3200),
    POWER_GEM(65, "Power Gem", ROCK, 33, 40, 2900),
    SHADOW_SNEAK(66, "Shadow Sneak", GHOST, 20, 15, 3100),
    SHADOW_PUNCH(67, "Shadow Punch", GHOST, 25, 20, 2100),
    OMINOUS_WIND(69, "Ominous Wind", GHOST, 25, 30, 3100),
    SHADOW_BALL(70, "Shadow Ball", GHOST, 33, 45, 3080),
    MAGNET_BOMB(72, "Magnet Bomb", STEEL, 25, 30, 2800),
    IRON_HEAD(74, "Iron Head", STEEL, 33, 30, 2000),
    PARABOLIC_CHARGE(75, "Parabolic Charge", ELECTRIC, 20, 15, 2100),
    THUNDER_PUNCH(77, "Thunder Punch", ELECTRIC, 33, 40, 2400),
    THUNDER(78, "Thunder", ELECTRIC, 100, 100, 4300),
    THUNDERBOLT(79, "Thunderbolt", ELECTRIC, 50, 55, 2700),
    TWISTER(80, "Twister", DRAGON, 20, 25, 2700),
    DRAGON_PULSE(82, "Dragon Pulse", DRAGON, 50, 65, 3600),
    DRAGON_CLAW(83, "Dragon Claw", DRAGON, 50, 35, 1500),
    DISARMING_VOICE(84, "Disarming Voice", FAIRY, 20, 25, 3900),
    DRAINING_KISS(85, "Draining Kiss", FAIRY, 20, 25, 2800),
    DAZZLING_GLEAM(86, "Dazzling Gleam", FAIRY, 33, 55, 4200),
    MOONBLAST(87, "Moonblast", FAIRY, 100, 85, 4100),
    PLAY_ROUGH(88, "Play Rough", FAIRY, 50, 55, 2900),
    CROSS_POISON(89, "Cross Poison", POISON, 25, 25, 1500),
    SLUDGE_BOMB(90, "Sludge Bomb", POISON, 50, 55, 2600),
    SLUDGE_WAVE(91, "Sludge Wave", POISON, 100, 70, 3400),
    GUNK_SHOT(92, "Gunk Shot", POISON, 100, 65, 3000),
    BONE_CLUB(94, "Bone Club", GROUND, 25, 25, 1600),
    BULLDOZE(95, "Bulldoze", GROUND, 25, 35, 3400),
    MUD_BOMB(96, "Mud Bomb", GROUND, 25, 30, 2600),
    SIGNAL_BEAM(99, "Signal Beam", BUG, 33, 45, 3100),
    X_SCISSOR(100, "X Scissor", BUG, 33, 35, 2100),
    FLAME_CHARGE(101, "Flame Charge", FIRE, 20, 25, 3100),
    FLAME_BURST(102, "Flame Burst", FIRE, 25, 30, 2100),
    FIRE_BLAST(103, "Fire Blast", FIRE, 100, 100, 4100),
    BRINE(104, "Brine", WATER, 25, 25, 2400),
    WATER_PULSE(105, "Water Pulse", WATER, 25, 35, 3300),
    SCALD(106, "Scald", WATER, 33, 55, 4000),
    HYDRO_PUMP(107, "Hydro Pump", WATER, 100, 90, 3800),
    PSYCHIC(108, "Psychic", Type.PSYCHIC, 50, 55, 2800),
    PSYSTRIKE(109, "Psystrike", Type.PSYCHIC, 100, 70, 5100),
    ICY_WIND(111, "Icy Wind", ICE, 20, 25, 3800),
    GIGA_DRAIN(114, "Giga Drain", GRASS, 33, 35, 3600),
    FIRE_PUNCH(115, "Fire Punch", FIRE, 33, 40, 2800),
    SOLAR_BEAM(116, "Solar Beam", GRASS, 100, 120, 4900),
    LEAF_BLADE(117, "Leaf Blade", GRASS, 50, 55, 2800),
    POWER_WHIP(118, "Power Whip", GRASS, 100, 70, 2800),
    AIR_CUTTER(121, "Air Cutter", FLYING, 25, 30, 3300),
    HURRICANE(122, "Hurricane", FLYING, 100, 80, 3200),
    BRICK_BREAK(123, "Brick Break", FIGHTING, 33, 30, 1600),
    SWIFT(125, "Swift", NORMAL, 25, 30, 3000),
    HORN_ATTACK(126, "Horn Attack", NORMAL, 25, 25, 2200),
    STOMP(127, "Stomp", NORMAL, 25, 30, 2100),
    HYPER_FANG(129, "Hyper Fang", NORMAL, 33, 35, 2100),
    BODY_SLAM(131, "Body Slam", NORMAL, 50, 40, 1560),
    REST(132, "Rest", NORMAL, 33, 35, 3100),
    STRUGGLE(133, "Struggle", NORMAL, 20, 15, 1695),
    FURY_CUTTER(200, "Fury Cutter", BUG, 12, 3, 400),
    BUG_BITE(201, "Bug Bite", BUG, 7, 5, 450),
    BITE(202, "Bite", DARK, 7, 6, 500),
    SUCKER_PUNCH(203, "Sucker Punch", DARK, 4, 7, 700),
    DRAGON_BREATH(204, "Dragon Breath", DRAGON, 7, 6, 500),
    THUNDER_SHOCK(205, "Thunder Shock", ELECTRIC, 7, 5, 600),
    SPARK(206, "Spark", ELECTRIC, 4, 7, 700),
    LOW_KICK(207, "Low Kick", FIGHTING, 7, 5, 600),
    KARATE_CHOP(208, "Karate Chop", FIGHTING, 7, 6, 800),
    EMBER(209, "Ember", FIRE, 7, 10, 1050),
    WING_ATTACK(210, "Wing Attack", FLYING, 7, 9, 750),
    PECK(211, "Peck", FLYING, 10, 10, 1150),
    LICK(212, "Lick", GHOST, 7, 5, 500),
    SHADOW_CLAW(213, "Shadow Claw", GHOST, 7, 11, 950),
    VINE_WHIP(214, "Vine Whip", GRASS, 7, 7, 650),
    RAZOR_LEAF(215, "Razor Leaf", GRASS, 7, 15, 1450),
    MUD_SHOT(216, "Mud Shot", GROUND, 7, 6, 550),
    ICE_SHARD(217, "Ice Shard", ICE, 7, 15, 1400),
    FROST_BREATH(218, "Frost Breath", ICE, 7, 9, 810),
    QUICK_ATTACK(219, "Quick Attack", NORMAL, 7, 10, 1330),
    SCRATCH(220, "Scratch", NORMAL, 7, 6, 500),
    TACKLE(221, "Tackle", NORMAL, 7, 12, 1100),
    POUND(222, "Pound", NORMAL, 7, 7, 540),
    CUT(223, "Cut", NORMAL, 7, 12, 1130),
    POISON_JAB(224, "Poison Jab", POISON, 7, 12, 1050),
    ACID(225, "Acid", POISON, 7, 10, 1050),
    PSYCHO_CUT(226, "Psycho Cut", Type.PSYCHIC, 7, 7, 570),
    ROCK_THROW(227, "Rock Throw", ROCK, 7, 12, 1360),
    METAL_CLAW(228, "Metal Claw", STEEL, 7, 8, 630),
    BULLET_PUNCH(229, "Bullet Punch", STEEL, 7, 10, 1200),
    WATER_GUN(230, "Water Gun", WATER, 7, 6, 500),
    SPLASH(231, "Splash", WATER, 7, 0, 1230),
    MUD_SLAP(233, "Mud Slap", GROUND, 9, 15, 1350),
    ZEN_HEADBUTT(234, "Zen Headbutt", Type.PSYCHIC, 4, 12, 1050),
    CONFUSION(235, "Confusion", Type.PSYCHIC, 7, 15, 1510),
    POISON_STING(236, "Poison Sting", POISON, 4, 6, 575),
    BUBBLE(237, "Bubble", WATER, 15, 25, 2300),
    FEINT_ATTACK(238, "Feint Attack", DARK, 7, 12, 1040),
    STEEL_WING(239, "Steel Wing", STEEL, 4, 15, 1330),
    FIRE_FANG(240, "Fire Fang", FIRE, 4, 10, 840),
    ROCK_SMASH(241, "Rock Smash", FIGHTING, 7, 15, 1410),;


    private final int number;
    private final String name;
    private final Type type;
    private final int energy;
    private final int damage;
    private final float duration;
    private final float dps;
    private static final Map<Integer, Move> BY_NUMBER = new HashMap<>();

    Move(int number, String name, Type type, int energy, int damage, int durationInMilliseconds) {
        this.number = number;
        this.name = name;
        this.type = type;
        this.energy = energy;
        this.damage = damage;
        this.duration = durationInMilliseconds / 1000;
        this.dps = damage / duration;
    }

    static {
        Arrays.stream(Move.values()).forEach(move -> BY_NUMBER.put(move.number, move));
    }

    /**
     * Gets a Move by it's number representation.
     * @param number the move's number representation
     * @return Optional containing the move, if it was found. Optional.empty() otherwise.
     */
    public static Optional<Move> byNumber(Integer number){
        return Optional.ofNullable(BY_NUMBER.get(number));
    }

    /**
     * The move's number representation.
     * @return int representing the move.
     */
    public int number() {
        return number;
    }

    /**
     * The move's {@link Type}
     * @return the move's {@link Type}
     */
    public Type type() {
        return type;
    }

    /**
     * The move's energy delta. In case of a quick move, represents the energy recovered. In case of
     * a charge move, represents the energy spent.
     * @return the energy delta
     */
    public int energy() {
        return energy;
    }

    /**
     * The move's raw damage, not considering STAB or weaknesses/strengths.
     * @return the move's damage.
     */
    public int damage() {
        return damage;
    }

    /**
     * The move's duration in seconds.
     * @return the move's duration.
     */
    public float duration() {
        return duration;
    }

    /**
     * The move's raw dps, not considering STAB or weaknesses/strengths.
     * @return The move's raw dps.
     */
    public float dps() {
        return dps;
    }

    /**
     * The move's human readable name.
     */
    @Override
    public String toString() {
        return name;
    }
}
