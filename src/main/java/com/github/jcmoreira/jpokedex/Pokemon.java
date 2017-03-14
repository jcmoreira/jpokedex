package com.github.jcmoreira.jpokedex;

import java.util.*;

import static com.github.jcmoreira.jpokedex.Move.*;
import static com.github.jcmoreira.jpokedex.Type.*;

public enum Pokemon {
    BULBASAUR(1, "Bulbasaur",
            EnumSet.of(GRASS, POISON),
            118, 118, 90, 981, 3.5F,
            EnumSet.of(TACKLE, VINE_WHIP),
            EnumSet.of(POWER_WHIP, SEED_BOMB, SLUDGE_BOMB)),
    IVYSAUR(2, "Ivysaur",
            EnumSet.of(GRASS, POISON),
            151, 151, 120, 1552, 5.5F,
            EnumSet.of(RAZOR_LEAF, VINE_WHIP),
            EnumSet.of(POWER_WHIP, SLUDGE_BOMB, SOLAR_BEAM)),
    VENUSAUR(3, "Venusaur",
            EnumSet.of(GRASS, POISON),
            198, 198, 160, 2568, 9F,
            EnumSet.of(RAZOR_LEAF, VINE_WHIP),
            EnumSet.of(PETAL_BLIZZARD, SLUDGE_BOMB, SOLAR_BEAM)),
    CHARMANDER(4, "Charmander",
            EnumSet.of(FIRE),
            116, 96, 78, 831, 3.5F,
            EnumSet.of(EMBER, SCRATCH),
            EnumSet.of(FLAME_BURST, FLAMETHROWER, FLAME_CHARGE)),
    CHARMELEON(5, "Charmeleon",
            EnumSet.of(FIRE),
            158, 129, 116, 1484, 5.5F,
            EnumSet.of(EMBER, FIRE_FANG, SCRATCH),
            EnumSet.of(FIRE_PUNCH, FLAME_BURST, FLAMETHROWER)),
    CHARIZARD(6, "Charizard",
            EnumSet.of(FIRE, FLYING),
            223, 176, 156, 2686, 8.5F,
            EnumSet.of(FIRE_SPIN, AIR_SLASH, EMBER, WING_ATTACK),
            EnumSet.of(DRAGON_CLAW, FIRE_BLAST, OVERHEAT, FLAMETHROWER)),
    SQUIRTLE(7, "Squirtle",
            EnumSet.of(WATER),
            94, 122, 88, 808, 3.5F,
            EnumSet.of(TACKLE, BUBBLE),
            EnumSet.of(AQUA_JET, AQUA_TAIL, WATER_PULSE)),
    WARTORTLE(8, "Wartortle",
            EnumSet.of(WATER),
            126, 155, 118, 1324, 5.5F,
            EnumSet.of(BITE, WATER_GUN),
            EnumSet.of(AQUA_JET, HYDRO_PUMP, ICE_BEAM)),
    BLASTOISE(9, "Blastoise",
            EnumSet.of(WATER),
            171, 210, 158, 2291, 8.5F,
            EnumSet.of(BITE, WATER_GUN),
            EnumSet.of(FLASH_CANNON, HYDRO_PUMP, ICE_BEAM)),
    CATERPIE(10, "Caterpie",
            EnumSet.of(BUG),
            55, 62, 90, 393, 1.5F,
            EnumSet.of(TACKLE, BUG_BITE),
            EnumSet.of(STRUGGLE)),
    METAPOD(11, "Metapod",
            EnumSet.of(BUG),
            45, 94, 100, 419, 2F,
            EnumSet.of(TACKLE, BUG_BITE),
            EnumSet.of(STRUGGLE)),
    BUTTERFREE(12, "Butterfree",
            EnumSet.of(BUG, FLYING),
            167, 151, 120, 1701, 5.5F,
            EnumSet.of(STRUGGLE_BUG, CONFUSION, BUG_BITE),
            EnumSet.of(BUG_BUZZ, Move.PSYCHIC, SIGNAL_BEAM)),
    WEEDLE(13, "Weedle",
            EnumSet.of(BUG, POISON),
            63, 55, 80, 397, 1.5F,
            EnumSet.of(BUG_BITE, POISON_STING),
            EnumSet.of(STRUGGLE)),
    KAKUNA(14, "Kakuna",
            EnumSet.of(BUG, POISON),
            46, 86, 90, 392, 2F,
            EnumSet.of(BUG_BITE, POISON_STING),
            EnumSet.of(STRUGGLE)),
    BEEDRILL(15, "Beedrill",
            EnumSet.of(BUG, POISON),
            169, 150, 130, 1777, 5.5F,
            EnumSet.of(INFESTATION, POISON_JAB, BUG_BITE),
            EnumSet.of(AERIAL_ACE, SLUDGE_BOMB, X_SCISSOR)),
    PIDGEY(16, "Pidgey",
            EnumSet.of(FLYING, NORMAL),
            85, 76, 80, 580, 2.5F,
            EnumSet.of(TACKLE, QUICK_ATTACK),
            EnumSet.of(AERIAL_ACE, AIR_CUTTER, TWISTER)),
    PIDGEOTTO(17, "Pidgeotto",
            EnumSet.of(FLYING, NORMAL),
            117, 108, 126, 1085, 5F,
            EnumSet.of(STEEL_WING, WING_ATTACK),
            EnumSet.of(AERIAL_ACE, AIR_CUTTER, TWISTER)),
    PIDGEOT(18, "Pidgeot",
            EnumSet.of(FLYING, NORMAL),
            166, 157, 166, 1994, 6.5F,
            EnumSet.of(STEEL_WING, AIR_SLASH, WING_ATTACK),
            EnumSet.of(AERIAL_ACE, BRAVE_BIRD, HURRICANE, AIR_CUTTER)),
    RATTATA(19, "Rattata",
            EnumSet.of(NORMAL),
            103, 70, 60, 588, 2.5F,
            EnumSet.of(TACKLE, QUICK_ATTACK),
            EnumSet.of(BODY_SLAM, DIG, HYPER_FANG)),
    RATICATE(20, "Raticate",
            EnumSet.of(NORMAL),
            161, 144, 110, 1549, 6F,
            EnumSet.of(BITE, QUICK_ATTACK),
            EnumSet.of(DIG, HYPER_BEAM, HYPER_FANG)),
    SPEAROW(21, "Spearow",
            EnumSet.of(FLYING, NORMAL),
            112, 61, 80, 673, 2.5F,
            EnumSet.of(PECK, QUICK_ATTACK),
            EnumSet.of(AERIAL_ACE, DRILL_PECK, SKY_ATTACK, TWISTER)),
    FEAROW(22, "Fearow",
            EnumSet.of(FLYING, NORMAL),
            182, 135, 130, 1814, 5.5F,
            EnumSet.of(PECK, STEEL_WING),
            EnumSet.of(AERIAL_ACE, SKY_ATTACK, DRILL_RUN, TWISTER)),
    EKANS(23, "Ekans",
            EnumSet.of(POISON),
            110, 102, 70, 778, 3F,
            EnumSet.of(ACID, POISON_STING),
            EnumSet.of(POISON_FANG, SLUDGE_BOMB, WRAP, GUNK_SHOT)),
    ARBOK(24, "Arbok",
            EnumSet.of(POISON),
            167, 158, 120, 1737, 6F,
            EnumSet.of(ACID, BITE),
            EnumSet.of(DARK_PULSE, GUNK_SHOT, SLUDGE_WAVE)),
    PIKACHU(25, "Pikachu",
            EnumSet.of(ELECTRIC),
            112, 101, 70, 787, 3.5F,
            EnumSet.of(QUICK_ATTACK, THUNDER_SHOCK),
            EnumSet.of(DISCHARGE, WILD_CHARGE, THUNDERBOLT, THUNDER)),
    RAICHU(26, "Raichu",
            EnumSet.of(ELECTRIC),
            193, 165, 120, 2025, 6F,
            EnumSet.of(SPARK, VOLT_SWITCH, THUNDER_SHOCK),
            EnumSet.of(BRICK_BREAK, WILD_CHARGE, THUNDER_PUNCH, THUNDER)),
    SANDSHREW(27, "Sandshrew",
            EnumSet.of(GROUND),
            126, 145, 100, 1194, 4F,
            EnumSet.of(MUD_SHOT, SCRATCH),
            EnumSet.of(DIG, ROCK_SLIDE, SAND_TOMB, ROCK_TOMB)),
    SANDSLASH(28, "Sandslash",
            EnumSet.of(GROUND),
            182, 202, 150, 2328, 8F,
            EnumSet.of(METAL_CLAW, MUD_SHOT),
            EnumSet.of(BULLDOZE, EARTHQUAKE, ROCK_TOMB)),
    NIDORAN_FEMALE(29, "Nidoran♀",
            EnumSet.of(POISON),
            86, 94, 110, 736, 3F,
            EnumSet.of(BITE, POISON_STING),
            EnumSet.of(BODY_SLAM, POISON_FANG, SLUDGE_BOMB)),
    NIDORINA(30, "Nidorina",
            EnumSet.of(POISON),
            117, 126, 140, 1218, 5.5F,
            EnumSet.of(BITE, POISON_STING),
            EnumSet.of(DIG, POISON_FANG, SLUDGE_BOMB)),
    NIDOQUEEN(31, "Nidoqueen",
            EnumSet.of(GROUND, POISON),
            180, 174, 180, 2338, 8F,
            EnumSet.of(BITE, POISON_JAB),
            EnumSet.of(EARTHQUAKE, SLUDGE_WAVE, STONE_EDGE)),
    NIDORAN_MALE(32, "Nidoran♂",
            EnumSet.of(POISON),
            105, 76, 92, 739, 3F,
            EnumSet.of(PECK, POISON_STING),
            EnumSet.of(BODY_SLAM, HORN_ATTACK, SLUDGE_BOMB)),
    NIDORINO(33, "Nidorino",
            EnumSet.of(POISON),
            137, 112, 122, 1252, 5.5F,
            EnumSet.of(POISON_STING, POISON_JAB),
            EnumSet.of(DIG, HORN_ATTACK, SLUDGE_BOMB)),
    NIDOKING(34, "Nidoking",
            EnumSet.of(GROUND, POISON),
            204, 157, 162, 2386, 7.5F,
            EnumSet.of(IRON_TAIL, POISON_JAB, FURY_CUTTER),
            EnumSet.of(EARTHQUAKE, MEGAHORN, SLUDGE_WAVE)),
    CLEFAIRY(35, "Clefairy",
            EnumSet.of(FAIRY),
            107, 116, 140, 1085, 5F,
            EnumSet.of(POUND, ZEN_HEADBUTT),
            EnumSet.of(BODY_SLAM, DISARMING_VOICE, MOONBLAST)),
    CLEFABLE(36, "Clefable",
            EnumSet.of(FAIRY),
            178, 171, 190, 2353, 8.5F,
            EnumSet.of(CHARGE_BEAM, ZEN_HEADBUTT, POUND),
            EnumSet.of(DAZZLING_GLEAM, MOONBLAST, Move.PSYCHIC)),
    VULPIX(37, "Vulpix",
            EnumSet.of(FIRE),
            96, 122, 76, 774, 3F,
            EnumSet.of(EMBER, QUICK_ATTACK),
            EnumSet.of(BODY_SLAM, FLAMETHROWER, FLAME_CHARGE)),
    NINETALES(38, "Ninetales",
            EnumSet.of(FIRE),
            169, 204, 146, 2157, 7F,
            EnumSet.of(FIRE_SPIN, FEINT_ATTACK, EMBER),
            EnumSet.of(OVERHEAT, SOLAR_BEAM, HEAT_WAVE, FIRE_BLAST, FLAMETHROWER)),
    JIGGLYPUFF(39, "Jigglypuff",
            EnumSet.of(FAIRY, NORMAL),
            80, 44, 230, 713, 4.5F,
            EnumSet.of(FEINT_ATTACK, POUND),
            EnumSet.of(GYRO_BALL, DAZZLING_GLEAM, DISARMING_VOICE, PLAY_ROUGH, BODY_SLAM)),
    WIGGLYTUFF(40, "Wigglytuff",
            EnumSet.of(FAIRY, NORMAL),
            156, 93, 280, 1906, 8.5F,
            EnumSet.of(FEINT_ATTACK, POUND),
            EnumSet.of(DAZZLING_GLEAM, HYPER_BEAM, PLAY_ROUGH)),
    ZUBAT(41, "Zubat",
            EnumSet.of(FLYING, POISON),
            83, 76, 80, 569, 2.5F,
            EnumSet.of(BITE, QUICK_ATTACK),
            EnumSet.of(AIR_CUTTER, POISON_FANG, SWIFT, SLUDGE_BOMB)),
    GOLBAT(42, "Golbat",
            EnumSet.of(FLYING, POISON),
            161, 153, 150, 1830, 6.5F,
            EnumSet.of(BITE, WING_ATTACK),
            EnumSet.of(AIR_CUTTER, POISON_FANG, SHADOW_BALL, OMINOUS_WIND)),
    ODDISH(43, "Oddish",
            EnumSet.of(GRASS, POISON),
            131, 116, 90, 1069, 3.5F,
            EnumSet.of(ACID, RAZOR_LEAF),
            EnumSet.of(MOONBLAST, SEED_BOMB, SLUDGE_BOMB)),
    GLOOM(44, "Gloom",
            EnumSet.of(GRASS, POISON),
            153, 139, 120, 1512, 6F,
            EnumSet.of(ACID, RAZOR_LEAF),
            EnumSet.of(MOONBLAST, PETAL_BLIZZARD, SLUDGE_BOMB)),
    VILEPLUME(45, "Vileplume",
            EnumSet.of(GRASS, POISON),
            202, 170, 150, 2367, 8F,
            EnumSet.of(ACID, RAZOR_LEAF),
            EnumSet.of(MOONBLAST, PETAL_BLIZZARD, SOLAR_BEAM)),
    PARAS(46, "Paras",
            EnumSet.of(BUG, GRASS),
            121, 99, 70, 836, 3.5F,
            EnumSet.of(BUG_BITE, SCRATCH),
            EnumSet.of(CROSS_POISON, SEED_BOMB, X_SCISSOR)),
    PARASECT(47, "Parasect",
            EnumSet.of(BUG, GRASS),
            165, 146, 120, 1657, 6F,
            EnumSet.of(STRUGGLE_BUG, FURY_CUTTER, BUG_BITE),
            EnumSet.of(CROSS_POISON, SOLAR_BEAM, X_SCISSOR)),
    VENONAT(48, "Venonat",
            EnumSet.of(BUG, POISON),
            100, 102, 120, 902, 3.5F,
            EnumSet.of(BUG_BITE, CONFUSION),
            EnumSet.of(POISON_FANG, PSYBEAM, SIGNAL_BEAM)),
    VENOMOTH(49, "Venomoth",
            EnumSet.of(BUG, POISON),
            179, 150, 140, 1937, 6.5F,
            EnumSet.of(INFESTATION, CONFUSION, BUG_BITE),
            EnumSet.of(BUG_BUZZ, SILVER_WIND, Move.PSYCHIC, POISON_FANG)),
    DIGLETT(50, "Diglett",
            EnumSet.of(GROUND),
            109, 88, 20, 465, 1F,
            EnumSet.of(MUD_SLAP, SCRATCH, MUD_SHOT),
            EnumSet.of(DIG, MUD_BOMB, ROCK_TOMB)),
    DUGTRIO(51, "Dugtrio",
            EnumSet.of(GROUND),
            167, 147, 70, 1333, 3.5F,
            EnumSet.of(MUD_SLAP, SUCKER_PUNCH, MUD_SHOT),
            EnumSet.of(EARTHQUAKE, MUD_BOMB, STONE_EDGE)),
    MEOWTH(52, "Meowth",
            EnumSet.of(NORMAL),
            92, 81, 80, 638, 3F,
            EnumSet.of(BITE, SCRATCH),
            EnumSet.of(FOUL_PLAY, DARK_PULSE, NIGHT_SLASH, BODY_SLAM)),
    PERSIAN(53, "Persian",
            EnumSet.of(NORMAL),
            150, 139, 130, 1539, 6F,
            EnumSet.of(FEINT_ATTACK, SCRATCH),
            EnumSet.of(FOUL_PLAY, PLAY_ROUGH, POWER_GEM, NIGHT_SLASH)),
    PSYDUCK(54, "Psyduck",
            EnumSet.of(WATER),
            122, 96, 100, 966, 4.5F,
            EnumSet.of(WATER_GUN, ZEN_HEADBUTT),
            EnumSet.of(AQUA_TAIL, CROSS_CHOP, PSYBEAM)),
    GOLDUCK(55, "Golduck",
            EnumSet.of(WATER),
            191, 163, 160, 2270, 8F,
            EnumSet.of(CONFUSION, WATER_GUN),
            EnumSet.of(HYDRO_PUMP, ICE_BEAM, Move.PSYCHIC)),
    MANKEY(56, "Mankey",
            EnumSet.of(FIGHTING),
            148, 87, 80, 1002, 3.5F,
            EnumSet.of(KARATE_CHOP, SCRATCH),
            EnumSet.of(BRICK_BREAK, CROSS_CHOP, LOW_SWEEP)),
    PRIMEAPE(57, "Primeape",
            EnumSet.of(FIGHTING),
            207, 144, 130, 2105, 6.5F,
            EnumSet.of(COUNTER, LOW_KICK, KARATE_CHOP),
            EnumSet.of(CLOSE_COMBAT, LOW_SWEEP, NIGHT_SLASH, CROSS_CHOP)),
    GROWLITHE(58, "Growlithe",
            EnumSet.of(FIRE),
            136, 96, 110, 1110, 5F,
            EnumSet.of(BITE, EMBER),
            EnumSet.of(BODY_SLAM, FLAME_WHEEL, FLAMETHROWER)),
    ARCANINE(59, "Arcanine",
            EnumSet.of(FIRE),
            227, 166, 180, 2839, 8F,
            EnumSet.of(SNARL, FIRE_FANG, BITE),
            EnumSet.of(CRUNCH, FIRE_BLAST, WILD_CHARGE, BULLDOZE, FLAMETHROWER)),
    POLIWAG(60, "Poliwag",
            EnumSet.of(WATER),
            101, 82, 80, 695, 3.5F,
            EnumSet.of(BUBBLE, MUD_SHOT),
            EnumSet.of(BODY_SLAM, BUBBLE_BEAM, MUD_BOMB)),
    POLIWHIRL(61, "Poliwhirl",
            EnumSet.of(WATER),
            130, 130, 130, 1313, 6F,
            EnumSet.of(BUBBLE, MUD_SHOT),
            EnumSet.of(BUBBLE_BEAM, MUD_BOMB, WATER_PULSE, SCALD)),
    POLIWRATH(62, "Poliwrath",
            EnumSet.of(FIGHTING, WATER),
            182, 187, 180, 2441, 9F,
            EnumSet.of(BUBBLE, ROCK_SMASH, MUD_SHOT),
            EnumSet.of(HYDRO_PUMP, ICE_PUNCH, DYNAMIC_PUNCH, SUBMISSION)),
    ABRA(63, "Abra",
            EnumSet.of(Type.PSYCHIC),
            195, 103, 50, 1148, 2.5F,
            EnumSet.of(ZEN_HEADBUTT, CHARGE_BEAM),
            EnumSet.of(PSYSHOCK, SHADOW_BALL, SIGNAL_BEAM)),
    KADABRA(64, "Kadabra",
            EnumSet.of(Type.PSYCHIC),
            232, 138, 80, 1859, 4.5F,
            EnumSet.of(CONFUSION, PSYCHO_CUT),
            EnumSet.of(DAZZLING_GLEAM, PSYBEAM, SHADOW_BALL)),
    ALAKAZAM(65, "Alakazam",
            EnumSet.of(Type.PSYCHIC),
            271, 194, 110, 2887, 9F,
            EnumSet.of(CONFUSION, PSYCHO_CUT),
            EnumSet.of(FOCUS_BLAST, FUTURE_SIGHT, SHADOW_BALL, DAZZLING_GLEAM, Move.PSYCHIC)),
    MACHOP(66, "Machop",
            EnumSet.of(FIGHTING),
            137, 88, 140, 1199, 3F,
            EnumSet.of(KARATE_CHOP, ROCK_SMASH, LOW_KICK),
            EnumSet.of(BRICK_BREAK, CROSS_CHOP, LOW_SWEEP)),
    MACHOKE(67, "Machoke",
            EnumSet.of(FIGHTING),
            177, 130, 160, 1910, 6F,
            EnumSet.of(KARATE_CHOP, LOW_KICK),
            EnumSet.of(BRICK_BREAK, DYNAMIC_PUNCH, SUBMISSION, CROSS_CHOP)),
    MACHAMP(68, "Machamp",
            EnumSet.of(FIGHTING),
            234, 162, 180, 2889, 7.5F,
            EnumSet.of(BULLET_PUNCH, COUNTER, KARATE_CHOP),
            EnumSet.of(HEAVY_SLAM, DYNAMIC_PUNCH, CLOSE_COMBAT, CROSS_CHOP, STONE_EDGE, SUBMISSION)),
    BELLSPROUT(69, "Bellsprout",
            EnumSet.of(GRASS, POISON),
            139, 64, 100, 916, 4F,
            EnumSet.of(ACID, VINE_WHIP),
            EnumSet.of(POWER_WHIP, SLUDGE_BOMB, WRAP)),
    WEEPINBELL(70, "Weepinbell",
            EnumSet.of(GRASS, POISON),
            172, 95, 130, 1475, 6F,
            EnumSet.of(ACID, BULLET_SEED, RAZOR_LEAF),
            EnumSet.of(POWER_WHIP, SEED_BOMB, SLUDGE_BOMB)),
    VICTREEBEL(71, "Victreebel",
            EnumSet.of(GRASS, POISON),
            207, 138, 160, 2268, 8F,
            EnumSet.of(ACID, RAZOR_LEAF),
            EnumSet.of(SLUDGE_BOMB, SOLAR_BEAM, LEAF_BLADE)),
    TENTACOOL(72, "Tentacool",
            EnumSet.of(POISON, WATER),
            97, 182, 80, 956, 3.5F,
            EnumSet.of(BUBBLE, POISON_STING),
            EnumSet.of(BUBBLE_BEAM, WATER_PULSE, WRAP)),
    TENTACRUEL(73, "Tentacruel",
            EnumSet.of(POISON, WATER),
            166, 237, 160, 2374, 8.5F,
            EnumSet.of(ACID, POISON_JAB),
            EnumSet.of(BLIZZARD, HYDRO_PUMP, SLUDGE_WAVE)),
    GEODUDE(74, "Geodude",
            EnumSet.of(GROUND, ROCK),
            132, 163, 80, 1193, 3.5F,
            EnumSet.of(TACKLE, ROCK_THROW),
            EnumSet.of(DIG, ROCK_SLIDE, ROCK_TOMB)),
    GRAVELER(75, "Graveler",
            EnumSet.of(GROUND, ROCK),
            164, 196, 110, 1815, 6F,
            EnumSet.of(MUD_SLAP, ROCK_THROW, MUD_SHOT, ROCK_SLIDE),
            EnumSet.of(DIG, ROCK_BLAST, STONE_EDGE)),
    GOLEM(76, "Golem",
            EnumSet.of(GROUND, ROCK),
            211, 229, 160, 2916, 9F,
            EnumSet.of(MUD_SLAP, ROCK_THROW, MUD_SHOT),
            EnumSet.of(ROCK_BLAST, EARTHQUAKE, STONE_EDGE, ANCIENT_POWER)),
    PONYTA(77, "Ponyta",
            EnumSet.of(FIRE),
            170, 132, 100, 1502, 4.5F,
            EnumSet.of(TACKLE, EMBER),
            EnumSet.of(STOMP, FLAME_WHEEL, FLAME_CHARGE, FIRE_BLAST)),
    RAPIDASH(78, "Rapidash",
            EnumSet.of(FIRE),
            207, 167, 130, 2252, 7F,
            EnumSet.of(FIRE_SPIN, LOW_KICK, EMBER),
            EnumSet.of(FIRE_BLAST, HEAT_WAVE, DRILL_RUN)),
    SLOWPOKE(79, "Slowpoke",
            EnumSet.of(Type.PSYCHIC, WATER),
            109, 109, 180, 1204, 5F,
            EnumSet.of(CONFUSION, WATER_GUN),
            EnumSet.of(Move.PSYCHIC, PSYSHOCK, WATER_PULSE)),
    SLOWBRO(80, "Slowbro",
            EnumSet.of(Type.PSYCHIC, WATER),
            177, 194, 190, 2482, 9F,
            EnumSet.of(CONFUSION, WATER_GUN),
            EnumSet.of(ICE_BEAM, Move.PSYCHIC, WATER_PULSE)),
    MAGNEMITE(81, "Magnemite",
            EnumSet.of(ELECTRIC, STEEL),
            165, 128, 50, 1083, 3.5F,
            EnumSet.of(SPARK, THUNDER_SHOCK),
            EnumSet.of(DISCHARGE, MAGNET_BOMB, THUNDERBOLT)),
    MAGNETON(82, "Magneton",
            EnumSet.of(ELECTRIC, STEEL),
            223, 182, 100, 2237, 8F,
            EnumSet.of(SPARK, CHARGE_BEAM, THUNDER_SHOCK),
            EnumSet.of(ZAP_CANNON, FLASH_CANNON, MAGNET_BOMB, DISCHARGE)),
    FARFETCHD(83, "Farfetch'd",
            EnumSet.of(FLYING, NORMAL),
            124, 118, 104, 1092, 4F,
            EnumSet.of(FURY_CUTTER, AIR_SLASH, CUT),
            EnumSet.of(AERIAL_ACE, AIR_CUTTER, LEAF_BLADE)),
    DODUO(84, "Doduo",
            EnumSet.of(FLYING, NORMAL),
            158, 88, 70, 1011, 2.5F,
            EnumSet.of(PECK, QUICK_ATTACK),
            EnumSet.of(AERIAL_ACE, DRILL_PECK, BRAVE_BIRD, SWIFT)),
    DODRIO(85, "Dodrio",
            EnumSet.of(FLYING, NORMAL),
            218, 145, 120, 2138, 6.5F,
            EnumSet.of(FEINT_ATTACK, STEEL_WING),
            EnumSet.of(AERIAL_ACE, BRAVE_BIRD, DRILL_PECK, AIR_CUTTER)),
    SEEL(86, "Seel",
            EnumSet.of(WATER),
            85, 128, 130, 899, 4.5F,
            EnumSet.of(LICK, ICE_SHARD, WATER_GUN),
            EnumSet.of(AURORA_BEAM, AQUA_TAIL, ICY_WIND, AQUA_JET)),
    DEWGONG(87, "Dewgong",
            EnumSet.of(ICE, WATER),
            139, 184, 180, 1894, 8F,
            EnumSet.of(FROST_BREATH, IRON_TAIL, ICE_SHARD),
            EnumSet.of(AURORA_BEAM, BLIZZARD, WATER_PULSE, AQUA_JET, ICY_WIND)),
    GRIMER(88, "Grimer",
            EnumSet.of(POISON),
            135, 90, 160, 1269, 4.5F,
            EnumSet.of(MUD_SLAP, POISON_JAB, ACID),
            EnumSet.of(MUD_BOMB, SLUDGE, SLUDGE_BOMB)),
    MUK(89, "Muk",
            EnumSet.of(POISON),
            190, 184, 210, 2709, 8.5F,
            EnumSet.of(INFESTATION, POISON_JAB, ACID, LICK),
            EnumSet.of(DARK_PULSE, GUNK_SHOT, SLUDGE_WAVE)),
    SHELLDER(90, "Shellder",
            EnumSet.of(WATER),
            116, 168, 60, 958, 3F,
            EnumSet.of(TACKLE, ICE_SHARD),
            EnumSet.of(BUBBLE_BEAM, ICY_WIND, WATER_PULSE)),
    CLOYSTER(91, "Cloyster",
            EnumSet.of(ICE, WATER),
            186, 323, 100, 2475, 8.5F,
            EnumSet.of(FROST_BREATH, ICE_SHARD),
            EnumSet.of(AURORA_BEAM, HYDRO_PUMP, AVALANCHE, BLIZZARD, ICY_WIND)),
    GASTLY(92, "Gastly",
            EnumSet.of(GHOST, POISON),
            186, 70, 60, 1002, 3.5F,
            EnumSet.of(LICK, ASTONISH, SUCKER_PUNCH),
            EnumSet.of(DARK_PULSE, SLUDGE_BOMB, NIGHT_SHADE, OMINOUS_WIND)),
    HAUNTER(93, "Haunter",
            EnumSet.of(GHOST, POISON),
            223, 112, 90, 1716, 5.5F,
            EnumSet.of(ASTONISH, SHADOW_CLAW, LICK),
            EnumSet.of(DARK_PULSE, SHADOW_PUNCH, SLUDGE_BOMB, SHADOW_BALL)),
    GENGAR(94, "Gengar",
            EnumSet.of(GHOST, POISON),
            261, 156, 120, 2619, 8.5F,
            EnumSet.of(SUCKER_PUNCH, HEX, SHADOW_CLAW),
            EnumSet.of(FOCUS_BLAST, SHADOW_BALL, SLUDGE_BOMB, SLUDGE_WAVE, DARK_PULSE)),
    ONIX(95, "Onix",
            EnumSet.of(GROUND, ROCK),
            85, 288, 70, 1002, 4F,
            EnumSet.of(TACKLE, ROCK_THROW),
            EnumSet.of(SAND_TOMB, HEAVY_SLAM, STONE_EDGE, IRON_HEAD, ROCK_SLIDE)),
    DROWZEE(96, "Drowzee",
            EnumSet.of(Type.PSYCHIC),
            89, 158, 120, 992, 4.5F,
            EnumSet.of(CONFUSION, POUND),
            EnumSet.of(PSYBEAM, Move.PSYCHIC, PSYSHOCK)),
    HYPNO(97, "Hypno",
            EnumSet.of(Type.PSYCHIC),
            144, 215, 170, 2048, 8F,
            EnumSet.of(CONFUSION, ZEN_HEADBUTT),
            EnumSet.of(Move.PSYCHIC, FUTURE_SIGHT, FOCUS_BLAST, PSYSHOCK, SHADOW_BALL)),
    KRABBY(98, "Krabby",
            EnumSet.of(WATER),
            181, 156, 60, 1386, 3.5F,
            EnumSet.of(BUBBLE, MUD_SHOT),
            EnumSet.of(BUBBLE_BEAM, VICE_GRIP, WATER_PULSE)),
    KINGLER(99, "Kingler",
            EnumSet.of(WATER),
            240, 214, 110, 2694, 7.5F,
            EnumSet.of(METAL_CLAW, BUBBLE, MUD_SHOT),
            EnumSet.of(VICE_GRIP, WATER_PULSE, X_SCISSOR)),
    VOLTORB(100, "Voltorb",
            EnumSet.of(ELECTRIC),
            109, 114, 80, 857, 3.5F,
            EnumSet.of(TACKLE, SPARK),
            EnumSet.of(DISCHARGE, GYRO_BALL, THUNDERBOLT, SIGNAL_BEAM)),
    ELECTRODE(101, "Electrode",
            EnumSet.of(ELECTRIC),
            173, 179, 120, 1900, 5.5F,
            EnumSet.of(SPARK, VOLT_SWITCH, TACKLE),
            EnumSet.of(DISCHARGE, HYPER_BEAM, THUNDERBOLT)),
    EXEGGCUTE(102, "Exeggcute",
            EnumSet.of(GRASS, Type.PSYCHIC),
            107, 140, 120, 1102, 4.5F,
            EnumSet.of(CONFUSION, BULLET_SEED),
            EnumSet.of(ANCIENT_POWER, Move.PSYCHIC, SEED_BOMB)),
    EXEGGUTOR(103, "Exeggutor",
            EnumSet.of(GRASS, Type.PSYCHIC),
            233, 158, 190, 2916, 9.5F,
            EnumSet.of(BULLET_SEED, EXTRASENSORY, CONFUSION, ZEN_HEADBUTT),
            EnumSet.of(Move.PSYCHIC, SEED_BOMB, SOLAR_BEAM)),
    CUBONE(104, "Cubone",
            EnumSet.of(GROUND),
            90, 165, 100, 943, 4F,
            EnumSet.of(MUD_SLAP, ROCK_SMASH),
            EnumSet.of(BONE_CLUB, BULLDOZE, DIG)),
    MAROWAK(105, "Marowak",
            EnumSet.of(GROUND),
            144, 200, 120, 1691, 6F,
            EnumSet.of(MUD_SLAP, ROCK_SMASH),
            EnumSet.of(BONE_CLUB, DIG, EARTHQUAKE)),
    HITMONLEE(106, "Hitmonlee",
            EnumSet.of(FIGHTING),
            224, 211, 100, 2406, 5.5F,
            EnumSet.of(LOW_KICK, ROCK_SMASH),
            EnumSet.of(CLOSE_COMBAT, LOW_SWEEP, STONE_EDGE, STOMP, BRICK_BREAK)),
    HITMONCHAN(107, "Hitmonchan",
            EnumSet.of(FIGHTING),
            193, 212, 100, 2098, 5.5F,
            EnumSet.of(BULLET_PUNCH, COUNTER, ROCK_SMASH),
            EnumSet.of(FIRE_PUNCH, THUNDER_PUNCH, CLOSE_COMBAT, ICE_PUNCH, BRICK_BREAK)),
    LICKITUNG(108, "Lickitung",
            EnumSet.of(NORMAL),
            108, 137, 180, 1322, 5.5F,
            EnumSet.of(LICK, ZEN_HEADBUTT),
            EnumSet.of(HYPER_BEAM, POWER_WHIP, STOMP)),
    KOFFING(109, "Koffing",
            EnumSet.of(POISON),
            119, 164, 80, 1091, 4F,
            EnumSet.of(TACKLE, INFESTATION, ACID),
            EnumSet.of(DARK_PULSE, SLUDGE, SLUDGE_BOMB)),
    WEEZING(110, "Weezing",
            EnumSet.of(POISON),
            174, 221, 130, 2183, 7F,
            EnumSet.of(TACKLE, INFESTATION, ACID),
            EnumSet.of(DARK_PULSE, SHADOW_BALL, SLUDGE_BOMB)),
    RHYHORN(111, "Rhyhorn",
            EnumSet.of(GROUND, ROCK),
            140, 157, 160, 1679, 5F,
            EnumSet.of(MUD_SLAP, ROCK_SMASH),
            EnumSet.of(BULLDOZE, HORN_ATTACK, STOMP)),
    RHYDON(112, "Rhydon",
            EnumSet.of(GROUND, ROCK),
            222, 206, 210, 3300, 9.5F,
            EnumSet.of(MUD_SLAP, ROCK_SMASH),
            EnumSet.of(EARTHQUAKE, MEGAHORN, STONE_EDGE)),
    CHANSEY(113, "Chansey",
            EnumSet.of(NORMAL),
            60, 176, 500, 1469, 8.5F,
            EnumSet.of(POUND, ZEN_HEADBUTT),
            EnumSet.of(DAZZLING_GLEAM, HYPER_BEAM, Move.PSYCHIC, PSYBEAM)),
    TANGELA(114, "Tangela",
            EnumSet.of(GRASS),
            183, 205, 130, 2208, 8F,
            EnumSet.of(VINE_WHIP, INFESTATION),
            EnumSet.of(GRASS_KNOT, SLUDGE_BOMB, SOLAR_BEAM, POWER_WHIP)),
    KANGASKHAN(115, "Kangaskhan",
            EnumSet.of(NORMAL),
            181, 165, 210, 2463, 8.5F,
            EnumSet.of(LOW_KICK, MUD_SLAP),
            EnumSet.of(CRUNCH, EARTHQUAKE, OUTRAGE, BRICK_BREAK, STOMP)),
    HORSEA(116, "Horsea",
            EnumSet.of(WATER),
            129, 125, 60, 921, 3.5F,
            EnumSet.of(BUBBLE, WATER_GUN),
            EnumSet.of(BUBBLE_BEAM, DRAGON_PULSE, FLASH_CANNON)),
    SEADRA(117, "Seadra",
            EnumSet.of(WATER),
            187, 182, 110, 1979, 7F,
            EnumSet.of(DRAGON_BREATH, WATER_GUN),
            EnumSet.of(AURORA_BEAM, DRAGON_PULSE, HYDRO_PUMP, BLIZZARD)),
    GOLDEEN(118, "Goldeen",
            EnumSet.of(WATER),
            123, 115, 90, 1006, 3.5F,
            EnumSet.of(MUD_SHOT, PECK),
            EnumSet.of(AQUA_TAIL, HORN_ATTACK, WATER_PULSE)),
    SEAKING(119, "Seaking",
            EnumSet.of(WATER),
            175, 154, 160, 2040, 6.5F,
            EnumSet.of(PECK, POISON_JAB),
            EnumSet.of(ICE_BEAM, MEGAHORN, WATER_PULSE, ICY_WIND, DRILL_RUN)),
    STARYU(120, "Staryu",
            EnumSet.of(WATER),
            137, 112, 60, 926, 3.5F,
            EnumSet.of(TACKLE, WATER_GUN, QUICK_ATTACK),
            EnumSet.of(BUBBLE_BEAM, POWER_GEM, SWIFT)),
    STARMIE(121, "Starmie",
            EnumSet.of(Type.PSYCHIC, WATER),
            210, 184, 120, 2303, 7.5F,
            EnumSet.of(HIDDEN_POWER, WATER_GUN, QUICK_ATTACK, TACKLE),
            EnumSet.of(HYDRO_PUMP, POWER_GEM, Move.PSYCHIC, PSYBEAM)),
    MR_MIME(122, "Mr. Mime",
            EnumSet.of(FAIRY, Type.PSYCHIC),
            192, 233, 80, 1984, 5F,
            EnumSet.of(CONFUSION, ZEN_HEADBUTT),
            EnumSet.of(PSYBEAM, Move.PSYCHIC, SHADOW_BALL)),
    SCYTHER(123, "Scyther",
            EnumSet.of(BUG, FLYING),
            218, 170, 140, 2464, 7.5F,
            EnumSet.of(FURY_CUTTER, AIR_SLASH, STEEL_WING),
            EnumSet.of(AERIAL_ACE, NIGHT_SLASH, X_SCISSOR, BUG_BUZZ)),
    JYNX(124, "Jynx",
            EnumSet.of(ICE, Type.PSYCHIC),
            223, 182, 130, 2512, 7.5F,
            EnumSet.of(FROST_BREATH, CONFUSION, POUND),
            EnumSet.of(DRAINING_KISS, AVALANCHE, PSYSHOCK, ICE_PUNCH)),
    ELECTABUZZ(125, "Electabuzz",
            EnumSet.of(ELECTRIC),
            198, 173, 130, 2196, 7.5F,
            EnumSet.of(LOW_KICK, THUNDER_SHOCK),
            EnumSet.of(THUNDER, THUNDER_PUNCH, THUNDERBOLT)),
    MAGMAR(126, "Magmar",
            EnumSet.of(FIRE),
            206, 169, 130, 2254, 7F,
            EnumSet.of(EMBER, KARATE_CHOP),
            EnumSet.of(FIRE_BLAST, FIRE_PUNCH, FLAMETHROWER)),
    PINSIR(127, "Pinsir",
            EnumSet.of(BUG),
            238, 197, 130, 2770, 8F,
            EnumSet.of(BUG_BITE, ROCK_SMASH, FURY_CUTTER),
            EnumSet.of(CLOSE_COMBAT, VICE_GRIP, X_SCISSOR, SUBMISSION)),
    TAUROS(128, "Tauros",
            EnumSet.of(NORMAL),
            198, 197, 150, 2488, 7.5F,
            EnumSet.of(TACKLE, ZEN_HEADBUTT),
            EnumSet.of(EARTHQUAKE, HORN_ATTACK, IRON_HEAD)),
    MAGIKARP(129, "Magikarp",
            EnumSet.of(WATER),
            29, 102, 40, 220, 1F,
            EnumSet.of(SPLASH),
            EnumSet.of(STRUGGLE)),
    GYARADOS(130, "Gyarados",
            EnumSet.of(FLYING, WATER),
            237, 197, 190, 3281, 9F,
            EnumSet.of(BITE, DRAGON_TAIL, DRAGON_BREATH),
            EnumSet.of(CRUNCH, HYDRO_PUMP, OUTRAGE, DRAGON_PULSE, TWISTER)),
    LAPRAS(131, "Lapras",
            EnumSet.of(ICE, WATER),
            165, 180, 260, 2603, 9F,
            EnumSet.of(FROST_BREATH, WATER_GUN, ICE_SHARD),
            EnumSet.of(BLIZZARD, HYDRO_PUMP, ICE_BEAM, DRAGON_PULSE)),
    DITTO(132, "Ditto",
            EnumSet.of(NORMAL),
            91, 91, 96, 718, null,
            EnumSet.of(TRANSFORM),
            EnumSet.of(STRUGGLE)),
    EEVEE(133, "Eevee",
            EnumSet.of(NORMAL),
            104, 121, 110, 969, 4.5F,
            EnumSet.of(TACKLE, QUICK_ATTACK),
            EnumSet.of(DIG, SWIFT, BODY_SLAM)),
    VAPOREON(134, "Vaporeon",
            EnumSet.of(WATER),
            205, 177, 260, 3157, 10F,
            EnumSet.of(WATER_GUN),
            EnumSet.of(AQUA_TAIL, HYDRO_PUMP, WATER_PULSE)),
    JOLTEON(135, "Jolteon",
            EnumSet.of(ELECTRIC),
            232, 201, 130, 2730, 8.5F,
            EnumSet.of(THUNDER_SHOCK, VOLT_SWITCH),
            EnumSet.of(DISCHARGE, THUNDER, THUNDERBOLT)),
    FLAREON(136, "Flareon",
            EnumSet.of(FIRE),
            246, 204, 130, 2904, 8F,
            EnumSet.of(EMBER, FIRE_SPIN),
            EnumSet.of(FIRE_BLAST, FLAMETHROWER, OVERHEAT, HEAT_WAVE)),
    PORYGON(137, "Porygon",
            EnumSet.of(NORMAL),
            153, 139, 130, 1567, 4.5F,
            EnumSet.of(CHARGE_BEAM, HIDDEN_POWER, QUICK_ATTACK, TACKLE, ZEN_HEADBUTT),
            EnumSet.of(SOLAR_BEAM, HYPER_BEAM, ZAP_CANNON, DISCHARGE, PSYBEAM, SIGNAL_BEAM)),
    OMANYTE(138, "Omanyte",
            EnumSet.of(ROCK, WATER),
            155, 174, 70, 1345, 4.5F,
            EnumSet.of(MUD_SHOT, WATER_GUN),
            EnumSet.of(ANCIENT_POWER, BUBBLE_BEAM, ROCK_BLAST, ROCK_TOMB, BRINE)),
    OMASTAR(139, "Omastar",
            EnumSet.of(ROCK, WATER),
            207, 227, 140, 2685, 9.5F,
            EnumSet.of(MUD_SHOT, WATER_GUN, ROCK_THROW),
            EnumSet.of(ANCIENT_POWER, HYDRO_PUMP, ROCK_BLAST, ROCK_SLIDE)),
    KABUTO(140, "Kabuto",
            EnumSet.of(ROCK, WATER),
            148, 162, 60, 1172, 5F,
            EnumSet.of(MUD_SHOT, SCRATCH),
            EnumSet.of(ANCIENT_POWER, AQUA_JET, ROCK_TOMB)),
    KABUTOPS(141, "Kabutops",
            EnumSet.of(ROCK, WATER),
            220, 203, 120, 2517, 8F,
            EnumSet.of(ROCK_SMASH, MUD_SHOT, FURY_CUTTER),
            EnumSet.of(ANCIENT_POWER, STONE_EDGE, WATER_PULSE)),
    AERODACTYL(142, "Aerodactyl",
            EnumSet.of(FLYING, ROCK),
            221, 164, 160, 2608, 7.5F,
            EnumSet.of(BITE, STEEL_WING),
            EnumSet.of(ANCIENT_POWER, HYPER_BEAM, IRON_HEAD)),
    SNORLAX(143, "Snorlax",
            EnumSet.of(NORMAL),
            190, 190, 320, 3355, 10F,
            EnumSet.of(LICK, ZEN_HEADBUTT),
            EnumSet.of(HEAVY_SLAM, EARTHQUAKE, HYPER_BEAM, BODY_SLAM)),
    ARTICUNO(144, "Articuno",
            EnumSet.of(FLYING, ICE),
            192, 249, 180, 2933, null,
            EnumSet.of(FROST_BREATH),
            EnumSet.of(BLIZZARD, ICE_BEAM, ICY_WIND)),
    ZAPDOS(145, "Zapdos",
            EnumSet.of(ELECTRIC, FLYING),
            253, 188, 180, 3330, null,
            EnumSet.of(CHARGE_BEAM, THUNDER_SHOCK),
            EnumSet.of(ZAP_CANNON, THUNDER, THUNDERBOLT, DISCHARGE)),
    MOLTRES(146, "Moltres",
            EnumSet.of(FIRE, FLYING),
            251, 184, 180, 3272, null,
            EnumSet.of(FIRE_SPIN, EMBER),
            EnumSet.of(FIRE_BLAST, OVERHEAT, HEAT_WAVE, FLAMETHROWER)),
    DRATINI(147, "Dratini",
            EnumSet.of(DRAGON),
            119, 94, 82, 860, 4F,
            EnumSet.of(DRAGON_BREATH, IRON_TAIL),
            EnumSet.of(AQUA_TAIL, TWISTER, WRAP)),
    DRAGONAIR(148, "Dragonair",
            EnumSet.of(DRAGON),
            163, 138, 122, 1609, 6F,
            EnumSet.of(DRAGON_BREATH, IRON_TAIL),
            EnumSet.of(AQUA_TAIL, DRAGON_PULSE, WRAP)),
    DRAGONITE(149, "Dragonite",
            EnumSet.of(DRAGON, FLYING),
            263, 201, 182, 3581, 10F,
            EnumSet.of(DRAGON_TAIL, STEEL_WING, DRAGON_BREATH),
            EnumSet.of(HURRICANE, OUTRAGE, HYPER_BEAM, DRAGON_CLAW, DRAGON_PULSE)),
    MEWTWO(150, "Mewtwo",
            EnumSet.of(Type.PSYCHIC),
            330, 200, 212, 4760, null,
            EnumSet.of(CONFUSION, PSYCHO_CUT),
            EnumSet.of(HYPER_BEAM, Move.PSYCHIC, SHADOW_BALL, FOCUS_BLAST)),
    MEW(151, "Mew",
            EnumSet.of(Type.PSYCHIC),
            210, 209, 200, 3083, null,
            EnumSet.of(POUND),
            EnumSet.of(BLIZZARD, EARTHQUAKE, Move.PSYCHIC, FOCUS_BLAST, THUNDER, FIRE_BLAST, HYPER_BEAM, SOLAR_BEAM, HURRICANE, DRAGON_PULSE)),
    CHIKORITA(152, "Chikorita",
            EnumSet.of(GRASS),
            92, 122, 90, 801, null,
            EnumSet.of(VINE_WHIP, TACKLE),
            EnumSet.of(ENERGY_BALL, GRASS_KNOT, BODY_SLAM)),
    BAYLEEF(153, "Bayleef",
            EnumSet.of(GRASS),
            122, 155, 120, 1296, null,
            EnumSet.of(RAZOR_LEAF, TACKLE),
            EnumSet.of(ENERGY_BALL, GRASS_KNOT, ANCIENT_POWER)),
    MEGANIUM(154, "Meganium",
            EnumSet.of(GRASS),
            168, 202, 160, 2227, null,
            EnumSet.of(RAZOR_LEAF, VINE_WHIP),
            EnumSet.of(PETAL_BLIZZARD, SOLAR_BEAM, EARTHQUAKE)),
    CYNDAQUIL(155, "Cyndaquil",
            EnumSet.of(FIRE),
            116, 96, 78, 831, null,
            EnumSet.of(EMBER, TACKLE),
            EnumSet.of(FLAME_CHARGE, SWIFT, FLAMETHROWER)),
    QUILAVA(156, "Quilava",
            EnumSet.of(FIRE),
            158, 129, 116, 1484, null,
            EnumSet.of(EMBER, TACKLE),
            EnumSet.of(FLAME_CHARGE, DIG, FLAMETHROWER)),
    TYPHLOSION(157, "Typhlosion",
            EnumSet.of(FIRE),
            223, 176, 156, 2686, null,
            EnumSet.of(EMBER, SHADOW_CLAW),
            EnumSet.of(FIRE_BLAST, OVERHEAT, SOLAR_BEAM)),
    TOTODILE(158, "Totodile",
            EnumSet.of(WATER),
            117, 116, 100, 1011, null,
            EnumSet.of(WATER_GUN, SCRATCH),
            EnumSet.of(CRUNCH, AQUA_JET, WATER_PULSE)),
    CROCONAW(159, "Croconaw",
            EnumSet.of(WATER),
            150, 151, 130, 1598, null,
            EnumSet.of(WATER_GUN, SCRATCH),
            EnumSet.of(CRUNCH, ICE_PUNCH, WATER_PULSE)),
    FERALIGATR(160, "Feraligatr",
            EnumSet.of(WATER),
            205, 197, 170, 2721, null,
            EnumSet.of(WATER_GUN, BITE),
            EnumSet.of(CRUNCH, HYDRO_PUMP, ICE_BEAM)),
    SENTRET(161, "Sentret",
            EnumSet.of(NORMAL),
            79, 77, 70, 519, null,
            EnumSet.of(SCRATCH, QUICK_ATTACK),
            EnumSet.of(DIG, BRICK_BREAK, GRASS_KNOT)),
    FURRET(162, "Furret",
            EnumSet.of(NORMAL),
            148, 130, 170, 1667, null,
            EnumSet.of(QUICK_ATTACK, SUCKER_PUNCH),
            EnumSet.of(DIG, BRICK_BREAK, HYPER_BEAM)),
    HOOTHOOT(163, "Hoothoot",
            EnumSet.of(FLYING, NORMAL),
            67, 101, 120, 640, null,
            EnumSet.of(FEINT_ATTACK, PECK),
            EnumSet.of(BLIZZARD)),
    NOCTOWL(164, "Noctowl",
            EnumSet.of(FLYING, NORMAL),
            145, 179, 200, 2040, null,
            EnumSet.of(WING_ATTACK, EXTRASENSORY),
            EnumSet.of(Move.PSYCHIC, SKY_ATTACK, NIGHT_SHADE)),
    LEDYBA(165, "Ledyba",
            EnumSet.of(BUG, FLYING),
            72, 142, 80, 663, null,
            EnumSet.of(TACKLE, BUG_BITE),
            EnumSet.of(SWIFT, SILVER_WIND, AERIAL_ACE)),
    LEDIAN(166, "Ledian",
            EnumSet.of(BUG, FLYING),
            107, 209, 110, 1275, null,
            EnumSet.of(STRUGGLE_BUG, BUG_BITE),
            EnumSet.of(BUG_BUZZ, SILVER_WIND, AERIAL_ACE)),
    SPINARAK(167, "Spinarak",
            EnumSet.of(BUG, POISON),
            105, 73, 80, 685, null,
            EnumSet.of(POISON_STING, BUG_BITE),
            EnumSet.of(NIGHT_SLASH, SIGNAL_BEAM, CROSS_POISON)),
    ARIADOS(168, "Ariados",
            EnumSet.of(BUG, POISON),
            161, 128, 140, 1636, null,
            EnumSet.of(POISON_STING, INFESTATION),
            EnumSet.of(SHADOW_SNEAK, MEGAHORN, CROSS_POISON)),
    CROBAT(169, "Crobat",
            EnumSet.of(FLYING, POISON),
            194, 178, 170, 2466, null,
            EnumSet.of(AIR_SLASH, BITE),
            EnumSet.of(SHADOW_BALL, AIR_CUTTER, SLUDGE_BOMB)),
    CHINCHOU(170, "Chinchou",
            EnumSet.of(ELECTRIC, WATER),
            106, 106, 150, 1067, null,
            EnumSet.of(BUBBLE, SPARK),
            EnumSet.of(WATER_PULSE, THUNDERBOLT, BUBBLE_BEAM)),
    LANTURN(171, "Lanturn",
            EnumSet.of(ELECTRIC, WATER),
            146, 146, 250, 2077, null,
            EnumSet.of(WATER_GUN, CHARGE_BEAM),
            EnumSet.of(HYDRO_PUMP, THUNDERBOLT, THUNDER)),
    PICHU(172, "Pichu",
            EnumSet.of(ELECTRIC),
            77, 63, 40, 376, null,
            EnumSet.of(THUNDER_SHOCK, QUICK_ATTACK),
            EnumSet.of(THUNDERBOLT, DISARMING_VOICE, THUNDER_PUNCH)),
    CLEFFA(173, "Cleffa",
            EnumSet.of(FAIRY),
            75, 91, 100, 620, null,
            EnumSet.of(ZEN_HEADBUTT, POUND),
            EnumSet.of(SIGNAL_BEAM, PSYSHOCK, GRASS_KNOT, Move.PSYCHIC, BODY_SLAM)),
    IGGLYBUFF(174, "Igglybuff",
            EnumSet.of(FAIRY, NORMAL),
            69, 34, 180, 512, null,
            EnumSet.of(POUND, FEINT_ATTACK),
            EnumSet.of(SHADOW_BALL, WILD_CHARGE, Move.PSYCHIC, BODY_SLAM)),
    TOGEPI(175, "Togepi",
            EnumSet.of(FAIRY),
            67, 116, 70, 540, null,
            EnumSet.of(HIDDEN_POWER, PECK, ZEN_HEADBUTT),
            EnumSet.of(ANCIENT_POWER, PSYSHOCK, DAZZLING_GLEAM)),
    TOGETIC(176, "Togetic",
            EnumSet.of(FAIRY, FLYING),
            139, 191, 110, 1543, null,
            EnumSet.of(EXTRASENSORY, HIDDEN_POWER),
            EnumSet.of(ANCIENT_POWER, DAZZLING_GLEAM, AERIAL_ACE)),
    NATU(177, "Natu",
            EnumSet.of(FLYING, Type.PSYCHIC),
            134, 89, 80, 925, null,
            EnumSet.of(PECK, QUICK_ATTACK),
            EnumSet.of(NIGHT_SHADE, PSYSHOCK, DRILL_PECK)),
    XATU(178, "Xatu",
            EnumSet.of(FLYING, Type.PSYCHIC),
            192, 146, 130, 1975, null,
            EnumSet.of(AIR_SLASH, FEINT_ATTACK),
            EnumSet.of(OMINOUS_WIND, FUTURE_SIGHT, AERIAL_ACE)),
    MAREEP(179, "Mareep",
            EnumSet.of(ELECTRIC),
            114, 82, 110, 887, null,
            EnumSet.of(TACKLE, THUNDER_SHOCK),
            EnumSet.of(BODY_SLAM, THUNDERBOLT, DISCHARGE)),
    FLAAFFY(180, "Flaaffy",
            EnumSet.of(ELECTRIC),
            145, 112, 140, 1402, null,
            EnumSet.of(TACKLE, CHARGE_BEAM),
            EnumSet.of(POWER_GEM, THUNDERBOLT, DISCHARGE)),
    AMPHAROS(181, "Ampharos",
            EnumSet.of(ELECTRIC),
            211, 172, 180, 2695, null,
            EnumSet.of(CHARGE_BEAM, VOLT_SWITCH),
            EnumSet.of(ZAP_CANNON, FOCUS_BLAST, THUNDER)),
    BELLOSSOM(182, "Bellossom",
            EnumSet.of(GRASS),
            169, 189, 150, 2108, null,
            EnumSet.of(RAZOR_LEAF, ACID),
            EnumSet.of(LEAF_BLADE, PETAL_BLIZZARD, DAZZLING_GLEAM)),
    MARILL(183, "Marill",
            EnumSet.of(FAIRY, WATER),
            37, 93, 140, 420, null,
            EnumSet.of(TACKLE, BUBBLE),
            EnumSet.of(BUBBLE_BEAM, AQUA_TAIL, BODY_SLAM)),
    AZUMARILL(184, "Azumarill",
            EnumSet.of(FAIRY, WATER),
            112, 152, 200, 1503, null,
            EnumSet.of(ROCK_SMASH, BUBBLE),
            EnumSet.of(PLAY_ROUGH, HYDRO_PUMP, ICE_BEAM)),
    SUDOWOODO(185, "Sudowoodo",
            EnumSet.of(ROCK),
            167, 198, 140, 2065, null,
            EnumSet.of(ROCK_THROW, COUNTER),
            EnumSet.of(STONE_EDGE, EARTHQUAKE, ROCK_SLIDE)),
    POLITOED(186, "Politoed",
            EnumSet.of(WATER),
            174, 192, 180, 2371, null,
            EnumSet.of(MUD_SHOT, BUBBLE),
            EnumSet.of(HYDRO_PUMP, BLIZZARD, EARTHQUAKE)),
    HOPPIP(187, "Hoppip",
            EnumSet.of(FLYING, GRASS),
            67, 101, 70, 508, null,
            EnumSet.of(TACKLE, BULLET_SEED),
            EnumSet.of(GRASS_KNOT, DAZZLING_GLEAM, SEED_BOMB)),
    SKIPLOOM(188, "Skiploom",
            EnumSet.of(FLYING, GRASS),
            91, 127, 110, 882, null,
            EnumSet.of(TACKLE, BULLET_SEED),
            EnumSet.of(GRASS_KNOT, DAZZLING_GLEAM, ENERGY_BALL)),
    JUMPLUFF(189, "Jumpluff",
            EnumSet.of(FLYING, GRASS),
            118, 197, 150, 1553, null,
            EnumSet.of(INFESTATION, BULLET_SEED),
            EnumSet.of(ENERGY_BALL, DAZZLING_GLEAM, SOLAR_BEAM)),
    AIPOM(190, "Aipom",
            EnumSet.of(NORMAL),
            136, 112, 110, 1188, null,
            EnumSet.of(SCRATCH, ASTONISH),
            EnumSet.of(LOW_SWEEP, SWIFT, AERIAL_ACE)),
    SUNKERN(191, "Sunkern",
            EnumSet.of(GRASS),
            55, 55, 60, 316, null,
            EnumSet.of(RAZOR_LEAF, CUT),
            EnumSet.of(ENERGY_BALL, GRASS_KNOT, SEED_BOMB)),
    SUNFLORA(192, "Sunflora",
            EnumSet.of(GRASS),
            185, 148, 150, 2048, null,
            EnumSet.of(RAZOR_LEAF, BULLET_SEED),
            EnumSet.of(SOLAR_BEAM, PETAL_BLIZZARD, SLUDGE_BOMB)),
    YANMA(193, "Yanma",
            EnumSet.of(BUG, FLYING),
            154, 94, 130, 1326, null,
            EnumSet.of(QUICK_ATTACK, WING_ATTACK),
            EnumSet.of(ANCIENT_POWER, AERIAL_ACE, SILVER_WIND)),
    WOOPER(194, "Wooper",
            EnumSet.of(GROUND, WATER),
            75, 75, 110, 596, null,
            EnumSet.of(WATER_GUN, MUD_SHOT),
            EnumSet.of(MUD_BOMB, DIG, BODY_SLAM)),
    QUAGSIRE(195, "Quagsire",
            EnumSet.of(GROUND, WATER),
            152, 152, 190, 1929, null,
            EnumSet.of(WATER_GUN, MUD_SHOT),
            EnumSet.of(SLUDGE_BOMB, EARTHQUAKE, STONE_EDGE)),
    ESPEON(196, "Espeon",
            EnumSet.of(Type.PSYCHIC),
            261, 194, 130, 3000, null,
            EnumSet.of(CONFUSION, ZEN_HEADBUTT),
            EnumSet.of(PSYBEAM, Move.PSYCHIC, FUTURE_SIGHT)),
    UMBREON(197, "Umbreon",
            EnumSet.of(DARK),
            126, 250, 190, 2052, null,
            EnumSet.of(FEINT_ATTACK, SNARL),
            EnumSet.of(DARK_PULSE, FOUL_PLAY)),
    MURKROW(198, "Murkrow",
            EnumSet.of(DARK, FLYING),
            175, 87, 120, 1392, null,
            EnumSet.of(PECK, FEINT_ATTACK),
            EnumSet.of(DRILL_PECK, FOUL_PLAY, DARK_PULSE)),
    SLOWKING(199, "Slowking",
            EnumSet.of(Type.PSYCHIC, WATER),
            177, 194, 190, 2482, null,
            EnumSet.of(WATER_GUN, CONFUSION),
            EnumSet.of(BLIZZARD, Move.PSYCHIC, FIRE_BLAST)),
    MISDREAVUS(200, "Misdreavus",
            EnumSet.of(GHOST),
            167, 167, 120, 1781, null,
            EnumSet.of(ASTONISH, HEX),
            EnumSet.of(DARK_PULSE, OMINOUS_WIND, SHADOW_SNEAK)),
    UNOWN(201, "Unown",
            EnumSet.of(Type.PSYCHIC),
            136, 91, 96, 1022, null,
            EnumSet.of(HIDDEN_POWER),
            EnumSet.of(STRUGGLE)),
    WOBBUFFET(202, "Wobbuffet",
            EnumSet.of(Type.PSYCHIC),
            60, 106, 380, 1024, null,
            EnumSet.of(COUNTER, SPLASH),
            EnumSet.of(MIRROR_COAT)),
    GIRAFARIG(203, "Girafarig",
            EnumSet.of(NORMAL, Type.PSYCHIC),
            182, 133, 140, 1863, null,
            EnumSet.of(TACKLE, CONFUSION),
            EnumSet.of(Move.PSYCHIC, THUNDERBOLT, MIRROR_COAT)),
    PINECO(204, "Pineco",
            EnumSet.of(BUG),
            108, 146, 100, 1045, null,
            EnumSet.of(TACKLE, BUG_BITE),
            EnumSet.of(GYRO_BALL, ROCK_TOMB, SAND_TOMB)),
    FORRETRESS(205, "Forretress",
            EnumSet.of(BUG, STEEL),
            161, 242, 150, 2263, null,
            EnumSet.of(BUG_BITE, STRUGGLE_BUG),
            EnumSet.of(HEAVY_SLAM, EARTHQUAKE, ROCK_TOMB)),
    DUNSPARCE(206, "Dunsparce",
            EnumSet.of(NORMAL),
            131, 131, 200, 1615, null,
            EnumSet.of(BITE, ASTONISH),
            EnumSet.of(DIG, ROCK_SLIDE, DRILL_RUN)),
    GLIGAR(207, "Gligar",
            EnumSet.of(FLYING, GROUND),
            143, 204, 130, 1758, null,
            EnumSet.of(FURY_CUTTER, WING_ATTACK),
            EnumSet.of(DIG, AERIAL_ACE, NIGHT_SLASH)),
    STEELIX(208, "Steelix",
            EnumSet.of(GROUND, STEEL),
            148, 333, 150, 2439, null,
            EnumSet.of(IRON_TAIL, DRAGON_TAIL),
            EnumSet.of(EARTHQUAKE, HEAVY_SLAM, CRUNCH)),
    SNUBBULL(209, "Snubbull",
            EnumSet.of(FAIRY),
            137, 89, 120, 1124, null,
            EnumSet.of(BITE, TACKLE),
            EnumSet.of(BRICK_BREAK, CRUNCH, DAZZLING_GLEAM)),
    GRANBULL(210, "Granbull",
            EnumSet.of(FAIRY),
            212, 137, 180, 2440, null,
            EnumSet.of(BITE, SNARL),
            EnumSet.of(CRUNCH, PLAY_ROUGH, CLOSE_COMBAT)),
    QWILFISH(211, "Qwilfish",
            EnumSet.of(POISON, WATER),
            184, 148, 130, 1910, null,
            EnumSet.of(POISON_STING, WATER_GUN),
            EnumSet.of(AQUA_TAIL, ICE_BEAM, SLUDGE_WAVE)),
    SCIZOR(212, "Scizor",
            EnumSet.of(BUG, STEEL),
            236, 191, 140, 2801, null,
            EnumSet.of(BULLET_PUNCH, FURY_CUTTER),
            EnumSet.of(X_SCISSOR, IRON_HEAD, NIGHT_SLASH)),
    SHUCKLE(213, "Shuckle",
            EnumSet.of(BUG, ROCK),
            17, 396, 40, 300, null,
            EnumSet.of(STRUGGLE_BUG, ROCK_THROW),
            EnumSet.of(ROCK_BLAST, STONE_EDGE, GYRO_BALL)),
    HERACROSS(214, "Heracross",
            EnumSet.of(BUG, FIGHTING),
            234, 189, 160, 2938, null,
            EnumSet.of(COUNTER, STRUGGLE_BUG),
            EnumSet.of(MEGAHORN, CLOSE_COMBAT, EARTHQUAKE)),
    SNEASEL(215, "Sneasel",
            EnumSet.of(DARK, ICE),
            189, 157, 110, 1868, null,
            EnumSet.of(ICE_SHARD, FEINT_ATTACK),
            EnumSet.of(AVALANCHE, ICE_PUNCH, FOUL_PLAY)),
    TEDDIURSA(216, "Teddiursa",
            EnumSet.of(NORMAL),
            142, 93, 120, 1184, null,
            EnumSet.of(SCRATCH, LICK),
            EnumSet.of(CROSS_CHOP, CRUNCH, PLAY_ROUGH)),
    URSARING(217, "Ursaring",
            EnumSet.of(NORMAL),
            236, 144, 180, 2760, null,
            EnumSet.of(METAL_CLAW, COUNTER),
            EnumSet.of(CLOSE_COMBAT, HYPER_BEAM, PLAY_ROUGH)),
    SLUGMA(218, "Slugma",
            EnumSet.of(FIRE),
            118, 71, 80, 750, null,
            EnumSet.of(EMBER, ROCK_THROW),
            EnumSet.of(FLAME_BURST, FLAME_CHARGE, ROCK_SLIDE)),
    MAGCARGO(219, "Magcargo",
            EnumSet.of(FIRE, ROCK),
            139, 209, 100, 1543, null,
            EnumSet.of(EMBER, ROCK_THROW),
            EnumSet.of(HEAT_WAVE, OVERHEAT, STONE_EDGE)),
    SWINUB(220, "Swinub",
            EnumSet.of(GROUND, ICE),
            90, 74, 100, 663, null,
            EnumSet.of(TACKLE, POWDER_SNOW),
            EnumSet.of(ICY_WIND, BODY_SLAM, ROCK_SLIDE)),
    PILOSWINE(221, "Piloswine",
            EnumSet.of(GROUND, ICE),
            181, 147, 200, 2284, null,
            EnumSet.of(ICE_SHARD, POWDER_SNOW),
            EnumSet.of(AVALANCHE, BULLDOZE, STONE_EDGE)),
    CORSOLA(222, "Corsola",
            EnumSet.of(ROCK, WATER),
            118, 156, 110, 1214, null,
            EnumSet.of(TACKLE, BUBBLE),
            EnumSet.of(ROCK_BLAST, POWER_GEM, BUBBLE_BEAM)),
    REMORAID(223, "Remoraid",
            EnumSet.of(WATER),
            127, 69, 70, 749, null,
            EnumSet.of(WATER_GUN, MUD_SHOT),
            EnumSet.of(AURORA_BEAM, WATER_PULSE, ROCK_BLAST)),
    OCTILLERY(224, "Octillery",
            EnumSet.of(WATER),
            197, 141, 150, 2124, null,
            EnumSet.of(WATER_GUN, MUD_SHOT),
            EnumSet.of(GUNK_SHOT, WATER_PULSE, AURORA_BEAM)),
    DELIBIRD(225, "Delibird",
            EnumSet.of(FLYING, ICE),
            128, 90, 90, 937, null,
            EnumSet.of(ICE_SHARD, QUICK_ATTACK),
            EnumSet.of(ICE_PUNCH, ICY_WIND, AERIAL_ACE)),
    MANTINE(226, "Mantine",
            EnumSet.of(FLYING, WATER),
            148, 260, 130, 2032, null,
            EnumSet.of(BUBBLE, WING_ATTACK),
            EnumSet.of(WATER_PULSE, ICE_BEAM, AERIAL_ACE)),
    SKARMORY(227, "Skarmory",
            EnumSet.of(FLYING, STEEL),
            148, 260, 130, 2032, null,
            EnumSet.of(STEEL_WING, AIR_SLASH),
            EnumSet.of(BRAVE_BIRD, SKY_ATTACK, FLASH_CANNON)),
    HOUNDOUR(228, "Houndour",
            EnumSet.of(DARK, FIRE),
            152, 93, 90, 1110, null,
            EnumSet.of(FEINT_ATTACK, EMBER),
            EnumSet.of(CRUNCH, FLAMETHROWER, DARK_PULSE)),
    HOUNDOOM(229, "Houndoom",
            EnumSet.of(DARK, FIRE),
            224, 159, 150, 2529, null,
            EnumSet.of(SNARL, FIRE_FANG),
            EnumSet.of(CRUNCH, FIRE_BLAST, FOUL_PLAY)),
    KINGDRA(230, "Kingdra",
            EnumSet.of(DRAGON, WATER),
            194, 194, 150, 2424, null,
            EnumSet.of(WATER_GUN, DRAGON_BREATH),
            EnumSet.of(HYDRO_PUMP, BLIZZARD, OUTRAGE)),
    PHANPY(231, "Phanpy",
            EnumSet.of(GROUND),
            107, 107, 180, 1175, null,
            EnumSet.of(TACKLE, ROCK_SMASH),
            EnumSet.of(BULLDOZE, ROCK_SLIDE, BODY_SLAM)),
    DONPHAN(232, "Donphan",
            EnumSet.of(GROUND),
            214, 214, 180, 3022, null,
            EnumSet.of(TACKLE, COUNTER),
            EnumSet.of(EARTHQUAKE, HEAVY_SLAM, PLAY_ROUGH)),
    PORYGON2(233, "Porygon2",
            EnumSet.of(NORMAL),
            198, 183, 170, 2546, null,
            EnumSet.of(HIDDEN_POWER, CHARGE_BEAM),
            EnumSet.of(SOLAR_BEAM, HYPER_BEAM, ZAP_CANNON)),
    STANTLER(234, "Stantler",
            EnumSet.of(NORMAL),
            192, 132, 146, 1988, null,
            EnumSet.of(TACKLE, ZEN_HEADBUTT),
            EnumSet.of(STOMP, WILD_CHARGE, MEGAHORN)),
    SMEARGLE(235, "Smeargle",
            EnumSet.of(NORMAL),
            40, 88, 110, 389, null,
            EnumSet.of(TACKLE),
            EnumSet.of(STRUGGLE)),
    TYROGUE(236, "Tyrogue",
            EnumSet.of(FIGHTING),
            64, 64, 70, 404, null,
            EnumSet.of(ROCK_SMASH, TACKLE),
            EnumSet.of(BRICK_BREAK, ROCK_SLIDE, LOW_SWEEP)),
    HITMONTOP(237, "Hitmontop",
            EnumSet.of(FIGHTING),
            173, 214, 100, 1905, null,
            EnumSet.of(ROCK_SMASH, COUNTER),
            EnumSet.of(CLOSE_COMBAT, GYRO_BALL, STONE_EDGE)),
    SMOOCHUM(238, "Smoochum",
            EnumSet.of(ICE, Type.PSYCHIC),
            153, 116, 90, 1230, null,
            EnumSet.of(POWDER_SNOW, POUND, FROST_BREATH),
            EnumSet.of(ICE_BEAM, ICE_PUNCH, PSYSHOCK)),
    ELEKID(239, "Elekid",
            EnumSet.of(ELECTRIC),
            135, 110, 90, 1073, null,
            EnumSet.of(THUNDER_SHOCK, LOW_KICK),
            EnumSet.of(THUNDER_PUNCH, BRICK_BREAK, DISCHARGE, THUNDERBOLT)),
    MAGBY(240, "Magby",
            EnumSet.of(FIRE),
            151, 108, 90, 1178, null,
            EnumSet.of(EMBER, KARATE_CHOP),
            EnumSet.of(BRICK_BREAK, FIRE_PUNCH, FLAME_BURST, FLAMETHROWER)),
    MILTANK(241, "Miltank",
            EnumSet.of(NORMAL),
            157, 211, 190, 2312, null,
            EnumSet.of(TACKLE, ZEN_HEADBUTT),
            EnumSet.of(STOMP, BODY_SLAM, GYRO_BALL)),
    BLISSEY(242, "Blissey",
            EnumSet.of(NORMAL),
            129, 229, 510, 3219, 10F,
            EnumSet.of(POUND, ZEN_HEADBUTT),
            EnumSet.of(DAZZLING_GLEAM, HYPER_BEAM, Move.PSYCHIC)),
    RAIKOU(243, "Raikou",
            EnumSet.of(ELECTRIC),
            241, 210, 180, 3349, null,
            EnumSet.of(THUNDER_SHOCK, VOLT_SWITCH),
            EnumSet.of(THUNDER, THUNDERBOLT, WILD_CHARGE)),
    ENTEI(244, "Entei",
            EnumSet.of(FIRE),
            235, 180, 230, 3412, null,
            EnumSet.of(FIRE_SPIN, FIRE_FANG),
            EnumSet.of(FLAMETHROWER, FIRE_BLAST, OVERHEAT)),
    SUICUNE(245, "Suicune",
            EnumSet.of(WATER),
            180, 235, 200, 2823, null,
            EnumSet.of(EXTRASENSORY, SNARL),
            EnumSet.of(HYDRO_PUMP, BUBBLE_BEAM, WATER_PULSE)),
    LARVITAR(246, "Larvitar",
            EnumSet.of(GROUND, ROCK),
            115, 93, 100, 904, null,
            EnumSet.of(BITE, ROCK_SMASH),
            EnumSet.of(STOMP, CRUNCH, ANCIENT_POWER)),
    PUPITAR(247, "Pupitar",
            EnumSet.of(GROUND, ROCK),
            155, 133, 140, 1608, null,
            EnumSet.of(BITE, ROCK_SMASH),
            EnumSet.of(DIG, CRUNCH, ANCIENT_POWER)),
    TYRANITAR(248, "Tyranitar",
            EnumSet.of(DARK, ROCK),
            251, 212, 200, 3670, null,
            EnumSet.of(BITE, IRON_TAIL),
            EnumSet.of(FIRE_BLAST, CRUNCH, STONE_EDGE)),
    LUGIA(249, "Lugia",
            EnumSet.of(FLYING, Type.PSYCHIC),
            193, 323, 212, 3598, null,
            EnumSet.of(EXTRASENSORY, DRAGON_TAIL),
            EnumSet.of(SKY_ATTACK, HYDRO_PUMP, FUTURE_SIGHT)),
    HO_OH(250, "Ho-Oh",
          EnumSet.of(FIRE, FLYING),
                263, 301, 212, 4650, null,
            EnumSet.of(EXTRASENSORY, STEEL_WING),
            EnumSet.of(BRAVE_BIRD, FIRE_BLAST, SOLAR_BEAM)),
    CELEBI(251, "Celebi",
           EnumSet.of(GRASS, Type.PSYCHIC),
                210, 210, 200, 3090, null,
            EnumSet.of(CONFUSION, CHARGE_BEAM),
            EnumSet.of(HYPER_BEAM, Move.PSYCHIC, DAZZLING_GLEAM));

    private static final  Map<Integer, Pokemon> BY_NUMBER = new HashMap();
    private final int number;
    private final String name;
    private final Set<Type> types;
    private final int baseAttack;
    private final int baseDefense;
    private final int baseStamina;
    private final int maxCp;
    private final Float rating;
    private Set<Move> quickMoves;
    private Set<Move> chargeMoves;
    private Map<Moveset, MovesetRating> movesetRanks;


    Pokemon(int number, String name, Set<Type> types, int baseAttack, int baseDefense, int baseStamina, int maxCp, Float rating, Set<Move> quickMoves, Set<Move> chargeMoves) {
        this.number = number;
        this.name = name;
        this.types = Collections.unmodifiableSet(types);
        this.baseAttack = baseAttack;
        this.baseDefense = baseDefense;
        this.baseStamina = baseStamina;
        this.maxCp = maxCp;
        this.rating = rating;
        this.quickMoves = Collections.unmodifiableSet(quickMoves);
        this.chargeMoves = Collections.unmodifiableSet(chargeMoves);
        movesetRanks = new HashMap<>();
        quickMoves.forEach(quickMove -> chargeMoves.forEach(chargeMove -> movesetRanks.put(Moveset.of(quickMove, chargeMove), MovesetRating.unknown())));
    }

    static {
        Arrays.stream(Pokemon.values()).forEach(pokemon -> BY_NUMBER.put(pokemon.number, pokemon));

        BULBASAUR.movesetRanks.put(Moveset.of(TACKLE, SLUDGE_BOMB), MovesetRating.of(null, "A1"));
        BULBASAUR.movesetRanks.put(Moveset.of(VINE_WHIP, SLUDGE_BOMB), MovesetRating.of("A1", null));
        BULBASAUR.movesetRanks = Collections.unmodifiableMap(BULBASAUR.movesetRanks);

        IVYSAUR.movesetRanks.put(Moveset.of(RAZOR_LEAF, SOLAR_BEAM), MovesetRating.of(null, "A1"));
        IVYSAUR.movesetRanks.put(Moveset.of(VINE_WHIP, SOLAR_BEAM), MovesetRating.of("A1", null));
        IVYSAUR.movesetRanks = Collections.unmodifiableMap(IVYSAUR.movesetRanks);

        VENUSAUR.movesetRanks.put(Moveset.of(RAZOR_LEAF, SOLAR_BEAM), MovesetRating.of("B4", "B3"));
        VENUSAUR.movesetRanks.put(Moveset.of(VINE_WHIP, SLUDGE_BOMB), MovesetRating.of("B3", "C4"));
        VENUSAUR.movesetRanks.put(Moveset.of(RAZOR_LEAF, PETAL_BLIZZARD), MovesetRating.of("B5", "B2"));
        VENUSAUR.movesetRanks.put(Moveset.of(RAZOR_LEAF, SLUDGE_BOMB), MovesetRating.of("C6", "A1"));
        VENUSAUR.movesetRanks.put(Moveset.of(VINE_WHIP, PETAL_BLIZZARD), MovesetRating.of("A2", "D5"));
        VENUSAUR.movesetRanks.put(Moveset.of(VINE_WHIP, SOLAR_BEAM), MovesetRating.of("A1", "D6"));
        VENUSAUR.movesetRanks = Collections.unmodifiableMap(VENUSAUR.movesetRanks);

        CHARMANDER.movesetRanks.put(Moveset.of(SCRATCH, FLAMETHROWER), MovesetRating.of("A1", null));
        CHARMANDER.movesetRanks.put(Moveset.of(EMBER, FLAMETHROWER), MovesetRating.of(null, "A1"));
        CHARMANDER.movesetRanks = Collections.unmodifiableMap(CHARMANDER.movesetRanks);

        CHARMELEON.movesetRanks.put(Moveset.of(SCRATCH, FLAMETHROWER), MovesetRating.of("A1", null));
        CHARMELEON.movesetRanks.put(Moveset.of(EMBER, FLAMETHROWER), MovesetRating.of(null, "A1"));
        CHARMELEON.movesetRanks = Collections.unmodifiableMap(CHARMELEON.movesetRanks);

        CHARIZARD.movesetRanks.put(Moveset.of(WING_ATTACK, FIRE_BLAST), MovesetRating.of("A1", "B3"));
        CHARIZARD.movesetRanks.put(Moveset.of(EMBER, FLAMETHROWER), MovesetRating.of("D5", "B2"));
        CHARIZARD.movesetRanks.put(Moveset.of(EMBER, DRAGON_CLAW), MovesetRating.of("F6", "D5"));
        CHARIZARD.movesetRanks.put(Moveset.of(EMBER, FIRE_BLAST), MovesetRating.of("C4", "B4"));
        CHARIZARD.movesetRanks.put(Moveset.of(WING_ATTACK, FLAMETHROWER), MovesetRating.of("B2", "A1"));
        CHARIZARD.movesetRanks.put(Moveset.of(WING_ATTACK, DRAGON_CLAW), MovesetRating.of("B3", "D6"));
        CHARIZARD.movesetRanks = Collections.unmodifiableMap(CHARIZARD.movesetRanks);

        SQUIRTLE.movesetRanks.put(Moveset.of(BUBBLE, AQUA_TAIL), MovesetRating.of("A1", "A1"));
        SQUIRTLE.movesetRanks = Collections.unmodifiableMap(SQUIRTLE.movesetRanks);

        WARTORTLE.movesetRanks.put(Moveset.of(WATER_GUN, HYDRO_PUMP), MovesetRating.of("A1", "A1"));
        WARTORTLE.movesetRanks = Collections.unmodifiableMap(WARTORTLE.movesetRanks);

        BLASTOISE.movesetRanks.put(Moveset.of(WATER_GUN, FLASH_CANNON), MovesetRating.of("C3", "A1"));
        BLASTOISE.movesetRanks.put(Moveset.of(BITE, HYDRO_PUMP), MovesetRating.of("B2", "D6"));
        BLASTOISE.movesetRanks.put(Moveset.of(BITE, FLASH_CANNON), MovesetRating.of("F6", "B2"));
        BLASTOISE.movesetRanks.put(Moveset.of(BITE, ICE_BEAM), MovesetRating.of("D5", "C5"));
        BLASTOISE.movesetRanks.put(Moveset.of(WATER_GUN, HYDRO_PUMP), MovesetRating.of("A1", "C4"));
        BLASTOISE.movesetRanks.put(Moveset.of(WATER_GUN, ICE_BEAM), MovesetRating.of("C4", "B3"));
        BLASTOISE.movesetRanks = Collections.unmodifiableMap(BLASTOISE.movesetRanks);

        CATERPIE.movesetRanks.put(Moveset.of(TACKLE, STRUGGLE), MovesetRating.of(null, "A1"));
        CATERPIE.movesetRanks.put(Moveset.of(BUG_BITE, STRUGGLE), MovesetRating.of("A1", null));
        CATERPIE.movesetRanks = Collections.unmodifiableMap(CATERPIE.movesetRanks);

        METAPOD.movesetRanks.put(Moveset.of(TACKLE, STRUGGLE), MovesetRating.of(null, "A1"));
        METAPOD.movesetRanks.put(Moveset.of(BUG_BITE, STRUGGLE), MovesetRating.of("A1", null));
        METAPOD.movesetRanks = Collections.unmodifiableMap(METAPOD.movesetRanks);

        BUTTERFREE.movesetRanks.put(Moveset.of(CONFUSION, Move.PSYCHIC), MovesetRating.of("D5", "C6"));
        BUTTERFREE.movesetRanks.put(Moveset.of(CONFUSION, SIGNAL_BEAM), MovesetRating.of("D6", "A4"));
        BUTTERFREE.movesetRanks.put(Moveset.of(CONFUSION, BUG_BUZZ), MovesetRating.of("C4", "A3"));
        BUTTERFREE.movesetRanks.put(Moveset.of(BUG_BITE, SIGNAL_BEAM), MovesetRating.of("B2", "A1"));
        BUTTERFREE.movesetRanks.put(Moveset.of(BUG_BITE, Move.PSYCHIC), MovesetRating.of("B3", "C5"));
        BUTTERFREE.movesetRanks.put(Moveset.of(BUG_BITE, BUG_BUZZ), MovesetRating.of("A1", "A2"));
        BUTTERFREE.movesetRanks = Collections.unmodifiableMap(BUTTERFREE.movesetRanks);

        WEEDLE.movesetRanks.put(Moveset.of(BUG_BITE, STRUGGLE), MovesetRating.of("A1", null));
        WEEDLE.movesetRanks.put(Moveset.of(POISON_STING, STRUGGLE), MovesetRating.of(null, "A1"));
        WEEDLE.movesetRanks = Collections.unmodifiableMap(WEEDLE.movesetRanks);

        KAKUNA.movesetRanks.put(Moveset.of(BUG_BITE, STRUGGLE), MovesetRating.of("A1", null));
        KAKUNA.movesetRanks.put(Moveset.of(POISON_STING, STRUGGLE), MovesetRating.of(null, "A1"));
        KAKUNA.movesetRanks = Collections.unmodifiableMap(KAKUNA.movesetRanks);

        BEEDRILL.movesetRanks.put(Moveset.of(BUG_BITE, X_SCISSOR), MovesetRating.of("B3", "A2"));
        BEEDRILL.movesetRanks.put(Moveset.of(BUG_BITE, SLUDGE_BOMB), MovesetRating.of("A1", "A1"));
        BEEDRILL.movesetRanks.put(Moveset.of(BUG_BITE, AERIAL_ACE), MovesetRating.of("C5", "F6"));
        BEEDRILL.movesetRanks.put(Moveset.of(POISON_JAB, AERIAL_ACE), MovesetRating.of("D6", "D5"));
        BEEDRILL.movesetRanks.put(Moveset.of(POISON_JAB, SLUDGE_BOMB), MovesetRating.of("B2", "A3"));
        BEEDRILL.movesetRanks.put(Moveset.of(POISON_JAB, X_SCISSOR), MovesetRating.of("C4", "B4"));
        BEEDRILL.movesetRanks = Collections.unmodifiableMap(BEEDRILL.movesetRanks);

        PIDGEY.movesetRanks.put(Moveset.of(TACKLE, AERIAL_ACE), MovesetRating.of("A1", "A1"));
        PIDGEY.movesetRanks = Collections.unmodifiableMap(PIDGEY.movesetRanks);

        PIDGEOTTO.movesetRanks.put(Moveset.of(STEEL_WING, AERIAL_ACE), MovesetRating.of(null, "A1"));
        PIDGEOTTO.movesetRanks.put(Moveset.of(WING_ATTACK, AERIAL_ACE), MovesetRating.of("A1", null));
        PIDGEOTTO.movesetRanks = Collections.unmodifiableMap(PIDGEOTTO.movesetRanks);

        PIDGEOT.movesetRanks.put(Moveset.of(WING_ATTACK, HURRICANE), MovesetRating.of("A1", "B6"));
        PIDGEOT.movesetRanks.put(Moveset.of(STEEL_WING, HURRICANE), MovesetRating.of("C2", "B4"));
        PIDGEOT.movesetRanks.put(Moveset.of(WING_ATTACK, AIR_CUTTER), MovesetRating.of("C3", "B5"));
        PIDGEOT.movesetRanks.put(Moveset.of(STEEL_WING, AERIAL_ACE), MovesetRating.of("F5", "A1"));
        PIDGEOT.movesetRanks.put(Moveset.of(STEEL_WING, AIR_CUTTER), MovesetRating.of("F6", "B3"));
        PIDGEOT.movesetRanks.put(Moveset.of(WING_ATTACK, AERIAL_ACE), MovesetRating.of("C4", "B2"));
        PIDGEOT.movesetRanks = Collections.unmodifiableMap(PIDGEOT.movesetRanks);

        RATTATA.movesetRanks.put(Moveset.of(TACKLE, HYPER_FANG), MovesetRating.of(null, "A1"));
        RATTATA.movesetRanks.put(Moveset.of(TACKLE, BODY_SLAM), MovesetRating.of("A1", null));
        RATTATA.movesetRanks = Collections.unmodifiableMap(RATTATA.movesetRanks);

        RATICATE.movesetRanks.put(Moveset.of(QUICK_ATTACK, HYPER_BEAM), MovesetRating.of("B3", "B5"));
        RATICATE.movesetRanks.put(Moveset.of(BITE, DIG), MovesetRating.of("D5", "B2"));
        RATICATE.movesetRanks.put(Moveset.of(QUICK_ATTACK, HYPER_FANG), MovesetRating.of("C4", "B6"));
        RATICATE.movesetRanks.put(Moveset.of(QUICK_ATTACK, DIG), MovesetRating.of("F6", "B4"));
        RATICATE.movesetRanks.put(Moveset.of(BITE, HYPER_BEAM), MovesetRating.of("A1", "B3"));
        RATICATE.movesetRanks.put(Moveset.of(BITE, HYPER_FANG), MovesetRating.of("B2", "A1"));
        RATICATE.movesetRanks = Collections.unmodifiableMap(RATICATE.movesetRanks);

        SPEAROW.movesetRanks.put(Moveset.of(QUICK_ATTACK, DRILL_PECK), MovesetRating.of(null, "A1"));
        SPEAROW.movesetRanks.put(Moveset.of(PECK, DRILL_PECK), MovesetRating.of("A1", null));
        SPEAROW.movesetRanks = Collections.unmodifiableMap(SPEAROW.movesetRanks);

        FEAROW.movesetRanks.put(Moveset.of(STEEL_WING, DRILL_RUN), MovesetRating.of("A1", "A2"));
        FEAROW.movesetRanks.put(Moveset.of(PECK, DRILL_RUN), MovesetRating.of("A2", "A4"));
        FEAROW.movesetRanks.put(Moveset.of(STEEL_WING, TWISTER), MovesetRating.of("B6", "C6"));
        FEAROW.movesetRanks.put(Moveset.of(PECK, AERIAL_ACE), MovesetRating.of("B3", "A3"));
        FEAROW.movesetRanks.put(Moveset.of(STEEL_WING, AERIAL_ACE), MovesetRating.of("B5", "A1"));
        FEAROW.movesetRanks.put(Moveset.of(PECK, TWISTER), MovesetRating.of("B4", "C5"));
        FEAROW.movesetRanks = Collections.unmodifiableMap(FEAROW.movesetRanks);

        EKANS.movesetRanks.put(Moveset.of(ACID, SLUDGE_BOMB), MovesetRating.of(null, "A1"));
        EKANS.movesetRanks.put(Moveset.of(POISON_STING, SLUDGE_BOMB), MovesetRating.of("A1", null));
        EKANS.movesetRanks = Collections.unmodifiableMap(EKANS.movesetRanks);

        ARBOK.movesetRanks.put(Moveset.of(ACID, GUNK_SHOT), MovesetRating.of("B3", "B4"));
        ARBOK.movesetRanks.put(Moveset.of(BITE, DARK_PULSE), MovesetRating.of("C5", "A2"));
        ARBOK.movesetRanks.put(Moveset.of(BITE, SLUDGE_WAVE), MovesetRating.of("A1", "C5"));
        ARBOK.movesetRanks.put(Moveset.of(ACID, SLUDGE_WAVE), MovesetRating.of("B4", "B3"));
        ARBOK.movesetRanks.put(Moveset.of(ACID, DARK_PULSE), MovesetRating.of("D6", "A1"));
        ARBOK.movesetRanks.put(Moveset.of(BITE, GUNK_SHOT), MovesetRating.of("A2", "C6"));
        ARBOK.movesetRanks = Collections.unmodifiableMap(ARBOK.movesetRanks);

        PIKACHU.movesetRanks.put(Moveset.of(QUICK_ATTACK, THUNDERBOLT), MovesetRating.of(null, "A1"));
        PIKACHU.movesetRanks.put(Moveset.of(THUNDER_SHOCK, THUNDER), MovesetRating.of("A1", null));
        PIKACHU.movesetRanks = Collections.unmodifiableMap(PIKACHU.movesetRanks);

        RAICHU.movesetRanks.put(Moveset.of(SPARK, BRICK_BREAK), MovesetRating.of("D5", "C3"));
        RAICHU.movesetRanks.put(Moveset.of(THUNDER_SHOCK, THUNDER_PUNCH), MovesetRating.of("B4", "A2"));
        RAICHU.movesetRanks.put(Moveset.of(THUNDER_SHOCK, THUNDER), MovesetRating.of("A2", "C6"));
        RAICHU.movesetRanks.put(Moveset.of(SPARK, THUNDER), MovesetRating.of("A1", "C4"));
        RAICHU.movesetRanks.put(Moveset.of(SPARK, THUNDER_PUNCH), MovesetRating.of("B3", "A1"));
        RAICHU.movesetRanks.put(Moveset.of(THUNDER_SHOCK, BRICK_BREAK), MovesetRating.of("D6", "C5"));
        RAICHU.movesetRanks = Collections.unmodifiableMap(RAICHU.movesetRanks);

        SANDSHREW.movesetRanks.put(Moveset.of(MUD_SHOT, DIG), MovesetRating.of(null, "A1"));
        SANDSHREW.movesetRanks.put(Moveset.of(MUD_SHOT, ROCK_SLIDE), MovesetRating.of("A1", null));
        SANDSHREW.movesetRanks = Collections.unmodifiableMap(SANDSHREW.movesetRanks);

        SANDSLASH.movesetRanks.put(Moveset.of(METAL_CLAW, ROCK_TOMB), MovesetRating.of("D6", "F5"));
        SANDSLASH.movesetRanks.put(Moveset.of(METAL_CLAW, EARTHQUAKE), MovesetRating.of("B2", "C4"));
        SANDSLASH.movesetRanks.put(Moveset.of(MUD_SHOT, BULLDOZE), MovesetRating.of("C3", "B2"));
        SANDSLASH.movesetRanks.put(Moveset.of(MUD_SHOT, EARTHQUAKE), MovesetRating.of("A1", "C3"));
        SANDSLASH.movesetRanks.put(Moveset.of(MUD_SHOT, ROCK_TOMB), MovesetRating.of("C4", "F6"));
        SANDSLASH.movesetRanks.put(Moveset.of(METAL_CLAW, BULLDOZE), MovesetRating.of("D5", "A1"));
        SANDSLASH.movesetRanks = Collections.unmodifiableMap(SANDSLASH.movesetRanks);

        NIDORAN_FEMALE.movesetRanks.put(Moveset.of(POISON_STING, SLUDGE_BOMB), MovesetRating.of("A1", "A1"));
        NIDORAN_FEMALE.movesetRanks = Collections.unmodifiableMap(NIDORAN_FEMALE.movesetRanks);

        NIDORINA.movesetRanks.put(Moveset.of(POISON_STING, SLUDGE_BOMB), MovesetRating.of("A1", "A1"));
        NIDORINA.movesetRanks = Collections.unmodifiableMap(NIDORINA.movesetRanks);

        NIDOQUEEN.movesetRanks.put(Moveset.of(POISON_JAB, EARTHQUAKE), MovesetRating.of("A1", "A1"));
        NIDOQUEEN.movesetRanks.put(Moveset.of(BITE, STONE_EDGE), MovesetRating.of("B6", "C6"));
        NIDOQUEEN.movesetRanks.put(Moveset.of(BITE, SLUDGE_WAVE), MovesetRating.of("B5", "C5"));
        NIDOQUEEN.movesetRanks.put(Moveset.of(POISON_JAB, SLUDGE_WAVE), MovesetRating.of("B3", "B2"));
        NIDOQUEEN.movesetRanks.put(Moveset.of(POISON_JAB, STONE_EDGE), MovesetRating.of("B4", "B3"));
        NIDOQUEEN.movesetRanks.put(Moveset.of(BITE, EARTHQUAKE), MovesetRating.of("A2", "B4"));
        NIDOQUEEN.movesetRanks = Collections.unmodifiableMap(NIDOQUEEN.movesetRanks);

        NIDORAN_MALE.movesetRanks.put(Moveset.of(PECK, SLUDGE_BOMB), MovesetRating.of(null, "A1"));
        NIDORAN_MALE.movesetRanks.put(Moveset.of(POISON_STING, SLUDGE_BOMB), MovesetRating.of("A1", null));
        NIDORAN_MALE.movesetRanks = Collections.unmodifiableMap(NIDORAN_MALE.movesetRanks);

        NIDORINO.movesetRanks.put(Moveset.of(POISON_JAB, SLUDGE_BOMB), MovesetRating.of("A1", "A1"));
        NIDORINO.movesetRanks = Collections.unmodifiableMap(NIDORINO.movesetRanks);

        NIDOKING.movesetRanks.put(Moveset.of(FURY_CUTTER, EARTHQUAKE), MovesetRating.of("B4", "D4"));
        NIDOKING.movesetRanks.put(Moveset.of(POISON_JAB, EARTHQUAKE), MovesetRating.of("A1", "A1"));
        NIDOKING.movesetRanks.put(Moveset.of(POISON_JAB, MEGAHORN), MovesetRating.of("B3", "C3"));
        NIDOKING.movesetRanks.put(Moveset.of(FURY_CUTTER, MEGAHORN), MovesetRating.of("D6", "F5"));
        NIDOKING.movesetRanks.put(Moveset.of(POISON_JAB, SLUDGE_WAVE), MovesetRating.of("B2", "C2"));
        NIDOKING.movesetRanks.put(Moveset.of(FURY_CUTTER, SLUDGE_WAVE), MovesetRating.of("D5", "F6"));
        NIDOKING.movesetRanks = Collections.unmodifiableMap(NIDOKING.movesetRanks);

        CLEFAIRY.movesetRanks.put(Moveset.of(ZEN_HEADBUTT, MOONBLAST), MovesetRating.of(null, "A1"));
        CLEFAIRY.movesetRanks.put(Moveset.of(POUND, MOONBLAST), MovesetRating.of("A1", null));
        CLEFAIRY.movesetRanks = Collections.unmodifiableMap(CLEFAIRY.movesetRanks);

        CLEFABLE.movesetRanks.put(Moveset.of(POUND, DAZZLING_GLEAM), MovesetRating.of("D4", "A2"));
        CLEFABLE.movesetRanks.put(Moveset.of(ZEN_HEADBUTT, Move.PSYCHIC), MovesetRating.of("D5", "C5"));
        CLEFABLE.movesetRanks.put(Moveset.of(ZEN_HEADBUTT, MOONBLAST), MovesetRating.of("C3", "C4"));
        CLEFABLE.movesetRanks.put(Moveset.of(POUND, Move.PSYCHIC), MovesetRating.of("C2", "C3"));
        CLEFABLE.movesetRanks.put(Moveset.of(ZEN_HEADBUTT, DAZZLING_GLEAM), MovesetRating.of("F6", "A1"));
        CLEFABLE.movesetRanks.put(Moveset.of(POUND, MOONBLAST), MovesetRating.of("A1", "D6"));
        CLEFABLE.movesetRanks = Collections.unmodifiableMap(CLEFABLE.movesetRanks);

        VULPIX.movesetRanks.put(Moveset.of(EMBER, FLAMETHROWER), MovesetRating.of("A1", "A1"));
        VULPIX.movesetRanks = Collections.unmodifiableMap(VULPIX.movesetRanks);

        NINETALES.movesetRanks.put(Moveset.of(FEINT_ATTACK, HEAT_WAVE), MovesetRating.of("B6", "D6"));
        NINETALES.movesetRanks.put(Moveset.of(EMBER, FLAMETHROWER), MovesetRating.of("B3", "B2"));
        NINETALES.movesetRanks.put(Moveset.of(FEINT_ATTACK, FIRE_BLAST), MovesetRating.of("A2", "C4"));
        NINETALES.movesetRanks.put(Moveset.of(EMBER, FIRE_BLAST), MovesetRating.of("A1", "C3"));
        NINETALES.movesetRanks.put(Moveset.of(FEINT_ATTACK, FLAMETHROWER), MovesetRating.of("B5", "A1"));
        NINETALES.movesetRanks.put(Moveset.of(EMBER, HEAT_WAVE), MovesetRating.of("B4", "D5"));
        NINETALES.movesetRanks = Collections.unmodifiableMap(NINETALES.movesetRanks);

        JIGGLYPUFF.movesetRanks.put(Moveset.of(FEINT_ATTACK, DAZZLING_GLEAM), MovesetRating.of(null, "A1"));
        JIGGLYPUFF.movesetRanks.put(Moveset.of(POUND, BODY_SLAM), MovesetRating.of("A1", null));
        JIGGLYPUFF.movesetRanks = Collections.unmodifiableMap(JIGGLYPUFF.movesetRanks);

        WIGGLYTUFF.movesetRanks.put(Moveset.of(FEINT_ATTACK, PLAY_ROUGH), MovesetRating.of("D5", "A2"));
        WIGGLYTUFF.movesetRanks.put(Moveset.of(POUND, HYPER_BEAM), MovesetRating.of("A1", "B3"));
        WIGGLYTUFF.movesetRanks.put(Moveset.of(POUND, PLAY_ROUGH), MovesetRating.of("A2", "A1"));
        WIGGLYTUFF.movesetRanks.put(Moveset.of(POUND, DAZZLING_GLEAM), MovesetRating.of("C4", "C5"));
        WIGGLYTUFF.movesetRanks.put(Moveset.of(FEINT_ATTACK, DAZZLING_GLEAM), MovesetRating.of("D6", "B4"));
        WIGGLYTUFF.movesetRanks.put(Moveset.of(FEINT_ATTACK, HYPER_BEAM), MovesetRating.of("C3", "C6"));
        WIGGLYTUFF.movesetRanks = Collections.unmodifiableMap(WIGGLYTUFF.movesetRanks);

        ZUBAT.movesetRanks.put(Moveset.of(QUICK_ATTACK, SLUDGE_BOMB), MovesetRating.of(null, "A1"));
        ZUBAT.movesetRanks.put(Moveset.of(BITE, SLUDGE_BOMB), MovesetRating.of("A1", null));
        ZUBAT.movesetRanks = Collections.unmodifiableMap(ZUBAT.movesetRanks);

        GOLBAT.movesetRanks.put(Moveset.of(BITE, AIR_CUTTER), MovesetRating.of("C4", "C4"));
        GOLBAT.movesetRanks.put(Moveset.of(BITE, OMINOUS_WIND), MovesetRating.of("C6", "F5"));
        GOLBAT.movesetRanks.put(Moveset.of(WING_ATTACK, OMINOUS_WIND), MovesetRating.of("A3", "F6"));
        GOLBAT.movesetRanks.put(Moveset.of(WING_ATTACK, POISON_FANG), MovesetRating.of("A1", "A1"));
        GOLBAT.movesetRanks.put(Moveset.of(WING_ATTACK, AIR_CUTTER), MovesetRating.of("A2", "C3"));
        GOLBAT.movesetRanks.put(Moveset.of(BITE, POISON_FANG), MovesetRating.of("C5", "A2"));
        GOLBAT.movesetRanks = Collections.unmodifiableMap(GOLBAT.movesetRanks);

        ODDISH.movesetRanks.put(Moveset.of(RAZOR_LEAF, SLUDGE_BOMB), MovesetRating.of("A1", "A1"));
        ODDISH.movesetRanks = Collections.unmodifiableMap(ODDISH.movesetRanks);

        GLOOM.movesetRanks.put(Moveset.of(RAZOR_LEAF, PETAL_BLIZZARD), MovesetRating.of("A1", "A1"));
        GLOOM.movesetRanks = Collections.unmodifiableMap(GLOOM.movesetRanks);

        VILEPLUME.movesetRanks.put(Moveset.of(RAZOR_LEAF, SOLAR_BEAM), MovesetRating.of("A1", "B3"));
        VILEPLUME.movesetRanks.put(Moveset.of(ACID, PETAL_BLIZZARD), MovesetRating.of("B4", "B2"));
        VILEPLUME.movesetRanks.put(Moveset.of(RAZOR_LEAF, MOONBLAST), MovesetRating.of("C5", "D5"));
        VILEPLUME.movesetRanks.put(Moveset.of(RAZOR_LEAF, PETAL_BLIZZARD), MovesetRating.of("A2", "A1"));
        VILEPLUME.movesetRanks.put(Moveset.of(ACID, MOONBLAST), MovesetRating.of("C6", "F6"));
        VILEPLUME.movesetRanks.put(Moveset.of(ACID, SOLAR_BEAM), MovesetRating.of("B3", "B4"));
        VILEPLUME.movesetRanks = Collections.unmodifiableMap(VILEPLUME.movesetRanks);

        PARAS.movesetRanks.put(Moveset.of(BUG_BITE, SEED_BOMB), MovesetRating.of("A1", "A1"));
        PARAS.movesetRanks = Collections.unmodifiableMap(PARAS.movesetRanks);

        PARASECT.movesetRanks.put(Moveset.of(BUG_BITE, X_SCISSOR), MovesetRating.of("B3", "A3"));
        PARASECT.movesetRanks.put(Moveset.of(BUG_BITE, SOLAR_BEAM), MovesetRating.of("A1", "A1"));
        PARASECT.movesetRanks.put(Moveset.of(FURY_CUTTER, X_SCISSOR), MovesetRating.of("D5", "A5"));
        PARASECT.movesetRanks.put(Moveset.of(FURY_CUTTER, CROSS_POISON), MovesetRating.of("F6", "A4"));
        PARASECT.movesetRanks.put(Moveset.of(FURY_CUTTER, SOLAR_BEAM), MovesetRating.of("B2", "B6"));
        PARASECT.movesetRanks.put(Moveset.of(BUG_BITE, CROSS_POISON), MovesetRating.of("D4", "A2"));
        PARASECT.movesetRanks = Collections.unmodifiableMap(PARASECT.movesetRanks);

        VENONAT.movesetRanks.put(Moveset.of(CONFUSION, SIGNAL_BEAM), MovesetRating.of(null, "A1"));
        VENONAT.movesetRanks.put(Moveset.of(BUG_BITE, SIGNAL_BEAM), MovesetRating.of("A1", null));
        VENONAT.movesetRanks = Collections.unmodifiableMap(VENONAT.movesetRanks);

        VENOMOTH.movesetRanks.put(Moveset.of(CONFUSION, Move.PSYCHIC), MovesetRating.of("D5", "C5"));
        VENOMOTH.movesetRanks.put(Moveset.of(CONFUSION, POISON_FANG), MovesetRating.of("F6", "B3"));
        VENOMOTH.movesetRanks.put(Moveset.of(BUG_BITE, POISON_FANG), MovesetRating.of("C3", "C4"));
        VENOMOTH.movesetRanks.put(Moveset.of(CONFUSION, BUG_BUZZ), MovesetRating.of("C4", "A1"));
        VENOMOTH.movesetRanks.put(Moveset.of(BUG_BITE, BUG_BUZZ), MovesetRating.of("A1", "B2"));
        VENOMOTH.movesetRanks.put(Moveset.of(BUG_BITE, Move.PSYCHIC), MovesetRating.of("B2", "D6"));
        VENOMOTH.movesetRanks = Collections.unmodifiableMap(VENOMOTH.movesetRanks);

        DIGLETT.movesetRanks.put(Moveset.of(MUD_SLAP, DIG), MovesetRating.of("A1", "A1"));
        DIGLETT.movesetRanks = Collections.unmodifiableMap(DIGLETT.movesetRanks);

        DUGTRIO.movesetRanks.put(Moveset.of(MUD_SLAP, STONE_EDGE), MovesetRating.of("B3", "B4"));
        DUGTRIO.movesetRanks.put(Moveset.of(SUCKER_PUNCH, STONE_EDGE), MovesetRating.of("B4", "F6"));
        DUGTRIO.movesetRanks.put(Moveset.of(MUD_SLAP, EARTHQUAKE), MovesetRating.of("A1", "A3"));
        DUGTRIO.movesetRanks.put(Moveset.of(SUCKER_PUNCH, EARTHQUAKE), MovesetRating.of("A2", "B5"));
        DUGTRIO.movesetRanks.put(Moveset.of(SUCKER_PUNCH, MUD_BOMB), MovesetRating.of("C6", "A2"));
        DUGTRIO.movesetRanks.put(Moveset.of(MUD_SLAP, MUD_BOMB), MovesetRating.of("C5", "A1"));
        DUGTRIO.movesetRanks = Collections.unmodifiableMap(DUGTRIO.movesetRanks);

        MEOWTH.movesetRanks.put(Moveset.of(SCRATCH, BODY_SLAM), MovesetRating.of("A1", "A1"));
        MEOWTH.movesetRanks = Collections.unmodifiableMap(MEOWTH.movesetRanks);

        PERSIAN.movesetRanks.put(Moveset.of(FEINT_ATTACK, PLAY_ROUGH), MovesetRating.of("C4", "A1"));
        PERSIAN.movesetRanks.put(Moveset.of(SCRATCH, NIGHT_SLASH), MovesetRating.of("A2", "A4"));
        PERSIAN.movesetRanks.put(Moveset.of(SCRATCH, PLAY_ROUGH), MovesetRating.of("A1", "A5"));
        PERSIAN.movesetRanks.put(Moveset.of(FEINT_ATTACK, NIGHT_SLASH), MovesetRating.of("D5", "A2"));
        PERSIAN.movesetRanks.put(Moveset.of(FEINT_ATTACK, POWER_GEM), MovesetRating.of("D6", "A3"));
        PERSIAN.movesetRanks.put(Moveset.of(SCRATCH, POWER_GEM), MovesetRating.of("A3", "A6"));
        PERSIAN.movesetRanks = Collections.unmodifiableMap(PERSIAN.movesetRanks);

        PSYDUCK.movesetRanks.put(Moveset.of(ZEN_HEADBUTT, AQUA_TAIL), MovesetRating.of(null, "A1"));
        PSYDUCK.movesetRanks.put(Moveset.of(WATER_GUN, AQUA_TAIL), MovesetRating.of("A1", null));
        PSYDUCK.movesetRanks = Collections.unmodifiableMap(PSYDUCK.movesetRanks);

        GOLDUCK.movesetRanks.put(Moveset.of(CONFUSION, Move.PSYCHIC), MovesetRating.of("F6", "A2"));
        GOLDUCK.movesetRanks.put(Moveset.of(WATER_GUN, Move.PSYCHIC), MovesetRating.of("C2", "B5"));
        GOLDUCK.movesetRanks.put(Moveset.of(WATER_GUN, HYDRO_PUMP), MovesetRating.of("A1", "C6"));
        GOLDUCK.movesetRanks.put(Moveset.of(WATER_GUN, ICE_BEAM), MovesetRating.of("D3", "B4"));
        GOLDUCK.movesetRanks.put(Moveset.of(CONFUSION, ICE_BEAM), MovesetRating.of("F5", "A1"));
        GOLDUCK.movesetRanks.put(Moveset.of(CONFUSION, HYDRO_PUMP), MovesetRating.of("F4", "B3"));
        GOLDUCK.movesetRanks = Collections.unmodifiableMap(GOLDUCK.movesetRanks);

        MANKEY.movesetRanks.put(Moveset.of(SCRATCH, LOW_SWEEP), MovesetRating.of(null, "A1"));
        MANKEY.movesetRanks.put(Moveset.of(SCRATCH, CROSS_CHOP), MovesetRating.of("A1", null));
        MANKEY.movesetRanks = Collections.unmodifiableMap(MANKEY.movesetRanks);

        PRIMEAPE.movesetRanks.put(Moveset.of(KARATE_CHOP, CROSS_CHOP), MovesetRating.of("B2", "F5"));
        PRIMEAPE.movesetRanks.put(Moveset.of(LOW_KICK, NIGHT_SLASH), MovesetRating.of("F6", "C3"));
        PRIMEAPE.movesetRanks.put(Moveset.of(KARATE_CHOP, LOW_SWEEP), MovesetRating.of("C4", "A2"));
        PRIMEAPE.movesetRanks.put(Moveset.of(KARATE_CHOP, NIGHT_SLASH), MovesetRating.of("F5", "C4"));
        PRIMEAPE.movesetRanks.put(Moveset.of(LOW_KICK, CROSS_CHOP), MovesetRating.of("A1", "F6"));
        PRIMEAPE.movesetRanks.put(Moveset.of(LOW_KICK, LOW_SWEEP), MovesetRating.of("C3", "A1"));
        PRIMEAPE.movesetRanks = Collections.unmodifiableMap(PRIMEAPE.movesetRanks);

        GROWLITHE.movesetRanks.put(Moveset.of(EMBER, FLAMETHROWER), MovesetRating.of(null, "A1"));
        GROWLITHE.movesetRanks.put(Moveset.of(BITE, FLAMETHROWER), MovesetRating.of("A1", null));
        GROWLITHE.movesetRanks = Collections.unmodifiableMap(GROWLITHE.movesetRanks);

        ARCANINE.movesetRanks.put(Moveset.of(FIRE_FANG, BULLDOZE), MovesetRating.of("C5", "C5"));
        ARCANINE.movesetRanks.put(Moveset.of(BITE, FLAMETHROWER), MovesetRating.of("B4", "B3"));
        ARCANINE.movesetRanks.put(Moveset.of(BITE, FIRE_BLAST), MovesetRating.of("A2", "C4"));
        ARCANINE.movesetRanks.put(Moveset.of(FIRE_FANG, FIRE_BLAST), MovesetRating.of("A1", "B2"));
        ARCANINE.movesetRanks.put(Moveset.of(BITE, BULLDOZE), MovesetRating.of("F6", "D6"));
        ARCANINE.movesetRanks.put(Moveset.of(FIRE_FANG, FLAMETHROWER), MovesetRating.of("B3", "A1"));
        ARCANINE.movesetRanks = Collections.unmodifiableMap(ARCANINE.movesetRanks);

        POLIWAG.movesetRanks.put(Moveset.of(BUBBLE, BODY_SLAM), MovesetRating.of("A1", "A1"));
        POLIWAG.movesetRanks = Collections.unmodifiableMap(POLIWAG.movesetRanks);

        POLIWHIRL.movesetRanks.put(Moveset.of(BUBBLE, SCALD), MovesetRating.of("A1", "A1"));
        POLIWHIRL.movesetRanks = Collections.unmodifiableMap(POLIWHIRL.movesetRanks);

        POLIWRATH.movesetRanks.put(Moveset.of(BUBBLE, SUBMISSION), MovesetRating.of("C3", "A3"));
        POLIWRATH.movesetRanks.put(Moveset.of(MUD_SHOT, HYDRO_PUMP), MovesetRating.of("A2", "F4"));
        POLIWRATH.movesetRanks.put(Moveset.of(MUD_SHOT, ICE_PUNCH), MovesetRating.of("F6", "F5"));
        POLIWRATH.movesetRanks.put(Moveset.of(MUD_SHOT, SUBMISSION), MovesetRating.of("C4", "F6"));
        POLIWRATH.movesetRanks.put(Moveset.of(BUBBLE, HYDRO_PUMP), MovesetRating.of("A1", "A2"));
        POLIWRATH.movesetRanks.put(Moveset.of(BUBBLE, ICE_PUNCH), MovesetRating.of("D5", "A1"));
        POLIWRATH.movesetRanks = Collections.unmodifiableMap(POLIWRATH.movesetRanks);

        ABRA.movesetRanks.put(Moveset.of(ZEN_HEADBUTT, PSYSHOCK), MovesetRating.of("A1", "A1"));
        ABRA.movesetRanks = Collections.unmodifiableMap(ABRA.movesetRanks);

        KADABRA.movesetRanks.put(Moveset.of(CONFUSION, PSYBEAM), MovesetRating.of(null, "A1"));
        KADABRA.movesetRanks.put(Moveset.of(PSYCHO_CUT, SHADOW_BALL), MovesetRating.of("A1", null));
        KADABRA.movesetRanks = Collections.unmodifiableMap(KADABRA.movesetRanks);

        ALAKAZAM.movesetRanks.put(Moveset.of(CONFUSION, Move.PSYCHIC), MovesetRating.of("B2", "A1"));
        ALAKAZAM.movesetRanks.put(Moveset.of(PSYCHO_CUT, SHADOW_BALL), MovesetRating.of("B4", "C6"));
        ALAKAZAM.movesetRanks.put(Moveset.of(PSYCHO_CUT, DAZZLING_GLEAM), MovesetRating.of("B3", "C5"));
        ALAKAZAM.movesetRanks.put(Moveset.of(CONFUSION, DAZZLING_GLEAM), MovesetRating.of("D6", "B4"));
        ALAKAZAM.movesetRanks.put(Moveset.of(PSYCHO_CUT, Move.PSYCHIC), MovesetRating.of("A1", "B2"));
        ALAKAZAM.movesetRanks.put(Moveset.of(CONFUSION, SHADOW_BALL), MovesetRating.of("D5", "B3"));
        ALAKAZAM.movesetRanks = Collections.unmodifiableMap(ALAKAZAM.movesetRanks);

        MACHOP.movesetRanks.put(Moveset.of(LOW_KICK, CROSS_CHOP), MovesetRating.of("A1", null));
        MACHOP.movesetRanks.put(Moveset.of(KARATE_CHOP, LOW_SWEEP), MovesetRating.of(null, "A1"));
        MACHOP.movesetRanks = Collections.unmodifiableMap(MACHOP.movesetRanks);

        MACHOKE.movesetRanks.put(Moveset.of(KARATE_CHOP, BRICK_BREAK), MovesetRating.of(null, "A1"));
        MACHOKE.movesetRanks.put(Moveset.of(LOW_KICK, CROSS_CHOP), MovesetRating.of("A1", null));
        MACHOKE.movesetRanks = Collections.unmodifiableMap(MACHOKE.movesetRanks);

        MACHAMP.movesetRanks.put(Moveset.of(KARATE_CHOP, SUBMISSION), MovesetRating.of("C3", "B2"));
        MACHAMP.movesetRanks.put(Moveset.of(KARATE_CHOP, CROSS_CHOP), MovesetRating.of("A1", "D5"));
        MACHAMP.movesetRanks.put(Moveset.of(BULLET_PUNCH, STONE_EDGE), MovesetRating.of("D5", "D4"));
        MACHAMP.movesetRanks.put(Moveset.of(BULLET_PUNCH, CROSS_CHOP), MovesetRating.of("C4", "D3"));
        MACHAMP.movesetRanks.put(Moveset.of(BULLET_PUNCH, SUBMISSION), MovesetRating.of("D6", "A1"));
        MACHAMP.movesetRanks.put(Moveset.of(KARATE_CHOP, STONE_EDGE), MovesetRating.of("B2", "D6"));
        MACHAMP.movesetRanks = Collections.unmodifiableMap(MACHAMP.movesetRanks);

        BELLSPROUT.movesetRanks.put(Moveset.of(ACID, SLUDGE_BOMB), MovesetRating.of(null, "A1"));
        BELLSPROUT.movesetRanks.put(Moveset.of(VINE_WHIP, SLUDGE_BOMB), MovesetRating.of("A1", null));
        BELLSPROUT.movesetRanks = Collections.unmodifiableMap(BELLSPROUT.movesetRanks);

        WEEPINBELL.movesetRanks.put(Moveset.of(RAZOR_LEAF, SLUDGE_BOMB), MovesetRating.of("A1", "A1"));
        WEEPINBELL.movesetRanks = Collections.unmodifiableMap(WEEPINBELL.movesetRanks);

        VICTREEBEL.movesetRanks.put(Moveset.of(RAZOR_LEAF, SOLAR_BEAM), MovesetRating.of("A1", "B2"));
        VICTREEBEL.movesetRanks.put(Moveset.of(ACID, SLUDGE_BOMB), MovesetRating.of("B4", "C4"));
        VICTREEBEL.movesetRanks.put(Moveset.of(ACID, LEAF_BLADE), MovesetRating.of("B6", "C6"));
        VICTREEBEL.movesetRanks.put(Moveset.of(RAZOR_LEAF, SLUDGE_BOMB), MovesetRating.of("B3", "A1"));
        VICTREEBEL.movesetRanks.put(Moveset.of(RAZOR_LEAF, LEAF_BLADE), MovesetRating.of("A2", "B3"));
        VICTREEBEL.movesetRanks.put(Moveset.of(ACID, SOLAR_BEAM), MovesetRating.of("B5", "C5"));
        VICTREEBEL.movesetRanks = Collections.unmodifiableMap(VICTREEBEL.movesetRanks);

        TENTACOOL.movesetRanks.put(Moveset.of(BUBBLE, WATER_PULSE), MovesetRating.of("A1", "A1"));
        TENTACOOL.movesetRanks = Collections.unmodifiableMap(TENTACOOL.movesetRanks);

        TENTACRUEL.movesetRanks.put(Moveset.of(ACID, HYDRO_PUMP), MovesetRating.of("C3", "B3"));
        TENTACRUEL.movesetRanks.put(Moveset.of(ACID, SLUDGE_WAVE), MovesetRating.of("D6", "C6"));
        TENTACRUEL.movesetRanks.put(Moveset.of(POISON_JAB, HYDRO_PUMP), MovesetRating.of("A1", "A1"));
        TENTACRUEL.movesetRanks.put(Moveset.of(POISON_JAB, SLUDGE_WAVE), MovesetRating.of("C4", "B4"));
        TENTACRUEL.movesetRanks.put(Moveset.of(POISON_JAB, BLIZZARD), MovesetRating.of("B2", "A2"));
        TENTACRUEL.movesetRanks.put(Moveset.of(ACID, BLIZZARD), MovesetRating.of("C5", "B5"));
        TENTACRUEL.movesetRanks = Collections.unmodifiableMap(TENTACRUEL.movesetRanks);

        GEODUDE.movesetRanks.put(Moveset.of(ROCK_THROW, ROCK_SLIDE), MovesetRating.of("A1", null));
        GEODUDE.movesetRanks.put(Moveset.of(ROCK_THROW, DIG), MovesetRating.of(null, "A1"));
        GEODUDE.movesetRanks = Collections.unmodifiableMap(GEODUDE.movesetRanks);

        GRAVELER.movesetRanks.put(Moveset.of(MUD_SLAP, DIG), MovesetRating.of(null, "A1"));
        GRAVELER.movesetRanks.put(Moveset.of(MUD_SLAP, STONE_EDGE), MovesetRating.of("A1", null));
        GRAVELER.movesetRanks = Collections.unmodifiableMap(GRAVELER.movesetRanks);

        GOLEM.movesetRanks.put(Moveset.of(ROCK_THROW, EARTHQUAKE), MovesetRating.of("B3", "A3"));
        GOLEM.movesetRanks.put(Moveset.of(MUD_SLAP, STONE_EDGE), MovesetRating.of("A2", "A4"));
        GOLEM.movesetRanks.put(Moveset.of(ROCK_THROW, ANCIENT_POWER), MovesetRating.of("F6", "A5"));
        GOLEM.movesetRanks.put(Moveset.of(MUD_SLAP, EARTHQUAKE), MovesetRating.of("A1", "A1"));
        GOLEM.movesetRanks.put(Moveset.of(ROCK_THROW, STONE_EDGE), MovesetRating.of("B4", "B6"));
        GOLEM.movesetRanks.put(Moveset.of(MUD_SLAP, ANCIENT_POWER), MovesetRating.of("D5", "A2"));
        GOLEM.movesetRanks = Collections.unmodifiableMap(GOLEM.movesetRanks);

        PONYTA.movesetRanks.put(Moveset.of(EMBER, FIRE_BLAST), MovesetRating.of("A1", "A1"));
        PONYTA.movesetRanks = Collections.unmodifiableMap(PONYTA.movesetRanks);

        RAPIDASH.movesetRanks.put(Moveset.of(EMBER, DRILL_RUN), MovesetRating.of("D5", "A1"));
        RAPIDASH.movesetRanks.put(Moveset.of(LOW_KICK, DRILL_RUN), MovesetRating.of("F6", "B3"));
        RAPIDASH.movesetRanks.put(Moveset.of(EMBER, FIRE_BLAST), MovesetRating.of("A1", "B2"));
        RAPIDASH.movesetRanks.put(Moveset.of(EMBER, HEAT_WAVE), MovesetRating.of("B2", "C4"));
        RAPIDASH.movesetRanks.put(Moveset.of(LOW_KICK, HEAT_WAVE), MovesetRating.of("C4", "F6"));
        RAPIDASH.movesetRanks.put(Moveset.of(LOW_KICK, FIRE_BLAST), MovesetRating.of("B3", "D5"));
        RAPIDASH.movesetRanks = Collections.unmodifiableMap(RAPIDASH.movesetRanks);

        SLOWPOKE.movesetRanks.put(Moveset.of(CONFUSION, Move.PSYCHIC), MovesetRating.of(null, "A1"));
        SLOWPOKE.movesetRanks.put(Moveset.of(WATER_GUN, Move.PSYCHIC), MovesetRating.of("A1", null));
        SLOWPOKE.movesetRanks = Collections.unmodifiableMap(SLOWPOKE.movesetRanks);

        SLOWBRO.movesetRanks.put(Moveset.of(CONFUSION, Move.PSYCHIC), MovesetRating.of("C4", "A1"));
        SLOWBRO.movesetRanks.put(Moveset.of(CONFUSION, WATER_PULSE), MovesetRating.of("F6", "B2"));
        SLOWBRO.movesetRanks.put(Moveset.of(WATER_GUN, Move.PSYCHIC), MovesetRating.of("A1", "C5"));
        SLOWBRO.movesetRanks.put(Moveset.of(WATER_GUN, WATER_PULSE), MovesetRating.of("C2", "C4"));
        SLOWBRO.movesetRanks.put(Moveset.of(WATER_GUN, ICE_BEAM), MovesetRating.of("C3", "D6"));
        SLOWBRO.movesetRanks.put(Moveset.of(CONFUSION, ICE_BEAM), MovesetRating.of("D5", "B3"));
        SLOWBRO.movesetRanks = Collections.unmodifiableMap(SLOWBRO.movesetRanks);

        MAGNEMITE.movesetRanks.put(Moveset.of(SPARK, THUNDERBOLT), MovesetRating.of("A1", "A1"));
        MAGNEMITE.movesetRanks = Collections.unmodifiableMap(MAGNEMITE.movesetRanks);

        MAGNETON.movesetRanks.put(Moveset.of(THUNDER_SHOCK, MAGNET_BOMB), MovesetRating.of("D6", "D6"));
        MAGNETON.movesetRanks.put(Moveset.of(THUNDER_SHOCK, DISCHARGE), MovesetRating.of("B5", "D5"));
        MAGNETON.movesetRanks.put(Moveset.of(THUNDER_SHOCK, FLASH_CANNON), MovesetRating.of("A3", "A2"));
        MAGNETON.movesetRanks.put(Moveset.of(SPARK, FLASH_CANNON), MovesetRating.of("A1", "A1"));
        MAGNETON.movesetRanks.put(Moveset.of(SPARK, DISCHARGE), MovesetRating.of("A2", "D3"));
        MAGNETON.movesetRanks.put(Moveset.of(SPARK, MAGNET_BOMB), MovesetRating.of("B4", "D4"));
        MAGNETON.movesetRanks = Collections.unmodifiableMap(MAGNETON.movesetRanks);

        FARFETCHD.movesetRanks.put(Moveset.of(FURY_CUTTER, LEAF_BLADE), MovesetRating.of("B2", "B3"));
        FARFETCHD.movesetRanks.put(Moveset.of(CUT, AERIAL_ACE), MovesetRating.of("B4", "A1"));
        FARFETCHD.movesetRanks.put(Moveset.of(CUT, LEAF_BLADE), MovesetRating.of("A1", "B5"));
        FARFETCHD.movesetRanks.put(Moveset.of(FURY_CUTTER, AERIAL_ACE), MovesetRating.of("F5", "B2"));
        FARFETCHD.movesetRanks.put(Moveset.of(FURY_CUTTER, AIR_CUTTER), MovesetRating.of("F6", "C6"));
        FARFETCHD.movesetRanks.put(Moveset.of(CUT, AIR_CUTTER), MovesetRating.of("B3", "B4"));
        FARFETCHD.movesetRanks = Collections.unmodifiableMap(FARFETCHD.movesetRanks);

        DODUO.movesetRanks.put(Moveset.of(QUICK_ATTACK, DRILL_PECK), MovesetRating.of(null, "A1"));
        DODUO.movesetRanks.put(Moveset.of(PECK, DRILL_PECK), MovesetRating.of("A1", null));
        DODUO.movesetRanks = Collections.unmodifiableMap(DODUO.movesetRanks);

        DODRIO.movesetRanks.put(Moveset.of(STEEL_WING, DRILL_PECK), MovesetRating.of("A2", "A1"));
        DODRIO.movesetRanks.put(Moveset.of(FEINT_ATTACK, DRILL_PECK), MovesetRating.of("A1", "A2"));
        DODRIO.movesetRanks.put(Moveset.of(FEINT_ATTACK, AERIAL_ACE), MovesetRating.of("C3", "B3"));
        DODRIO.movesetRanks.put(Moveset.of(STEEL_WING, AIR_CUTTER), MovesetRating.of("C4", "B6"));
        DODRIO.movesetRanks.put(Moveset.of(STEEL_WING, AERIAL_ACE), MovesetRating.of("C6", "B4"));
        DODRIO.movesetRanks.put(Moveset.of(FEINT_ATTACK, AIR_CUTTER), MovesetRating.of("C5", "B5"));
        DODRIO.movesetRanks = Collections.unmodifiableMap(DODRIO.movesetRanks);

        SEEL.movesetRanks.put(Moveset.of(LICK, AQUA_TAIL), MovesetRating.of("A1", null));
        SEEL.movesetRanks.put(Moveset.of(ICE_SHARD, AQUA_TAIL), MovesetRating.of(null, "A1"));
        SEEL.movesetRanks = Collections.unmodifiableMap(SEEL.movesetRanks);

        DEWGONG.movesetRanks.put(Moveset.of(FROST_BREATH, BLIZZARD), MovesetRating.of("A1", "C4"));
        DEWGONG.movesetRanks.put(Moveset.of(FROST_BREATH, ICY_WIND), MovesetRating.of("D4", "F5"));
        DEWGONG.movesetRanks.put(Moveset.of(ICE_SHARD, AQUA_JET), MovesetRating.of("D5", "A2"));
        DEWGONG.movesetRanks.put(Moveset.of(ICE_SHARD, ICY_WIND), MovesetRating.of("D6", "F6"));
        DEWGONG.movesetRanks.put(Moveset.of(FROST_BREATH, AQUA_JET), MovesetRating.of("D3", "B3"));
        DEWGONG.movesetRanks.put(Moveset.of(ICE_SHARD, BLIZZARD), MovesetRating.of("B2", "A1"));
        DEWGONG.movesetRanks = Collections.unmodifiableMap(DEWGONG.movesetRanks);

        GRIMER.movesetRanks.put(Moveset.of(POISON_JAB, SLUDGE_BOMB), MovesetRating.of("A1", "A1"));
        GRIMER.movesetRanks = Collections.unmodifiableMap(GRIMER.movesetRanks);

        MUK.movesetRanks.put(Moveset.of(LICK, GUNK_SHOT), MovesetRating.of("B3", null));
        MUK.movesetRanks.put(Moveset.of(LICK, SLUDGE_WAVE), MovesetRating.of("B4", null));
        MUK.movesetRanks.put(Moveset.of(LICK, DARK_PULSE), MovesetRating.of("D6", null));
        MUK.movesetRanks.put(Moveset.of(POISON_JAB, GUNK_SHOT), MovesetRating.of("A1", null));
        MUK.movesetRanks.put(Moveset.of(POISON_JAB, DARK_PULSE), MovesetRating.of("C5", null));
        MUK.movesetRanks.put(Moveset.of(POISON_JAB, SLUDGE_WAVE), MovesetRating.of("A2", null));
        MUK.movesetRanks = Collections.unmodifiableMap(MUK.movesetRanks);

        SHELLDER.movesetRanks.put(Moveset.of(ICE_SHARD, WATER_PULSE), MovesetRating.of(null, "A1"));
        SHELLDER.movesetRanks.put(Moveset.of(TACKLE, WATER_PULSE), MovesetRating.of("A1", null));
        SHELLDER.movesetRanks = Collections.unmodifiableMap(SHELLDER.movesetRanks);

        CLOYSTER.movesetRanks.put(Moveset.of(FROST_BREATH, BLIZZARD), MovesetRating.of("A1", "D10"));
        CLOYSTER.movesetRanks.put(Moveset.of(FROST_BREATH, ICY_WIND), MovesetRating.of("C5", "B4"));
        CLOYSTER.movesetRanks.put(Moveset.of(ICE_SHARD, AVALANCHE), MovesetRating.of(null, "A1"));
        CLOYSTER.movesetRanks.put(Moveset.of(ICE_SHARD, HYDRO_PUMP), MovesetRating.of("B4", "C7"));
        CLOYSTER.movesetRanks.put(Moveset.of(ICE_SHARD, ICY_WIND), MovesetRating.of("C6", "B3"));
        CLOYSTER.movesetRanks.put(Moveset.of(FROST_BREATH, HYDRO_PUMP), MovesetRating.of("B3", "D9"));
        CLOYSTER.movesetRanks.put(Moveset.of(ICE_SHARD, AURORA_BEAM), MovesetRating.of(null, "B5"));
        CLOYSTER.movesetRanks.put(Moveset.of(FROST_BREATH, AURORA_BEAM), MovesetRating.of(null, "C6"));
        CLOYSTER.movesetRanks.put(Moveset.of(FROST_BREATH, AVALANCHE), MovesetRating.of(null, "B2"));
        CLOYSTER.movesetRanks.put(Moveset.of(ICE_SHARD, BLIZZARD), MovesetRating.of("A2", "D8"));
        CLOYSTER.movesetRanks = Collections.unmodifiableMap(CLOYSTER.movesetRanks);

        GASTLY.movesetRanks.put(Moveset.of(SUCKER_PUNCH, SLUDGE_BOMB), MovesetRating.of(null, "A1"));
        GASTLY.movesetRanks.put(Moveset.of(LICK, SLUDGE_BOMB), MovesetRating.of("A1", null));
        GASTLY.movesetRanks = Collections.unmodifiableMap(GASTLY.movesetRanks);

        HAUNTER.movesetRanks.put(Moveset.of(SHADOW_CLAW, SLUDGE_BOMB), MovesetRating.of("A1", null));
        HAUNTER.movesetRanks.put(Moveset.of(SHADOW_CLAW, SHADOW_BALL), MovesetRating.of(null, "A1"));
        HAUNTER.movesetRanks = Collections.unmodifiableMap(HAUNTER.movesetRanks);

        GENGAR.movesetRanks.put(Moveset.of(SHADOW_CLAW, DARK_PULSE), MovesetRating.of("C5", "D6"));
        GENGAR.movesetRanks.put(Moveset.of(SHADOW_CLAW, SHADOW_BALL), MovesetRating.of("C3", "A1"));
        GENGAR.movesetRanks.put(Moveset.of(SUCKER_PUNCH, SLUDGE_BOMB), MovesetRating.of("B2", "C4"));
        GENGAR.movesetRanks.put(Moveset.of(SUCKER_PUNCH, SHADOW_BALL), MovesetRating.of("C4", "B2"));
        GENGAR.movesetRanks.put(Moveset.of(SHADOW_CLAW, SLUDGE_BOMB), MovesetRating.of("A1", "B3"));
        GENGAR.movesetRanks.put(Moveset.of(SUCKER_PUNCH, DARK_PULSE), MovesetRating.of("F6", "D5"));
        GENGAR.movesetRanks = Collections.unmodifiableMap(GENGAR.movesetRanks);

        ONIX.movesetRanks.put(Moveset.of(TACKLE, STONE_EDGE), MovesetRating.of("A2", "D5"));
        ONIX.movesetRanks.put(Moveset.of(ROCK_THROW, STONE_EDGE), MovesetRating.of("A4", "C3"));
        ONIX.movesetRanks.put(Moveset.of(ROCK_THROW, IRON_HEAD), MovesetRating.of("C6", "D6"));
        ONIX.movesetRanks.put(Moveset.of(ROCK_THROW, ROCK_SLIDE), MovesetRating.of("A3", "A1"));
        ONIX.movesetRanks.put(Moveset.of(TACKLE, ROCK_SLIDE), MovesetRating.of("A1", "A2"));
        ONIX.movesetRanks.put(Moveset.of(TACKLE, IRON_HEAD), MovesetRating.of("C5", "D4"));
        ONIX.movesetRanks = Collections.unmodifiableMap(ONIX.movesetRanks);

        DROWZEE.movesetRanks.put(Moveset.of(POUND, Move.PSYCHIC), MovesetRating.of("A1", null));
        DROWZEE.movesetRanks.put(Moveset.of(CONFUSION, Move.PSYCHIC), MovesetRating.of(null, "A1"));
        DROWZEE.movesetRanks = Collections.unmodifiableMap(DROWZEE.movesetRanks);

        HYPNO.movesetRanks.put(Moveset.of(CONFUSION, Move.PSYCHIC), MovesetRating.of("B2", "C5"));
        HYPNO.movesetRanks.put(Moveset.of(ZEN_HEADBUTT, Move.PSYCHIC), MovesetRating.of("A1", "F10"));
        HYPNO.movesetRanks.put(Moveset.of(CONFUSION, PSYSHOCK), MovesetRating.of("C4", "A1"));
        HYPNO.movesetRanks.put(Moveset.of(ZEN_HEADBUTT, SHADOW_BALL), MovesetRating.of("C5", "C7"));
        HYPNO.movesetRanks.put(Moveset.of(CONFUSION, FUTURE_SIGHT), MovesetRating.of(null, "A3"));
        HYPNO.movesetRanks.put(Moveset.of(CONFUSION, SHADOW_BALL), MovesetRating.of("F6", "A2"));
        HYPNO.movesetRanks.put(Moveset.of(CONFUSION, FOCUS_BLAST), MovesetRating.of(null, "B4"));
        HYPNO.movesetRanks.put(Moveset.of(ZEN_HEADBUTT, FOCUS_BLAST), MovesetRating.of(null, "F8"));
        HYPNO.movesetRanks.put(Moveset.of(ZEN_HEADBUTT, PSYSHOCK), MovesetRating.of("B3", "C6"));
        HYPNO.movesetRanks.put(Moveset.of(ZEN_HEADBUTT, FUTURE_SIGHT), MovesetRating.of(null, "F9"));
        HYPNO.movesetRanks = Collections.unmodifiableMap(HYPNO.movesetRanks);

        KRABBY.movesetRanks.put(Moveset.of(BUBBLE, WATER_PULSE), MovesetRating.of("A1", "A1"));
        KRABBY.movesetRanks = Collections.unmodifiableMap(KRABBY.movesetRanks);

        KINGLER.movesetRanks.put(Moveset.of(METAL_CLAW, WATER_PULSE), MovesetRating.of("A3", "A1"));
        KINGLER.movesetRanks.put(Moveset.of(MUD_SHOT, X_SCISSOR), MovesetRating.of("A1", "D6"));
        KINGLER.movesetRanks.put(Moveset.of(METAL_CLAW, VICE_GRIP), MovesetRating.of("A2", "C3"));
        KINGLER.movesetRanks.put(Moveset.of(MUD_SHOT, WATER_PULSE), MovesetRating.of("D5", "A2"));
        KINGLER.movesetRanks.put(Moveset.of(MUD_SHOT, VICE_GRIP), MovesetRating.of("D6", "C4"));
        KINGLER.movesetRanks.put(Moveset.of(METAL_CLAW, X_SCISSOR), MovesetRating.of("A4", "D5"));
        KINGLER.movesetRanks = Collections.unmodifiableMap(KINGLER.movesetRanks);

        VOLTORB.movesetRanks.put(Moveset.of(TACKLE, THUNDERBOLT), MovesetRating.of(null, "A1"));
        VOLTORB.movesetRanks.put(Moveset.of(SPARK, THUNDERBOLT), MovesetRating.of("A1", null));
        VOLTORB.movesetRanks = Collections.unmodifiableMap(VOLTORB.movesetRanks);

        ELECTRODE.movesetRanks.put(Moveset.of(TACKLE, HYPER_BEAM), MovesetRating.of("C5", "C5"));
        ELECTRODE.movesetRanks.put(Moveset.of(SPARK, DISCHARGE), MovesetRating.of("C4", "B4"));
        ELECTRODE.movesetRanks.put(Moveset.of(SPARK, HYPER_BEAM), MovesetRating.of("B3", "C6"));
        ELECTRODE.movesetRanks.put(Moveset.of(TACKLE, THUNDERBOLT), MovesetRating.of("B2", "A1"));
        ELECTRODE.movesetRanks.put(Moveset.of(SPARK, THUNDERBOLT), MovesetRating.of("A1", "B2"));
        ELECTRODE.movesetRanks.put(Moveset.of(TACKLE, DISCHARGE), MovesetRating.of("D6", "B3"));
        ELECTRODE.movesetRanks = Collections.unmodifiableMap(ELECTRODE.movesetRanks);

        EXEGGCUTE.movesetRanks.put(Moveset.of(CONFUSION, Move.PSYCHIC), MovesetRating.of("A1", "A1"));
        EXEGGCUTE.movesetRanks = Collections.unmodifiableMap(EXEGGCUTE.movesetRanks);

        EXEGGUTOR.movesetRanks.put(Moveset.of(ZEN_HEADBUTT, SOLAR_BEAM), MovesetRating.of("A1", "B6"));
        EXEGGUTOR.movesetRanks.put(Moveset.of(ZEN_HEADBUTT, Move.PSYCHIC), MovesetRating.of("B2", "B4"));
        EXEGGUTOR.movesetRanks.put(Moveset.of(CONFUSION, SEED_BOMB), MovesetRating.of("D6", "A3"));
        EXEGGUTOR.movesetRanks.put(Moveset.of(CONFUSION, Move.PSYCHIC), MovesetRating.of("C5", "A1"));
        EXEGGUTOR.movesetRanks.put(Moveset.of(ZEN_HEADBUTT, SEED_BOMB), MovesetRating.of("C4", "B5"));
        EXEGGUTOR.movesetRanks.put(Moveset.of(CONFUSION, SOLAR_BEAM), MovesetRating.of("B3", "A2"));
        EXEGGUTOR.movesetRanks = Collections.unmodifiableMap(EXEGGUTOR.movesetRanks);

        CUBONE.movesetRanks.put(Moveset.of(MUD_SLAP, DIG), MovesetRating.of(null, "A1"));
        CUBONE.movesetRanks.put(Moveset.of(MUD_SLAP, BONE_CLUB), MovesetRating.of("A1", null));
        CUBONE.movesetRanks = Collections.unmodifiableMap(CUBONE.movesetRanks);

        MAROWAK.movesetRanks.put(Moveset.of(ROCK_SMASH, DIG), MovesetRating.of("F6", "A2"));
        MAROWAK.movesetRanks.put(Moveset.of(ROCK_SMASH, EARTHQUAKE), MovesetRating.of("B3", "C6"));
        MAROWAK.movesetRanks.put(Moveset.of(MUD_SLAP, EARTHQUAKE), MovesetRating.of("A1", "B4"));
        MAROWAK.movesetRanks.put(Moveset.of(ROCK_SMASH, BONE_CLUB), MovesetRating.of("C5", "B5"));
        MAROWAK.movesetRanks.put(Moveset.of(MUD_SLAP, DIG), MovesetRating.of("C4", "A1"));
        MAROWAK.movesetRanks.put(Moveset.of(MUD_SLAP, BONE_CLUB), MovesetRating.of("B2", "B3"));
        MAROWAK.movesetRanks = Collections.unmodifiableMap(MAROWAK.movesetRanks);

        HITMONLEE.movesetRanks.put(Moveset.of(ROCK_SMASH, STONE_EDGE), MovesetRating.of("A3", "C5"));
        HITMONLEE.movesetRanks.put(Moveset.of(ROCK_SMASH, BRICK_BREAK), MovesetRating.of("A1", "A1"));
        HITMONLEE.movesetRanks.put(Moveset.of(LOW_KICK, BRICK_BREAK), MovesetRating.of("A4", "C4"));
        HITMONLEE.movesetRanks.put(Moveset.of(LOW_KICK, STONE_EDGE), MovesetRating.of("B6", "F6"));
        HITMONLEE.movesetRanks.put(Moveset.of(ROCK_SMASH, LOW_SWEEP), MovesetRating.of("A2", "B2"));
        HITMONLEE.movesetRanks.put(Moveset.of(LOW_KICK, LOW_SWEEP), MovesetRating.of("B5", "B3"));
        HITMONLEE.movesetRanks = Collections.unmodifiableMap(HITMONLEE.movesetRanks);

        HITMONCHAN.movesetRanks.put(Moveset.of(ROCK_SMASH, ICE_PUNCH), MovesetRating.of("B4", "B4"));
        HITMONCHAN.movesetRanks.put(Moveset.of(ROCK_SMASH, BRICK_BREAK), MovesetRating.of("A1", "A1"));
        HITMONCHAN.movesetRanks.put(Moveset.of(BULLET_PUNCH, THUNDER_PUNCH), MovesetRating.of("D8", "C8"));
        HITMONCHAN.movesetRanks.put(Moveset.of(BULLET_PUNCH, ICE_PUNCH), MovesetRating.of("D7", "C7"));
        HITMONCHAN.movesetRanks.put(Moveset.of(BULLET_PUNCH, BRICK_BREAK), MovesetRating.of("B5", "C5"));
        HITMONCHAN.movesetRanks.put(Moveset.of(ROCK_SMASH, THUNDER_PUNCH), MovesetRating.of("B2", "A2"));
        HITMONCHAN.movesetRanks.put(Moveset.of(ROCK_SMASH, FIRE_PUNCH), MovesetRating.of("B3", "B3"));
        HITMONCHAN.movesetRanks.put(Moveset.of(BULLET_PUNCH, FIRE_PUNCH), MovesetRating.of("D6", "C6"));
        HITMONCHAN.movesetRanks = Collections.unmodifiableMap(HITMONCHAN.movesetRanks);

        LICKITUNG.movesetRanks.put(Moveset.of(ZEN_HEADBUTT, HYPER_BEAM), MovesetRating.of("B2", "C3"));
        LICKITUNG.movesetRanks.put(Moveset.of(ZEN_HEADBUTT, STOMP), MovesetRating.of("D6", "A2"));
        LICKITUNG.movesetRanks.put(Moveset.of(ZEN_HEADBUTT, POWER_WHIP), MovesetRating.of("D5", "F6"));
        LICKITUNG.movesetRanks.put(Moveset.of(LICK, STOMP), MovesetRating.of("D4", "A1"));
        LICKITUNG.movesetRanks.put(Moveset.of(LICK, HYPER_BEAM), MovesetRating.of("A1", "C4"));
        LICKITUNG.movesetRanks.put(Moveset.of(LICK, POWER_WHIP), MovesetRating.of("D3", "F5"));
        LICKITUNG.movesetRanks = Collections.unmodifiableMap(LICKITUNG.movesetRanks);

        KOFFING.movesetRanks.put(Moveset.of(TACKLE, SLUDGE_BOMB), MovesetRating.of("A1", "A1"));
        KOFFING.movesetRanks = Collections.unmodifiableMap(KOFFING.movesetRanks);

        WEEZING.movesetRanks.put(Moveset.of(TACKLE, SHADOW_BALL), MovesetRating.of("D5", "C4"));
        WEEZING.movesetRanks.put(Moveset.of(ACID, SLUDGE_BOMB), MovesetRating.of("A1", "B2"));
        WEEZING.movesetRanks.put(Moveset.of(TACKLE, DARK_PULSE), MovesetRating.of("F6", "C3"));
        WEEZING.movesetRanks.put(Moveset.of(ACID, DARK_PULSE), MovesetRating.of("D3", "C5"));
        WEEZING.movesetRanks.put(Moveset.of(ACID, SHADOW_BALL), MovesetRating.of("D4", "C6"));
        WEEZING.movesetRanks.put(Moveset.of(TACKLE, SLUDGE_BOMB), MovesetRating.of("B2", "A1"));
        WEEZING.movesetRanks = Collections.unmodifiableMap(WEEZING.movesetRanks);

        RHYHORN.movesetRanks.put(Moveset.of(MUD_SLAP, BULLDOZE), MovesetRating.of(null, "A1"));
        RHYHORN.movesetRanks.put(Moveset.of(MUD_SLAP, STOMP), MovesetRating.of("A1", null));
        RHYHORN.movesetRanks = Collections.unmodifiableMap(RHYHORN.movesetRanks);

        RHYDON.movesetRanks.put(Moveset.of(ROCK_SMASH, STONE_EDGE), MovesetRating.of("C4", "C4"));
        RHYDON.movesetRanks.put(Moveset.of(MUD_SLAP, STONE_EDGE), MovesetRating.of("A2", "A1"));
        RHYDON.movesetRanks.put(Moveset.of(ROCK_SMASH, EARTHQUAKE), MovesetRating.of("C3", "B3"));
        RHYDON.movesetRanks.put(Moveset.of(MUD_SLAP, EARTHQUAKE), MovesetRating.of("A1", "B2"));
        RHYDON.movesetRanks.put(Moveset.of(ROCK_SMASH, MEGAHORN), MovesetRating.of("F6", "D6"));
        RHYDON.movesetRanks.put(Moveset.of(MUD_SLAP, MEGAHORN), MovesetRating.of("D5", "C5"));
        RHYDON.movesetRanks = Collections.unmodifiableMap(RHYDON.movesetRanks);

        CHANSEY.movesetRanks.put(Moveset.of(ZEN_HEADBUTT, HYPER_BEAM), MovesetRating.of("C4", "B2"));
        CHANSEY.movesetRanks.put(Moveset.of(POUND, DAZZLING_GLEAM), MovesetRating.of("B3", "D5"));
        CHANSEY.movesetRanks.put(Moveset.of(POUND, HYPER_BEAM), MovesetRating.of("A1", "A1"));
        CHANSEY.movesetRanks.put(Moveset.of(ZEN_HEADBUTT, Move.PSYCHIC), MovesetRating.of("D5", "C3"));
        CHANSEY.movesetRanks.put(Moveset.of(POUND, Move.PSYCHIC), MovesetRating.of("B2", "C4"));
        CHANSEY.movesetRanks.put(Moveset.of(ZEN_HEADBUTT, DAZZLING_GLEAM), MovesetRating.of("F6", "D6"));
        CHANSEY.movesetRanks = Collections.unmodifiableMap(CHANSEY.movesetRanks);

        TANGELA.movesetRanks.put(Moveset.of(VINE_WHIP, POWER_WHIP), MovesetRating.of("B2", "C3"));
        TANGELA.movesetRanks.put(Moveset.of(VINE_WHIP, SLUDGE_BOMB), MovesetRating.of("C3", "A2"));
        TANGELA.movesetRanks.put(Moveset.of(VINE_WHIP, SOLAR_BEAM), MovesetRating.of("A1", "A1"));
        TANGELA.movesetRanks = Collections.unmodifiableMap(TANGELA.movesetRanks);

        KANGASKHAN.movesetRanks.put(Moveset.of(MUD_SLAP, STOMP), MovesetRating.of("B2", "A1"));
        KANGASKHAN.movesetRanks.put(Moveset.of(LOW_KICK, EARTHQUAKE), MovesetRating.of("B3", "F6"));
        KANGASKHAN.movesetRanks.put(Moveset.of(LOW_KICK, BRICK_BREAK), MovesetRating.of("C5", "D5"));
        KANGASKHAN.movesetRanks.put(Moveset.of(MUD_SLAP, EARTHQUAKE), MovesetRating.of("A1", "C4"));
        KANGASKHAN.movesetRanks.put(Moveset.of(MUD_SLAP, BRICK_BREAK), MovesetRating.of("C4", "C3"));
        KANGASKHAN.movesetRanks.put(Moveset.of(LOW_KICK, STOMP), MovesetRating.of("C6", "B2"));
        KANGASKHAN.movesetRanks = Collections.unmodifiableMap(KANGASKHAN.movesetRanks);

        HORSEA.movesetRanks.put(Moveset.of(WATER_GUN, DRAGON_PULSE), MovesetRating.of("A1", null));
        HORSEA.movesetRanks.put(Moveset.of(BUBBLE, FLASH_CANNON), MovesetRating.of(null, "A1"));
        HORSEA.movesetRanks = Collections.unmodifiableMap(HORSEA.movesetRanks);

        SEADRA.movesetRanks.put(Moveset.of(WATER_GUN, DRAGON_PULSE), MovesetRating.of("C4", "A1"));
        SEADRA.movesetRanks.put(Moveset.of(DRAGON_BREATH, DRAGON_PULSE), MovesetRating.of("C6", "A2"));
        SEADRA.movesetRanks.put(Moveset.of(DRAGON_BREATH, BLIZZARD), MovesetRating.of("C5", "C6"));
        SEADRA.movesetRanks.put(Moveset.of(WATER_GUN, HYDRO_PUMP), MovesetRating.of("A1", "B3"));
        SEADRA.movesetRanks.put(Moveset.of(DRAGON_BREATH, HYDRO_PUMP), MovesetRating.of("B2", "B4"));
        SEADRA.movesetRanks.put(Moveset.of(WATER_GUN, BLIZZARD), MovesetRating.of("B3", "B5"));
        SEADRA.movesetRanks = Collections.unmodifiableMap(SEADRA.movesetRanks);

        GOLDEEN.movesetRanks.put(Moveset.of(PECK, WATER_PULSE), MovesetRating.of(null, "A1"));
        GOLDEEN.movesetRanks.put(Moveset.of(MUD_SHOT, AQUA_TAIL), MovesetRating.of("A1", null));
        GOLDEEN.movesetRanks = Collections.unmodifiableMap(GOLDEEN.movesetRanks);

        SEAKING.movesetRanks.put(Moveset.of(POISON_JAB, ICY_WIND), MovesetRating.of("C4", "D6"));
        SEAKING.movesetRanks.put(Moveset.of(PECK, ICY_WIND), MovesetRating.of("F6", "D4"));
        SEAKING.movesetRanks.put(Moveset.of(PECK, DRILL_RUN), MovesetRating.of("D5", "A2"));
        SEAKING.movesetRanks.put(Moveset.of(POISON_JAB, MEGAHORN), MovesetRating.of("A1", "C3"));
        SEAKING.movesetRanks.put(Moveset.of(PECK, MEGAHORN), MovesetRating.of("C3", "D5"));
        SEAKING.movesetRanks.put(Moveset.of(POISON_JAB, DRILL_RUN), MovesetRating.of("C2", "A1"));
        SEAKING.movesetRanks = Collections.unmodifiableMap(SEAKING.movesetRanks);

        STARYU.movesetRanks.put(Moveset.of(TACKLE, BUBBLE_BEAM), MovesetRating.of(null, "A1"));
        STARYU.movesetRanks.put(Moveset.of(WATER_GUN, POWER_GEM), MovesetRating.of("A1", null));
        STARYU.movesetRanks = Collections.unmodifiableMap(STARYU.movesetRanks);

        STARMIE.movesetRanks.put(Moveset.of(TACKLE, Move.PSYCHIC), MovesetRating.of("C5", "A1"));
        STARMIE.movesetRanks.put(Moveset.of(TACKLE, POWER_GEM), MovesetRating.of("F6", "C4"));
        STARMIE.movesetRanks.put(Moveset.of(TACKLE, HYDRO_PUMP), MovesetRating.of("C4", "C3"));
        STARMIE.movesetRanks.put(Moveset.of(WATER_GUN, HYDRO_PUMP), MovesetRating.of("A1", "C5"));
        STARMIE.movesetRanks.put(Moveset.of(WATER_GUN, POWER_GEM), MovesetRating.of("C3", "C6"));
        STARMIE.movesetRanks.put(Moveset.of(WATER_GUN, Move.PSYCHIC), MovesetRating.of("A2", "B2"));
        STARMIE.movesetRanks = Collections.unmodifiableMap(STARMIE.movesetRanks);

        MR_MIME.movesetRanks.put(Moveset.of(CONFUSION, Move.PSYCHIC), MovesetRating.of("B2", "A2"));
        MR_MIME.movesetRanks.put(Moveset.of(ZEN_HEADBUTT, Move.PSYCHIC), MovesetRating.of("A1", "A4"));
        MR_MIME.movesetRanks.put(Moveset.of(CONFUSION, PSYBEAM), MovesetRating.of("F5", "A1"));
        MR_MIME.movesetRanks.put(Moveset.of(ZEN_HEADBUTT, PSYBEAM), MovesetRating.of("C4", "A3"));
        MR_MIME.movesetRanks.put(Moveset.of(ZEN_HEADBUTT, SHADOW_BALL), MovesetRating.of("C3", "B6"));
        MR_MIME.movesetRanks.put(Moveset.of(CONFUSION, SHADOW_BALL), MovesetRating.of("F6", "B5"));
        MR_MIME.movesetRanks = Collections.unmodifiableMap(MR_MIME.movesetRanks);

        SCYTHER.movesetRanks.put(Moveset.of(STEEL_WING, NIGHT_SLASH), MovesetRating.of("F6", "F6"));
        SCYTHER.movesetRanks.put(Moveset.of(FURY_CUTTER, X_SCISSOR), MovesetRating.of("A2", "D4"));
        SCYTHER.movesetRanks.put(Moveset.of(FURY_CUTTER, BUG_BUZZ), MovesetRating.of("A1", "C3"));
        SCYTHER.movesetRanks.put(Moveset.of(STEEL_WING, X_SCISSOR), MovesetRating.of("B4", "B2"));
        SCYTHER.movesetRanks.put(Moveset.of(FURY_CUTTER, NIGHT_SLASH), MovesetRating.of("F5", "F5"));
        SCYTHER.movesetRanks.put(Moveset.of(STEEL_WING, BUG_BUZZ), MovesetRating.of("B3", "A1"));
        SCYTHER.movesetRanks = Collections.unmodifiableMap(SCYTHER.movesetRanks);

        JYNX.movesetRanks.put(Moveset.of(FROST_BREATH, PSYSHOCK), MovesetRating.of("A3", "B4"));
        JYNX.movesetRanks.put(Moveset.of(FROST_BREATH, DRAINING_KISS), MovesetRating.of("B4", "F5"));
        JYNX.movesetRanks.put(Moveset.of(POUND, ICE_PUNCH), MovesetRating.of("B6", "B2"));
        JYNX.movesetRanks.put(Moveset.of(POUND, DRAINING_KISS), MovesetRating.of("B5", "F6"));
        JYNX.movesetRanks.put(Moveset.of(FROST_BREATH, ICE_PUNCH), MovesetRating.of("A2", "B3"));
        JYNX.movesetRanks.put(Moveset.of(POUND, PSYSHOCK), MovesetRating.of("A1", "A1"));
        JYNX.movesetRanks = Collections.unmodifiableMap(JYNX.movesetRanks);

        ELECTABUZZ.movesetRanks.put(Moveset.of(LOW_KICK, THUNDER), MovesetRating.of("B5", "D5"));
        ELECTABUZZ.movesetRanks.put(Moveset.of(LOW_KICK, THUNDER_PUNCH), MovesetRating.of("C6", "A1"));
        ELECTABUZZ.movesetRanks.put(Moveset.of(THUNDER_SHOCK, THUNDER_PUNCH), MovesetRating.of("B3", "B2"));
        ELECTABUZZ.movesetRanks.put(Moveset.of(THUNDER_SHOCK, THUNDERBOLT), MovesetRating.of("A2", "C4"));
        ELECTABUZZ.movesetRanks.put(Moveset.of(THUNDER_SHOCK, THUNDER), MovesetRating.of("A1", "D6"));
        ELECTABUZZ.movesetRanks.put(Moveset.of(LOW_KICK, THUNDERBOLT), MovesetRating.of("B4", "C3"));
        ELECTABUZZ.movesetRanks = Collections.unmodifiableMap(ELECTABUZZ.movesetRanks);

        MAGMAR.movesetRanks.put(Moveset.of(EMBER, FLAMETHROWER), MovesetRating.of("A2", "A2"));
        MAGMAR.movesetRanks.put(Moveset.of(EMBER, FIRE_BLAST), MovesetRating.of("A1", "B4"));
        MAGMAR.movesetRanks.put(Moveset.of(EMBER, FIRE_PUNCH), MovesetRating.of("C3", "A1"));
        MAGMAR.movesetRanks.put(Moveset.of(KARATE_CHOP, FIRE_BLAST), MovesetRating.of("C5", "F6"));
        MAGMAR.movesetRanks.put(Moveset.of(KARATE_CHOP, FIRE_PUNCH), MovesetRating.of("D6", "B3"));
        MAGMAR.movesetRanks.put(Moveset.of(KARATE_CHOP, FLAMETHROWER), MovesetRating.of("C4", "C5"));
        MAGMAR.movesetRanks = Collections.unmodifiableMap(MAGMAR.movesetRanks);

        PINSIR.movesetRanks.put(Moveset.of(FURY_CUTTER, VICE_GRIP), MovesetRating.of("D4", "C4"));
        PINSIR.movesetRanks.put(Moveset.of(ROCK_SMASH, SUBMISSION), MovesetRating.of("D5", "D5"));
        PINSIR.movesetRanks.put(Moveset.of(FURY_CUTTER, X_SCISSOR), MovesetRating.of("A1", "B2"));
        PINSIR.movesetRanks.put(Moveset.of(ROCK_SMASH, VICE_GRIP), MovesetRating.of("D6", "B3"));
        PINSIR.movesetRanks.put(Moveset.of(ROCK_SMASH, X_SCISSOR), MovesetRating.of("C2", "A1"));
        PINSIR.movesetRanks.put(Moveset.of(FURY_CUTTER, SUBMISSION), MovesetRating.of("D3", "F6"));
        PINSIR.movesetRanks = Collections.unmodifiableMap(PINSIR.movesetRanks);

        TAUROS.movesetRanks.put(Moveset.of(ZEN_HEADBUTT, EARTHQUAKE), MovesetRating.of("B2", "B5"));
        TAUROS.movesetRanks.put(Moveset.of(ZEN_HEADBUTT, HORN_ATTACK), MovesetRating.of("C5", "A2"));
        TAUROS.movesetRanks.put(Moveset.of(TACKLE, HORN_ATTACK), MovesetRating.of("B4", "A1"));
        TAUROS.movesetRanks.put(Moveset.of(ZEN_HEADBUTT, IRON_HEAD), MovesetRating.of("C6", "B6"));
        TAUROS.movesetRanks.put(Moveset.of(TACKLE, IRON_HEAD), MovesetRating.of("B3", "B4"));
        TAUROS.movesetRanks.put(Moveset.of(TACKLE, EARTHQUAKE), MovesetRating.of("A1", "B3"));
        TAUROS.movesetRanks = Collections.unmodifiableMap(TAUROS.movesetRanks);

        MAGIKARP.movesetRanks.put(Moveset.of(SPLASH, STRUGGLE), MovesetRating.of("A1", "A1"));
        MAGIKARP.movesetRanks = Collections.unmodifiableMap(MAGIKARP.movesetRanks);

        GYARADOS.movesetRanks.put(Moveset.of(DRAGON_BREATH, TWISTER), MovesetRating.of("F11", "F11"));
        GYARADOS.movesetRanks.put(Moveset.of(BITE, OUTRAGE), MovesetRating.of("C7", "C7"));
        GYARADOS.movesetRanks.put(Moveset.of(BITE, HYDRO_PUMP), MovesetRating.of("B5", "B5"));
        GYARADOS.movesetRanks.put(Moveset.of(DRAGON_TAIL, CRUNCH), MovesetRating.of("B4", "B3"));
        GYARADOS.movesetRanks.put(Moveset.of(BITE, DRAGON_PULSE), MovesetRating.of("D9", "D9"));
        GYARADOS.movesetRanks.put(Moveset.of(DRAGON_BREATH, HYDRO_PUMP), MovesetRating.of("A2", "B4"));
        GYARADOS.movesetRanks.put(Moveset.of(DRAGON_TAIL, OUTRAGE), MovesetRating.of("A3", "B2"));
        GYARADOS.movesetRanks.put(Moveset.of(DRAGON_TAIL, HYDRO_PUMP), MovesetRating.of("A1", "A1"));
        GYARADOS.movesetRanks.put(Moveset.of(BITE, TWISTER), MovesetRating.of("F10", "F10"));
        GYARADOS.movesetRanks.put(Moveset.of(BITE, CRUNCH), MovesetRating.of("C8", "C8"));
        GYARADOS.movesetRanks.put(Moveset.of(DRAGON_BREATH, DRAGON_PULSE), MovesetRating.of("C6", "C6"));
        GYARADOS.movesetRanks = Collections.unmodifiableMap(GYARADOS.movesetRanks);

        LAPRAS.movesetRanks.put(Moveset.of(FROST_BREATH, BLIZZARD), MovesetRating.of("A1", "C5"));
        LAPRAS.movesetRanks.put(Moveset.of(ICE_SHARD, DRAGON_PULSE), MovesetRating.of("C6", "B4"));
        LAPRAS.movesetRanks.put(Moveset.of(ICE_SHARD, BLIZZARD), MovesetRating.of("B3", "A2"));
        LAPRAS.movesetRanks.put(Moveset.of(FROST_BREATH, ICE_BEAM), MovesetRating.of("A2", "B3"));
        LAPRAS.movesetRanks.put(Moveset.of(FROST_BREATH, DRAGON_PULSE), MovesetRating.of("C5", "C6"));
        LAPRAS.movesetRanks.put(Moveset.of(ICE_SHARD, ICE_BEAM), MovesetRating.of("B4", "A1"));
        LAPRAS.movesetRanks = Collections.unmodifiableMap(LAPRAS.movesetRanks);

        DITTO.movesetRanks.put(Moveset.of(TRANSFORM, STRUGGLE), MovesetRating.of("A1", "A1"));
        DITTO.movesetRanks = Collections.unmodifiableMap(DITTO.movesetRanks);

        EEVEE.movesetRanks.put(Moveset.of(TACKLE, BODY_SLAM), MovesetRating.of("A1", null));
        EEVEE.movesetRanks.put(Moveset.of(TACKLE, DIG), MovesetRating.of(null, "A1"));
        EEVEE.movesetRanks = Collections.unmodifiableMap(EEVEE.movesetRanks);

        VAPOREON.movesetRanks.put(Moveset.of(WATER_GUN, WATER_PULSE), MovesetRating.of("B3", "B2"));
        VAPOREON.movesetRanks.put(Moveset.of(WATER_GUN, HYDRO_PUMP), MovesetRating.of("A1", "B3"));
        VAPOREON.movesetRanks.put(Moveset.of(WATER_GUN, AQUA_TAIL), MovesetRating.of("B2", "A1"));
        VAPOREON.movesetRanks = Collections.unmodifiableMap(VAPOREON.movesetRanks);

        JOLTEON.movesetRanks.put(Moveset.of(THUNDER_SHOCK, DISCHARGE), MovesetRating.of("D3", "A2"));
        JOLTEON.movesetRanks.put(Moveset.of(THUNDER_SHOCK, THUNDER), MovesetRating.of("A2", "C3"));
        JOLTEON.movesetRanks.put(Moveset.of(THUNDER_SHOCK, THUNDERBOLT), MovesetRating.of("A1", "A1"));
        JOLTEON.movesetRanks = Collections.unmodifiableMap(JOLTEON.movesetRanks);

        FLAREON.movesetRanks.put(Moveset.of(EMBER, FLAMETHROWER), MovesetRating.of("B2", "A1"));
        FLAREON.movesetRanks.put(Moveset.of(EMBER, FIRE_BLAST), MovesetRating.of("A1", "B2"));
        FLAREON.movesetRanks.put(Moveset.of(EMBER, HEAT_WAVE), MovesetRating.of("B3", "C3"));
        FLAREON.movesetRanks = Collections.unmodifiableMap(FLAREON.movesetRanks);

        PORYGON.movesetRanks.put(Moveset.of(ZEN_HEADBUTT, SIGNAL_BEAM), MovesetRating.of("B6", "A5"));
        PORYGON.movesetRanks.put(Moveset.of(ZEN_HEADBUTT, DISCHARGE), MovesetRating.of("B4", "B6"));
        PORYGON.movesetRanks.put(Moveset.of(ZEN_HEADBUTT, PSYBEAM), MovesetRating.of("B5", "A4"));
        PORYGON.movesetRanks.put(Moveset.of(TACKLE, SIGNAL_BEAM), MovesetRating.of("A1", "A1"));
        PORYGON.movesetRanks.put(Moveset.of(TACKLE, PSYBEAM), MovesetRating.of("A3", "A2"));
        PORYGON.movesetRanks.put(Moveset.of(TACKLE, DISCHARGE), MovesetRating.of("A2", "A3"));
        PORYGON.movesetRanks = Collections.unmodifiableMap(PORYGON.movesetRanks);

        OMANYTE.movesetRanks.put(Moveset.of(WATER_GUN, ANCIENT_POWER), MovesetRating.of(null, "A1"));
        OMANYTE.movesetRanks.put(Moveset.of(WATER_GUN, BRINE), MovesetRating.of("A1", null));
        OMANYTE.movesetRanks = Collections.unmodifiableMap(OMANYTE.movesetRanks);

        OMASTAR.movesetRanks.put(Moveset.of(WATER_GUN, ROCK_SLIDE), MovesetRating.of("C5", "B3"));
        OMASTAR.movesetRanks.put(Moveset.of(MUD_SHOT, HYDRO_PUMP), MovesetRating.of("C4", "F8"));
        OMASTAR.movesetRanks.put(Moveset.of(MUD_SHOT, ROCK_SLIDE), MovesetRating.of("D6", "C4"));
        OMASTAR.movesetRanks.put(Moveset.of(ROCK_THROW, ANCIENT_POWER), MovesetRating.of("D8", "B2"));
        OMASTAR.movesetRanks.put(Moveset.of(ROCK_THROW, ROCK_SLIDE), MovesetRating.of("B2", "A1"));
        OMASTAR.movesetRanks.put(Moveset.of(WATER_GUN, HYDRO_PUMP), MovesetRating.of("A1", "F9"));
        OMASTAR.movesetRanks.put(Moveset.of(MUD_SHOT, ANCIENT_POWER), MovesetRating.of("F9", "D7"));
        OMASTAR.movesetRanks.put(Moveset.of(WATER_GUN, ANCIENT_POWER), MovesetRating.of("D7", "C5"));
        OMASTAR.movesetRanks.put(Moveset.of(ROCK_THROW, HYDRO_PUMP), MovesetRating.of("B3", "C6"));
        OMASTAR.movesetRanks = Collections.unmodifiableMap(OMASTAR.movesetRanks);

        KABUTO.movesetRanks.put(Moveset.of(SCRATCH, ANCIENT_POWER), MovesetRating.of(null, "A1"));
        KABUTO.movesetRanks.put(Moveset.of(SCRATCH, AQUA_JET), MovesetRating.of("A1", null));
        KABUTO.movesetRanks = Collections.unmodifiableMap(KABUTO.movesetRanks);

        KABUTOPS.movesetRanks.put(Moveset.of(MUD_SHOT, STONE_EDGE), MovesetRating.of("A1", "F6"));
        KABUTOPS.movesetRanks.put(Moveset.of(FURY_CUTTER, ANCIENT_POWER), MovesetRating.of("D6", "B3"));
        KABUTOPS.movesetRanks.put(Moveset.of(FURY_CUTTER, WATER_PULSE), MovesetRating.of("C3", "A1"));
        KABUTOPS.movesetRanks.put(Moveset.of(MUD_SHOT, ANCIENT_POWER), MovesetRating.of("C4", "B4"));
        KABUTOPS.movesetRanks.put(Moveset.of(MUD_SHOT, WATER_PULSE), MovesetRating.of("C5", "A2"));
        KABUTOPS.movesetRanks.put(Moveset.of(FURY_CUTTER, STONE_EDGE), MovesetRating.of("B2", "F5"));
        KABUTOPS.movesetRanks = Collections.unmodifiableMap(KABUTOPS.movesetRanks);

        AERODACTYL.movesetRanks.put(Moveset.of(STEEL_WING, HYPER_BEAM), MovesetRating.of("B2", "B3"));
        AERODACTYL.movesetRanks.put(Moveset.of(BITE, IRON_HEAD), MovesetRating.of("C4", "D6"));
        AERODACTYL.movesetRanks.put(Moveset.of(STEEL_WING, ANCIENT_POWER), MovesetRating.of("F6", "A1"));
        AERODACTYL.movesetRanks.put(Moveset.of(BITE, HYPER_BEAM), MovesetRating.of("A1", "D5"));
        AERODACTYL.movesetRanks.put(Moveset.of(BITE, ANCIENT_POWER), MovesetRating.of("C3", "B2"));
        AERODACTYL.movesetRanks.put(Moveset.of(STEEL_WING, IRON_HEAD), MovesetRating.of("D5", "C4"));
        AERODACTYL.movesetRanks = Collections.unmodifiableMap(AERODACTYL.movesetRanks);

        SNORLAX.movesetRanks.put(Moveset.of(ZEN_HEADBUTT, HYPER_BEAM), MovesetRating.of("B3", "A1"));
        SNORLAX.movesetRanks.put(Moveset.of(LICK, EARTHQUAKE), MovesetRating.of("D7", "D8"));
        SNORLAX.movesetRanks.put(Moveset.of(ZEN_HEADBUTT, EARTHQUAKE), MovesetRating.of("D8", "C7"));
        SNORLAX.movesetRanks.put(Moveset.of(LICK, BODY_SLAM), MovesetRating.of("A2", "B5"));
        SNORLAX.movesetRanks.put(Moveset.of(LICK, HEAVY_SLAM), MovesetRating.of("C5", "B6"));
        SNORLAX.movesetRanks.put(Moveset.of(ZEN_HEADBUTT, BODY_SLAM), MovesetRating.of("B4", "A2"));
        SNORLAX.movesetRanks.put(Moveset.of(LICK, HYPER_BEAM), MovesetRating.of("A1", "B4"));
        SNORLAX.movesetRanks.put(Moveset.of(ZEN_HEADBUTT, HEAVY_SLAM), MovesetRating.of("C6", "B3"));
        SNORLAX.movesetRanks = Collections.unmodifiableMap(SNORLAX.movesetRanks);

        ARTICUNO.movesetRanks.put(Moveset.of(FROST_BREATH, BLIZZARD), MovesetRating.of("A1", null));
        ARTICUNO.movesetRanks.put(Moveset.of(FROST_BREATH, ICE_BEAM), MovesetRating.of(null, "A1"));
        ARTICUNO.movesetRanks = Collections.unmodifiableMap(ARTICUNO.movesetRanks);

        ZAPDOS.movesetRanks.put(Moveset.of(THUNDER_SHOCK, THUNDER), MovesetRating.of("A1", null));
        ZAPDOS.movesetRanks.put(Moveset.of(THUNDER_SHOCK, THUNDERBOLT), MovesetRating.of(null, "A1"));
        ZAPDOS.movesetRanks = Collections.unmodifiableMap(ZAPDOS.movesetRanks);

        MOLTRES.movesetRanks.put(Moveset.of(EMBER, FLAMETHROWER), MovesetRating.of(null, "A1"));
        MOLTRES.movesetRanks.put(Moveset.of(EMBER, FIRE_BLAST), MovesetRating.of("A1", null));
        MOLTRES.movesetRanks = Collections.unmodifiableMap(MOLTRES.movesetRanks);

        DRATINI.movesetRanks.put(Moveset.of(DRAGON_BREATH, AQUA_TAIL), MovesetRating.of("A1", null));
        DRATINI.movesetRanks.put(Moveset.of(DRAGON_BREATH, TWISTER), MovesetRating.of(null, "A1"));
        DRATINI.movesetRanks = Collections.unmodifiableMap(DRATINI.movesetRanks);

        DRAGONAIR.movesetRanks.put(Moveset.of(DRAGON_BREATH, DRAGON_PULSE), MovesetRating.of("A1", "A1"));
        DRAGONAIR.movesetRanks = Collections.unmodifiableMap(DRAGONAIR.movesetRanks);

        DRAGONITE.movesetRanks.put(Moveset.of(STEEL_WING, HYPER_BEAM), MovesetRating.of("D11", "C8"));
        DRAGONITE.movesetRanks.put(Moveset.of(DRAGON_TAIL, HURRICANE), MovesetRating.of("A2", "B2"));
        DRAGONITE.movesetRanks.put(Moveset.of(DRAGON_BREATH, HYPER_BEAM), MovesetRating.of("C5", "D11"));
        DRAGONITE.movesetRanks.put(Moveset.of(DRAGON_BREATH, DRAGON_PULSE), MovesetRating.of("C6", "C9"));
        DRAGONITE.movesetRanks.put(Moveset.of(DRAGON_TAIL, HYPER_BEAM), MovesetRating.of("B4", "B3"));
        DRAGONITE.movesetRanks.put(Moveset.of(DRAGON_TAIL, OUTRAGE), MovesetRating.of("A1", "A1"));
        DRAGONITE.movesetRanks.put(Moveset.of(STEEL_WING, DRAGON_PULSE), MovesetRating.of("D10", "B6"));
        DRAGONITE.movesetRanks.put(Moveset.of(DRAGON_BREATH, DRAGON_CLAW), MovesetRating.of("A3", "C10"));
        DRAGONITE.movesetRanks.put(Moveset.of(STEEL_WING, OUTRAGE), MovesetRating.of("C7", "B4"));
        DRAGONITE.movesetRanks.put(Moveset.of(STEEL_WING, HURRICANE), MovesetRating.of("C8", "B5"));
        DRAGONITE.movesetRanks.put(Moveset.of(STEEL_WING, DRAGON_CLAW), MovesetRating.of("C9", "B7"));
        DRAGONITE.movesetRanks = Collections.unmodifiableMap(DRAGONITE.movesetRanks);

        MEWTWO.movesetRanks.put(Moveset.of(CONFUSION, Move.PSYCHIC), MovesetRating.of(null, "A1"));
        MEWTWO.movesetRanks.put(Moveset.of(PSYCHO_CUT, Move.PSYCHIC), MovesetRating.of("A1", null));
        MEWTWO.movesetRanks = Collections.unmodifiableMap(MEWTWO.movesetRanks);

        MEW.movesetRanks.put(Moveset.of(POUND, Move.PSYCHIC), MovesetRating.of("A1", "A1"));
        MEW.movesetRanks = Collections.unmodifiableMap(MEW.movesetRanks);

        CHIKORITA.movesetRanks.put(Moveset.of(VINE_WHIP, GRASS_KNOT), MovesetRating.of("A1", "A1"));
        CHIKORITA.movesetRanks = Collections.unmodifiableMap(CHIKORITA.movesetRanks);

        BAYLEEF.movesetRanks.put(Moveset.of(RAZOR_LEAF, GRASS_KNOT), MovesetRating.of("A1", "A1"));
        BAYLEEF.movesetRanks = Collections.unmodifiableMap(BAYLEEF.movesetRanks);

        MEGANIUM.movesetRanks.put(Moveset.of(RAZOR_LEAF, SOLAR_BEAM), MovesetRating.of("A2", "A1"));
        MEGANIUM.movesetRanks.put(Moveset.of(VINE_WHIP, EARTHQUAKE), MovesetRating.of("C6", "D6"));
        MEGANIUM.movesetRanks.put(Moveset.of(RAZOR_LEAF, EARTHQUAKE), MovesetRating.of("C5", "B3"));
        MEGANIUM.movesetRanks.put(Moveset.of(RAZOR_LEAF, PETAL_BLIZZARD), MovesetRating.of("B4", "A2"));
        MEGANIUM.movesetRanks.put(Moveset.of(VINE_WHIP, PETAL_BLIZZARD), MovesetRating.of("B3", "C4"));
        MEGANIUM.movesetRanks.put(Moveset.of(VINE_WHIP, SOLAR_BEAM), MovesetRating.of("A1", "C5"));
        MEGANIUM.movesetRanks = Collections.unmodifiableMap(MEGANIUM.movesetRanks);

        CYNDAQUIL.movesetRanks.put(Moveset.of(EMBER, FLAMETHROWER), MovesetRating.of("A1", "A1"));
        CYNDAQUIL.movesetRanks = Collections.unmodifiableMap(CYNDAQUIL.movesetRanks);

        QUILAVA.movesetRanks.put(Moveset.of(EMBER, FLAMETHROWER), MovesetRating.of("A1", "A1"));
        QUILAVA.movesetRanks = Collections.unmodifiableMap(QUILAVA.movesetRanks);

        TYPHLOSION.movesetRanks.put(Moveset.of(SHADOW_CLAW, FIRE_BLAST), MovesetRating.of("B4", "C6"));
        TYPHLOSION.movesetRanks.put(Moveset.of(SHADOW_CLAW, SOLAR_BEAM), MovesetRating.of("C6", "C5"));
        TYPHLOSION.movesetRanks.put(Moveset.of(EMBER, FIRE_BLAST), MovesetRating.of("B3", "B2"));
        TYPHLOSION.movesetRanks.put(Moveset.of(EMBER, OVERHEAT), MovesetRating.of("A1", "A1"));
        TYPHLOSION.movesetRanks.put(Moveset.of(EMBER, SOLAR_BEAM), MovesetRating.of("C5", "B3"));
        TYPHLOSION.movesetRanks.put(Moveset.of(SHADOW_CLAW, OVERHEAT), MovesetRating.of("A2", "C4"));
        TYPHLOSION.movesetRanks = Collections.unmodifiableMap(TYPHLOSION.movesetRanks);

        TOTODILE.movesetRanks.put(Moveset.of(WATER_GUN, WATER_PULSE), MovesetRating.of("A1", null));
        TOTODILE.movesetRanks.put(Moveset.of(WATER_GUN, CRUNCH), MovesetRating.of(null, "A1"));
        TOTODILE.movesetRanks = Collections.unmodifiableMap(TOTODILE.movesetRanks);

        CROCONAW.movesetRanks.put(Moveset.of(WATER_GUN, WATER_PULSE), MovesetRating.of("A1", null));
        CROCONAW.movesetRanks.put(Moveset.of(WATER_GUN, CRUNCH), MovesetRating.of(null, "A1"));
        CROCONAW.movesetRanks = Collections.unmodifiableMap(CROCONAW.movesetRanks);

        FERALIGATR.movesetRanks.put(Moveset.of(BITE, HYDRO_PUMP), MovesetRating.of("B2", "B6"));
        FERALIGATR.movesetRanks.put(Moveset.of(BITE, CRUNCH), MovesetRating.of("C6", "B5"));
        FERALIGATR.movesetRanks.put(Moveset.of(BITE, ICE_BEAM), MovesetRating.of("C4", "A2"));
        FERALIGATR.movesetRanks.put(Moveset.of(WATER_GUN, CRUNCH), MovesetRating.of("C5", "B3"));
        FERALIGATR.movesetRanks.put(Moveset.of(WATER_GUN, HYDRO_PUMP), MovesetRating.of("A1", "B4"));
        FERALIGATR.movesetRanks.put(Moveset.of(WATER_GUN, ICE_BEAM), MovesetRating.of("B3", "A1"));
        FERALIGATR.movesetRanks = Collections.unmodifiableMap(FERALIGATR.movesetRanks);

        SENTRET.movesetRanks.put(Moveset.of(QUICK_ATTACK, DIG), MovesetRating.of(null, "A1"));
        SENTRET.movesetRanks.put(Moveset.of(SCRATCH, GRASS_KNOT), MovesetRating.of("A1", null));
        SENTRET.movesetRanks = Collections.unmodifiableMap(SENTRET.movesetRanks);

        FURRET.movesetRanks.put(Moveset.of(QUICK_ATTACK, HYPER_BEAM), MovesetRating.of("A1", "C5"));
        FURRET.movesetRanks.put(Moveset.of(SUCKER_PUNCH, DIG), MovesetRating.of("C5", "B4"));
        FURRET.movesetRanks.put(Moveset.of(QUICK_ATTACK, DIG), MovesetRating.of("C3", "B3"));
        FURRET.movesetRanks.put(Moveset.of(SUCKER_PUNCH, BRICK_BREAK), MovesetRating.of("C6", "A2"));
        FURRET.movesetRanks.put(Moveset.of(QUICK_ATTACK, BRICK_BREAK), MovesetRating.of("C4", "A1"));
        FURRET.movesetRanks.put(Moveset.of(SUCKER_PUNCH, HYPER_BEAM), MovesetRating.of("B2", "C6"));
        FURRET.movesetRanks = Collections.unmodifiableMap(FURRET.movesetRanks);

        HOOTHOOT.movesetRanks.put(Moveset.of(PECK, SKY_ATTACK), MovesetRating.of("A1", null));
        HOOTHOOT.movesetRanks.put(Moveset.of(PECK, AERIAL_ACE), MovesetRating.of(null, "A1"));
        HOOTHOOT.movesetRanks = Collections.unmodifiableMap(HOOTHOOT.movesetRanks);

        NOCTOWL.movesetRanks.put(Moveset.of(WING_ATTACK, Move.PSYCHIC), MovesetRating.of("C4", "C6"));
        NOCTOWL.movesetRanks.put(Moveset.of(EXTRASENSORY, SKY_ATTACK), MovesetRating.of("B2", "A1"));
        NOCTOWL.movesetRanks.put(Moveset.of(EXTRASENSORY, Move.PSYCHIC), MovesetRating.of("C3", "C4"));
        NOCTOWL.movesetRanks.put(Moveset.of(EXTRASENSORY, NIGHT_SHADE), MovesetRating.of("D5", "C3"));
        NOCTOWL.movesetRanks.put(Moveset.of(WING_ATTACK, SKY_ATTACK), MovesetRating.of("A1", "B2"));
        NOCTOWL.movesetRanks.put(Moveset.of(WING_ATTACK, NIGHT_SHADE), MovesetRating.of("D6", "C5"));
        NOCTOWL.movesetRanks = Collections.unmodifiableMap(NOCTOWL.movesetRanks);

        LEDYBA.movesetRanks.put(Moveset.of(BUG_BITE, AERIAL_ACE), MovesetRating.of("A1", null));
        LEDYBA.movesetRanks.put(Moveset.of(BUG_BITE, SILVER_WIND), MovesetRating.of(null, "A1"));
        LEDYBA.movesetRanks = Collections.unmodifiableMap(LEDYBA.movesetRanks);

        LEDIAN.movesetRanks.put(Moveset.of(BUG_BITE, AERIAL_ACE), MovesetRating.of("B4", "B5"));
        LEDIAN.movesetRanks.put(Moveset.of(STRUGGLE_BUG, BUG_BITE), MovesetRating.of(null, "A3"));
        LEDIAN.movesetRanks.put(Moveset.of(BUG_BITE, SILVER_WIND), MovesetRating.of("B3", "B4"));
        LEDIAN.movesetRanks.put(Moveset.of(STRUGGLE_BUG, SILVER_WIND), MovesetRating.of("B5", "A1"));
        LEDIAN.movesetRanks.put(Moveset.of(STRUGGLE_BUG, BUG_BUZZ), MovesetRating.of("A2", null));
        LEDIAN.movesetRanks.put(Moveset.of(STRUGGLE_BUG, AERIAL_ACE), MovesetRating.of("B6", "A2"));
        LEDIAN.movesetRanks.put(Moveset.of(BUG_BITE, BUG_BUZZ), MovesetRating.of("A1", "B6"));
        LEDIAN.movesetRanks = Collections.unmodifiableMap(LEDIAN.movesetRanks);

        SPINARAK.movesetRanks.put(Moveset.of(BUG_BITE, SIGNAL_BEAM), MovesetRating.of("A1", null));
        SPINARAK.movesetRanks.put(Moveset.of(POISON_STING, SIGNAL_BEAM), MovesetRating.of(null, "A1"));
        SPINARAK.movesetRanks = Collections.unmodifiableMap(SPINARAK.movesetRanks);

        ARIADOS.movesetRanks.put(Moveset.of(INFESTATION, SHADOW_SNEAK), MovesetRating.of("B5", "A2"));
        ARIADOS.movesetRanks.put(Moveset.of(POISON_STING, MEGAHORN), MovesetRating.of("A3", "D6"));
        ARIADOS.movesetRanks.put(Moveset.of(INFESTATION, MEGAHORN), MovesetRating.of("A1", "B3"));
        ARIADOS.movesetRanks.put(Moveset.of(INFESTATION, CROSS_POISON), MovesetRating.of("A2", "A1"));
        ARIADOS.movesetRanks.put(Moveset.of(POISON_STING, CROSS_POISON), MovesetRating.of("A4", "C4"));
        ARIADOS.movesetRanks.put(Moveset.of(POISON_STING, SHADOW_SNEAK), MovesetRating.of("B6", "C5"));
        ARIADOS.movesetRanks = Collections.unmodifiableMap(ARIADOS.movesetRanks);

        CROBAT.movesetRanks.put(Moveset.of(AIR_SLASH, AIR_CUTTER), MovesetRating.of("B5", "B3"));
        CROBAT.movesetRanks.put(Moveset.of(BITE, AIR_CUTTER), MovesetRating.of("C6", "C6"));
        CROBAT.movesetRanks.put(Moveset.of(AIR_SLASH, SHADOW_BALL), MovesetRating.of("A2", "A2"));
        CROBAT.movesetRanks.put(Moveset.of(AIR_SLASH, SLUDGE_BOMB), MovesetRating.of("A1", "A1"));
        CROBAT.movesetRanks.put(Moveset.of(BITE, SLUDGE_BOMB), MovesetRating.of("A3", "C4"));
        CROBAT.movesetRanks.put(Moveset.of(BITE, SHADOW_BALL), MovesetRating.of("A4", "C5"));
        CROBAT.movesetRanks = Collections.unmodifiableMap(CROBAT.movesetRanks);

        CHINCHOU.movesetRanks.put(Moveset.of(BUBBLE, THUNDERBOLT), MovesetRating.of("A1", "A1"));
        CHINCHOU.movesetRanks = Collections.unmodifiableMap(CHINCHOU.movesetRanks);

        LANTURN.movesetRanks.put(Moveset.of(CHARGE_BEAM, THUNDER), MovesetRating.of("B6", "B3"));
        LANTURN.movesetRanks.put(Moveset.of(WATER_GUN, THUNDERBOLT), MovesetRating.of("A2", "C6"));
        LANTURN.movesetRanks.put(Moveset.of(CHARGE_BEAM, THUNDERBOLT), MovesetRating.of("A3", "A2"));
        LANTURN.movesetRanks.put(Moveset.of(WATER_GUN, HYDRO_PUMP), MovesetRating.of("A1", "C4"));
        LANTURN.movesetRanks.put(Moveset.of(CHARGE_BEAM, HYDRO_PUMP), MovesetRating.of("B4", "A1"));
        LANTURN.movesetRanks.put(Moveset.of(WATER_GUN, THUNDER), MovesetRating.of("B5", "C5"));
        LANTURN.movesetRanks = Collections.unmodifiableMap(LANTURN.movesetRanks);

        PICHU.movesetRanks.put(Moveset.of(THUNDER_SHOCK, THUNDERBOLT), MovesetRating.of("A1", "A1"));
        PICHU.movesetRanks = Collections.unmodifiableMap(PICHU.movesetRanks);

        CLEFFA.movesetRanks.put(Moveset.of(POUND, Move.PSYCHIC), MovesetRating.of("A1", null));
        CLEFFA.movesetRanks.put(Moveset.of(ZEN_HEADBUTT, Move.PSYCHIC), MovesetRating.of(null, "A1"));
        CLEFFA.movesetRanks = Collections.unmodifiableMap(CLEFFA.movesetRanks);

        IGGLYBUFF.movesetRanks.put(Moveset.of(POUND, BODY_SLAM), MovesetRating.of("A1", null));
        IGGLYBUFF.movesetRanks.put(Moveset.of(FEINT_ATTACK, BODY_SLAM), MovesetRating.of(null, "A1"));
        IGGLYBUFF.movesetRanks = Collections.unmodifiableMap(IGGLYBUFF.movesetRanks);

        TOGEPI.movesetRanks.put(Moveset.of(ZEN_HEADBUTT, PSYSHOCK), MovesetRating.of("A1", "A1"));
        TOGEPI.movesetRanks = Collections.unmodifiableMap(TOGEPI.movesetRanks);

        TOGETIC.movesetRanks.put(Moveset.of(EXTRASENSORY, DAZZLING_GLEAM), MovesetRating.of("A3", "A3"));
        TOGETIC.movesetRanks.put(Moveset.of(ZEN_HEADBUTT, DAZZLING_GLEAM), MovesetRating.of("A2", "A2"));
        TOGETIC.movesetRanks.put(Moveset.of(ZEN_HEADBUTT, ANCIENT_POWER), MovesetRating.of("C10", "C10"));
        TOGETIC.movesetRanks.put(Moveset.of(ZEN_HEADBUTT, AERIAL_ACE), MovesetRating.of("B6", "B6"));
        TOGETIC.movesetRanks.put(Moveset.of(HIDDEN_POWER, AERIAL_ACE), MovesetRating.of("B8", "B8"));
        TOGETIC.movesetRanks.put(Moveset.of(STEEL_WING, AERIAL_ACE), MovesetRating.of("B5", "B5"));
        TOGETIC.movesetRanks.put(Moveset.of(STEEL_WING, ANCIENT_POWER), MovesetRating.of("C9", "C9"));
        TOGETIC.movesetRanks.put(Moveset.of(EXTRASENSORY, ANCIENT_POWER), MovesetRating.of("C11", "C11"));
        TOGETIC.movesetRanks.put(Moveset.of(STEEL_WING, DAZZLING_GLEAM), MovesetRating.of("A1", "A1"));
        TOGETIC.movesetRanks.put(Moveset.of(HIDDEN_POWER, DAZZLING_GLEAM), MovesetRating.of("A4", "A4"));
        TOGETIC.movesetRanks.put(Moveset.of(EXTRASENSORY, AERIAL_ACE), MovesetRating.of("B7", "B7"));
        TOGETIC.movesetRanks.put(Moveset.of(HIDDEN_POWER, ANCIENT_POWER), MovesetRating.of("C12", "C12"));
        TOGETIC.movesetRanks = Collections.unmodifiableMap(TOGETIC.movesetRanks);

        NATU.movesetRanks.put(Moveset.of(POUND, DRILL_PECK), MovesetRating.of("A1", null));
        NATU.movesetRanks.put(Moveset.of(POUND, PSYSHOCK), MovesetRating.of(null, "A1"));
        NATU.movesetRanks = Collections.unmodifiableMap(NATU.movesetRanks);

        XATU.movesetRanks.put(Moveset.of(FEINT_ATTACK, OMINOUS_WIND), MovesetRating.of("C6", "B6"));
        XATU.movesetRanks.put(Moveset.of(FEINT_ATTACK, FUTURE_SIGHT), MovesetRating.of("A2", "B5"));
        XATU.movesetRanks.put(Moveset.of(AIR_SLASH, AERIAL_ACE), MovesetRating.of("B3", "A1"));
        XATU.movesetRanks.put(Moveset.of(FEINT_ATTACK, AERIAL_ACE), MovesetRating.of("B4", "B4"));
        XATU.movesetRanks.put(Moveset.of(AIR_SLASH, FUTURE_SIGHT), MovesetRating.of("A1", "A2"));
        XATU.movesetRanks.put(Moveset.of(AIR_SLASH, OMINOUS_WIND), MovesetRating.of("C5", "A3"));
        XATU.movesetRanks = Collections.unmodifiableMap(XATU.movesetRanks);

        MAREEP.movesetRanks.put(Moveset.of(THUNDER_SHOCK, THUNDERBOLT), MovesetRating.of("A1", "A1"));
        MAREEP.movesetRanks = Collections.unmodifiableMap(MAREEP.movesetRanks);

        FLAAFFY.movesetRanks.put(Moveset.of(CHARGE_BEAM, DISCHARGE), MovesetRating.of(null, "A1"));
        FLAAFFY.movesetRanks.put(Moveset.of(CHARGE_BEAM, THUNDERBOLT), MovesetRating.of("A1", null));
        FLAAFFY.movesetRanks = Collections.unmodifiableMap(FLAAFFY.movesetRanks);

        AMPHAROS.movesetRanks.put(Moveset.of(CHARGE_BEAM, THUNDER), MovesetRating.of("B3", "C5"));
        AMPHAROS.movesetRanks.put(Moveset.of(CHARGE_BEAM, FOCUS_BLAST), MovesetRating.of("C5", "D6"));
        AMPHAROS.movesetRanks.put(Moveset.of(CHARGE_BEAM, ZAP_CANNON), MovesetRating.of("A1", "C4"));
        AMPHAROS.movesetRanks.put(Moveset.of(VOLT_SWITCH, ZAP_CANNON), MovesetRating.of("A2", "A1"));
        AMPHAROS.movesetRanks.put(Moveset.of(VOLT_SWITCH, FOCUS_BLAST), MovesetRating.of("C6", "B3"));
        AMPHAROS.movesetRanks.put(Moveset.of(VOLT_SWITCH, THUNDER), MovesetRating.of("B4", "A2"));
        AMPHAROS.movesetRanks = Collections.unmodifiableMap(AMPHAROS.movesetRanks);

        BELLOSSOM.movesetRanks.put(Moveset.of(ACID, PETAL_BLIZZARD), MovesetRating.of("B5", "D6"));
        BELLOSSOM.movesetRanks.put(Moveset.of(RAZOR_LEAF, PETAL_BLIZZARD), MovesetRating.of("A2", "B3"));
        BELLOSSOM.movesetRanks.put(Moveset.of(ACID, DAZZLING_GLEAM), MovesetRating.of("C6", "C5"));
        BELLOSSOM.movesetRanks.put(Moveset.of(RAZOR_LEAF, DAZZLING_GLEAM), MovesetRating.of("B4", "B2"));
        BELLOSSOM.movesetRanks.put(Moveset.of(ACID, LEAF_BLADE), MovesetRating.of("B3", "C4"));
        BELLOSSOM.movesetRanks.put(Moveset.of(RAZOR_LEAF, LEAF_BLADE), MovesetRating.of("A1", "A1"));
        BELLOSSOM.movesetRanks = Collections.unmodifiableMap(BELLOSSOM.movesetRanks);

        MARILL.movesetRanks.put(Moveset.of(BUBBLE, AQUA_TAIL), MovesetRating.of("A1", "A1"));
        MARILL.movesetRanks = Collections.unmodifiableMap(MARILL.movesetRanks);

        AZUMARILL.movesetRanks.put(Moveset.of(ROCK_SMASH, HYDRO_PUMP), MovesetRating.of("B4", "B4"));
        AZUMARILL.movesetRanks.put(Moveset.of(BUBBLE, HYDRO_PUMP), MovesetRating.of("A1", "B3"));
        AZUMARILL.movesetRanks.put(Moveset.of(ROCK_SMASH, ICE_BEAM), MovesetRating.of("D6", "B6"));
        AZUMARILL.movesetRanks.put(Moveset.of(ROCK_SMASH, PLAY_ROUGH), MovesetRating.of("B3", "A1"));
        AZUMARILL.movesetRanks.put(Moveset.of(BUBBLE, PLAY_ROUGH), MovesetRating.of("A2", "B2"));
        AZUMARILL.movesetRanks.put(Moveset.of(BUBBLE, ICE_BEAM), MovesetRating.of("C5", "B5"));
        AZUMARILL.movesetRanks = Collections.unmodifiableMap(AZUMARILL.movesetRanks);

        SUDOWOODO.movesetRanks.put(Moveset.of(COUNTER, STONE_EDGE), MovesetRating.of("B4", "C5"));
        SUDOWOODO.movesetRanks.put(Moveset.of(ROCK_THROW, EARTHQUAKE), MovesetRating.of("B5", "B4"));
        SUDOWOODO.movesetRanks.put(Moveset.of(COUNTER, EARTHQUAKE), MovesetRating.of("C6", "C6"));
        SUDOWOODO.movesetRanks.put(Moveset.of(COUNTER, ROCK_SLIDE), MovesetRating.of("B3", "B2"));
        SUDOWOODO.movesetRanks.put(Moveset.of(ROCK_THROW, ROCK_SLIDE), MovesetRating.of("A1", "A1"));
        SUDOWOODO.movesetRanks.put(Moveset.of(ROCK_THROW, STONE_EDGE), MovesetRating.of("A2", "B3"));
        SUDOWOODO.movesetRanks = Collections.unmodifiableMap(SUDOWOODO.movesetRanks);

        POLITOED.movesetRanks.put(Moveset.of(MUD_SHOT, EARTHQUAKE), MovesetRating.of("C6", "D6"));
        POLITOED.movesetRanks.put(Moveset.of(MUD_SHOT, HYDRO_PUMP), MovesetRating.of("B2", "C4"));
        POLITOED.movesetRanks.put(Moveset.of(BUBBLE, EARTHQUAKE), MovesetRating.of("B4", "B3"));
        POLITOED.movesetRanks.put(Moveset.of(BUBBLE, BLIZZARD), MovesetRating.of("B3", "A2"));
        POLITOED.movesetRanks.put(Moveset.of(BUBBLE, HYDRO_PUMP), MovesetRating.of("A1", "A1"));
        POLITOED.movesetRanks.put(Moveset.of(MUD_SHOT, BLIZZARD), MovesetRating.of("C5", "C5"));
        POLITOED.movesetRanks = Collections.unmodifiableMap(POLITOED.movesetRanks);

        HOPPIP.movesetRanks.put(Moveset.of(BULLET_SEED, GRASS_KNOT), MovesetRating.of("A1", "A1"));
        HOPPIP.movesetRanks = Collections.unmodifiableMap(HOPPIP.movesetRanks);

        SKIPLOOM.movesetRanks.put(Moveset.of(BULLET_SEED, GRASS_KNOT), MovesetRating.of("A1", "A1"));
        SKIPLOOM.movesetRanks = Collections.unmodifiableMap(SKIPLOOM.movesetRanks);

        JUMPLUFF.movesetRanks.put(Moveset.of(BULLET_SEED, DAZZLING_GLEAM), MovesetRating.of("C5", "A1"));
        JUMPLUFF.movesetRanks.put(Moveset.of(INFESTATION, ENERGY_BALL), MovesetRating.of("B4", "A4"));
        JUMPLUFF.movesetRanks.put(Moveset.of(INFESTATION, SOLAR_BEAM), MovesetRating.of("A2", "B6"));
        JUMPLUFF.movesetRanks.put(Moveset.of(BULLET_SEED, SOLAR_BEAM), MovesetRating.of("A1", "B5"));
        JUMPLUFF.movesetRanks.put(Moveset.of(BULLET_SEED, ENERGY_BALL), MovesetRating.of("B3", "A3"));
        JUMPLUFF.movesetRanks.put(Moveset.of(INFESTATION, DAZZLING_GLEAM), MovesetRating.of("C6", "A2"));
        JUMPLUFF.movesetRanks = Collections.unmodifiableMap(JUMPLUFF.movesetRanks);

        AIPOM.movesetRanks.put(Moveset.of(ASTONISH, SWIFT), MovesetRating.of("C5", "A3"));
        AIPOM.movesetRanks.put(Moveset.of(ASTONISH, AERIAL_ACE), MovesetRating.of("C4", "A2"));
        AIPOM.movesetRanks.put(Moveset.of(SCRATCH, SWIFT), MovesetRating.of("A1", "B6"));
        AIPOM.movesetRanks.put(Moveset.of(SCRATCH, LOW_SWEEP), MovesetRating.of("B3", "B4"));
        AIPOM.movesetRanks.put(Moveset.of(ASTONISH, LOW_SWEEP), MovesetRating.of("D6", "A1"));
        AIPOM.movesetRanks.put(Moveset.of(SCRATCH, AERIAL_ACE), MovesetRating.of("B2", "B5"));
        AIPOM.movesetRanks = Collections.unmodifiableMap(AIPOM.movesetRanks);

        SUNKERN.movesetRanks.put(Moveset.of(RAZOR_LEAF, GRASS_KNOT), MovesetRating.of("A1", "A1"));
        SUNKERN.movesetRanks = Collections.unmodifiableMap(SUNKERN.movesetRanks);

        SUNFLORA.movesetRanks.put(Moveset.of(RAZOR_LEAF, SOLAR_BEAM), MovesetRating.of("A1", "A2"));
        SUNFLORA.movesetRanks.put(Moveset.of(BULLET_SEED, SOLAR_BEAM), MovesetRating.of("B2", "B5"));
        SUNFLORA.movesetRanks.put(Moveset.of(BULLET_SEED, SLUDGE_BOMB), MovesetRating.of("D6", "B4"));
        SUNFLORA.movesetRanks.put(Moveset.of(RAZOR_LEAF, PETAL_BLIZZARD), MovesetRating.of("B3", "A3"));
        SUNFLORA.movesetRanks.put(Moveset.of(RAZOR_LEAF, SLUDGE_BOMB), MovesetRating.of("C4", "A1"));
        SUNFLORA.movesetRanks.put(Moveset.of(BULLET_SEED, PETAL_BLIZZARD), MovesetRating.of("C5", "B6"));
        SUNFLORA.movesetRanks = Collections.unmodifiableMap(SUNFLORA.movesetRanks);

        YANMA.movesetRanks.put(Moveset.of(WING_ATTACK, SILVER_WIND), MovesetRating.of("A2", "A2"));
        YANMA.movesetRanks.put(Moveset.of(WING_ATTACK, AERIAL_ACE), MovesetRating.of("A1", "A1"));
        YANMA.movesetRanks.put(Moveset.of(QUICK_ATTACK, ANCIENT_POWER), MovesetRating.of("B6", "B6"));
        YANMA.movesetRanks.put(Moveset.of(WING_ATTACK, ANCIENT_POWER), MovesetRating.of("B5", "B5"));
        YANMA.movesetRanks.put(Moveset.of(QUICK_ATTACK, SILVER_WIND), MovesetRating.of("A4", "A4"));
        YANMA.movesetRanks.put(Moveset.of(QUICK_ATTACK, AERIAL_ACE), MovesetRating.of("A3", "A3"));
        YANMA.movesetRanks = Collections.unmodifiableMap(YANMA.movesetRanks);

        WOOPER.movesetRanks.put(Moveset.of(MUD_SHOT, MUD_BOMB), MovesetRating.of(null, "A1"));
        WOOPER.movesetRanks.put(Moveset.of(WATER_GUN, DIG), MovesetRating.of("A1", null));
        WOOPER.movesetRanks = Collections.unmodifiableMap(WOOPER.movesetRanks);

        QUAGSIRE.movesetRanks.put(Moveset.of(WATER_GUN, STONE_EDGE), MovesetRating.of("B5", "B3"));
        QUAGSIRE.movesetRanks.put(Moveset.of(WATER_GUN, SLUDGE_BOMB), MovesetRating.of("B3", "A1"));
        QUAGSIRE.movesetRanks.put(Moveset.of(WATER_GUN, EARTHQUAKE), MovesetRating.of("A1", "B5"));
        QUAGSIRE.movesetRanks.put(Moveset.of(MUD_SHOT, EARTHQUAKE), MovesetRating.of("A2", "B6"));
        QUAGSIRE.movesetRanks.put(Moveset.of(MUD_SHOT, SLUDGE_BOMB), MovesetRating.of("B4", "A2"));
        QUAGSIRE.movesetRanks.put(Moveset.of(MUD_SHOT, STONE_EDGE), MovesetRating.of("B6", "B4"));
        QUAGSIRE.movesetRanks = Collections.unmodifiableMap(QUAGSIRE.movesetRanks);

        ESPEON.movesetRanks.put(Moveset.of(CONFUSION, PSYBEAM), MovesetRating.of("B3", "A1"));
        ESPEON.movesetRanks.put(Moveset.of(CONFUSION, Move.PSYCHIC), MovesetRating.of("B4", "D5"));
        ESPEON.movesetRanks.put(Moveset.of(CONFUSION, FUTURE_SIGHT), MovesetRating.of("A1", "C3"));
        ESPEON.movesetRanks.put(Moveset.of(ZEN_HEADBUTT, Move.PSYCHIC), MovesetRating.of("B5", "D6"));
        ESPEON.movesetRanks.put(Moveset.of(ZEN_HEADBUTT, PSYBEAM), MovesetRating.of("C6", "B2"));
        ESPEON.movesetRanks.put(Moveset.of(ZEN_HEADBUTT, FUTURE_SIGHT), MovesetRating.of("A2", "C4"));
        ESPEON.movesetRanks = Collections.unmodifiableMap(ESPEON.movesetRanks);

        UMBREON.movesetRanks.put(Moveset.of(SNARL, DARK_PULSE), MovesetRating.of("B4", "A1"));
        UMBREON.movesetRanks.put(Moveset.of(FEINT_ATTACK, DARK_PULSE), MovesetRating.of("B3", "B3"));
        UMBREON.movesetRanks.put(Moveset.of(SNARL, FOUL_PLAY), MovesetRating.of("A2", "A2"));
        UMBREON.movesetRanks.put(Moveset.of(FEINT_ATTACK, FOUL_PLAY), MovesetRating.of("A1", "B4"));
        UMBREON.movesetRanks = Collections.unmodifiableMap(UMBREON.movesetRanks);

        MURKROW.movesetRanks.put(Moveset.of(PECK, FOUL_PLAY), MovesetRating.of("B4", "B6"));
        MURKROW.movesetRanks.put(Moveset.of(FEINT_ATTACK, DARK_PULSE), MovesetRating.of("B2", "B3"));
        MURKROW.movesetRanks.put(Moveset.of(FEINT_ATTACK, DRILL_PECK), MovesetRating.of("B3", "A1"));
        MURKROW.movesetRanks.put(Moveset.of(PECK, DARK_PULSE), MovesetRating.of("B6", "B4"));
        MURKROW.movesetRanks.put(Moveset.of(FEINT_ATTACK, FOUL_PLAY), MovesetRating.of("A1", "B5"));
        MURKROW.movesetRanks.put(Moveset.of(PECK, DRILL_PECK), MovesetRating.of("B5", "A2"));
        MURKROW.movesetRanks = Collections.unmodifiableMap(MURKROW.movesetRanks);

        SLOWKING.movesetRanks.put(Moveset.of(CONFUSION, Move.PSYCHIC), MovesetRating.of("A1", "A2"));
        SLOWKING.movesetRanks.put(Moveset.of(CONFUSION, FIRE_BLAST), MovesetRating.of("C5", "B3"));
        SLOWKING.movesetRanks.put(Moveset.of(CONFUSION, BLIZZARD), MovesetRating.of("A2", "A1"));
        SLOWKING.movesetRanks.put(Moveset.of(WATER_GUN, BLIZZARD), MovesetRating.of("A4", "C5"));
        SLOWKING.movesetRanks.put(Moveset.of(WATER_GUN, Move.PSYCHIC), MovesetRating.of("A3", "C4"));
        SLOWKING.movesetRanks.put(Moveset.of(WATER_GUN, FIRE_BLAST), MovesetRating.of("D6", "D6"));
        SLOWKING.movesetRanks = Collections.unmodifiableMap(SLOWKING.movesetRanks);

        MISDREAVUS.movesetRanks.put(Moveset.of(HEX, DARK_PULSE), MovesetRating.of("B3", "A1"));
        MISDREAVUS.movesetRanks.put(Moveset.of(HEX, OMINOUS_WIND), MovesetRating.of("A1", "A2"));
        MISDREAVUS.movesetRanks.put(Moveset.of(HEX, SHADOW_SNEAK), MovesetRating.of("B5", "B4"));
        MISDREAVUS.movesetRanks.put(Moveset.of(ASTONISH, SHADOW_SNEAK), MovesetRating.of("B6", "B6"));
        MISDREAVUS.movesetRanks.put(Moveset.of(ASTONISH, DARK_PULSE), MovesetRating.of("B4", "A3"));
        MISDREAVUS.movesetRanks.put(Moveset.of(ASTONISH, OMINOUS_WIND), MovesetRating.of("A2", "B5"));
        MISDREAVUS.movesetRanks = Collections.unmodifiableMap(MISDREAVUS.movesetRanks);

        UNOWN.movesetRanks.put(Moveset.of(HIDDEN_POWER, STRUGGLE), MovesetRating.of("A1", "A1"));
        UNOWN.movesetRanks = Collections.unmodifiableMap(UNOWN.movesetRanks);

        WOBBUFFET.movesetRanks.put(Moveset.of(SPLASH, MIRROR_COAT), MovesetRating.of("D2", "D2"));
        WOBBUFFET.movesetRanks.put(Moveset.of(COUNTER, MIRROR_COAT), MovesetRating.of("A1", "A1"));
        WOBBUFFET.movesetRanks = Collections.unmodifiableMap(WOBBUFFET.movesetRanks);

        GIRAFARIG.movesetRanks.put(Moveset.of(CONFUSION, Move.PSYCHIC), MovesetRating.of("A1", "B3"));
        GIRAFARIG.movesetRanks.put(Moveset.of(TACKLE, MIRROR_COAT), MovesetRating.of("B6", "C5"));
        GIRAFARIG.movesetRanks.put(Moveset.of(CONFUSION, THUNDERBOLT), MovesetRating.of("A2", "A1"));
        GIRAFARIG.movesetRanks.put(Moveset.of(TACKLE, Move.PSYCHIC), MovesetRating.of("B5", "D6"));
        GIRAFARIG.movesetRanks.put(Moveset.of(TACKLE, THUNDERBOLT), MovesetRating.of("B4", "C4"));
        GIRAFARIG.movesetRanks.put(Moveset.of(CONFUSION, MIRROR_COAT), MovesetRating.of("A3", "A2"));
        GIRAFARIG.movesetRanks = Collections.unmodifiableMap(GIRAFARIG.movesetRanks);

        PINECO.movesetRanks.put(Moveset.of(BUG_BITE, GYRO_BALL), MovesetRating.of("A1", "A1"));
        PINECO.movesetRanks = Collections.unmodifiableMap(PINECO.movesetRanks);

        FORRETRESS.movesetRanks.put(Moveset.of(STRUGGLE_BUG, HEAVY_SLAM), MovesetRating.of("B2", "A1"));
        FORRETRESS.movesetRanks.put(Moveset.of(BUG_BITE, ROCK_TOMB), MovesetRating.of("B4", "B5"));
        FORRETRESS.movesetRanks.put(Moveset.of(STRUGGLE_BUG, EARTHQUAKE), MovesetRating.of("C5", "A3"));
        FORRETRESS.movesetRanks.put(Moveset.of(BUG_BITE, EARTHQUAKE), MovesetRating.of("B3", "C6"));
        FORRETRESS.movesetRanks.put(Moveset.of(BUG_BITE, HEAVY_SLAM), MovesetRating.of("A1", "B4"));
        FORRETRESS.movesetRanks.put(Moveset.of(STRUGGLE_BUG, ROCK_TOMB), MovesetRating.of("C6", "A2"));
        FORRETRESS.movesetRanks = Collections.unmodifiableMap(FORRETRESS.movesetRanks);

        DUNSPARCE.movesetRanks.put(Moveset.of(BITE, DIG), MovesetRating.of("B5", "C6"));
        DUNSPARCE.movesetRanks.put(Moveset.of(BITE, ROCK_SLIDE), MovesetRating.of("A1", "C4"));
        DUNSPARCE.movesetRanks.put(Moveset.of(ASTONISH, DRILL_RUN), MovesetRating.of("B4", "A2"));
        DUNSPARCE.movesetRanks.put(Moveset.of(ASTONISH, ROCK_SLIDE), MovesetRating.of("B3", "A1"));
        DUNSPARCE.movesetRanks.put(Moveset.of(ASTONISH, DIG), MovesetRating.of("B6", "A3"));
        DUNSPARCE.movesetRanks.put(Moveset.of(BITE, DRILL_RUN), MovesetRating.of("A2", "C5"));
        DUNSPARCE.movesetRanks = Collections.unmodifiableMap(DUNSPARCE.movesetRanks);

        GLIGAR.movesetRanks.put(Moveset.of(FURY_CUTTER, DIG), MovesetRating.of("B5", "C4"));
        GLIGAR.movesetRanks.put(Moveset.of(FURY_CUTTER, NIGHT_SLASH), MovesetRating.of("C6", "C6"));
        GLIGAR.movesetRanks.put(Moveset.of(WING_ATTACK, NIGHT_SLASH), MovesetRating.of("B4", "A3"));
        GLIGAR.movesetRanks.put(Moveset.of(FURY_CUTTER, AERIAL_ACE), MovesetRating.of("B3", "C5"));
        GLIGAR.movesetRanks.put(Moveset.of(WING_ATTACK, DIG), MovesetRating.of("A2", "A1"));
        GLIGAR.movesetRanks.put(Moveset.of(WING_ATTACK, AERIAL_ACE), MovesetRating.of("A1", "A2"));
        GLIGAR.movesetRanks = Collections.unmodifiableMap(GLIGAR.movesetRanks);

        STEELIX.movesetRanks.put(Moveset.of(IRON_TAIL, HEAVY_SLAM), MovesetRating.of("A1", "A1"));
        STEELIX.movesetRanks.put(Moveset.of(DRAGON_TAIL, CRUNCH), MovesetRating.of("C6", "B5"));
        STEELIX.movesetRanks.put(Moveset.of(IRON_TAIL, CRUNCH), MovesetRating.of("B5", "B4"));
        STEELIX.movesetRanks.put(Moveset.of(DRAGON_TAIL, EARTHQUAKE), MovesetRating.of("A4", "B3"));
        STEELIX.movesetRanks.put(Moveset.of(IRON_TAIL, EARTHQUAKE), MovesetRating.of("A2", "B6"));
        STEELIX.movesetRanks.put(Moveset.of(DRAGON_TAIL, HEAVY_SLAM), MovesetRating.of("A3", "A2"));
        STEELIX.movesetRanks = Collections.unmodifiableMap(STEELIX.movesetRanks);

        SNUBBULL.movesetRanks.put(Moveset.of(BITE, DAZZLING_GLEAM), MovesetRating.of("A1", "A1"));
        SNUBBULL.movesetRanks = Collections.unmodifiableMap(SNUBBULL.movesetRanks);

        GRANBULL.movesetRanks.put(Moveset.of(SNARL, CRUNCH), MovesetRating.of("C5", "B2"));
        GRANBULL.movesetRanks.put(Moveset.of(BITE, CLOSE_COMBAT), MovesetRating.of("B3", null));
        GRANBULL.movesetRanks.put(Moveset.of(SNARL, PLAY_ROUGH), MovesetRating.of("A2", "A1"));
        GRANBULL.movesetRanks.put(Moveset.of(BITE, PLAY_ROUGH), MovesetRating.of("A1", "C3"));
        GRANBULL.movesetRanks.put(Moveset.of(SNARL, CLOSE_COMBAT), MovesetRating.of("D6", "C4"));
        GRANBULL.movesetRanks.put(Moveset.of(BITE, CRUNCH), MovesetRating.of("B4", "D5"));
        GRANBULL.movesetRanks = Collections.unmodifiableMap(GRANBULL.movesetRanks);

        QWILFISH.movesetRanks.put(Moveset.of(WATER_GUN, SLUDGE_WAVE), MovesetRating.of("A2", "C6"));
        QWILFISH.movesetRanks.put(Moveset.of(WATER_GUN, AQUA_TAIL), MovesetRating.of("A1", "B3"));
        QWILFISH.movesetRanks.put(Moveset.of(POISON_STING, SLUDGE_WAVE), MovesetRating.of("A3", "C5"));
        QWILFISH.movesetRanks.put(Moveset.of(WATER_GUN, ICE_BEAM), MovesetRating.of("C5", "C4"));
        QWILFISH.movesetRanks.put(Moveset.of(POISON_STING, ICE_BEAM), MovesetRating.of("D6", "A2"));
        QWILFISH.movesetRanks.put(Moveset.of(POISON_STING, AQUA_TAIL), MovesetRating.of("B4", "A1"));
        QWILFISH.movesetRanks = Collections.unmodifiableMap(QWILFISH.movesetRanks);

        SCIZOR.movesetRanks.put(Moveset.of(BULLET_PUNCH, NIGHT_SLASH), MovesetRating.of("C5", "A3"));
        SCIZOR.movesetRanks.put(Moveset.of(FURY_CUTTER, X_SCISSOR), MovesetRating.of("A4", "C4"));
        SCIZOR.movesetRanks.put(Moveset.of(FURY_CUTTER, IRON_HEAD), MovesetRating.of("A2", "C5"));
        SCIZOR.movesetRanks.put(Moveset.of(FURY_CUTTER, NIGHT_SLASH), MovesetRating.of("C6", "C6"));
        SCIZOR.movesetRanks.put(Moveset.of(BULLET_PUNCH, IRON_HEAD), MovesetRating.of("A1", "A2"));
        SCIZOR.movesetRanks.put(Moveset.of(BULLET_PUNCH, X_SCISSOR), MovesetRating.of("A3", "A1"));
        SCIZOR.movesetRanks = Collections.unmodifiableMap(SCIZOR.movesetRanks);

        SHUCKLE.movesetRanks.put(Moveset.of(ROCK_THROW, GYRO_BALL), MovesetRating.of("B4", "B5"));
        SHUCKLE.movesetRanks.put(Moveset.of(STRUGGLE_BUG, ROCK_BLAST), MovesetRating.of("B5", "A1"));
        SHUCKLE.movesetRanks.put(Moveset.of(STRUGGLE_BUG, STONE_EDGE), MovesetRating.of("B3", "A3"));
        SHUCKLE.movesetRanks.put(Moveset.of(STRUGGLE_BUG, GYRO_BALL), MovesetRating.of("C6", "A2"));
        SHUCKLE.movesetRanks.put(Moveset.of(ROCK_THROW, STONE_EDGE), MovesetRating.of("A1", "B6"));
        SHUCKLE.movesetRanks.put(Moveset.of(ROCK_THROW, ROCK_BLAST), MovesetRating.of("A2", "B4"));
        SHUCKLE.movesetRanks = Collections.unmodifiableMap(SHUCKLE.movesetRanks);

        HERACROSS.movesetRanks.put(Moveset.of(COUNTER, EARTHQUAKE), MovesetRating.of("B3", "C6"));
        HERACROSS.movesetRanks.put(Moveset.of(STRUGGLE_BUG, EARTHQUAKE), MovesetRating.of("C6", "B3"));
        HERACROSS.movesetRanks.put(Moveset.of(STRUGGLE_BUG, MEGAHORN), MovesetRating.of("B5", "A2"));
        HERACROSS.movesetRanks.put(Moveset.of(COUNTER, CLOSE_COMBAT), MovesetRating.of("A1", "C5"));
        HERACROSS.movesetRanks.put(Moveset.of(COUNTER, MEGAHORN), MovesetRating.of("A2", "B4"));
        HERACROSS.movesetRanks.put(Moveset.of(STRUGGLE_BUG, CLOSE_COMBAT), MovesetRating.of("B4", "A1"));
        HERACROSS.movesetRanks = Collections.unmodifiableMap(HERACROSS.movesetRanks);

        SNEASEL.movesetRanks.put(Moveset.of(ICE_SHARD, ICE_PUNCH), MovesetRating.of("B4", "A1"));
        SNEASEL.movesetRanks.put(Moveset.of(FEINT_ATTACK, ICE_PUNCH), MovesetRating.of("B6", "B4"));
        SNEASEL.movesetRanks.put(Moveset.of(ICE_SHARD, AVALANCHE), MovesetRating.of("A3", "A2"));
        SNEASEL.movesetRanks.put(Moveset.of(FEINT_ATTACK, AVALANCHE), MovesetRating.of("A2", "B5"));
        SNEASEL.movesetRanks.put(Moveset.of(ICE_SHARD, FOUL_PLAY), MovesetRating.of("B5", "B3"));
        SNEASEL.movesetRanks.put(Moveset.of(FEINT_ATTACK, FOUL_PLAY), MovesetRating.of("A1", "C6"));
        SNEASEL.movesetRanks = Collections.unmodifiableMap(SNEASEL.movesetRanks);

        TEDDIURSA.movesetRanks.put(Moveset.of(SCRATCH, PLAY_ROUGH), MovesetRating.of("A1", null));
        TEDDIURSA.movesetRanks.put(Moveset.of(SCRATCH, CRUNCH), MovesetRating.of(null, "A1"));
        TEDDIURSA.movesetRanks = Collections.unmodifiableMap(TEDDIURSA.movesetRanks);

        URSARING.movesetRanks.put(Moveset.of(COUNTER, HYPER_BEAM), MovesetRating.of("A1", "B3"));
        URSARING.movesetRanks.put(Moveset.of(COUNTER, PLAY_ROUGH), MovesetRating.of("B3", "A1"));
        URSARING.movesetRanks.put(Moveset.of(METAL_CLAW, HYPER_BEAM), MovesetRating.of("A2", "B4"));
        URSARING.movesetRanks.put(Moveset.of(METAL_CLAW, CLOSE_COMBAT), MovesetRating.of("C6", "D6"));
        URSARING.movesetRanks.put(Moveset.of(COUNTER, CLOSE_COMBAT), MovesetRating.of("B4", "C5"));
        URSARING.movesetRanks.put(Moveset.of(METAL_CLAW, PLAY_ROUGH), MovesetRating.of("B5", "A2"));
        URSARING.movesetRanks = Collections.unmodifiableMap(URSARING.movesetRanks);

        SLUGMA.movesetRanks.put(Moveset.of(EMBER, FLAME_CHARGE), MovesetRating.of(null, "A1"));
        SLUGMA.movesetRanks.put(Moveset.of(EMBER, FLAME_BURST), MovesetRating.of("A1", null));
        SLUGMA.movesetRanks = Collections.unmodifiableMap(SLUGMA.movesetRanks);

        MAGCARGO.movesetRanks.put(Moveset.of(ROCK_THROW, HEAT_WAVE), MovesetRating.of("B4", "C5"));
        MAGCARGO.movesetRanks.put(Moveset.of(ROCK_THROW, OVERHEAT), MovesetRating.of("A2", "B3"));
        MAGCARGO.movesetRanks.put(Moveset.of(EMBER, STONE_EDGE), MovesetRating.of("B5", "A2"));
        MAGCARGO.movesetRanks.put(Moveset.of(EMBER, OVERHEAT), MovesetRating.of("A1", "B4"));
        MAGCARGO.movesetRanks.put(Moveset.of(EMBER, HEAT_WAVE), MovesetRating.of("B6", "C6"));
        MAGCARGO.movesetRanks.put(Moveset.of(ROCK_THROW, STONE_EDGE), MovesetRating.of("A3", "A1"));
        MAGCARGO.movesetRanks = Collections.unmodifiableMap(MAGCARGO.movesetRanks);

        SWINUB.movesetRanks.put(Moveset.of(POWDER_SNOW, ROCK_SLIDE), MovesetRating.of("A1", "A1"));
        SWINUB.movesetRanks = Collections.unmodifiableMap(SWINUB.movesetRanks);

        PILOSWINE.movesetRanks.put(Moveset.of(POWDER_SNOW, STONE_EDGE), MovesetRating.of("C6", "B5"));
        PILOSWINE.movesetRanks.put(Moveset.of(ICE_SHARD, BULLDOZE), MovesetRating.of("B3", "A2"));
        PILOSWINE.movesetRanks.put(Moveset.of(ICE_SHARD, AVALANCHE), MovesetRating.of("A1", "A1"));
        PILOSWINE.movesetRanks.put(Moveset.of(POWDER_SNOW, BULLDOZE), MovesetRating.of("B4", "B4"));
        PILOSWINE.movesetRanks.put(Moveset.of(POWDER_SNOW, AVALANCHE), MovesetRating.of("A2", "B6"));
        PILOSWINE.movesetRanks.put(Moveset.of(ICE_SHARD, STONE_EDGE), MovesetRating.of("C5", "A3"));
        PILOSWINE.movesetRanks = Collections.unmodifiableMap(PILOSWINE.movesetRanks);

        CORSOLA.movesetRanks.put(Moveset.of(TACKLE, ROCK_BLAST), MovesetRating.of("B5", "C4"));
        CORSOLA.movesetRanks.put(Moveset.of(TACKLE, BUBBLE_BEAM), MovesetRating.of("C6", "C6"));
        CORSOLA.movesetRanks.put(Moveset.of(BUBBLE, BUBBLE_BEAM), MovesetRating.of("A2", "B3"));
        CORSOLA.movesetRanks.put(Moveset.of(TACKLE, POWER_GEM), MovesetRating.of("B4", "C5"));
        CORSOLA.movesetRanks.put(Moveset.of(BUBBLE, POWER_GEM), MovesetRating.of("A1", "A2"));
        CORSOLA.movesetRanks.put(Moveset.of(BUBBLE, ROCK_BLAST), MovesetRating.of("A3", "A1"));
        CORSOLA.movesetRanks = Collections.unmodifiableMap(CORSOLA.movesetRanks);

        REMORAID.movesetRanks.put(Moveset.of(WATER_GUN, ROCK_BLAST), MovesetRating.of(null, "A1"));
        REMORAID.movesetRanks.put(Moveset.of(WATER_GUN, WATER_PULSE), MovesetRating.of("A1", null));
        REMORAID.movesetRanks = Collections.unmodifiableMap(REMORAID.movesetRanks);

        OCTILLERY.movesetRanks.put(Moveset.of(WATER_GUN, AURORA_BEAM), MovesetRating.of("C5", "B4"));
        OCTILLERY.movesetRanks.put(Moveset.of(MUD_SHOT, GUNK_SHOT), MovesetRating.of("B2", "C6"));
        OCTILLERY.movesetRanks.put(Moveset.of(WATER_GUN, WATER_PULSE), MovesetRating.of("A1", "A2"));
        OCTILLERY.movesetRanks.put(Moveset.of(WATER_GUN, GUNK_SHOT), MovesetRating.of("B3", null));
        OCTILLERY.movesetRanks.put(Moveset.of(MUD_SHOT, WATER_PULSE), MovesetRating.of("B4", "A1"));
        OCTILLERY.movesetRanks.put(Moveset.of(MUD_SHOT, AURORA_BEAM), MovesetRating.of("D6", "B3"));
        OCTILLERY.movesetRanks = Collections.unmodifiableMap(OCTILLERY.movesetRanks);

        DELIBIRD.movesetRanks.put(Moveset.of(QUICK_ATTACK, ICY_WIND), MovesetRating.of("B6", "B5"));
        DELIBIRD.movesetRanks.put(Moveset.of(ICE_SHARD, ICE_PUNCH), MovesetRating.of("A1", "A1"));
        DELIBIRD.movesetRanks.put(Moveset.of(QUICK_ATTACK, AERIAL_ACE), MovesetRating.of("A4", "B6"));
        DELIBIRD.movesetRanks.put(Moveset.of(ICE_SHARD, AERIAL_ACE), MovesetRating.of("A2", "A2"));
        DELIBIRD.movesetRanks.put(Moveset.of(ICE_SHARD, ICY_WIND), MovesetRating.of("B5", "A3"));
        DELIBIRD.movesetRanks.put(Moveset.of(QUICK_ATTACK, ICE_PUNCH), MovesetRating.of("A3", "B4"));
        DELIBIRD.movesetRanks = Collections.unmodifiableMap(DELIBIRD.movesetRanks);

        MANTINE.movesetRanks.put(Moveset.of(WING_ATTACK, WATER_PULSE), MovesetRating.of("B6", "B5"));
        MANTINE.movesetRanks.put(Moveset.of(BUBBLE, WATER_PULSE), MovesetRating.of("A2", "A2"));
        MANTINE.movesetRanks.put(Moveset.of(BUBBLE, AERIAL_ACE), MovesetRating.of("A3", "A3"));
        MANTINE.movesetRanks.put(Moveset.of(WING_ATTACK, ICE_BEAM), MovesetRating.of("B4", "B4"));
        MANTINE.movesetRanks.put(Moveset.of(BUBBLE, ICE_BEAM), MovesetRating.of("B5", "A1"));
        MANTINE.movesetRanks.put(Moveset.of(WING_ATTACK, AERIAL_ACE), MovesetRating.of("A1", "B6"));
        MANTINE.movesetRanks = Collections.unmodifiableMap(MANTINE.movesetRanks);

        SKARMORY.movesetRanks.put(Moveset.of(AIR_SLASH, SKY_ATTACK), MovesetRating.of(null, "A1"));
        SKARMORY.movesetRanks.put(Moveset.of(AIR_SLASH, FLASH_CANNON), MovesetRating.of(null, "B3"));
        SKARMORY.movesetRanks.put(Moveset.of(STEEL_WING, BRAVE_BIRD), MovesetRating.of(null, "C5"));
        SKARMORY.movesetRanks.put(Moveset.of(STEEL_WING, FLASH_CANNON), MovesetRating.of("A1", "D6"));
        SKARMORY.movesetRanks.put(Moveset.of(STEEL_WING, SKY_ATTACK), MovesetRating.of(null, "B4"));
        SKARMORY.movesetRanks.put(Moveset.of(AIR_SLASH, BRAVE_BIRD), MovesetRating.of(null, "B2"));
        SKARMORY.movesetRanks = Collections.unmodifiableMap(SKARMORY.movesetRanks);

        HOUNDOUR.movesetRanks.put(Moveset.of(FEINT_ATTACK, DARK_PULSE), MovesetRating.of("A1", null));
        HOUNDOUR.movesetRanks.put(Moveset.of(EMBER, CRUNCH), MovesetRating.of(null, "A1"));
        HOUNDOUR.movesetRanks = Collections.unmodifiableMap(HOUNDOUR.movesetRanks);

        HOUNDOOM.movesetRanks.put(Moveset.of(SNARL, CRUNCH), MovesetRating.of("B6", "A1"));
        HOUNDOOM.movesetRanks.put(Moveset.of(FIRE_FANG, FOUL_PLAY), MovesetRating.of("B3", "B5"));
        HOUNDOOM.movesetRanks.put(Moveset.of(SNARL, FIRE_BLAST), MovesetRating.of("B4", "B4"));
        HOUNDOOM.movesetRanks.put(Moveset.of(FIRE_FANG, FIRE_BLAST), MovesetRating.of("A2", "C6"));
        HOUNDOOM.movesetRanks.put(Moveset.of(SNARL, FOUL_PLAY), MovesetRating.of("A1", "A2"));
        HOUNDOOM.movesetRanks.put(Moveset.of(FIRE_FANG, CRUNCH), MovesetRating.of("B5", "B3"));
        HOUNDOOM.movesetRanks = Collections.unmodifiableMap(HOUNDOOM.movesetRanks);

        KINGDRA.movesetRanks.put(Moveset.of(WATER_GUN, OUTRAGE), MovesetRating.of("A3", "B4"));
        KINGDRA.movesetRanks.put(Moveset.of(DRAGON_BREATH, HYDRO_PUMP), MovesetRating.of("A2", "A2"));
        KINGDRA.movesetRanks.put(Moveset.of(DRAGON_BREATH, OUTRAGE), MovesetRating.of("A1", "A1"));
        KINGDRA.movesetRanks.put(Moveset.of(WATER_GUN, HYDRO_PUMP), MovesetRating.of("A4", "B5"));
        KINGDRA.movesetRanks.put(Moveset.of(DRAGON_BREATH, BLIZZARD), MovesetRating.of("B6", "B3"));
        KINGDRA.movesetRanks.put(Moveset.of(WATER_GUN, BLIZZARD), MovesetRating.of("B5", "C6"));
        KINGDRA.movesetRanks = Collections.unmodifiableMap(KINGDRA.movesetRanks);

        PHANPY.movesetRanks.put(Moveset.of(ROCK_SMASH, BULLDOZE), MovesetRating.of("A1", "A1"));
        PHANPY.movesetRanks = Collections.unmodifiableMap(PHANPY.movesetRanks);

        DONPHAN.movesetRanks.put(Moveset.of(COUNTER, HEAVY_SLAM), MovesetRating.of("B3", "B3"));
        DONPHAN.movesetRanks.put(Moveset.of(TACKLE, HEAVY_SLAM), MovesetRating.of("D6", "C4"));
        DONPHAN.movesetRanks.put(Moveset.of(COUNTER, PLAY_ROUGH), MovesetRating.of("B2", "A1"));
        DONPHAN.movesetRanks.put(Moveset.of(COUNTER, EARTHQUAKE), MovesetRating.of("A1", "D5"));
        DONPHAN.movesetRanks.put(Moveset.of(TACKLE, PLAY_ROUGH), MovesetRating.of("C5", "B2"));
        DONPHAN.movesetRanks.put(Moveset.of(TACKLE, EARTHQUAKE), MovesetRating.of("B4", "F6"));
        DONPHAN.movesetRanks = Collections.unmodifiableMap(DONPHAN.movesetRanks);

        PORYGON2.movesetRanks = Collections.unmodifiableMap(PORYGON2.movesetRanks);

        STANTLER.movesetRanks.put(Moveset.of(TACKLE, MEGAHORN), MovesetRating.of("B4", "C6"));
        STANTLER.movesetRanks.put(Moveset.of(ZEN_HEADBUTT, STOMP), MovesetRating.of("B5", "A1"));
        STANTLER.movesetRanks.put(Moveset.of(ZEN_HEADBUTT, MEGAHORN), MovesetRating.of("C6", "B5"));
        STANTLER.movesetRanks.put(Moveset.of(ZEN_HEADBUTT, WILD_CHARGE), MovesetRating.of("B3", "A2"));
        STANTLER.movesetRanks.put(Moveset.of(TACKLE, STOMP), MovesetRating.of("A1", "B3"));
        STANTLER.movesetRanks.put(Moveset.of(TACKLE, WILD_CHARGE), MovesetRating.of("A2", "B4"));
        STANTLER.movesetRanks = Collections.unmodifiableMap(STANTLER.movesetRanks);

        SMEARGLE.movesetRanks.put(Moveset.of(TACKLE, STRUGGLE), MovesetRating.of("A1", "A1"));
        SMEARGLE.movesetRanks = Collections.unmodifiableMap(SMEARGLE.movesetRanks);

        TYROGUE.movesetRanks.put(Moveset.of(ROCK_SMASH, BRICK_BREAK), MovesetRating.of("A1", null));
        TYROGUE.movesetRanks.put(Moveset.of(ROCK_SMASH, ROCK_SLIDE), MovesetRating.of(null, "A1"));
        TYROGUE.movesetRanks = Collections.unmodifiableMap(TYROGUE.movesetRanks);

        HITMONTOP.movesetRanks.put(Moveset.of(COUNTER, STONE_EDGE), MovesetRating.of("B3", "B5"));
        HITMONTOP.movesetRanks.put(Moveset.of(ROCK_SMASH, STONE_EDGE), MovesetRating.of("C4", "A1"));
        HITMONTOP.movesetRanks.put(Moveset.of(COUNTER, GYRO_BALL), MovesetRating.of("D5", "B4"));
        HITMONTOP.movesetRanks.put(Moveset.of(ROCK_SMASH, GYRO_BALL), MovesetRating.of("F6", "A2"));
        HITMONTOP.movesetRanks.put(Moveset.of(COUNTER, CLOSE_COMBAT), MovesetRating.of("A1", "C6"));
        HITMONTOP.movesetRanks.put(Moveset.of(ROCK_SMASH, CLOSE_COMBAT), MovesetRating.of("B2", "B3"));
        HITMONTOP.movesetRanks = Collections.unmodifiableMap(HITMONTOP.movesetRanks);

        SMOOCHUM.movesetRanks.put(Moveset.of(FROST_BREATH, ICE_BEAM), MovesetRating.of(null, "A1"));
        SMOOCHUM.movesetRanks.put(Moveset.of(POUND, ICE_BEAM), MovesetRating.of("A1", null));
        SMOOCHUM.movesetRanks = Collections.unmodifiableMap(SMOOCHUM.movesetRanks);

        ELEKID.movesetRanks.put(Moveset.of(THUNDER_SHOCK, THUNDERBOLT), MovesetRating.of("A1", "A1"));
        ELEKID.movesetRanks = Collections.unmodifiableMap(ELEKID.movesetRanks);

        MAGBY.movesetRanks.put(Moveset.of(EMBER, FLAMETHROWER), MovesetRating.of("A1", "A1"));
        MAGBY.movesetRanks = Collections.unmodifiableMap(MAGBY.movesetRanks);

        MILTANK.movesetRanks.put(Moveset.of(ZEN_HEADBUTT, GYRO_BALL), MovesetRating.of("D6", "A3"));
        MILTANK.movesetRanks.put(Moveset.of(ZEN_HEADBUTT, STOMP), MovesetRating.of("B3", "A2"));
        MILTANK.movesetRanks.put(Moveset.of(TACKLE, GYRO_BALL), MovesetRating.of("C5", null));
        MILTANK.movesetRanks.put(Moveset.of(TACKLE, STOMP), MovesetRating.of("A1", null));
        MILTANK.movesetRanks.put(Moveset.of(ZEN_HEADBUTT, BODY_SLAM), MovesetRating.of("B4", "A1"));
        MILTANK.movesetRanks.put(Moveset.of(TACKLE, BODY_SLAM), MovesetRating.of("A2", null));
        MILTANK.movesetRanks = Collections.unmodifiableMap(MILTANK.movesetRanks);

        BLISSEY.movesetRanks.put(Moveset.of(ZEN_HEADBUTT, HYPER_BEAM), MovesetRating.of("B4", "B3"));
        BLISSEY.movesetRanks.put(Moveset.of(POUND, Move.PSYCHIC), MovesetRating.of("B3", "D5"));
        BLISSEY.movesetRanks.put(Moveset.of(POUND, HYPER_BEAM), MovesetRating.of("A1", "B4"));
        BLISSEY.movesetRanks.put(Moveset.of(ZEN_HEADBUTT, Move.PSYCHIC), MovesetRating.of("D6", "D6"));
        BLISSEY.movesetRanks.put(Moveset.of(POUND, DAZZLING_GLEAM), MovesetRating.of("B2", "A2"));
        BLISSEY.movesetRanks.put(Moveset.of(ZEN_HEADBUTT, DAZZLING_GLEAM), MovesetRating.of("C5", "A1"));
        BLISSEY.movesetRanks = Collections.unmodifiableMap(BLISSEY.movesetRanks);

        RAIKOU.movesetRanks = Collections.unmodifiableMap(RAIKOU.movesetRanks);

        ENTEI.movesetRanks = Collections.unmodifiableMap(ENTEI.movesetRanks);

        SUICUNE.movesetRanks = Collections.unmodifiableMap(SUICUNE.movesetRanks);

        LARVITAR.movesetRanks.put(Moveset.of(ROCK_SMASH, ANCIENT_POWER), MovesetRating.of(null, "A1"));
        LARVITAR.movesetRanks.put(Moveset.of(BITE, CRUNCH), MovesetRating.of("A1", null));
        LARVITAR.movesetRanks = Collections.unmodifiableMap(LARVITAR.movesetRanks);

        PUPITAR.movesetRanks.put(Moveset.of(BITE, DIG), MovesetRating.of("A1", null));
        PUPITAR.movesetRanks.put(Moveset.of(ROCK_SMASH, ANCIENT_POWER), MovesetRating.of(null, "A1"));
        PUPITAR.movesetRanks = Collections.unmodifiableMap(PUPITAR.movesetRanks);

        TYRANITAR.movesetRanks.put(Moveset.of(IRON_TAIL, FIRE_BLAST), MovesetRating.of("D6", "C3"));
        TYRANITAR.movesetRanks.put(Moveset.of(IRON_TAIL, STONE_EDGE), MovesetRating.of("C4", "B2"));
        TYRANITAR.movesetRanks.put(Moveset.of(BITE, STONE_EDGE), MovesetRating.of("A1", "D5"));
        TYRANITAR.movesetRanks.put(Moveset.of(IRON_TAIL, CRUNCH), MovesetRating.of("C5", "A1"));
        TYRANITAR.movesetRanks.put(Moveset.of(BITE, CRUNCH), MovesetRating.of("A2", "C4"));
        TYRANITAR.movesetRanks.put(Moveset.of(BITE, FIRE_BLAST), MovesetRating.of("C3", "D6"));
        TYRANITAR.movesetRanks = Collections.unmodifiableMap(TYRANITAR.movesetRanks);

        LUGIA.movesetRanks = Collections.unmodifiableMap(LUGIA.movesetRanks);

        HO_OH.movesetRanks = Collections.unmodifiableMap(HO_OH.movesetRanks);

        CELEBI.movesetRanks = Collections.unmodifiableMap(CELEBI.movesetRanks);

    }

    public int number() {
        return number;
    }

    public Set<Type> types() {
        return types;
    }

    public int baseAttack() {
        return baseAttack;
    }

    public int baseDefense() {
        return baseDefense;
    }

    public int baseStamina() {
        return baseStamina;
    }

    public int maxCp() {
        return maxCp;
    }

    public Optional<Float> rating() {
        return Optional.ofNullable(rating);
    }

    public Set<Move> quickMoves() {
        return quickMoves;
    }

    public Set<Move> chargeMoves() {
        return chargeMoves;
    }

    public MovesetRating movesetRating(Moveset moveset) {
        return movesetRanks.get(moveset);
    }

    public MovesetRating movesetRating(Move quickMove, Move chargeMove) {
        return movesetRanks.get(Moveset.of(quickMove, chargeMove));
    }

    public static Optional<Pokemon> byNumber(Integer number){
        return Optional.ofNullable(BY_NUMBER.get(number));
    }

    @Override
    public String toString() {
        return name;
    }
}
