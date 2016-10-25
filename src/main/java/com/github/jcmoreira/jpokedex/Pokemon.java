package com.github.jcmoreira.jpokedex;

import java.util.*;

import static com.github.jcmoreira.jpokedex.Move.*;
import static com.github.jcmoreira.jpokedex.Type.*;

public enum Pokemon {
    BULBASAUR(1, "Bulbasaur",
            EnumSet.of(GRASS, POISON),
            126, 126, 90, 1071, 3.5F,
            EnumSet.of(TACKLE, VINE_WHIP),
            EnumSet.of(POWER_WHIP, SEED_BOMB, SLUDGE_BOMB)),
    IVYSAUR(2, "Ivysaur",
            EnumSet.of(GRASS, POISON),
            156, 158, 120, 1632, 5.5F,
            EnumSet.of(RAZOR_LEAF, VINE_WHIP),
            EnumSet.of(POWER_WHIP, SLUDGE_BOMB, SOLAR_BEAM)),
    VENUSAUR(3, "Venusaur",
            EnumSet.of(GRASS, POISON),
            198, 200, 160, 2580, 9F,
            EnumSet.of(RAZOR_LEAF, VINE_WHIP),
            EnumSet.of(PETAL_BLIZZARD, SLUDGE_BOMB, SOLAR_BEAM)),
    CHARMANDER(4, "Charmander",
            EnumSet.of(FIRE),
            128, 108, 78, 955, 3.5F,
            EnumSet.of(EMBER, SCRATCH),
            EnumSet.of(FLAME_BURST, FLAMETHROWER, FLAME_CHARGE)),
    CHARMELEON(5, "Charmeleon",
            EnumSet.of(FIRE),
            160, 140, 116, 1557, 5.5F,
            EnumSet.of(EMBER, SCRATCH),
            EnumSet.of(FIRE_PUNCH, FLAME_BURST, FLAMETHROWER)),
    CHARIZARD(6, "Charizard",
            EnumSet.of(FIRE, FLYING),
            212, 182, 156, 2602, 8F,
            EnumSet.of(EMBER, WING_ATTACK),
            EnumSet.of(DRAGON_CLAW, FIRE_BLAST, FLAMETHROWER)),
    SQUIRTLE(7, "Squirtle",
            EnumSet.of(WATER),
            112, 142, 88, 1008, 3.5F,
            EnumSet.of(TACKLE, BUBBLE),
            EnumSet.of(AQUA_JET, AQUA_TAIL, WATER_PULSE)),
    WARTORTLE(8, "Wartortle",
            EnumSet.of(WATER),
            144, 176, 118, 1582, 5.5F,
            EnumSet.of(BITE, WATER_GUN),
            EnumSet.of(AQUA_JET, HYDRO_PUMP, ICE_BEAM)),
    BLASTOISE(9, "Blastoise",
            EnumSet.of(WATER),
            186, 222, 158, 2542, 8.5F,
            EnumSet.of(BITE, WATER_GUN),
            EnumSet.of(FLASH_CANNON, HYDRO_PUMP, ICE_BEAM)),
    CATERPIE(10, "Caterpie",
            EnumSet.of(BUG),
            62, 66, 90, 443, 1.5F,
            EnumSet.of(TACKLE, BUG_BITE),
            EnumSet.of(STRUGGLE)),
    METAPOD(11, "Metapod",
            EnumSet.of(BUG),
            56, 86, 100, 477, 2F,
            EnumSet.of(TACKLE, BUG_BITE),
            EnumSet.of(STRUGGLE)),
    BUTTERFREE(12, "Butterfree",
            EnumSet.of(BUG, FLYING),
            144, 144, 120, 1454, 5.5F,
            EnumSet.of(BUG_BITE, CONFUSION),
            EnumSet.of(BUG_BUZZ, Move.PSYCHIC, SIGNAL_BEAM)),
    WEEDLE(13, "Weedle",
            EnumSet.of(BUG, POISON),
            68, 64, 80, 449, 1.5F,
            EnumSet.of(BUG_BITE, POISON_STING),
            EnumSet.of(STRUGGLE)),
    KAKUNA(14, "Kakuna",
            EnumSet.of(BUG, POISON),
            62, 82, 90, 485, 2F,
            EnumSet.of(BUG_BITE, POISON_STING),
            EnumSet.of(STRUGGLE)),
    BEEDRILL(15, "Beedrill",
            EnumSet.of(BUG, POISON),
            144, 130, 130, 1439, 5.5F,
            EnumSet.of(BUG_BITE, POISON_JAB),
            EnumSet.of(AERIAL_ACE, SLUDGE_BOMB, X_SCISSOR)),
    PIDGEY(16, "Pidgey",
            EnumSet.of(FLYING, NORMAL),
            94, 90, 80, 679, 2.5F,
            EnumSet.of(TACKLE, QUICK_ATTACK),
            EnumSet.of(AERIAL_ACE, AIR_CUTTER, TWISTER)),
    PIDGEOTTO(17, "Pidgeotto",
            EnumSet.of(FLYING, NORMAL),
            126, 122, 126, 1223, 5F,
            EnumSet.of(STEEL_WING, WING_ATTACK),
            EnumSet.of(AERIAL_ACE, AIR_CUTTER, TWISTER)),
    PIDGEOT(18, "Pidgeot",
            EnumSet.of(FLYING, NORMAL),
            170, 166, 166, 2091, 7.5F,
            EnumSet.of(STEEL_WING, WING_ATTACK),
            EnumSet.of(AERIAL_ACE, AIR_CUTTER, HURRICANE)),
    RATTATA(19, "Rattata",
            EnumSet.of(NORMAL),
            92, 86, 60, 581, 2.5F,
            EnumSet.of(TACKLE, QUICK_ATTACK),
            EnumSet.of(BODY_SLAM, DIG, HYPER_FANG)),
    RATICATE(20, "Raticate",
            EnumSet.of(NORMAL),
            146, 150, 110, 1444, 6F,
            EnumSet.of(BITE, QUICK_ATTACK),
            EnumSet.of(DIG, HYPER_BEAM, HYPER_FANG)),
    SPEAROW(21, "Spearow",
            EnumSet.of(FLYING, NORMAL),
            102, 78, 80, 686, 2.5F,
            EnumSet.of(PECK, QUICK_ATTACK),
            EnumSet.of(AERIAL_ACE, DRILL_PECK, TWISTER)),
    FEAROW(22, "Fearow",
            EnumSet.of(FLYING, NORMAL),
            168, 146, 130, 1746, 5.5F,
            EnumSet.of(PECK, STEEL_WING),
            EnumSet.of(AERIAL_ACE, TWISTER, DRILL_RUN)),
    EKANS(23, "Ekans",
            EnumSet.of(POISON),
            112, 112, 70, 824, 3F,
            EnumSet.of(ACID, POISON_STING),
            EnumSet.of(GUNK_SHOT, SLUDGE_BOMB, WRAP)),
    ARBOK(24, "Arbok",
            EnumSet.of(POISON),
            166, 166, 120, 1767, 6F,
            EnumSet.of(ACID, BITE),
            EnumSet.of(DARK_PULSE, GUNK_SHOT, SLUDGE_WAVE)),
    PIKACHU(25, "Pikachu",
            EnumSet.of(ELECTRIC),
            124, 108, 70, 887, 3.5F,
            EnumSet.of(QUICK_ATTACK, THUNDER_SHOCK),
            EnumSet.of(DISCHARGE, THUNDER, THUNDERBOLT)),
    RAICHU(26, "Raichu",
            EnumSet.of(ELECTRIC),
            200, 154, 120, 2028, 7F,
            EnumSet.of(SPARK, THUNDER_SHOCK),
            EnumSet.of(BRICK_BREAK, THUNDER, THUNDER_PUNCH)),
    SANDSHREW(27, "Sandshrew",
            EnumSet.of(GROUND),
            90, 114, 100, 798, 4F,
            EnumSet.of(MUD_SHOT, SCRATCH),
            EnumSet.of(DIG, ROCK_SLIDE, ROCK_TOMB)),
    SANDSLASH(28, "Sandslash",
            EnumSet.of(GROUND),
            150, 172, 150, 1810, 7.5F,
            EnumSet.of(METAL_CLAW, MUD_SHOT),
            EnumSet.of(BULLDOZE, EARTHQUAKE, ROCK_TOMB)),
    NIDORAN_FEMALE(29, "Nidoran♀",
            EnumSet.of(Type.POISON),
            100, 104, 110, 876, 3F,
            EnumSet.of(BITE, POISON_STING),
            EnumSet.of(BODY_SLAM, POISON_FANG, SLUDGE_BOMB)),
    NIDORINA(30, "Nidorina",
            EnumSet.of(POISON),
            132, 136, 140, 1404, 5.5F,
            EnumSet.of(BITE, POISON_STING),
            EnumSet.of(DIG, POISON_FANG, SLUDGE_BOMB)),
    NIDOQUEEN(31, "Nidoqueen",
            EnumSet.of(GROUND, POISON),
            184, 190, 180, 2485, 8.5F,
            EnumSet.of(BITE, POISON_JAB),
            EnumSet.of(EARTHQUAKE, SLUDGE_WAVE, STONE_EDGE)),
    NIDORAN_MALE(32, "Nidoran♂",
            EnumSet.of(POISON),
            110, 94, 92, 843, 3F,
            EnumSet.of(PECK, POISON_STING),
            EnumSet.of(BODY_SLAM, HORN_ATTACK, SLUDGE_BOMB)),
    NIDORINO(33, "Nidorino",
            EnumSet.of(POISON),
            142, 128, 122, 1372, 5.5F,
            EnumSet.of(POISON_STING, POISON_JAB),
            EnumSet.of(DIG, HORN_ATTACK, SLUDGE_BOMB)),
    NIDOKING(34, "Nidoking",
            EnumSet.of(GROUND, POISON),
            204, 170, 162, 2475, 8F,
            EnumSet.of(FURY_CUTTER, POISON_JAB),
            EnumSet.of(EARTHQUAKE, MEGAHORN, SLUDGE_WAVE)),
    CLEFAIRY(35, "Clefairy",
            EnumSet.of(FAIRY),
            116, 124, 140, 1200, 5F,
            EnumSet.of(POUND, ZEN_HEADBUTT),
            EnumSet.of(BODY_SLAM, DISARMING_VOICE, MOONBLAST)),
    CLEFABLE(36, "Clefable",
            EnumSet.of(FAIRY),
            178, 178, 190, 2397, 8.5F,
            EnumSet.of(POUND, ZEN_HEADBUTT),
            EnumSet.of(DAZZLING_GLEAM, MOONBLAST, Move.PSYCHIC)),
    VULPIX(37, "Vulpix",
            EnumSet.of(FIRE),
            106, 118, 76, 831, 3F,
            EnumSet.of(EMBER, QUICK_ATTACK),
            EnumSet.of(BODY_SLAM, FLAMETHROWER, FLAME_CHARGE)),
    NINETALES(38, "Ninetales",
            EnumSet.of(FIRE),
            176, 194, 146, 2188, 7F,
            EnumSet.of(EMBER, FEINT_ATTACK),
            EnumSet.of(FIRE_BLAST, FLAMETHROWER, HEAT_WAVE)),
    JIGGLYPUFF(39, "Jigglypuff",
            EnumSet.of(FAIRY, NORMAL),
            98, 54, 230, 917, 4.5F,
            EnumSet.of(FEINT_ATTACK, POUND),
            EnumSet.of(BODY_SLAM, DAZZLING_GLEAM, DISARMING_VOICE, PLAY_ROUGH)),
    WIGGLYTUFF(40, "Wigglytuff",
            EnumSet.of(FAIRY, NORMAL),
            168, 108, 280, 2177, 9.5F,
            EnumSet.of(FEINT_ATTACK, POUND),
            EnumSet.of(DAZZLING_GLEAM, HYPER_BEAM, PLAY_ROUGH)),
    ZUBAT(41, "Zubat",
            EnumSet.of(FLYING, POISON),
            88, 90, 80, 642, 2.5F,
            EnumSet.of(BITE, QUICK_ATTACK),
            EnumSet.of(AIR_CUTTER, POISON_FANG, SLUDGE_BOMB)),
    GOLBAT(42, "Golbat",
            EnumSet.of(FLYING, POISON),
            164, 164, 150, 1921, 6.5F,
            EnumSet.of(BITE, WING_ATTACK),
            EnumSet.of(AIR_CUTTER, POISON_FANG, OMINOUS_WIND)),
    ODDISH(43, "Oddish",
            EnumSet.of(GRASS, POISON),
            134, 130, 90, 1148, 3.5F,
            EnumSet.of(ACID, RAZOR_LEAF),
            EnumSet.of(MOONBLAST, SEED_BOMB, SLUDGE_BOMB)),
    GLOOM(44, "Gloom",
            EnumSet.of(GRASS, POISON),
            162, 158, 120, 1689, 6F,
            EnumSet.of(ACID, RAZOR_LEAF),
            EnumSet.of(MOONBLAST, PETAL_BLIZZARD, SLUDGE_BOMB)),
    VILEPLUME(45, "Vileplume",
            EnumSet.of(GRASS, POISON),
            202, 190, 150, 2492, 8.5F,
            EnumSet.of(ACID, RAZOR_LEAF),
            EnumSet.of(MOONBLAST, PETAL_BLIZZARD, SOLAR_BEAM)),
    PARAS(46, "Paras",
            EnumSet.of(BUG, GRASS),
            122, 120, 70, 916, 3.5F,
            EnumSet.of(BUG_BITE, SCRATCH),
            EnumSet.of(CROSS_POISON, SEED_BOMB, X_SCISSOR)),
    PARASECT(47, "Parasect",
            EnumSet.of(BUG, GRASS),
            162, 170, 120, 1747, 7F,
            EnumSet.of(BUG_BITE, FURY_CUTTER),
            EnumSet.of(CROSS_POISON, SOLAR_BEAM, X_SCISSOR)),
    VENONAT(48, "Venonat",
            EnumSet.of(BUG, POISON),
            108, 118, 120, 1029, 3.5F,
            EnumSet.of(BUG_BITE, CONFUSION),
            EnumSet.of(POISON_FANG, PSYBEAM, SIGNAL_BEAM)),
    VENOMOTH(49, "Venomoth",
            EnumSet.of(BUG, POISON),
            172, 154, 140, 1890, 6.5F,
            EnumSet.of(BUG_BITE, CONFUSION),
            EnumSet.of(BUG_BUZZ, POISON_FANG, Move.PSYCHIC)),
    DIGLETT(50, "Diglett",
            EnumSet.of(GROUND),
            108, 86, 20, 456, 1F,
            EnumSet.of(MUD_SLAP, SCRATCH, MUD_SHOT),
            EnumSet.of(DIG, MUD_BOMB, ROCK_TOMB)),
    DUGTRIO(51, "Dugtrio",
            EnumSet.of(GROUND),
            148, 140, 70, 1168, 3.5F,
            EnumSet.of(MUD_SLAP, SUCKER_PUNCH, MUD_SHOT),
            EnumSet.of(EARTHQUAKE, MUD_BOMB, STONE_EDGE)),
    MEOWTH(52, "Meowth",
            EnumSet.of(NORMAL),
            104, 94, 80, 756, 3F,
            EnumSet.of(BITE, SCRATCH),
            EnumSet.of(BODY_SLAM, DARK_PULSE, NIGHT_SLASH)),
    PERSIAN(53, "Persian",
            EnumSet.of(NORMAL),
            156, 146, 130, 1631, 6F,
            EnumSet.of(FEINT_ATTACK, SCRATCH),
            EnumSet.of(NIGHT_SLASH, PLAY_ROUGH, POWER_GEM)),
    PSYDUCK(54, "Psyduck",
            EnumSet.of(WATER),
            132, 112, 100, 1109, 4.5F,
            EnumSet.of(WATER_GUN, ZEN_HEADBUTT),
            EnumSet.of(AQUA_TAIL, CROSS_CHOP, PSYBEAM)),
    GOLDUCK(55, "Golduck",
            EnumSet.of(WATER),
            194, 176, 160, 2386, 8F,
            EnumSet.of(CONFUSION, WATER_GUN),
            EnumSet.of(HYDRO_PUMP, ICE_BEAM, Move.PSYCHIC)),
    MANKEY(56, "Mankey",
            EnumSet.of(FIGHTING),
            122, 96, 80, 878, 3.5F,
            EnumSet.of(KARATE_CHOP, SCRATCH),
            EnumSet.of(BRICK_BREAK, CROSS_CHOP, LOW_SWEEP)),
    PRIMEAPE(57, "Primeape",
            EnumSet.of(FIGHTING),
            178, 150, 130, 1864, 6.5F,
            EnumSet.of(KARATE_CHOP, LOW_KICK),
            EnumSet.of(CROSS_CHOP, LOW_SWEEP, NIGHT_SLASH)),
    GROWLITHE(58, "Growlithe",
            EnumSet.of(FIRE),
            156, 110, 110, 1335, 5F,
            EnumSet.of(BITE, EMBER),
            EnumSet.of(BODY_SLAM, FLAME_WHEEL, FLAMETHROWER)),
    ARCANINE(59, "Arcanine",
            EnumSet.of(FIRE),
            230, 180, 180, 2983, 9F,
            EnumSet.of(BITE, FIRE_FANG),
            EnumSet.of(BULLDOZE, FIRE_BLAST, FLAMETHROWER)),
    POLIWAG(60, "Poliwag",
            EnumSet.of(WATER),
            108, 98, 80, 795, 3.5F,
            EnumSet.of(BUBBLE, MUD_SHOT),
            EnumSet.of(BODY_SLAM, BUBBLE_BEAM, MUD_BOMB)),
    POLIWHIRL(61, "Poliwhirl",
            EnumSet.of(WATER),
            132, 132, 130, 1340, 6F,
            EnumSet.of(BUBBLE, MUD_SHOT),
            EnumSet.of(BUBBLE_BEAM, MUD_BOMB, SCALD)),
    POLIWRATH(62, "Poliwrath",
            EnumSet.of(FIGHTING, WATER),
            180, 202, 180, 2505, 9.5F,
            EnumSet.of(BUBBLE, MUD_SHOT),
            EnumSet.of(HYDRO_PUMP, ICE_PUNCH, SUBMISSION)),
    ABRA(63, "Abra",
            EnumSet.of(Type.PSYCHIC),
            110, 76, 50, 600, 2.5F,
            EnumSet.of(ZEN_HEADBUTT),
            EnumSet.of(PSYSHOCK, SHADOW_BALL, SIGNAL_BEAM)),
    KADABRA(64, "Kadabra",
            EnumSet.of(Type.PSYCHIC),
            150, 112, 80, 1131, 4.5F,
            EnumSet.of(CONFUSION, PSYCHO_CUT),
            EnumSet.of(DAZZLING_GLEAM, PSYBEAM, SHADOW_BALL)),
    ALAKAZAM(65, "Alakazam",
            EnumSet.of(Type.PSYCHIC),
            186, 152, 110, 1813, 6.5F,
            EnumSet.of(CONFUSION, PSYCHO_CUT),
            EnumSet.of(DAZZLING_GLEAM, Move.PSYCHIC, SHADOW_BALL)),
    MACHOP(66, "Machop",
            EnumSet.of(FIGHTING),
            118, 96, 140, 1089, 3F,
            EnumSet.of(KARATE_CHOP, LOW_KICK),
            EnumSet.of(BRICK_BREAK, CROSS_CHOP, LOW_SWEEP)),
    MACHOKE(67, "Machoke",
            EnumSet.of(FIGHTING),
            154, 144, 160, 1760, 6F,
            EnumSet.of(KARATE_CHOP, LOW_KICK),
            EnumSet.of(BRICK_BREAK, CROSS_CHOP, SUBMISSION)),
    MACHAMP(68, "Machamp",
            EnumSet.of(FIGHTING),
            198, 180, 180, 2594, 7.5F,
            EnumSet.of(BULLET_PUNCH, KARATE_CHOP),
            EnumSet.of(CROSS_CHOP, STONE_EDGE, SUBMISSION)),
    BELLSPROUT(69, "Bellsprout",
            EnumSet.of(GRASS, POISON),
            158, 78, 100, 1117, 4F,
            EnumSet.of(ACID, VINE_WHIP),
            EnumSet.of(POWER_WHIP, SLUDGE_BOMB, WRAP)),
    WEEPINBELL(70, "Weepinbell",
            EnumSet.of(GRASS, POISON),
            190, 110, 130, 1723, 6F,
            EnumSet.of(ACID, RAZOR_LEAF),
            EnumSet.of(POWER_WHIP, SEED_BOMB, SLUDGE_BOMB)),
    VICTREEBEL(71, "Victreebel",
            EnumSet.of(GRASS, POISON),
            222, 152, 160, 2530, 8.5F,
            EnumSet.of(ACID, RAZOR_LEAF),
            EnumSet.of(SLUDGE_BOMB, SOLAR_BEAM, LEAF_BLADE)),
    TENTACOOL(72, "Tentacool",
            EnumSet.of(POISON, WATER),
            106, 136, 80, 905, 3.5F,
            EnumSet.of(BUBBLE, POISON_STING),
            EnumSet.of(BUBBLE_BEAM, WATER_PULSE, WRAP)),
    TENTACRUEL(73, "Tentacruel",
            EnumSet.of(POISON, WATER),
            170, 196, 160, 2220, 8F,
            EnumSet.of(ACID, POISON_JAB),
            EnumSet.of(BLIZZARD, HYDRO_PUMP, SLUDGE_WAVE)),
    GEODUDE(74, "Geodude",
            EnumSet.of(GROUND, ROCK),
            106, 118, 80, 849, 3.5F,
            EnumSet.of(TACKLE, ROCK_THROW),
            EnumSet.of(DIG, ROCK_SLIDE, ROCK_TOMB)),
    GRAVELER(75, "Graveler",
            EnumSet.of(GROUND, ROCK),
            142, 156, 110, 1433, 6F,
            EnumSet.of(MUD_SLAP, ROCK_THROW, MUD_SHOT),
            EnumSet.of(DIG, ROCK_SLIDE, STONE_EDGE)),
    GOLEM(76, "Golem",
            EnumSet.of(GROUND, ROCK),
            176, 198, 160, 2303, 8.5F,
            EnumSet.of(MUD_SLAP, ROCK_THROW, MUD_SHOT),
            EnumSet.of(ANCIENT_POWER, EARTHQUAKE, STONE_EDGE)),
    PONYTA(77, "Ponyta",
            EnumSet.of(FIRE),
            168, 138, 100, 1516, 4.5F,
            EnumSet.of(TACKLE, EMBER),
            EnumSet.of(FIRE_BLAST, FLAME_WHEEL, FLAME_CHARGE)),
    RAPIDASH(78, "Rapidash",
            EnumSet.of(FIRE),
            200, 170, 130, 2199, 7F,
            EnumSet.of(EMBER, LOW_KICK),
            EnumSet.of(FIRE_BLAST, HEAT_WAVE, DRILL_RUN)),
    SLOWPOKE(79, "Slowpoke",
            EnumSet.of(Type.PSYCHIC, WATER),
            110, 110, 180, 1218, 5F,
            EnumSet.of(CONFUSION, WATER_GUN),
            EnumSet.of(Move.PSYCHIC, PSYSHOCK, WATER_PULSE)),
    SLOWBRO(80, "Slowbro",
            EnumSet.of(Type.PSYCHIC, WATER),
            184, 198, 190, 2597, 9.5F,
            EnumSet.of(CONFUSION, WATER_GUN),
            EnumSet.of(ICE_BEAM, Move.PSYCHIC, WATER_PULSE)),
    MAGNEMITE(81, "Magnemite",
            EnumSet.of(ELECTRIC, STEEL),
            128, 138, 50, 890, 3.5F,
            EnumSet.of(SPARK, THUNDER_SHOCK),
            EnumSet.of(DISCHARGE, MAGNET_BOMB, THUNDERBOLT)),
    MAGNETON(82, "Magneton",
            EnumSet.of(ELECTRIC, STEEL),
            186, 180, 100, 1879, 6F,
            EnumSet.of(SPARK, THUNDER_SHOCK),
            EnumSet.of(DISCHARGE, FLASH_CANNON, MAGNET_BOMB)),
    FARFETCHD(83, "Farfetch'd",
            EnumSet.of(FLYING, NORMAL),
            138, 132, 104, 1263, 4F,
            EnumSet.of(FURY_CUTTER, CUT),
            EnumSet.of(AERIAL_ACE, AIR_CUTTER, LEAF_BLADE)),
    DODUO(84, "Doduo",
            EnumSet.of(FLYING, NORMAL),
            126, 96, 70, 855, 2.5F,
            EnumSet.of(PECK, QUICK_ATTACK),
            EnumSet.of(AERIAL_ACE, DRILL_PECK, SWIFT)),
    DODRIO(85, "Dodrio",
            EnumSet.of(FLYING, NORMAL),
            182, 150, 120, 1836, 6.5F,
            EnumSet.of(FEINT_ATTACK, STEEL_WING),
            EnumSet.of(AERIAL_ACE, AIR_CUTTER, DRILL_PECK)),
    SEEL(86, "Seel",
            EnumSet.of(WATER),
            104, 138, 130, 1107, 4.5F,
            EnumSet.of(LICK, ICE_SHARD, WATER_GUN),
            EnumSet.of(AQUA_JET, AQUA_TAIL, ICY_WIND)),
    DEWGONG(87, "Dewgong",
            EnumSet.of(ICE, WATER),
            156, 192, 180, 2145, 8.5F,
            EnumSet.of(FROST_BREATH, ICE_SHARD),
            EnumSet.of(AQUA_JET, BLIZZARD, ICY_WIND)),
    GRIMER(88, "Grimer",
            EnumSet.of(POISON),
            124, 110, 160, 1284, 4.5F,
            EnumSet.of(MUD_SLAP, POISON_JAB, ACID),
            EnumSet.of(MUD_BOMB, SLUDGE, SLUDGE_BOMB)),
    MUK(89, "Muk",
            EnumSet.of(POISON),
            180, 188, 210, 2602, 8.5F,
            EnumSet.of(LICK, POISON_JAB, ACID),
            EnumSet.of(DARK_PULSE, GUNK_SHOT, SLUDGE_WAVE)),
    SHELLDER(90, "Shellder",
            EnumSet.of(WATER),
            120, 112, 60, 822, 3F,
            EnumSet.of(TACKLE, ICE_SHARD),
            EnumSet.of(BUBBLE_BEAM, ICY_WIND, WATER_PULSE)),
    CLOYSTER(91, "Cloyster",
            EnumSet.of(ICE, WATER),
            196, 196, 100, 2052, 7.5F,
            EnumSet.of(FROST_BREATH, ICE_SHARD),
            EnumSet.of(BLIZZARD, HYDRO_PUMP, ICY_WIND)),
    GASTLY(92, "Gastly",
            EnumSet.of(GHOST, POISON),
            136, 82, 60, 804, 3.5F,
            EnumSet.of(LICK, SUCKER_PUNCH),
            EnumSet.of(DARK_PULSE, SLUDGE_BOMB, OMINOUS_WIND)),
    HAUNTER(93, "Haunter",
            EnumSet.of(GHOST, POISON),
            172, 118, 90, 1380, 5.5F,
            EnumSet.of(LICK, SHADOW_CLAW),
            EnumSet.of(DARK_PULSE, SHADOW_BALL, SLUDGE_BOMB)),
    GENGAR(94, "Gengar",
            EnumSet.of(GHOST, POISON),
            204, 156, 120, 2078, 6.5F,
            EnumSet.of(SUCKER_PUNCH, SHADOW_CLAW),
            EnumSet.of(DARK_PULSE, SHADOW_BALL, SLUDGE_BOMB, SLUDGE_WAVE)),
    ONIX(95, "Onix",
            EnumSet.of(GROUND, ROCK),
            90, 186, 70, 857, 4F,
            EnumSet.of(TACKLE, ROCK_THROW),
            EnumSet.of(IRON_HEAD, ROCK_SLIDE, STONE_EDGE)),
    DROWZEE(96, "Drowzee",
            EnumSet.of(Type.PSYCHIC),
            104, 140, 120, 1075, 4.5F,
            EnumSet.of(CONFUSION, POUND),
            EnumSet.of(PSYBEAM, Move.PSYCHIC, PSYSHOCK)),
    HYPNO(97, "Hypno",
            EnumSet.of(Type.PSYCHIC),
            162, 196, 170, 2184, 8.5F,
            EnumSet.of(CONFUSION, ZEN_HEADBUTT),
            EnumSet.of(Move.PSYCHIC, PSYSHOCK, SHADOW_BALL)),
    KRABBY(98, "Krabby",
            EnumSet.of(WATER),
            116, 110, 60, 792, 3.5F,
            EnumSet.of(BUBBLE, MUD_SHOT),
            EnumSet.of(BUBBLE_BEAM, VICE_GRIP, WATER_PULSE)),
    KINGLER(99, "Kingler",
            EnumSet.of(WATER),
            178, 168, 110, 1823, 7F,
            EnumSet.of(METAL_CLAW, MUD_SHOT),
            EnumSet.of(VICE_GRIP, WATER_PULSE, X_SCISSOR)),
    VOLTORB(100, "Voltorb",
            EnumSet.of(ELECTRIC),
            102, 124, 80, 839, 3.5F,
            EnumSet.of(TACKLE, SPARK),
            EnumSet.of(DISCHARGE, SIGNAL_BEAM, THUNDERBOLT)),
    ELECTRODE(101, "Electrode",
            EnumSet.of(ELECTRIC),
            150, 174, 120, 1646, 5.5F,
            EnumSet.of(TACKLE, SPARK),
            EnumSet.of(DISCHARGE, HYPER_BEAM, THUNDERBOLT)),
    EXEGGCUTE(102, "Exeggcute",
            EnumSet.of(GRASS, Type.PSYCHIC),
            110, 132, 120, 1099, 4.5F,
            EnumSet.of(CONFUSION),
            EnumSet.of(ANCIENT_POWER, Move.PSYCHIC, SEED_BOMB)),
    EXEGGUTOR(103, "Exeggutor",
            EnumSet.of(GRASS, Type.PSYCHIC),
            232, 164, 190, 2955, 9.5F,
            EnumSet.of(CONFUSION, ZEN_HEADBUTT),
            EnumSet.of(Move.PSYCHIC, SEED_BOMB, SOLAR_BEAM)),
    CUBONE(104, "Cubone",
            EnumSet.of(GROUND),
            102, 150, 100, 1006, 4F,
            EnumSet.of(MUD_SLAP, ROCK_SMASH),
            EnumSet.of(BONE_CLUB, BULLDOZE, DIG)),
    MAROWAK(105, "Marowak",
            EnumSet.of(GROUND),
            140, 202, 120, 1656, 6F,
            EnumSet.of(MUD_SLAP, ROCK_SMASH),
            EnumSet.of(BONE_CLUB, DIG, EARTHQUAKE)),
    HITMONLEE(106, "Hitmonlee",
            EnumSet.of(FIGHTING),
            148, 172, 100, 1492, 5.5F,
            EnumSet.of(LOW_KICK, ROCK_SMASH),
            EnumSet.of(BRICK_BREAK, LOW_SWEEP, STONE_EDGE, STOMP)),
    HITMONCHAN(107, "Hitmonchan",
            EnumSet.of(FIGHTING),
            138, 204, 100, 1516, 5.5F,
            EnumSet.of(BULLET_PUNCH, ROCK_SMASH),
            EnumSet.of(BRICK_BREAK, FIRE_PUNCH, ICE_PUNCH, THUNDER_PUNCH)),
    LICKITUNG(108, "Lickitung",
            EnumSet.of(NORMAL),
            126, 160, 180, 1626, 7F,
            EnumSet.of(LICK, ZEN_HEADBUTT),
            EnumSet.of(HYPER_BEAM, POWER_WHIP, STOMP)),
    KOFFING(109, "Koffing",
            EnumSet.of(POISON),
            136, 142, 80, 1151, 4F,
            EnumSet.of(TACKLE, ACID),
            EnumSet.of(DARK_PULSE, SLUDGE, SLUDGE_BOMB)),
    WEEZING(110, "Weezing",
            EnumSet.of(POISON),
            190, 198, 130, 2250, 7F,
            EnumSet.of(TACKLE, ACID),
            EnumSet.of(DARK_PULSE, SHADOW_BALL, SLUDGE_BOMB)),
    RHYHORN(111, "Rhyhorn",
            EnumSet.of(GROUND, ROCK),
            110, 116, 160, 1182, 5F,
            EnumSet.of(MUD_SLAP, ROCK_SMASH),
            EnumSet.of(BULLDOZE, HORN_ATTACK, STOMP)),
    RHYDON(112, "Rhydon",
            EnumSet.of(GROUND, ROCK),
            166, 160, 210, 2243, 8.5F,
            EnumSet.of(MUD_SLAP, ROCK_SMASH),
            EnumSet.of(EARTHQUAKE, MEGAHORN, STONE_EDGE)),
    CHANSEY(113, "Chansey",
            EnumSet.of(NORMAL),
            40, 60, 500, 675, 5.5F,
            EnumSet.of(POUND, ZEN_HEADBUTT),
            EnumSet.of(DAZZLING_GLEAM, HYPER_BEAM, Move.PSYCHIC, PSYBEAM)),
    TANGELA(114, "Tangela",
            EnumSet.of(GRASS),
            164, 152, 130, 1739, 7F,
            EnumSet.of(VINE_WHIP),
            EnumSet.of(POWER_WHIP, SLUDGE_BOMB, SOLAR_BEAM)),
    KANGASKHAN(115, "Kangaskhan",
            EnumSet.of(NORMAL),
            142, 178, 210, 2043, 7.5F,
            EnumSet.of(LOW_KICK, MUD_SLAP),
            EnumSet.of(BRICK_BREAK, EARTHQUAKE, STOMP)),
    HORSEA(116, "Horsea",
            EnumSet.of(WATER),
            122, 100, 60, 794, 3.5F,
            EnumSet.of(BUBBLE, WATER_GUN),
            EnumSet.of(BUBBLE_BEAM, DRAGON_PULSE, FLASH_CANNON)),
    SEADRA(117, "Seadra",
            EnumSet.of(WATER),
            176, 150, 110, 1713, 6F,
            EnumSet.of(DRAGON_BREATH, WATER_GUN),
            EnumSet.of(BLIZZARD, DRAGON_PULSE, HYDRO_PUMP)),
    GOLDEEN(118, "Goldeen",
            EnumSet.of(WATER),
            112, 126, 90, 965, 3.5F,
            EnumSet.of(MUD_SHOT, PECK),
            EnumSet.of(AQUA_TAIL, HORN_ATTACK, WATER_PULSE)),
    SEAKING(119, "Seaking",
            EnumSet.of(WATER),
            172, 160, 160, 2043, 6.5F,
            EnumSet.of(PECK, POISON_JAB),
            EnumSet.of(ICY_WIND, MEGAHORN, DRILL_RUN)),
    STARYU(120, "Staryu",
            EnumSet.of(WATER),
            130, 128, 60, 937, 3.5F,
            EnumSet.of(TACKLE, WATER_GUN, QUICK_ATTACK),
            EnumSet.of(BUBBLE_BEAM, POWER_GEM, SWIFT)),
    STARMIE(121, "Starmie",
            EnumSet.of(Type.PSYCHIC, WATER),
            194, 192, 120, 2182, 7.5F,
            EnumSet.of(TACKLE, WATER_GUN, QUICK_ATTACK),
            EnumSet.of(HYDRO_PUMP, POWER_GEM, Move.PSYCHIC, PSYBEAM)),
    MR_MIME(122, "Mr. Mime",
            EnumSet.of(FAIRY, Type.PSYCHIC),
            154, 196, 80, 1494, 5F,
            EnumSet.of(CONFUSION, ZEN_HEADBUTT),
            EnumSet.of(PSYBEAM, Move.PSYCHIC, SHADOW_BALL)),
    SCYTHER(123, "Scyther",
            EnumSet.of(BUG, FLYING),
            176, 180, 140, 2073, 7.5F,
            EnumSet.of(FURY_CUTTER, STEEL_WING),
            EnumSet.of(BUG_BUZZ, NIGHT_SLASH, X_SCISSOR)),
    JYNX(124, "Jynx",
            EnumSet.of(ICE, Type.PSYCHIC),
            172, 134, 130, 1716, 6F,
            EnumSet.of(FROST_BREATH, POUND),
            EnumSet.of(DRAINING_KISS, ICE_PUNCH, PSYSHOCK)),
    ELECTABUZZ(125, "Electabuzz",
            EnumSet.of(ELECTRIC),
            198, 160, 130, 2119, 7.5F,
            EnumSet.of(LOW_KICK, THUNDER_SHOCK),
            EnumSet.of(THUNDER, THUNDER_PUNCH, THUNDERBOLT)),
    MAGMAR(126, "Magmar",
            EnumSet.of(FIRE),
            214, 158, 130, 2265, 7F,
            EnumSet.of(EMBER, KARATE_CHOP),
            EnumSet.of(FIRE_BLAST, FIRE_PUNCH, FLAMETHROWER)),
    PINSIR(127, "Pinsir",
            EnumSet.of(BUG),
            184, 186, 130, 2121, 6.5F,
            EnumSet.of(FURY_CUTTER, ROCK_SMASH),
            EnumSet.of(SUBMISSION, VICE_GRIP, X_SCISSOR)),
    TAUROS(128, "Tauros",
            EnumSet.of(NORMAL),
            148, 184, 150, 1844, 7.5F,
            EnumSet.of(TACKLE, ZEN_HEADBUTT),
            EnumSet.of(EARTHQUAKE, HORN_ATTACK, IRON_HEAD)),
    MAGIKARP(129, "Magikarp",
            EnumSet.of(WATER),
            42, 84, 40, 262, 1F,
            EnumSet.of(SPLASH),
            EnumSet.of(STRUGGLE)),
    GYARADOS(130, "Gyarados",
            EnumSet.of(FLYING, WATER),
            192, 196, 190, 2688, 8.5F,
            EnumSet.of(BITE, DRAGON_BREATH),
            EnumSet.of(DRAGON_PULSE, HYDRO_PUMP, TWISTER)),
    LAPRAS(131, "Lapras",
            EnumSet.of(ICE, WATER),
            186, 190, 260, 2980, 10F,
            EnumSet.of(FROST_BREATH, ICE_SHARD),
            EnumSet.of(BLIZZARD, DRAGON_PULSE, ICE_BEAM)),
    DITTO(132, "Ditto",
            EnumSet.of(NORMAL),
            110, 110, 96, 919, null,
            EnumSet.of(POUND),
            EnumSet.of(STRUGGLE)),
    EEVEE(133, "Eevee",
            EnumSet.of(NORMAL),
            114, 128, 110, 1077, 4.5F,
            EnumSet.of(TACKLE, QUICK_ATTACK),
            EnumSet.of(BODY_SLAM, DIG, SWIFT)),
    VAPOREON(134, "Vaporeon",
            EnumSet.of(WATER),
            186, 168, 260, 2816, 9.5F,
            EnumSet.of(WATER_GUN),
            EnumSet.of(AQUA_TAIL, HYDRO_PUMP, WATER_PULSE)),
    JOLTEON(135, "Jolteon",
            EnumSet.of(ELECTRIC),
            192, 174, 130, 2140, 7.5F,
            EnumSet.of(THUNDER_SHOCK),
            EnumSet.of(DISCHARGE, THUNDER, THUNDERBOLT)),
    FLAREON(136, "Flareon",
            EnumSet.of(FIRE),
            238, 178, 130, 2643, 8F,
            EnumSet.of(EMBER),
            EnumSet.of(FIRE_BLAST, FLAMETHROWER, HEAT_WAVE)),
    PORYGON(137, "Porygon",
            EnumSet.of(NORMAL),
            156, 158, 130, 1691, 4.5F,
            EnumSet.of(TACKLE, ZEN_HEADBUTT, QUICK_ATTACK),
            EnumSet.of(DISCHARGE, PSYBEAM, SIGNAL_BEAM)),
    OMANYTE(138, "Omanyte",
            EnumSet.of(ROCK, WATER),
            132, 160, 70, 1119, 4.5F,
            EnumSet.of(MUD_SHOT, WATER_GUN),
            EnumSet.of(ANCIENT_POWER, ROCK_TOMB, BRINE)),
    OMASTAR(139, "Omastar",
            EnumSet.of(ROCK, WATER),
            180, 202, 140, 2233, 8.5F,
            EnumSet.of(MUD_SHOT, WATER_GUN, ROCK_THROW),
            EnumSet.of(ANCIENT_POWER, HYDRO_PUMP, ROCK_SLIDE)),
    KABUTO(140, "Kabuto",
            EnumSet.of(ROCK, WATER),
            148, 142, 60, 1104, 5F,
            EnumSet.of(MUD_SHOT, SCRATCH),
            EnumSet.of(ANCIENT_POWER, AQUA_JET, ROCK_TOMB)),
    KABUTOPS(141, "Kabutops",
            EnumSet.of(ROCK, WATER),
            190, 190, 120, 2130, 7.5F,
            EnumSet.of(FURY_CUTTER, MUD_SHOT),
            EnumSet.of(ANCIENT_POWER, STONE_EDGE, WATER_PULSE)),
    AERODACTYL(142, "Aerodactyl",
            EnumSet.of(FLYING, ROCK),
            182, 162, 160, 2165, 7.5F,
            EnumSet.of(BITE, STEEL_WING),
            EnumSet.of(ANCIENT_POWER, HYPER_BEAM, IRON_HEAD)),
    SNORLAX(143, "Snorlax",
            EnumSet.of(NORMAL),
            180, 180, 320, 3112, 10F,
            EnumSet.of(LICK, ZEN_HEADBUTT),
            EnumSet.of(BODY_SLAM, EARTHQUAKE, HYPER_BEAM)),
    ARTICUNO(144, "Articuno",
            EnumSet.of(FLYING, ICE),
            198, 242, 180, 2978, null,
            EnumSet.of(FROST_BREATH),
            EnumSet.of(BLIZZARD, ICE_BEAM, ICY_WIND)),
    ZAPDOS(145, "Zapdos",
            EnumSet.of(ELECTRIC, FLYING),
            232, 194, 180, 3114, null,
            EnumSet.of(THUNDER_SHOCK),
            EnumSet.of(DISCHARGE, THUNDER, THUNDERBOLT)),
    MOLTRES(146, "Moltres",
            EnumSet.of(FIRE, FLYING),
            242, 194, 180, 3240, null,
            EnumSet.of(EMBER),
            EnumSet.of(FIRE_BLAST, FLAMETHROWER, HEAT_WAVE)),
    DRATINI(147, "Dratini",
            EnumSet.of(DRAGON),
            128, 110, 82, 983, 4F,
            EnumSet.of(DRAGON_BREATH),
            EnumSet.of(AQUA_TAIL, TWISTER, WRAP)),
    DRAGONAIR(148, "Dragonair",
            EnumSet.of(DRAGON),
            170, 152, 122, 1747, 6F,
            EnumSet.of(DRAGON_BREATH),
            EnumSet.of(AQUA_TAIL, DRAGON_PULSE, WRAP)),
    DRAGONITE(149, "Dragonite",
            EnumSet.of(DRAGON, FLYING),
            250, 212, 182, 3500, 10F,
            EnumSet.of(DRAGON_BREATH, STEEL_WING),
            EnumSet.of(DRAGON_CLAW, DRAGON_PULSE, HYPER_BEAM)),
    MEWTWO(150, "Mewtwo",
            EnumSet.of(Type.PSYCHIC),
            284, 202, 212, 4144, null,
            EnumSet.of(CONFUSION, PSYCHO_CUT),
            EnumSet.of(HYPER_BEAM, Move.PSYCHIC, SHADOW_BALL)),
    MEW(151, "Mew",
            EnumSet.of(Type.PSYCHIC),
            220, 220, 200, 3299, null,
            EnumSet.of(POUND),
            EnumSet.of(BLIZZARD, DRAGON_PULSE, EARTHQUAKE, FIRE_BLAST, HYPER_BEAM, Move.PSYCHIC, SOLAR_BEAM, THUNDER, HURRICANE));

    private static Map<Integer, Pokemon> BY_NUMBER = new HashMap();
    private int number;
    private String name;
    private Set<Type> types;
    private int baseAttack;
    private int baseDefense;
    private int baseStamina;
    private int maxCp;
    private Float rating;
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

        BULBASAUR.movesetRanks.put(Moveset.of(VINE_WHIP, SLUDGE_BOMB), MovesetRating.of("A1", null));
        BULBASAUR.movesetRanks.put(Moveset.of(TACKLE, SLUDGE_BOMB), MovesetRating.of(null, "A1"));
        BULBASAUR.movesetRanks = Collections.unmodifiableMap(BULBASAUR.movesetRanks);

        IVYSAUR.movesetRanks.put(Moveset.of(RAZOR_LEAF, SOLAR_BEAM), MovesetRating.of(null, "A1"));
        IVYSAUR.movesetRanks.put(Moveset.of(VINE_WHIP, SOLAR_BEAM), MovesetRating.of("A1", null));
        IVYSAUR.movesetRanks = Collections.unmodifiableMap(IVYSAUR.movesetRanks);

        VENUSAUR.movesetRanks.put(Moveset.of(RAZOR_LEAF, SLUDGE_BOMB), MovesetRating.of("C6", "A1"));
        VENUSAUR.movesetRanks.put(Moveset.of(RAZOR_LEAF, PETAL_BLIZZARD), MovesetRating.of("B5", "B2"));
        VENUSAUR.movesetRanks.put(Moveset.of(VINE_WHIP, PETAL_BLIZZARD), MovesetRating.of("A2", "D5"));
        VENUSAUR.movesetRanks.put(Moveset.of(VINE_WHIP, SLUDGE_BOMB), MovesetRating.of("B3", "C4"));
        VENUSAUR.movesetRanks.put(Moveset.of(RAZOR_LEAF, SOLAR_BEAM), MovesetRating.of("B4", "B3"));
        VENUSAUR.movesetRanks.put(Moveset.of(VINE_WHIP, SOLAR_BEAM), MovesetRating.of("A1", "D6"));
        VENUSAUR.movesetRanks = Collections.unmodifiableMap(VENUSAUR.movesetRanks);

        CHARMANDER.movesetRanks.put(Moveset.of(SCRATCH, FLAMETHROWER), MovesetRating.of("A1", null));
        CHARMANDER.movesetRanks.put(Moveset.of(EMBER, FLAMETHROWER), MovesetRating.of(null, "A1"));
        CHARMANDER.movesetRanks = Collections.unmodifiableMap(CHARMANDER.movesetRanks);

        CHARMELEON.movesetRanks.put(Moveset.of(SCRATCH, FLAMETHROWER), MovesetRating.of("A1", null));
        CHARMELEON.movesetRanks.put(Moveset.of(EMBER, FLAMETHROWER), MovesetRating.of(null, "A1"));
        CHARMELEON.movesetRanks = Collections.unmodifiableMap(CHARMELEON.movesetRanks);

        CHARIZARD.movesetRanks.put(Moveset.of(WING_ATTACK, FIRE_BLAST), MovesetRating.of("A1", "B3"));
        CHARIZARD.movesetRanks.put(Moveset.of(EMBER, FIRE_BLAST), MovesetRating.of("C4", "B4"));
        CHARIZARD.movesetRanks.put(Moveset.of(WING_ATTACK, DRAGON_CLAW), MovesetRating.of("B3", "D6"));
        CHARIZARD.movesetRanks.put(Moveset.of(EMBER, FLAMETHROWER), MovesetRating.of("D5", "B2"));
        CHARIZARD.movesetRanks.put(Moveset.of(WING_ATTACK, FLAMETHROWER), MovesetRating.of("B2", "A1"));
        CHARIZARD.movesetRanks.put(Moveset.of(EMBER, DRAGON_CLAW), MovesetRating.of("F6", "D5"));
        CHARIZARD.movesetRanks = Collections.unmodifiableMap(CHARIZARD.movesetRanks);

        SQUIRTLE.movesetRanks.put(Moveset.of(BUBBLE, AQUA_TAIL), MovesetRating.of("A1", "A1"));
        SQUIRTLE.movesetRanks = Collections.unmodifiableMap(SQUIRTLE.movesetRanks);

        WARTORTLE.movesetRanks.put(Moveset.of(WATER_GUN, HYDRO_PUMP), MovesetRating.of("A1", "A1"));
        WARTORTLE.movesetRanks = Collections.unmodifiableMap(WARTORTLE.movesetRanks);

        BLASTOISE.movesetRanks.put(Moveset.of(BITE, ICE_BEAM), MovesetRating.of("D5", "C5"));
        BLASTOISE.movesetRanks.put(Moveset.of(BITE, HYDRO_PUMP), MovesetRating.of("B2", "D6"));
        BLASTOISE.movesetRanks.put(Moveset.of(WATER_GUN, ICE_BEAM), MovesetRating.of("C4", "B3"));
        BLASTOISE.movesetRanks.put(Moveset.of(BITE, FLASH_CANNON), MovesetRating.of("F6", "B2"));
        BLASTOISE.movesetRanks.put(Moveset.of(WATER_GUN, HYDRO_PUMP), MovesetRating.of("A1", "C4"));
        BLASTOISE.movesetRanks.put(Moveset.of(WATER_GUN, FLASH_CANNON), MovesetRating.of("C3", "A1"));
        BLASTOISE.movesetRanks = Collections.unmodifiableMap(BLASTOISE.movesetRanks);

        CATERPIE.movesetRanks.put(Moveset.of(TACKLE, STRUGGLE), MovesetRating.of(null, "A1"));
        CATERPIE.movesetRanks.put(Moveset.of(BUG_BITE, STRUGGLE), MovesetRating.of("A1", null));
        CATERPIE.movesetRanks = Collections.unmodifiableMap(CATERPIE.movesetRanks);

        METAPOD.movesetRanks.put(Moveset.of(TACKLE, STRUGGLE), MovesetRating.of(null, "A1"));
        METAPOD.movesetRanks.put(Moveset.of(BUG_BITE, STRUGGLE), MovesetRating.of("A1", null));
        METAPOD.movesetRanks = Collections.unmodifiableMap(METAPOD.movesetRanks);

        BUTTERFREE.movesetRanks.put(Moveset.of(BUG_BITE, BUG_BUZZ), MovesetRating.of("A1", "A2"));
        BUTTERFREE.movesetRanks.put(Moveset.of(CONFUSION, BUG_BUZZ), MovesetRating.of("C4", "A3"));
        BUTTERFREE.movesetRanks.put(Moveset.of(CONFUSION, Move.PSYCHIC), MovesetRating.of("D5", "C6"));
        BUTTERFREE.movesetRanks.put(Moveset.of(CONFUSION, SIGNAL_BEAM), MovesetRating.of("D6", "A4"));
        BUTTERFREE.movesetRanks.put(Moveset.of(BUG_BITE, SIGNAL_BEAM), MovesetRating.of("B2", "A1"));
        BUTTERFREE.movesetRanks.put(Moveset.of(BUG_BITE, Move.PSYCHIC), MovesetRating.of("B3", "C5"));
        BUTTERFREE.movesetRanks = Collections.unmodifiableMap(BUTTERFREE.movesetRanks);

        WEEDLE.movesetRanks.put(Moveset.of(POISON_STING, STRUGGLE), MovesetRating.of(null, "A1"));
        WEEDLE.movesetRanks.put(Moveset.of(BUG_BITE, STRUGGLE), MovesetRating.of("A1", null));
        WEEDLE.movesetRanks = Collections.unmodifiableMap(WEEDLE.movesetRanks);

        KAKUNA.movesetRanks.put(Moveset.of(POISON_STING, STRUGGLE), MovesetRating.of(null, "A1"));
        KAKUNA.movesetRanks.put(Moveset.of(BUG_BITE, STRUGGLE), MovesetRating.of("A1", null));
        KAKUNA.movesetRanks = Collections.unmodifiableMap(KAKUNA.movesetRanks);

        BEEDRILL.movesetRanks.put(Moveset.of(BUG_BITE, X_SCISSOR), MovesetRating.of("B3", "A2"));
        BEEDRILL.movesetRanks.put(Moveset.of(POISON_JAB, SLUDGE_BOMB), MovesetRating.of("B2", "A3"));
        BEEDRILL.movesetRanks.put(Moveset.of(POISON_JAB, AERIAL_ACE), MovesetRating.of("D6", "D5"));
        BEEDRILL.movesetRanks.put(Moveset.of(BUG_BITE, AERIAL_ACE), MovesetRating.of("C5", "F6"));
        BEEDRILL.movesetRanks.put(Moveset.of(BUG_BITE, SLUDGE_BOMB), MovesetRating.of("A1", "A1"));
        BEEDRILL.movesetRanks.put(Moveset.of(POISON_JAB, X_SCISSOR), MovesetRating.of("C4", "B4"));
        BEEDRILL.movesetRanks = Collections.unmodifiableMap(BEEDRILL.movesetRanks);

        PIDGEY.movesetRanks.put(Moveset.of(TACKLE, AERIAL_ACE), MovesetRating.of("A1", "A1"));
        PIDGEY.movesetRanks = Collections.unmodifiableMap(PIDGEY.movesetRanks);

        PIDGEOTTO.movesetRanks.put(Moveset.of(STEEL_WING, AERIAL_ACE), MovesetRating.of(null, "A1"));
        PIDGEOTTO.movesetRanks.put(Moveset.of(WING_ATTACK, AERIAL_ACE), MovesetRating.of("A1", null));
        PIDGEOTTO.movesetRanks = Collections.unmodifiableMap(PIDGEOTTO.movesetRanks);

        PIDGEOT.movesetRanks.put(Moveset.of(WING_ATTACK, AIR_CUTTER), MovesetRating.of("C3", "B5"));
        PIDGEOT.movesetRanks.put(Moveset.of(STEEL_WING, AIR_CUTTER), MovesetRating.of("F6", "B3"));
        PIDGEOT.movesetRanks.put(Moveset.of(STEEL_WING, AERIAL_ACE), MovesetRating.of("F5", "A1"));
        PIDGEOT.movesetRanks.put(Moveset.of(WING_ATTACK, HURRICANE), MovesetRating.of("A1", "B6"));
        PIDGEOT.movesetRanks.put(Moveset.of(STEEL_WING, HURRICANE), MovesetRating.of("C2", "B4"));
        PIDGEOT.movesetRanks.put(Moveset.of(WING_ATTACK, AERIAL_ACE), MovesetRating.of("C4", "B2"));
        PIDGEOT.movesetRanks = Collections.unmodifiableMap(PIDGEOT.movesetRanks);

        RATTATA.movesetRanks.put(Moveset.of(TACKLE, BODY_SLAM), MovesetRating.of("A1", null));
        RATTATA.movesetRanks.put(Moveset.of(TACKLE, HYPER_FANG), MovesetRating.of(null, "A1"));
        RATTATA.movesetRanks = Collections.unmodifiableMap(RATTATA.movesetRanks);

        RATICATE.movesetRanks.put(Moveset.of(QUICK_ATTACK, HYPER_BEAM), MovesetRating.of("B3", "B5"));
        RATICATE.movesetRanks.put(Moveset.of(QUICK_ATTACK, HYPER_FANG), MovesetRating.of("C4", "B6"));
        RATICATE.movesetRanks.put(Moveset.of(BITE, DIG), MovesetRating.of("D5", "B2"));
        RATICATE.movesetRanks.put(Moveset.of(BITE, HYPER_BEAM), MovesetRating.of("A1", "B3"));
        RATICATE.movesetRanks.put(Moveset.of(BITE, HYPER_FANG), MovesetRating.of("B2", "A1"));
        RATICATE.movesetRanks.put(Moveset.of(QUICK_ATTACK, DIG), MovesetRating.of("F6", "B4"));
        RATICATE.movesetRanks = Collections.unmodifiableMap(RATICATE.movesetRanks);

        SPEAROW.movesetRanks.put(Moveset.of(PECK, DRILL_PECK), MovesetRating.of("A1", null));
        SPEAROW.movesetRanks.put(Moveset.of(QUICK_ATTACK, DRILL_PECK), MovesetRating.of(null, "A1"));
        SPEAROW.movesetRanks = Collections.unmodifiableMap(SPEAROW.movesetRanks);

        FEAROW.movesetRanks.put(Moveset.of(PECK, TWISTER), MovesetRating.of("B4", "C5"));
        FEAROW.movesetRanks.put(Moveset.of(STEEL_WING, AERIAL_ACE), MovesetRating.of("B5", "A1"));
        FEAROW.movesetRanks.put(Moveset.of(STEEL_WING, DRILL_RUN), MovesetRating.of("A1", "A2"));
        FEAROW.movesetRanks.put(Moveset.of(PECK, AERIAL_ACE), MovesetRating.of("B3", "A3"));
        FEAROW.movesetRanks.put(Moveset.of(STEEL_WING, TWISTER), MovesetRating.of("B6", "C6"));
        FEAROW.movesetRanks.put(Moveset.of(PECK, DRILL_RUN), MovesetRating.of("A2", "A4"));
        FEAROW.movesetRanks = Collections.unmodifiableMap(FEAROW.movesetRanks);

        EKANS.movesetRanks.put(Moveset.of(POISON_STING, SLUDGE_BOMB), MovesetRating.of("A1", null));
        EKANS.movesetRanks.put(Moveset.of(ACID, SLUDGE_BOMB), MovesetRating.of(null, "A1"));
        EKANS.movesetRanks = Collections.unmodifiableMap(EKANS.movesetRanks);

        ARBOK.movesetRanks.put(Moveset.of(BITE, SLUDGE_WAVE), MovesetRating.of("A1", "C5"));
        ARBOK.movesetRanks.put(Moveset.of(ACID, DARK_PULSE), MovesetRating.of("D6", "A1"));
        ARBOK.movesetRanks.put(Moveset.of(BITE, DARK_PULSE), MovesetRating.of("C5", "A2"));
        ARBOK.movesetRanks.put(Moveset.of(ACID, GUNK_SHOT), MovesetRating.of("B3", "B4"));
        ARBOK.movesetRanks.put(Moveset.of(ACID, SLUDGE_WAVE), MovesetRating.of("B4", "B3"));
        ARBOK.movesetRanks.put(Moveset.of(BITE, GUNK_SHOT), MovesetRating.of("A2", "C6"));
        ARBOK.movesetRanks = Collections.unmodifiableMap(ARBOK.movesetRanks);

        PIKACHU.movesetRanks.put(Moveset.of(THUNDER_SHOCK, THUNDER), MovesetRating.of("A1", null));
        PIKACHU.movesetRanks.put(Moveset.of(QUICK_ATTACK, THUNDERBOLT), MovesetRating.of(null, "A1"));
        PIKACHU.movesetRanks = Collections.unmodifiableMap(PIKACHU.movesetRanks);

        RAICHU.movesetRanks.put(Moveset.of(THUNDER_SHOCK, THUNDER), MovesetRating.of("A2", "C6"));
        RAICHU.movesetRanks.put(Moveset.of(THUNDER_SHOCK, THUNDER_PUNCH), MovesetRating.of("B4", "A2"));
        RAICHU.movesetRanks.put(Moveset.of(SPARK, BRICK_BREAK), MovesetRating.of("D5", "C3"));
        RAICHU.movesetRanks.put(Moveset.of(SPARK, THUNDER), MovesetRating.of("A1", "C4"));
        RAICHU.movesetRanks.put(Moveset.of(SPARK, THUNDER_PUNCH), MovesetRating.of("B3", "A1"));
        RAICHU.movesetRanks.put(Moveset.of(THUNDER_SHOCK, BRICK_BREAK), MovesetRating.of("D6", "C5"));
        RAICHU.movesetRanks = Collections.unmodifiableMap(RAICHU.movesetRanks);

        SANDSHREW.movesetRanks.put(Moveset.of(MUD_SHOT, ROCK_SLIDE), MovesetRating.of("A1", null));
        SANDSHREW.movesetRanks.put(Moveset.of(MUD_SHOT, DIG), MovesetRating.of(null, "A1"));
        SANDSHREW.movesetRanks = Collections.unmodifiableMap(SANDSHREW.movesetRanks);

        SANDSLASH.movesetRanks.put(Moveset.of(METAL_CLAW, EARTHQUAKE), MovesetRating.of("B2", "C4"));
        SANDSLASH.movesetRanks.put(Moveset.of(MUD_SHOT, ROCK_TOMB), MovesetRating.of("C4", "F6"));
        SANDSLASH.movesetRanks.put(Moveset.of(MUD_SHOT, BULLDOZE), MovesetRating.of("C3", "B2"));
        SANDSLASH.movesetRanks.put(Moveset.of(MUD_SHOT, EARTHQUAKE), MovesetRating.of("A1", "C3"));
        SANDSLASH.movesetRanks.put(Moveset.of(METAL_CLAW, BULLDOZE), MovesetRating.of("D5", "A1"));
        SANDSLASH.movesetRanks.put(Moveset.of(METAL_CLAW, ROCK_TOMB), MovesetRating.of("D6", "F5"));
        SANDSLASH.movesetRanks = Collections.unmodifiableMap(SANDSLASH.movesetRanks);

        NIDORAN_FEMALE.movesetRanks.put(Moveset.of(POISON_STING, SLUDGE_BOMB), MovesetRating.of("A1", "A1"));
        NIDORAN_FEMALE.movesetRanks = Collections.unmodifiableMap(NIDORAN_FEMALE.movesetRanks);

        NIDORINA.movesetRanks.put(Moveset.of(POISON_STING, SLUDGE_BOMB), MovesetRating.of("A1", "A1"));
        NIDORINA.movesetRanks = Collections.unmodifiableMap(NIDORINA.movesetRanks);

        NIDOQUEEN.movesetRanks.put(Moveset.of(POISON_JAB, EARTHQUAKE), MovesetRating.of("A1", "A1"));
        NIDOQUEEN.movesetRanks.put(Moveset.of(BITE, EARTHQUAKE), MovesetRating.of("A2", "B4"));
        NIDOQUEEN.movesetRanks.put(Moveset.of(POISON_JAB, SLUDGE_WAVE), MovesetRating.of("B3", "B2"));
        NIDOQUEEN.movesetRanks.put(Moveset.of(BITE, SLUDGE_WAVE), MovesetRating.of("B5", "C5"));
        NIDOQUEEN.movesetRanks.put(Moveset.of(POISON_JAB, STONE_EDGE), MovesetRating.of("B4", "B3"));
        NIDOQUEEN.movesetRanks.put(Moveset.of(BITE, STONE_EDGE), MovesetRating.of("B6", "C6"));
        NIDOQUEEN.movesetRanks = Collections.unmodifiableMap(NIDOQUEEN.movesetRanks);

        NIDORAN_MALE.movesetRanks.put(Moveset.of(PECK, SLUDGE_BOMB), MovesetRating.of(null, "A1"));
        NIDORAN_MALE.movesetRanks.put(Moveset.of(POISON_STING, SLUDGE_BOMB), MovesetRating.of("A1", null));
        NIDORAN_MALE.movesetRanks = Collections.unmodifiableMap(NIDORAN_MALE.movesetRanks);

        NIDORINO.movesetRanks.put(Moveset.of(POISON_JAB, SLUDGE_BOMB), MovesetRating.of("A1", "A1"));
        NIDORINO.movesetRanks = Collections.unmodifiableMap(NIDORINO.movesetRanks);

        NIDOKING.movesetRanks.put(Moveset.of(POISON_JAB, EARTHQUAKE), MovesetRating.of("A1", "A1"));
        NIDOKING.movesetRanks.put(Moveset.of(POISON_JAB, MEGAHORN), MovesetRating.of("B3", "C3"));
        NIDOKING.movesetRanks.put(Moveset.of(POISON_JAB, SLUDGE_WAVE), MovesetRating.of("B2", "C2"));
        NIDOKING.movesetRanks.put(Moveset.of(FURY_CUTTER, EARTHQUAKE), MovesetRating.of("B4", "D4"));
        NIDOKING.movesetRanks.put(Moveset.of(FURY_CUTTER, SLUDGE_WAVE), MovesetRating.of("D5", "F6"));
        NIDOKING.movesetRanks.put(Moveset.of(FURY_CUTTER, MEGAHORN), MovesetRating.of("D6", "F5"));
        NIDOKING.movesetRanks = Collections.unmodifiableMap(NIDOKING.movesetRanks);

        CLEFAIRY.movesetRanks.put(Moveset.of(ZEN_HEADBUTT, MOONBLAST), MovesetRating.of(null, "A1"));
        CLEFAIRY.movesetRanks.put(Moveset.of(POUND, MOONBLAST), MovesetRating.of("A1", null));
        CLEFAIRY.movesetRanks = Collections.unmodifiableMap(CLEFAIRY.movesetRanks);

        CLEFABLE.movesetRanks.put(Moveset.of(ZEN_HEADBUTT, DAZZLING_GLEAM), MovesetRating.of("F6", "A1"));
        CLEFABLE.movesetRanks.put(Moveset.of(POUND, Move.PSYCHIC), MovesetRating.of("C2", "C3"));
        CLEFABLE.movesetRanks.put(Moveset.of(POUND, MOONBLAST), MovesetRating.of("A1", "D6"));
        CLEFABLE.movesetRanks.put(Moveset.of(ZEN_HEADBUTT, MOONBLAST), MovesetRating.of("C3", "C4"));
        CLEFABLE.movesetRanks.put(Moveset.of(ZEN_HEADBUTT, Move.PSYCHIC), MovesetRating.of("D5", "C5"));
        CLEFABLE.movesetRanks.put(Moveset.of(POUND, DAZZLING_GLEAM), MovesetRating.of("D4", "A2"));
        CLEFABLE.movesetRanks = Collections.unmodifiableMap(CLEFABLE.movesetRanks);

        VULPIX.movesetRanks.put(Moveset.of(EMBER, FLAMETHROWER), MovesetRating.of("A1", "A1"));
        VULPIX.movesetRanks = Collections.unmodifiableMap(VULPIX.movesetRanks);

        NINETALES.movesetRanks.put(Moveset.of(EMBER, FIRE_BLAST), MovesetRating.of("A1", "C3"));
        NINETALES.movesetRanks.put(Moveset.of(EMBER, HEAT_WAVE), MovesetRating.of("B4", "D5"));
        NINETALES.movesetRanks.put(Moveset.of(EMBER, FLAMETHROWER), MovesetRating.of("B3", "B2"));
        NINETALES.movesetRanks.put(Moveset.of(FEINT_ATTACK, FLAMETHROWER), MovesetRating.of("B5", "A1"));
        NINETALES.movesetRanks.put(Moveset.of(FEINT_ATTACK, FIRE_BLAST), MovesetRating.of("A2", "C4"));
        NINETALES.movesetRanks.put(Moveset.of(FEINT_ATTACK, HEAT_WAVE), MovesetRating.of("B6", "D6"));
        NINETALES.movesetRanks = Collections.unmodifiableMap(NINETALES.movesetRanks);

        JIGGLYPUFF.movesetRanks.put(Moveset.of(FEINT_ATTACK, DAZZLING_GLEAM), MovesetRating.of(null, "A1"));
        JIGGLYPUFF.movesetRanks.put(Moveset.of(POUND, BODY_SLAM), MovesetRating.of("A1", null));
        JIGGLYPUFF.movesetRanks = Collections.unmodifiableMap(JIGGLYPUFF.movesetRanks);

        WIGGLYTUFF.movesetRanks.put(Moveset.of(FEINT_ATTACK, DAZZLING_GLEAM), MovesetRating.of("D6", "B4"));
        WIGGLYTUFF.movesetRanks.put(Moveset.of(FEINT_ATTACK, PLAY_ROUGH), MovesetRating.of("D5", "A2"));
        WIGGLYTUFF.movesetRanks.put(Moveset.of(FEINT_ATTACK, HYPER_BEAM), MovesetRating.of("C3", "C6"));
        WIGGLYTUFF.movesetRanks.put(Moveset.of(POUND, HYPER_BEAM), MovesetRating.of("A1", "B3"));
        WIGGLYTUFF.movesetRanks.put(Moveset.of(POUND, PLAY_ROUGH), MovesetRating.of("A2", "A1"));
        WIGGLYTUFF.movesetRanks.put(Moveset.of(POUND, DAZZLING_GLEAM), MovesetRating.of("C4", "C5"));
        WIGGLYTUFF.movesetRanks = Collections.unmodifiableMap(WIGGLYTUFF.movesetRanks);

        ZUBAT.movesetRanks.put(Moveset.of(BITE, SLUDGE_BOMB), MovesetRating.of("A1", null));
        ZUBAT.movesetRanks.put(Moveset.of(QUICK_ATTACK, SLUDGE_BOMB), MovesetRating.of(null, "A1"));
        ZUBAT.movesetRanks = Collections.unmodifiableMap(ZUBAT.movesetRanks);

        GOLBAT.movesetRanks.put(Moveset.of(BITE, POISON_FANG), MovesetRating.of("C5", "A2"));
        GOLBAT.movesetRanks.put(Moveset.of(WING_ATTACK, AIR_CUTTER), MovesetRating.of("A2", "C3"));
        GOLBAT.movesetRanks.put(Moveset.of(WING_ATTACK, POISON_FANG), MovesetRating.of("A1", "A1"));
        GOLBAT.movesetRanks.put(Moveset.of(BITE, OMINOUS_WIND), MovesetRating.of("C6", "F5"));
        GOLBAT.movesetRanks.put(Moveset.of(BITE, AIR_CUTTER), MovesetRating.of("C4", "C4"));
        GOLBAT.movesetRanks.put(Moveset.of(WING_ATTACK, OMINOUS_WIND), MovesetRating.of("A3", "F6"));
        GOLBAT.movesetRanks = Collections.unmodifiableMap(GOLBAT.movesetRanks);

        ODDISH.movesetRanks.put(Moveset.of(RAZOR_LEAF, SLUDGE_BOMB), MovesetRating.of("A1", "A1"));
        ODDISH.movesetRanks = Collections.unmodifiableMap(ODDISH.movesetRanks);

        GLOOM.movesetRanks.put(Moveset.of(RAZOR_LEAF, PETAL_BLIZZARD), MovesetRating.of("A1", "A1"));
        GLOOM.movesetRanks = Collections.unmodifiableMap(GLOOM.movesetRanks);

        VILEPLUME.movesetRanks.put(Moveset.of(ACID, PETAL_BLIZZARD), MovesetRating.of("B4", "B2"));
        VILEPLUME.movesetRanks.put(Moveset.of(RAZOR_LEAF, MOONBLAST), MovesetRating.of("C5", "D5"));
        VILEPLUME.movesetRanks.put(Moveset.of(RAZOR_LEAF, PETAL_BLIZZARD), MovesetRating.of("A2", "A1"));
        VILEPLUME.movesetRanks.put(Moveset.of(ACID, SOLAR_BEAM), MovesetRating.of("B3", "B4"));
        VILEPLUME.movesetRanks.put(Moveset.of(ACID, MOONBLAST), MovesetRating.of("C6", "F6"));
        VILEPLUME.movesetRanks.put(Moveset.of(RAZOR_LEAF, SOLAR_BEAM), MovesetRating.of("A1", "B3"));
        VILEPLUME.movesetRanks = Collections.unmodifiableMap(VILEPLUME.movesetRanks);

        PARAS.movesetRanks.put(Moveset.of(BUG_BITE, SEED_BOMB), MovesetRating.of("A1", "A1"));
        PARAS.movesetRanks = Collections.unmodifiableMap(PARAS.movesetRanks);

        PARASECT.movesetRanks.put(Moveset.of(FURY_CUTTER, SOLAR_BEAM), MovesetRating.of("B2", "B6"));
        PARASECT.movesetRanks.put(Moveset.of(FURY_CUTTER, X_SCISSOR), MovesetRating.of("D5", "A5"));
        PARASECT.movesetRanks.put(Moveset.of(FURY_CUTTER, CROSS_POISON), MovesetRating.of("F6", "A4"));
        PARASECT.movesetRanks.put(Moveset.of(BUG_BITE, X_SCISSOR), MovesetRating.of("B3", "A3"));
        PARASECT.movesetRanks.put(Moveset.of(BUG_BITE, SOLAR_BEAM), MovesetRating.of("A1", "A1"));
        PARASECT.movesetRanks.put(Moveset.of(BUG_BITE, CROSS_POISON), MovesetRating.of("D4", "A2"));
        PARASECT.movesetRanks = Collections.unmodifiableMap(PARASECT.movesetRanks);

        VENONAT.movesetRanks.put(Moveset.of(CONFUSION, SIGNAL_BEAM), MovesetRating.of(null, "A1"));
        VENONAT.movesetRanks.put(Moveset.of(BUG_BITE, SIGNAL_BEAM), MovesetRating.of("A1", null));
        VENONAT.movesetRanks = Collections.unmodifiableMap(VENONAT.movesetRanks);

        VENOMOTH.movesetRanks.put(Moveset.of(BUG_BITE, BUG_BUZZ), MovesetRating.of("A1", "B2"));
        VENOMOTH.movesetRanks.put(Moveset.of(CONFUSION, POISON_FANG), MovesetRating.of("F6", "B3"));
        VENOMOTH.movesetRanks.put(Moveset.of(CONFUSION, BUG_BUZZ), MovesetRating.of("C4", "A1"));
        VENOMOTH.movesetRanks.put(Moveset.of(CONFUSION, Move.PSYCHIC), MovesetRating.of("D5", "C5"));
        VENOMOTH.movesetRanks.put(Moveset.of(BUG_BITE, Move.PSYCHIC), MovesetRating.of("B2", "D6"));
        VENOMOTH.movesetRanks.put(Moveset.of(BUG_BITE, POISON_FANG), MovesetRating.of("C3", "C4"));
        VENOMOTH.movesetRanks = Collections.unmodifiableMap(VENOMOTH.movesetRanks);

        DIGLETT.movesetRanks = Collections.unmodifiableMap(DIGLETT.movesetRanks);

        DUGTRIO.movesetRanks.put(Moveset.of(SUCKER_PUNCH, MUD_BOMB), MovesetRating.of("C6", "A2"));
        DUGTRIO.movesetRanks.put(Moveset.of(SUCKER_PUNCH, STONE_EDGE), MovesetRating.of("B4", "F6"));
        DUGTRIO.movesetRanks.put(Moveset.of(MUD_SLAP, MUD_BOMB), MovesetRating.of("C5", "A1"));
        DUGTRIO.movesetRanks.put(Moveset.of(SUCKER_PUNCH, EARTHQUAKE), MovesetRating.of("A2", "B5"));
        DUGTRIO.movesetRanks.put(Moveset.of(MUD_SLAP, STONE_EDGE), MovesetRating.of("B3", "B4"));
        DUGTRIO.movesetRanks.put(Moveset.of(MUD_SLAP, EARTHQUAKE), MovesetRating.of("A1", "A3"));
        DUGTRIO.movesetRanks = Collections.unmodifiableMap(DUGTRIO.movesetRanks);

        MEOWTH.movesetRanks.put(Moveset.of(SCRATCH, BODY_SLAM), MovesetRating.of("A1", "A1"));
        MEOWTH.movesetRanks = Collections.unmodifiableMap(MEOWTH.movesetRanks);

        PERSIAN.movesetRanks.put(Moveset.of(SCRATCH, NIGHT_SLASH), MovesetRating.of("A2", "A4"));
        PERSIAN.movesetRanks.put(Moveset.of(FEINT_ATTACK, POWER_GEM), MovesetRating.of("D6", "A3"));
        PERSIAN.movesetRanks.put(Moveset.of(SCRATCH, POWER_GEM), MovesetRating.of("A3", "A6"));
        PERSIAN.movesetRanks.put(Moveset.of(FEINT_ATTACK, PLAY_ROUGH), MovesetRating.of("C4", "A1"));
        PERSIAN.movesetRanks.put(Moveset.of(FEINT_ATTACK, NIGHT_SLASH), MovesetRating.of("D5", "A2"));
        PERSIAN.movesetRanks.put(Moveset.of(SCRATCH, PLAY_ROUGH), MovesetRating.of("A1", "A5"));
        PERSIAN.movesetRanks = Collections.unmodifiableMap(PERSIAN.movesetRanks);

        PSYDUCK.movesetRanks.put(Moveset.of(ZEN_HEADBUTT, AQUA_TAIL), MovesetRating.of(null, "A1"));
        PSYDUCK.movesetRanks.put(Moveset.of(WATER_GUN, AQUA_TAIL), MovesetRating.of("A1", null));
        PSYDUCK.movesetRanks = Collections.unmodifiableMap(PSYDUCK.movesetRanks);

        GOLDUCK.movesetRanks.put(Moveset.of(CONFUSION, ICE_BEAM), MovesetRating.of("F5", "A1"));
        GOLDUCK.movesetRanks.put(Moveset.of(WATER_GUN, ICE_BEAM), MovesetRating.of("D3", "B4"));
        GOLDUCK.movesetRanks.put(Moveset.of(WATER_GUN, Move.PSYCHIC), MovesetRating.of("C2", "B5"));
        GOLDUCK.movesetRanks.put(Moveset.of(CONFUSION, HYDRO_PUMP), MovesetRating.of("F4", "B3"));
        GOLDUCK.movesetRanks.put(Moveset.of(CONFUSION, Move.PSYCHIC), MovesetRating.of("F6", "A2"));
        GOLDUCK.movesetRanks.put(Moveset.of(WATER_GUN, HYDRO_PUMP), MovesetRating.of("A1", "C6"));
        GOLDUCK.movesetRanks = Collections.unmodifiableMap(GOLDUCK.movesetRanks);

        MANKEY.movesetRanks.put(Moveset.of(SCRATCH, LOW_SWEEP), MovesetRating.of(null, "A1"));
        MANKEY.movesetRanks.put(Moveset.of(SCRATCH, CROSS_CHOP), MovesetRating.of("A1", null));
        MANKEY.movesetRanks = Collections.unmodifiableMap(MANKEY.movesetRanks);

        PRIMEAPE.movesetRanks.put(Moveset.of(KARATE_CHOP, LOW_SWEEP), MovesetRating.of("C4", "A2"));
        PRIMEAPE.movesetRanks.put(Moveset.of(LOW_KICK, NIGHT_SLASH), MovesetRating.of("F6", "C3"));
        PRIMEAPE.movesetRanks.put(Moveset.of(KARATE_CHOP, CROSS_CHOP), MovesetRating.of("B2", "F5"));
        PRIMEAPE.movesetRanks.put(Moveset.of(LOW_KICK, LOW_SWEEP), MovesetRating.of("C3", "A1"));
        PRIMEAPE.movesetRanks.put(Moveset.of(LOW_KICK, CROSS_CHOP), MovesetRating.of("A1", "F6"));
        PRIMEAPE.movesetRanks.put(Moveset.of(KARATE_CHOP, NIGHT_SLASH), MovesetRating.of("F5", "C4"));
        PRIMEAPE.movesetRanks = Collections.unmodifiableMap(PRIMEAPE.movesetRanks);

        GROWLITHE.movesetRanks.put(Moveset.of(BITE, FLAMETHROWER), MovesetRating.of("A1", null));
        GROWLITHE.movesetRanks.put(Moveset.of(EMBER, FLAMETHROWER), MovesetRating.of(null, "A1"));
        GROWLITHE.movesetRanks = Collections.unmodifiableMap(GROWLITHE.movesetRanks);

        ARCANINE.movesetRanks.put(Moveset.of(BITE, BULLDOZE), MovesetRating.of("F6", "D6"));
        ARCANINE.movesetRanks.put(Moveset.of(BITE, FIRE_BLAST), MovesetRating.of("A2", "C4"));
        ARCANINE.movesetRanks.put(Moveset.of(FIRE_FANG, FIRE_BLAST), MovesetRating.of("A1", "B2"));
        ARCANINE.movesetRanks.put(Moveset.of(BITE, FLAMETHROWER), MovesetRating.of("B4", "B3"));
        ARCANINE.movesetRanks.put(Moveset.of(FIRE_FANG, FLAMETHROWER), MovesetRating.of("B3", "A1"));
        ARCANINE.movesetRanks.put(Moveset.of(FIRE_FANG, BULLDOZE), MovesetRating.of("C5", "C5"));
        ARCANINE.movesetRanks = Collections.unmodifiableMap(ARCANINE.movesetRanks);

        POLIWAG.movesetRanks.put(Moveset.of(BUBBLE, BODY_SLAM), MovesetRating.of("A1", "A1"));
        POLIWAG.movesetRanks = Collections.unmodifiableMap(POLIWAG.movesetRanks);

        POLIWHIRL.movesetRanks.put(Moveset.of(BUBBLE, SCALD), MovesetRating.of("A1", "A1"));
        POLIWHIRL.movesetRanks = Collections.unmodifiableMap(POLIWHIRL.movesetRanks);

        POLIWRATH.movesetRanks.put(Moveset.of(MUD_SHOT, ICE_PUNCH), MovesetRating.of("F6", "F5"));
        POLIWRATH.movesetRanks.put(Moveset.of(MUD_SHOT, SUBMISSION), MovesetRating.of("C4", "F6"));
        POLIWRATH.movesetRanks.put(Moveset.of(BUBBLE, ICE_PUNCH), MovesetRating.of("D5", "A1"));
        POLIWRATH.movesetRanks.put(Moveset.of(BUBBLE, SUBMISSION), MovesetRating.of("C3", "A3"));
        POLIWRATH.movesetRanks.put(Moveset.of(MUD_SHOT, HYDRO_PUMP), MovesetRating.of("A2", "F4"));
        POLIWRATH.movesetRanks.put(Moveset.of(BUBBLE, HYDRO_PUMP), MovesetRating.of("A1", "A2"));
        POLIWRATH.movesetRanks = Collections.unmodifiableMap(POLIWRATH.movesetRanks);

        ABRA.movesetRanks.put(Moveset.of(ZEN_HEADBUTT, PSYSHOCK), MovesetRating.of("A1", "A1"));
        ABRA.movesetRanks = Collections.unmodifiableMap(ABRA.movesetRanks);

        KADABRA.movesetRanks.put(Moveset.of(PSYCHO_CUT, SHADOW_BALL), MovesetRating.of("A1", null));
        KADABRA.movesetRanks.put(Moveset.of(CONFUSION, PSYBEAM), MovesetRating.of(null, "A1"));
        KADABRA.movesetRanks = Collections.unmodifiableMap(KADABRA.movesetRanks);

        ALAKAZAM.movesetRanks.put(Moveset.of(PSYCHO_CUT, Move.PSYCHIC), MovesetRating.of("A1", "B2"));
        ALAKAZAM.movesetRanks.put(Moveset.of(PSYCHO_CUT, DAZZLING_GLEAM), MovesetRating.of("B3", "C5"));
        ALAKAZAM.movesetRanks.put(Moveset.of(CONFUSION, DAZZLING_GLEAM), MovesetRating.of("D6", "B4"));
        ALAKAZAM.movesetRanks.put(Moveset.of(CONFUSION, Move.PSYCHIC), MovesetRating.of("B2", "A1"));
        ALAKAZAM.movesetRanks.put(Moveset.of(PSYCHO_CUT, SHADOW_BALL), MovesetRating.of("B4", "C6"));
        ALAKAZAM.movesetRanks.put(Moveset.of(CONFUSION, SHADOW_BALL), MovesetRating.of("D5", "B3"));
        ALAKAZAM.movesetRanks = Collections.unmodifiableMap(ALAKAZAM.movesetRanks);

        MACHOP.movesetRanks.put(Moveset.of(KARATE_CHOP, LOW_SWEEP), MovesetRating.of(null, "A1"));
        MACHOP.movesetRanks.put(Moveset.of(LOW_KICK, CROSS_CHOP), MovesetRating.of("A1", null));
        MACHOP.movesetRanks = Collections.unmodifiableMap(MACHOP.movesetRanks);

        MACHOKE.movesetRanks.put(Moveset.of(KARATE_CHOP, BRICK_BREAK), MovesetRating.of(null, "A1"));
        MACHOKE.movesetRanks.put(Moveset.of(LOW_KICK, CROSS_CHOP), MovesetRating.of("A1", null));
        MACHOKE.movesetRanks = Collections.unmodifiableMap(MACHOKE.movesetRanks);

        MACHAMP.movesetRanks.put(Moveset.of(KARATE_CHOP, CROSS_CHOP), MovesetRating.of("A1", "D5"));
        MACHAMP.movesetRanks.put(Moveset.of(BULLET_PUNCH, SUBMISSION), MovesetRating.of("D6", "A1"));
        MACHAMP.movesetRanks.put(Moveset.of(BULLET_PUNCH, STONE_EDGE), MovesetRating.of("D5", "D4"));
        MACHAMP.movesetRanks.put(Moveset.of(BULLET_PUNCH, CROSS_CHOP), MovesetRating.of("C4", "D3"));
        MACHAMP.movesetRanks.put(Moveset.of(KARATE_CHOP, SUBMISSION), MovesetRating.of("C3", "B2"));
        MACHAMP.movesetRanks.put(Moveset.of(KARATE_CHOP, STONE_EDGE), MovesetRating.of("B2", "D6"));
        MACHAMP.movesetRanks = Collections.unmodifiableMap(MACHAMP.movesetRanks);

        BELLSPROUT.movesetRanks.put(Moveset.of(VINE_WHIP, SLUDGE_BOMB), MovesetRating.of("A1", null));
        BELLSPROUT.movesetRanks.put(Moveset.of(ACID, SLUDGE_BOMB), MovesetRating.of(null, "A1"));
        BELLSPROUT.movesetRanks = Collections.unmodifiableMap(BELLSPROUT.movesetRanks);

        WEEPINBELL.movesetRanks.put(Moveset.of(RAZOR_LEAF, SLUDGE_BOMB), MovesetRating.of("A1", "A1"));
        WEEPINBELL.movesetRanks = Collections.unmodifiableMap(WEEPINBELL.movesetRanks);

        VICTREEBEL.movesetRanks.put(Moveset.of(RAZOR_LEAF, SLUDGE_BOMB), MovesetRating.of("B3", "A1"));
        VICTREEBEL.movesetRanks.put(Moveset.of(ACID, SOLAR_BEAM), MovesetRating.of("B5", "C5"));
        VICTREEBEL.movesetRanks.put(Moveset.of(RAZOR_LEAF, LEAF_BLADE), MovesetRating.of("A2", "B3"));
        VICTREEBEL.movesetRanks.put(Moveset.of(ACID, LEAF_BLADE), MovesetRating.of("B6", "C6"));
        VICTREEBEL.movesetRanks.put(Moveset.of(RAZOR_LEAF, SOLAR_BEAM), MovesetRating.of("A1", "B2"));
        VICTREEBEL.movesetRanks.put(Moveset.of(ACID, SLUDGE_BOMB), MovesetRating.of("B4", "C4"));
        VICTREEBEL.movesetRanks = Collections.unmodifiableMap(VICTREEBEL.movesetRanks);

        TENTACOOL.movesetRanks.put(Moveset.of(BUBBLE, WATER_PULSE), MovesetRating.of("A1", "A1"));
        TENTACOOL.movesetRanks = Collections.unmodifiableMap(TENTACOOL.movesetRanks);

        TENTACRUEL.movesetRanks.put(Moveset.of(POISON_JAB, HYDRO_PUMP), MovesetRating.of("A1", "A1"));
        TENTACRUEL.movesetRanks.put(Moveset.of(POISON_JAB, SLUDGE_WAVE), MovesetRating.of("C4", "B4"));
        TENTACRUEL.movesetRanks.put(Moveset.of(ACID, BLIZZARD), MovesetRating.of("C5", "B5"));
        TENTACRUEL.movesetRanks.put(Moveset.of(ACID, SLUDGE_WAVE), MovesetRating.of("D6", "C6"));
        TENTACRUEL.movesetRanks.put(Moveset.of(ACID, HYDRO_PUMP), MovesetRating.of("C3", "B3"));
        TENTACRUEL.movesetRanks.put(Moveset.of(POISON_JAB, BLIZZARD), MovesetRating.of("B2", "A2"));
        TENTACRUEL.movesetRanks = Collections.unmodifiableMap(TENTACRUEL.movesetRanks);

        GEODUDE.movesetRanks.put(Moveset.of(ROCK_THROW, ROCK_SLIDE), MovesetRating.of("A1", null));
        GEODUDE.movesetRanks.put(Moveset.of(ROCK_THROW, DIG), MovesetRating.of(null, "A1"));
        GEODUDE.movesetRanks = Collections.unmodifiableMap(GEODUDE.movesetRanks);

        GRAVELER.movesetRanks.put(Moveset.of(MUD_SLAP, DIG), MovesetRating.of(null, "A1"));
        GRAVELER.movesetRanks.put(Moveset.of(MUD_SLAP, STONE_EDGE), MovesetRating.of("A1", null));
        GRAVELER.movesetRanks = Collections.unmodifiableMap(GRAVELER.movesetRanks);

        GOLEM.movesetRanks.put(Moveset.of(ROCK_THROW, ANCIENT_POWER), MovesetRating.of("F6", "A5"));
        GOLEM.movesetRanks.put(Moveset.of(MUD_SLAP, ANCIENT_POWER), MovesetRating.of("D5", "A2"));
        GOLEM.movesetRanks.put(Moveset.of(MUD_SLAP, EARTHQUAKE), MovesetRating.of("A1", "A1"));
        GOLEM.movesetRanks.put(Moveset.of(ROCK_THROW, EARTHQUAKE), MovesetRating.of("B3", "A3"));
        GOLEM.movesetRanks.put(Moveset.of(MUD_SLAP, STONE_EDGE), MovesetRating.of("A2", "A4"));
        GOLEM.movesetRanks.put(Moveset.of(ROCK_THROW, STONE_EDGE), MovesetRating.of("B4", "B6"));
        GOLEM.movesetRanks = Collections.unmodifiableMap(GOLEM.movesetRanks);

        PONYTA.movesetRanks.put(Moveset.of(EMBER, FIRE_BLAST), MovesetRating.of("A1", "A1"));
        PONYTA.movesetRanks = Collections.unmodifiableMap(PONYTA.movesetRanks);

        RAPIDASH.movesetRanks.put(Moveset.of(LOW_KICK, FIRE_BLAST), MovesetRating.of("B3", "D5"));
        RAPIDASH.movesetRanks.put(Moveset.of(EMBER, FIRE_BLAST), MovesetRating.of("A1", "B2"));
        RAPIDASH.movesetRanks.put(Moveset.of(EMBER, HEAT_WAVE), MovesetRating.of("B2", "C4"));
        RAPIDASH.movesetRanks.put(Moveset.of(EMBER, DRILL_RUN), MovesetRating.of("D5", "A1"));
        RAPIDASH.movesetRanks.put(Moveset.of(LOW_KICK, HEAT_WAVE), MovesetRating.of("C4", "F6"));
        RAPIDASH.movesetRanks.put(Moveset.of(LOW_KICK, DRILL_RUN), MovesetRating.of("F6", "B3"));
        RAPIDASH.movesetRanks = Collections.unmodifiableMap(RAPIDASH.movesetRanks);

        SLOWPOKE.movesetRanks.put(Moveset.of(WATER_GUN, Move.PSYCHIC), MovesetRating.of("A1", null));
        SLOWPOKE.movesetRanks.put(Moveset.of(CONFUSION, Move.PSYCHIC), MovesetRating.of(null, "A1"));
        SLOWPOKE.movesetRanks = Collections.unmodifiableMap(SLOWPOKE.movesetRanks);

        SLOWBRO.movesetRanks.put(Moveset.of(CONFUSION, ICE_BEAM), MovesetRating.of("D5", "B3"));
        SLOWBRO.movesetRanks.put(Moveset.of(WATER_GUN, Move.PSYCHIC), MovesetRating.of("A1", "C5"));
        SLOWBRO.movesetRanks.put(Moveset.of(WATER_GUN, ICE_BEAM), MovesetRating.of("C3", "D6"));
        SLOWBRO.movesetRanks.put(Moveset.of(CONFUSION, Move.PSYCHIC), MovesetRating.of("C4", "A1"));
        SLOWBRO.movesetRanks.put(Moveset.of(CONFUSION, WATER_PULSE), MovesetRating.of("F6", "B2"));
        SLOWBRO.movesetRanks.put(Moveset.of(WATER_GUN, WATER_PULSE), MovesetRating.of("C2", "C4"));
        SLOWBRO.movesetRanks = Collections.unmodifiableMap(SLOWBRO.movesetRanks);

        MAGNEMITE.movesetRanks.put(Moveset.of(SPARK, THUNDERBOLT), MovesetRating.of("A1", "A1"));
        MAGNEMITE.movesetRanks = Collections.unmodifiableMap(MAGNEMITE.movesetRanks);

        MAGNETON.movesetRanks.put(Moveset.of(THUNDER_SHOCK, DISCHARGE), MovesetRating.of("B5", "D5"));
        MAGNETON.movesetRanks.put(Moveset.of(THUNDER_SHOCK, FLASH_CANNON), MovesetRating.of("A3", "A2"));
        MAGNETON.movesetRanks.put(Moveset.of(SPARK, DISCHARGE), MovesetRating.of("A2", "D3"));
        MAGNETON.movesetRanks.put(Moveset.of(SPARK, MAGNET_BOMB), MovesetRating.of("B4", "D4"));
        MAGNETON.movesetRanks.put(Moveset.of(THUNDER_SHOCK, MAGNET_BOMB), MovesetRating.of("D6", "D6"));
        MAGNETON.movesetRanks.put(Moveset.of(SPARK, FLASH_CANNON), MovesetRating.of("A1", "A1"));
        MAGNETON.movesetRanks = Collections.unmodifiableMap(MAGNETON.movesetRanks);

        FARFETCHD.movesetRanks.put(Moveset.of(CUT, AERIAL_ACE), MovesetRating.of("B4", "A1"));
        FARFETCHD.movesetRanks.put(Moveset.of(FURY_CUTTER, LEAF_BLADE), MovesetRating.of("B2", "B3"));
        FARFETCHD.movesetRanks.put(Moveset.of(FURY_CUTTER, AIR_CUTTER), MovesetRating.of("F6", "C6"));
        FARFETCHD.movesetRanks.put(Moveset.of(CUT, AIR_CUTTER), MovesetRating.of("B3", "B4"));
        FARFETCHD.movesetRanks.put(Moveset.of(CUT, LEAF_BLADE), MovesetRating.of("A1", "B5"));
        FARFETCHD.movesetRanks.put(Moveset.of(FURY_CUTTER, AERIAL_ACE), MovesetRating.of("F5", "B2"));
        FARFETCHD.movesetRanks = Collections.unmodifiableMap(FARFETCHD.movesetRanks);

        DODUO.movesetRanks.put(Moveset.of(PECK, DRILL_PECK), MovesetRating.of("A1", null));
        DODUO.movesetRanks.put(Moveset.of(QUICK_ATTACK, DRILL_PECK), MovesetRating.of(null, "A1"));
        DODUO.movesetRanks = Collections.unmodifiableMap(DODUO.movesetRanks);

        DODRIO.movesetRanks.put(Moveset.of(FEINT_ATTACK, AIR_CUTTER), MovesetRating.of("C5", "B5"));
        DODRIO.movesetRanks.put(Moveset.of(STEEL_WING, DRILL_PECK), MovesetRating.of("A2", "A1"));
        DODRIO.movesetRanks.put(Moveset.of(FEINT_ATTACK, AERIAL_ACE), MovesetRating.of("C3", "B3"));
        DODRIO.movesetRanks.put(Moveset.of(STEEL_WING, AERIAL_ACE), MovesetRating.of("C6", "B4"));
        DODRIO.movesetRanks.put(Moveset.of(STEEL_WING, AIR_CUTTER), MovesetRating.of("C4", "B6"));
        DODRIO.movesetRanks.put(Moveset.of(FEINT_ATTACK, DRILL_PECK), MovesetRating.of("A1", "A2"));
        DODRIO.movesetRanks = Collections.unmodifiableMap(DODRIO.movesetRanks);

        SEEL.movesetRanks.put(Moveset.of(ICE_SHARD, AQUA_TAIL), MovesetRating.of(null, "A1"));
        SEEL.movesetRanks.put(Moveset.of(LICK, AQUA_TAIL), MovesetRating.of("A1", null));
        SEEL.movesetRanks = Collections.unmodifiableMap(SEEL.movesetRanks);

        DEWGONG.movesetRanks.put(Moveset.of(ICE_SHARD, AQUA_JET), MovesetRating.of("D5", "A2"));
        DEWGONG.movesetRanks.put(Moveset.of(FROST_BREATH, AQUA_JET), MovesetRating.of("D3", "B3"));
        DEWGONG.movesetRanks.put(Moveset.of(ICE_SHARD, BLIZZARD), MovesetRating.of("B2", "A1"));
        DEWGONG.movesetRanks.put(Moveset.of(FROST_BREATH, ICY_WIND), MovesetRating.of("D4", "F5"));
        DEWGONG.movesetRanks.put(Moveset.of(FROST_BREATH, BLIZZARD), MovesetRating.of("A1", "C4"));
        DEWGONG.movesetRanks.put(Moveset.of(ICE_SHARD, ICY_WIND), MovesetRating.of("D6", "F6"));
        DEWGONG.movesetRanks = Collections.unmodifiableMap(DEWGONG.movesetRanks);

        GRIMER.movesetRanks.put(Moveset.of(POISON_JAB, SLUDGE_BOMB), MovesetRating.of("A1", "A1"));
        GRIMER.movesetRanks = Collections.unmodifiableMap(GRIMER.movesetRanks);

        MUK.movesetRanks.put(Moveset.of(POISON_JAB, DARK_PULSE), MovesetRating.of("C5", "A1"));
        MUK.movesetRanks.put(Moveset.of(LICK, SLUDGE_WAVE), MovesetRating.of("B4", "F5"));
        MUK.movesetRanks.put(Moveset.of(POISON_JAB, SLUDGE_WAVE), MovesetRating.of("A2", "B2"));
        MUK.movesetRanks.put(Moveset.of(LICK, DARK_PULSE), MovesetRating.of("D6", "C4"));
        MUK.movesetRanks.put(Moveset.of(POISON_JAB, GUNK_SHOT), MovesetRating.of("A1", "B3"));
        MUK.movesetRanks.put(Moveset.of(LICK, GUNK_SHOT), MovesetRating.of("B3", "F6"));
        MUK.movesetRanks = Collections.unmodifiableMap(MUK.movesetRanks);

        SHELLDER.movesetRanks.put(Moveset.of(TACKLE, WATER_PULSE), MovesetRating.of("A1", null));
        SHELLDER.movesetRanks.put(Moveset.of(ICE_SHARD, WATER_PULSE), MovesetRating.of(null, "A1"));
        SHELLDER.movesetRanks = Collections.unmodifiableMap(SHELLDER.movesetRanks);

        CLOYSTER.movesetRanks.put(Moveset.of(FROST_BREATH, HYDRO_PUMP), MovesetRating.of("B3", "B4"));
        CLOYSTER.movesetRanks.put(Moveset.of(ICE_SHARD, HYDRO_PUMP), MovesetRating.of("B4", "A2"));
        CLOYSTER.movesetRanks.put(Moveset.of(ICE_SHARD, BLIZZARD), MovesetRating.of("A2", "A1"));
        CLOYSTER.movesetRanks.put(Moveset.of(FROST_BREATH, ICY_WIND), MovesetRating.of("C5", "C5"));
        CLOYSTER.movesetRanks.put(Moveset.of(FROST_BREATH, BLIZZARD), MovesetRating.of("A1", "B3"));
        CLOYSTER.movesetRanks.put(Moveset.of(ICE_SHARD, ICY_WIND), MovesetRating.of("C6", "C6"));
        CLOYSTER.movesetRanks = Collections.unmodifiableMap(CLOYSTER.movesetRanks);

        GASTLY.movesetRanks.put(Moveset.of(LICK, SLUDGE_BOMB), MovesetRating.of("A1", null));
        GASTLY.movesetRanks.put(Moveset.of(SUCKER_PUNCH, SLUDGE_BOMB), MovesetRating.of(null, "A1"));
        GASTLY.movesetRanks = Collections.unmodifiableMap(GASTLY.movesetRanks);

        HAUNTER.movesetRanks.put(Moveset.of(SHADOW_CLAW, SHADOW_BALL), MovesetRating.of(null, "A1"));
        HAUNTER.movesetRanks.put(Moveset.of(SHADOW_CLAW, SLUDGE_BOMB), MovesetRating.of("A1", null));
        HAUNTER.movesetRanks = Collections.unmodifiableMap(HAUNTER.movesetRanks);

        GENGAR.movesetRanks.put(Moveset.of(SHADOW_CLAW, SHADOW_BALL), MovesetRating.of("C3", "A1"));
        GENGAR.movesetRanks.put(Moveset.of(SUCKER_PUNCH, SHADOW_BALL), MovesetRating.of("C4", "B2"));
        GENGAR.movesetRanks.put(Moveset.of(SUCKER_PUNCH, DARK_PULSE), MovesetRating.of("F6", "D5"));
        GENGAR.movesetRanks.put(Moveset.of(SHADOW_CLAW, SLUDGE_BOMB), MovesetRating.of("A1", "B3"));
        GENGAR.movesetRanks.put(Moveset.of(SHADOW_CLAW, DARK_PULSE), MovesetRating.of("C5", "D6"));
        GENGAR.movesetRanks.put(Moveset.of(SUCKER_PUNCH, SLUDGE_BOMB), MovesetRating.of("B2", "C4"));
        GENGAR.movesetRanks = Collections.unmodifiableMap(GENGAR.movesetRanks);

        ONIX.movesetRanks.put(Moveset.of(TACKLE, IRON_HEAD), MovesetRating.of("C5", "D4"));
        ONIX.movesetRanks.put(Moveset.of(ROCK_THROW, IRON_HEAD), MovesetRating.of("C6", "D6"));
        ONIX.movesetRanks.put(Moveset.of(TACKLE, STONE_EDGE), MovesetRating.of("A2", "D5"));
        ONIX.movesetRanks.put(Moveset.of(ROCK_THROW, ROCK_SLIDE), MovesetRating.of("A3", "A1"));
        ONIX.movesetRanks.put(Moveset.of(TACKLE, ROCK_SLIDE), MovesetRating.of("A1", "A2"));
        ONIX.movesetRanks.put(Moveset.of(ROCK_THROW, STONE_EDGE), MovesetRating.of("A4", "C3"));
        ONIX.movesetRanks = Collections.unmodifiableMap(ONIX.movesetRanks);

        DROWZEE.movesetRanks.put(Moveset.of(POUND, Move.PSYCHIC), MovesetRating.of("A1", null));
        DROWZEE.movesetRanks.put(Moveset.of(CONFUSION, Move.PSYCHIC), MovesetRating.of(null, "A1"));
        DROWZEE.movesetRanks = Collections.unmodifiableMap(DROWZEE.movesetRanks);

        HYPNO.movesetRanks.put(Moveset.of(CONFUSION, Move.PSYCHIC), MovesetRating.of("B2", "A1"));
        HYPNO.movesetRanks.put(Moveset.of(ZEN_HEADBUTT, Move.PSYCHIC), MovesetRating.of("A1", "B4"));
        HYPNO.movesetRanks.put(Moveset.of(CONFUSION, SHADOW_BALL), MovesetRating.of("F6", "C5"));
        HYPNO.movesetRanks.put(Moveset.of(ZEN_HEADBUTT, PSYSHOCK), MovesetRating.of("B3", "B3"));
        HYPNO.movesetRanks.put(Moveset.of(CONFUSION, PSYSHOCK), MovesetRating.of("C4", "A2"));
        HYPNO.movesetRanks.put(Moveset.of(ZEN_HEADBUTT, SHADOW_BALL), MovesetRating.of("C5", "C6"));
        HYPNO.movesetRanks = Collections.unmodifiableMap(HYPNO.movesetRanks);

        KRABBY.movesetRanks.put(Moveset.of(BUBBLE, WATER_PULSE), MovesetRating.of("A1", "A1"));
        KRABBY.movesetRanks = Collections.unmodifiableMap(KRABBY.movesetRanks);

        KINGLER.movesetRanks.put(Moveset.of(METAL_CLAW, X_SCISSOR), MovesetRating.of("A4", "D5"));
        KINGLER.movesetRanks.put(Moveset.of(MUD_SHOT, WATER_PULSE), MovesetRating.of("D5", "A2"));
        KINGLER.movesetRanks.put(Moveset.of(MUD_SHOT, X_SCISSOR), MovesetRating.of("A1", "D6"));
        KINGLER.movesetRanks.put(Moveset.of(METAL_CLAW, VICE_GRIP), MovesetRating.of("A2", "C3"));
        KINGLER.movesetRanks.put(Moveset.of(MUD_SHOT, VICE_GRIP), MovesetRating.of("D6", "C4"));
        KINGLER.movesetRanks.put(Moveset.of(METAL_CLAW, WATER_PULSE), MovesetRating.of("A3", "A1"));
        KINGLER.movesetRanks = Collections.unmodifiableMap(KINGLER.movesetRanks);

        VOLTORB.movesetRanks.put(Moveset.of(TACKLE, THUNDERBOLT), MovesetRating.of(null, "A1"));
        VOLTORB.movesetRanks.put(Moveset.of(SPARK, THUNDERBOLT), MovesetRating.of("A1", null));
        VOLTORB.movesetRanks = Collections.unmodifiableMap(VOLTORB.movesetRanks);

        ELECTRODE.movesetRanks.put(Moveset.of(SPARK, HYPER_BEAM), MovesetRating.of("B3", "C6"));
        ELECTRODE.movesetRanks.put(Moveset.of(TACKLE, DISCHARGE), MovesetRating.of("D6", "B3"));
        ELECTRODE.movesetRanks.put(Moveset.of(TACKLE, THUNDERBOLT), MovesetRating.of("B2", "A1"));
        ELECTRODE.movesetRanks.put(Moveset.of(SPARK, THUNDERBOLT), MovesetRating.of("A1", "B2"));
        ELECTRODE.movesetRanks.put(Moveset.of(SPARK, DISCHARGE), MovesetRating.of("C4", "B4"));
        ELECTRODE.movesetRanks.put(Moveset.of(TACKLE, HYPER_BEAM), MovesetRating.of("C5", "C5"));
        ELECTRODE.movesetRanks = Collections.unmodifiableMap(ELECTRODE.movesetRanks);

        EXEGGCUTE.movesetRanks.put(Moveset.of(CONFUSION, Move.PSYCHIC), MovesetRating.of("A1", "A1"));
        EXEGGCUTE.movesetRanks = Collections.unmodifiableMap(EXEGGCUTE.movesetRanks);

        EXEGGUTOR.movesetRanks.put(Moveset.of(CONFUSION, SEED_BOMB), MovesetRating.of("D6", "A3"));
        EXEGGUTOR.movesetRanks.put(Moveset.of(ZEN_HEADBUTT, SOLAR_BEAM), MovesetRating.of("A1", "B6"));
        EXEGGUTOR.movesetRanks.put(Moveset.of(CONFUSION, SOLAR_BEAM), MovesetRating.of("B3", "A2"));
        EXEGGUTOR.movesetRanks.put(Moveset.of(CONFUSION, Move.PSYCHIC), MovesetRating.of("C5", "A1"));
        EXEGGUTOR.movesetRanks.put(Moveset.of(ZEN_HEADBUTT, Move.PSYCHIC), MovesetRating.of("B2", "B4"));
        EXEGGUTOR.movesetRanks.put(Moveset.of(ZEN_HEADBUTT, SEED_BOMB), MovesetRating.of("C4", "B5"));
        EXEGGUTOR.movesetRanks = Collections.unmodifiableMap(EXEGGUTOR.movesetRanks);

        CUBONE.movesetRanks.put(Moveset.of(MUD_SLAP, DIG), MovesetRating.of(null, "A1"));
        CUBONE.movesetRanks.put(Moveset.of(MUD_SLAP, BONE_CLUB), MovesetRating.of("A1", null));
        CUBONE.movesetRanks = Collections.unmodifiableMap(CUBONE.movesetRanks);

        MAROWAK.movesetRanks.put(Moveset.of(ROCK_SMASH, EARTHQUAKE), MovesetRating.of("B3", "C6"));
        MAROWAK.movesetRanks.put(Moveset.of(ROCK_SMASH, BONE_CLUB), MovesetRating.of("C5", "B5"));
        MAROWAK.movesetRanks.put(Moveset.of(ROCK_SMASH, DIG), MovesetRating.of("F6", "A2"));
        MAROWAK.movesetRanks.put(Moveset.of(MUD_SLAP, DIG), MovesetRating.of("C4", "A1"));
        MAROWAK.movesetRanks.put(Moveset.of(MUD_SLAP, BONE_CLUB), MovesetRating.of("B2", "B3"));
        MAROWAK.movesetRanks.put(Moveset.of(MUD_SLAP, EARTHQUAKE), MovesetRating.of("A1", "B4"));
        MAROWAK.movesetRanks = Collections.unmodifiableMap(MAROWAK.movesetRanks);

        HITMONLEE.movesetRanks.put(Moveset.of(LOW_KICK, STONE_EDGE), MovesetRating.of("B6", "F6"));
        HITMONLEE.movesetRanks.put(Moveset.of(ROCK_SMASH, LOW_SWEEP), MovesetRating.of("A2", "B2"));
        HITMONLEE.movesetRanks.put(Moveset.of(LOW_KICK, BRICK_BREAK), MovesetRating.of("A4", "C4"));
        HITMONLEE.movesetRanks.put(Moveset.of(ROCK_SMASH, BRICK_BREAK), MovesetRating.of("A1", "A1"));
        HITMONLEE.movesetRanks.put(Moveset.of(LOW_KICK, LOW_SWEEP), MovesetRating.of("B5", "B3"));
        HITMONLEE.movesetRanks.put(Moveset.of(ROCK_SMASH, STONE_EDGE), MovesetRating.of("A3", "C5"));
        HITMONLEE.movesetRanks = Collections.unmodifiableMap(HITMONLEE.movesetRanks);

        HITMONCHAN.movesetRanks.put(Moveset.of(BULLET_PUNCH, THUNDER_PUNCH), MovesetRating.of("D8", "C8"));
        HITMONCHAN.movesetRanks.put(Moveset.of(ROCK_SMASH, THUNDER_PUNCH), MovesetRating.of("B2", "A2"));
        HITMONCHAN.movesetRanks.put(Moveset.of(BULLET_PUNCH, ICE_PUNCH), MovesetRating.of("D7", "C7"));
        HITMONCHAN.movesetRanks.put(Moveset.of(ROCK_SMASH, BRICK_BREAK), MovesetRating.of("A1", "A1"));
        HITMONCHAN.movesetRanks.put(Moveset.of(BULLET_PUNCH, BRICK_BREAK), MovesetRating.of("B5", "C5"));
        HITMONCHAN.movesetRanks.put(Moveset.of(ROCK_SMASH, FIRE_PUNCH), MovesetRating.of("B3", "B3"));
        HITMONCHAN.movesetRanks.put(Moveset.of(ROCK_SMASH, ICE_PUNCH), MovesetRating.of("B4", "B4"));
        HITMONCHAN.movesetRanks.put(Moveset.of(BULLET_PUNCH, FIRE_PUNCH), MovesetRating.of("D6", "C6"));
        HITMONCHAN.movesetRanks = Collections.unmodifiableMap(HITMONCHAN.movesetRanks);

        LICKITUNG.movesetRanks.put(Moveset.of(ZEN_HEADBUTT, STOMP), MovesetRating.of("D6", "A2"));
        LICKITUNG.movesetRanks.put(Moveset.of(ZEN_HEADBUTT, POWER_WHIP), MovesetRating.of("D5", "F6"));
        LICKITUNG.movesetRanks.put(Moveset.of(LICK, HYPER_BEAM), MovesetRating.of("A1", "C4"));
        LICKITUNG.movesetRanks.put(Moveset.of(LICK, POWER_WHIP), MovesetRating.of("D3", "F5"));
        LICKITUNG.movesetRanks.put(Moveset.of(LICK, STOMP), MovesetRating.of("D4", "A1"));
        LICKITUNG.movesetRanks.put(Moveset.of(ZEN_HEADBUTT, HYPER_BEAM), MovesetRating.of("B2", "C3"));
        LICKITUNG.movesetRanks = Collections.unmodifiableMap(LICKITUNG.movesetRanks);

        KOFFING.movesetRanks.put(Moveset.of(TACKLE, SLUDGE_BOMB), MovesetRating.of("A1", "A1"));
        KOFFING.movesetRanks = Collections.unmodifiableMap(KOFFING.movesetRanks);

        WEEZING.movesetRanks.put(Moveset.of(TACKLE, SLUDGE_BOMB), MovesetRating.of("B2", "A1"));
        WEEZING.movesetRanks.put(Moveset.of(TACKLE, DARK_PULSE), MovesetRating.of("F6", "C3"));
        WEEZING.movesetRanks.put(Moveset.of(ACID, SHADOW_BALL), MovesetRating.of("D4", "C6"));
        WEEZING.movesetRanks.put(Moveset.of(ACID, SLUDGE_BOMB), MovesetRating.of("A1", "B2"));
        WEEZING.movesetRanks.put(Moveset.of(ACID, DARK_PULSE), MovesetRating.of("D3", "C5"));
        WEEZING.movesetRanks.put(Moveset.of(TACKLE, SHADOW_BALL), MovesetRating.of("D5", "C4"));
        WEEZING.movesetRanks = Collections.unmodifiableMap(WEEZING.movesetRanks);

        RHYHORN.movesetRanks.put(Moveset.of(MUD_SLAP, BULLDOZE), MovesetRating.of(null, "A1"));
        RHYHORN.movesetRanks.put(Moveset.of(MUD_SLAP, STOMP), MovesetRating.of("A1", null));
        RHYHORN.movesetRanks = Collections.unmodifiableMap(RHYHORN.movesetRanks);

        RHYDON.movesetRanks.put(Moveset.of(ROCK_SMASH, MEGAHORN), MovesetRating.of("D6", "D6"));
        RHYDON.movesetRanks.put(Moveset.of(ROCK_SMASH, EARTHQUAKE), MovesetRating.of("C3", "B3"));
        RHYDON.movesetRanks.put(Moveset.of(MUD_SLAP, MEGAHORN), MovesetRating.of("C4", "C4"));
        RHYDON.movesetRanks.put(Moveset.of(MUD_SLAP, EARTHQUAKE), MovesetRating.of("A1", "A1"));
        RHYDON.movesetRanks.put(Moveset.of(MUD_SLAP, STONE_EDGE), MovesetRating.of("A2", "A2"));
        RHYDON.movesetRanks.put(Moveset.of(ROCK_SMASH, STONE_EDGE), MovesetRating.of("C5", "C5"));
        RHYDON.movesetRanks = Collections.unmodifiableMap(RHYDON.movesetRanks);

        CHANSEY.movesetRanks.put(Moveset.of(ZEN_HEADBUTT, DAZZLING_GLEAM), MovesetRating.of("F6", "D6"));
        CHANSEY.movesetRanks.put(Moveset.of(POUND, Move.PSYCHIC), MovesetRating.of("B2", "C4"));
        CHANSEY.movesetRanks.put(Moveset.of(POUND, DAZZLING_GLEAM), MovesetRating.of("B3", "D5"));
        CHANSEY.movesetRanks.put(Moveset.of(POUND, HYPER_BEAM), MovesetRating.of("A1", "A1"));
        CHANSEY.movesetRanks.put(Moveset.of(ZEN_HEADBUTT, Move.PSYCHIC), MovesetRating.of("D5", "C3"));
        CHANSEY.movesetRanks.put(Moveset.of(ZEN_HEADBUTT, HYPER_BEAM), MovesetRating.of("C4", "B2"));
        CHANSEY.movesetRanks = Collections.unmodifiableMap(CHANSEY.movesetRanks);

        TANGELA.movesetRanks.put(Moveset.of(VINE_WHIP, SLUDGE_BOMB), MovesetRating.of("C3", "A2"));
        TANGELA.movesetRanks.put(Moveset.of(VINE_WHIP, SOLAR_BEAM), MovesetRating.of("A1", "A1"));
        TANGELA.movesetRanks.put(Moveset.of(VINE_WHIP, POWER_WHIP), MovesetRating.of("B2", "C3"));
        TANGELA.movesetRanks = Collections.unmodifiableMap(TANGELA.movesetRanks);

        KANGASKHAN.movesetRanks.put(Moveset.of(LOW_KICK, STOMP), MovesetRating.of("C6", "B2"));
        KANGASKHAN.movesetRanks.put(Moveset.of(LOW_KICK, EARTHQUAKE), MovesetRating.of("B3", "F6"));
        KANGASKHAN.movesetRanks.put(Moveset.of(MUD_SLAP, BRICK_BREAK), MovesetRating.of("C4", "C3"));
        KANGASKHAN.movesetRanks.put(Moveset.of(LOW_KICK, BRICK_BREAK), MovesetRating.of("C5", "D5"));
        KANGASKHAN.movesetRanks.put(Moveset.of(MUD_SLAP, STOMP), MovesetRating.of("B2", "A1"));
        KANGASKHAN.movesetRanks.put(Moveset.of(MUD_SLAP, EARTHQUAKE), MovesetRating.of("A1", "C4"));
        KANGASKHAN.movesetRanks = Collections.unmodifiableMap(KANGASKHAN.movesetRanks);

        HORSEA.movesetRanks.put(Moveset.of(WATER_GUN, DRAGON_PULSE), MovesetRating.of("A1", null));
        HORSEA.movesetRanks.put(Moveset.of(BUBBLE, FLASH_CANNON), MovesetRating.of(null, "A1"));
        HORSEA.movesetRanks = Collections.unmodifiableMap(HORSEA.movesetRanks);

        SEADRA.movesetRanks.put(Moveset.of(DRAGON_BREATH, HYDRO_PUMP), MovesetRating.of("B2", "B4"));
        SEADRA.movesetRanks.put(Moveset.of(DRAGON_BREATH, DRAGON_PULSE), MovesetRating.of("C6", "A2"));
        SEADRA.movesetRanks.put(Moveset.of(WATER_GUN, DRAGON_PULSE), MovesetRating.of("C4", "A1"));
        SEADRA.movesetRanks.put(Moveset.of(WATER_GUN, HYDRO_PUMP), MovesetRating.of("A1", "B3"));
        SEADRA.movesetRanks.put(Moveset.of(DRAGON_BREATH, BLIZZARD), MovesetRating.of("C5", "C6"));
        SEADRA.movesetRanks.put(Moveset.of(WATER_GUN, BLIZZARD), MovesetRating.of("B3", "B5"));
        SEADRA.movesetRanks = Collections.unmodifiableMap(SEADRA.movesetRanks);

        GOLDEEN.movesetRanks.put(Moveset.of(MUD_SHOT, AQUA_TAIL), MovesetRating.of("A1", null));
        GOLDEEN.movesetRanks.put(Moveset.of(PECK, WATER_PULSE), MovesetRating.of(null, "A1"));
        GOLDEEN.movesetRanks = Collections.unmodifiableMap(GOLDEEN.movesetRanks);

        SEAKING.movesetRanks.put(Moveset.of(POISON_JAB, MEGAHORN), MovesetRating.of("A1", "C3"));
        SEAKING.movesetRanks.put(Moveset.of(POISON_JAB, ICY_WIND), MovesetRating.of("C4", "D6"));
        SEAKING.movesetRanks.put(Moveset.of(PECK, ICY_WIND), MovesetRating.of("F6", "D4"));
        SEAKING.movesetRanks.put(Moveset.of(POISON_JAB, DRILL_RUN), MovesetRating.of("C2", "A1"));
        SEAKING.movesetRanks.put(Moveset.of(PECK, DRILL_RUN), MovesetRating.of("D5", "A2"));
        SEAKING.movesetRanks.put(Moveset.of(PECK, MEGAHORN), MovesetRating.of("C3", "D5"));
        SEAKING.movesetRanks = Collections.unmodifiableMap(SEAKING.movesetRanks);

        STARYU.movesetRanks.put(Moveset.of(WATER_GUN, POWER_GEM), MovesetRating.of("A1", null));
        STARYU.movesetRanks.put(Moveset.of(TACKLE, BUBBLE_BEAM), MovesetRating.of(null, "A1"));
        STARYU.movesetRanks = Collections.unmodifiableMap(STARYU.movesetRanks);

        STARMIE.movesetRanks.put(Moveset.of(WATER_GUN, POWER_GEM), MovesetRating.of("C3", "C6"));
        STARMIE.movesetRanks.put(Moveset.of(TACKLE, Move.PSYCHIC), MovesetRating.of("C5", "A1"));
        STARMIE.movesetRanks.put(Moveset.of(TACKLE, POWER_GEM), MovesetRating.of("F6", "C4"));
        STARMIE.movesetRanks.put(Moveset.of(WATER_GUN, Move.PSYCHIC), MovesetRating.of("A2", "B2"));
        STARMIE.movesetRanks.put(Moveset.of(WATER_GUN, HYDRO_PUMP), MovesetRating.of("A1", "C5"));
        STARMIE.movesetRanks.put(Moveset.of(TACKLE, HYDRO_PUMP), MovesetRating.of("C4", "C3"));
        STARMIE.movesetRanks = Collections.unmodifiableMap(STARMIE.movesetRanks);

        MR_MIME.movesetRanks.put(Moveset.of(CONFUSION, SHADOW_BALL), MovesetRating.of("F6", "B5"));
        MR_MIME.movesetRanks.put(Moveset.of(ZEN_HEADBUTT, PSYBEAM), MovesetRating.of("C4", "A3"));
        MR_MIME.movesetRanks.put(Moveset.of(CONFUSION, PSYBEAM), MovesetRating.of("F5", "A1"));
        MR_MIME.movesetRanks.put(Moveset.of(CONFUSION, Move.PSYCHIC), MovesetRating.of("B2", "A2"));
        MR_MIME.movesetRanks.put(Moveset.of(ZEN_HEADBUTT, Move.PSYCHIC), MovesetRating.of("A1", "A4"));
        MR_MIME.movesetRanks.put(Moveset.of(ZEN_HEADBUTT, SHADOW_BALL), MovesetRating.of("C3", "B6"));
        MR_MIME.movesetRanks = Collections.unmodifiableMap(MR_MIME.movesetRanks);

        SCYTHER.movesetRanks.put(Moveset.of(STEEL_WING, NIGHT_SLASH), MovesetRating.of("F6", "F6"));
        SCYTHER.movesetRanks.put(Moveset.of(FURY_CUTTER, X_SCISSOR), MovesetRating.of("A2", "D4"));
        SCYTHER.movesetRanks.put(Moveset.of(STEEL_WING, X_SCISSOR), MovesetRating.of("B4", "B2"));
        SCYTHER.movesetRanks.put(Moveset.of(STEEL_WING, BUG_BUZZ), MovesetRating.of("B3", "A1"));
        SCYTHER.movesetRanks.put(Moveset.of(FURY_CUTTER, BUG_BUZZ), MovesetRating.of("A1", "C3"));
        SCYTHER.movesetRanks.put(Moveset.of(FURY_CUTTER, NIGHT_SLASH), MovesetRating.of("F5", "F5"));
        SCYTHER.movesetRanks = Collections.unmodifiableMap(SCYTHER.movesetRanks);

        JYNX.movesetRanks.put(Moveset.of(POUND, ICE_PUNCH), MovesetRating.of("B6", "B2"));
        JYNX.movesetRanks.put(Moveset.of(FROST_BREATH, DRAINING_KISS), MovesetRating.of("B3", "F5"));
        JYNX.movesetRanks.put(Moveset.of(FROST_BREATH, ICE_PUNCH), MovesetRating.of("B4", "B3"));
        JYNX.movesetRanks.put(Moveset.of(FROST_BREATH, PSYSHOCK), MovesetRating.of("A2", "B4"));
        JYNX.movesetRanks.put(Moveset.of(POUND, PSYSHOCK), MovesetRating.of("A1", "A1"));
        JYNX.movesetRanks.put(Moveset.of(POUND, DRAINING_KISS), MovesetRating.of("B5", "F6"));
        JYNX.movesetRanks = Collections.unmodifiableMap(JYNX.movesetRanks);

        ELECTABUZZ.movesetRanks.put(Moveset.of(LOW_KICK, THUNDER_PUNCH), MovesetRating.of("C6", "A1"));
        ELECTABUZZ.movesetRanks.put(Moveset.of(THUNDER_SHOCK, THUNDERBOLT), MovesetRating.of("A2", "C4"));
        ELECTABUZZ.movesetRanks.put(Moveset.of(LOW_KICK, THUNDERBOLT), MovesetRating.of("B4", "C3"));
        ELECTABUZZ.movesetRanks.put(Moveset.of(THUNDER_SHOCK, THUNDER_PUNCH), MovesetRating.of("B3", "B2"));
        ELECTABUZZ.movesetRanks.put(Moveset.of(THUNDER_SHOCK, THUNDER), MovesetRating.of("A1", "D6"));
        ELECTABUZZ.movesetRanks.put(Moveset.of(LOW_KICK, THUNDER), MovesetRating.of("B5", "D5"));
        ELECTABUZZ.movesetRanks = Collections.unmodifiableMap(ELECTABUZZ.movesetRanks);

        MAGMAR.movesetRanks.put(Moveset.of(KARATE_CHOP, FIRE_PUNCH), MovesetRating.of("D6", "B3"));
        MAGMAR.movesetRanks.put(Moveset.of(EMBER, FIRE_BLAST), MovesetRating.of("A1", "B4"));
        MAGMAR.movesetRanks.put(Moveset.of(EMBER, FLAMETHROWER), MovesetRating.of("A2", "A2"));
        MAGMAR.movesetRanks.put(Moveset.of(KARATE_CHOP, FIRE_BLAST), MovesetRating.of("C5", "F6"));
        MAGMAR.movesetRanks.put(Moveset.of(EMBER, FIRE_PUNCH), MovesetRating.of("C3", "A1"));
        MAGMAR.movesetRanks.put(Moveset.of(KARATE_CHOP, FLAMETHROWER), MovesetRating.of("C4", "C5"));
        MAGMAR.movesetRanks = Collections.unmodifiableMap(MAGMAR.movesetRanks);

        PINSIR.movesetRanks.put(Moveset.of(FURY_CUTTER, VICE_GRIP), MovesetRating.of("D4", "C4"));
        PINSIR.movesetRanks.put(Moveset.of(FURY_CUTTER, X_SCISSOR), MovesetRating.of("A1", "B2"));
        PINSIR.movesetRanks.put(Moveset.of(FURY_CUTTER, SUBMISSION), MovesetRating.of("D3", "F6"));
        PINSIR.movesetRanks.put(Moveset.of(ROCK_SMASH, X_SCISSOR), MovesetRating.of("C2", "A1"));
        PINSIR.movesetRanks.put(Moveset.of(ROCK_SMASH, SUBMISSION), MovesetRating.of("D5", "D5"));
        PINSIR.movesetRanks.put(Moveset.of(ROCK_SMASH, VICE_GRIP), MovesetRating.of("D6", "B3"));
        PINSIR.movesetRanks = Collections.unmodifiableMap(PINSIR.movesetRanks);

        TAUROS.movesetRanks.put(Moveset.of(ZEN_HEADBUTT, EARTHQUAKE), MovesetRating.of("B2", "B5"));
        TAUROS.movesetRanks.put(Moveset.of(ZEN_HEADBUTT, IRON_HEAD), MovesetRating.of("C6", "B6"));
        TAUROS.movesetRanks.put(Moveset.of(TACKLE, HORN_ATTACK), MovesetRating.of("B4", "A1"));
        TAUROS.movesetRanks.put(Moveset.of(TACKLE, IRON_HEAD), MovesetRating.of("B3", "B4"));
        TAUROS.movesetRanks.put(Moveset.of(ZEN_HEADBUTT, HORN_ATTACK), MovesetRating.of("C5", "A2"));
        TAUROS.movesetRanks.put(Moveset.of(TACKLE, EARTHQUAKE), MovesetRating.of("A1", "B3"));
        TAUROS.movesetRanks = Collections.unmodifiableMap(TAUROS.movesetRanks);

        MAGIKARP.movesetRanks.put(Moveset.of(SPLASH, STRUGGLE), MovesetRating.of("A1", "A1"));
        MAGIKARP.movesetRanks = Collections.unmodifiableMap(MAGIKARP.movesetRanks);

        GYARADOS.movesetRanks.put(Moveset.of(DRAGON_BREATH, HYDRO_PUMP), MovesetRating.of("A2", "B2"));
        GYARADOS.movesetRanks.put(Moveset.of(BITE, HYDRO_PUMP), MovesetRating.of("A1", "C5"));
        GYARADOS.movesetRanks.put(Moveset.of(BITE, DRAGON_PULSE), MovesetRating.of("B4", "B4"));
        GYARADOS.movesetRanks.put(Moveset.of(BITE, TWISTER), MovesetRating.of("D5", "C6"));
        GYARADOS.movesetRanks.put(Moveset.of(DRAGON_BREATH, DRAGON_PULSE), MovesetRating.of("A3", "A1"));
        GYARADOS.movesetRanks.put(Moveset.of(DRAGON_BREATH, TWISTER), MovesetRating.of("D6", "B3"));
        GYARADOS.movesetRanks = Collections.unmodifiableMap(GYARADOS.movesetRanks);

        LAPRAS.movesetRanks.put(Moveset.of(ICE_SHARD, DRAGON_PULSE), MovesetRating.of("C6", "B4"));
        LAPRAS.movesetRanks.put(Moveset.of(ICE_SHARD, ICE_BEAM), MovesetRating.of("B4", "A1"));
        LAPRAS.movesetRanks.put(Moveset.of(FROST_BREATH, ICE_BEAM), MovesetRating.of("A2", "B3"));
        LAPRAS.movesetRanks.put(Moveset.of(ICE_SHARD, BLIZZARD), MovesetRating.of("B3", "A2"));
        LAPRAS.movesetRanks.put(Moveset.of(FROST_BREATH, DRAGON_PULSE), MovesetRating.of("C5", "C6"));
        LAPRAS.movesetRanks.put(Moveset.of(FROST_BREATH, BLIZZARD), MovesetRating.of("A1", "C5"));
        LAPRAS.movesetRanks = Collections.unmodifiableMap(LAPRAS.movesetRanks);

        DITTO.movesetRanks.put(Moveset.of(POUND, STRUGGLE), MovesetRating.of("A1", "A1"));
        DITTO.movesetRanks = Collections.unmodifiableMap(DITTO.movesetRanks);

        EEVEE.movesetRanks.put(Moveset.of(TACKLE, BODY_SLAM), MovesetRating.of("A1", null));
        EEVEE.movesetRanks.put(Moveset.of(TACKLE, DIG), MovesetRating.of(null, "A1"));
        EEVEE.movesetRanks = Collections.unmodifiableMap(EEVEE.movesetRanks);

        VAPOREON.movesetRanks.put(Moveset.of(WATER_GUN, HYDRO_PUMP), MovesetRating.of("A1", "C3"));
        VAPOREON.movesetRanks.put(Moveset.of(WATER_GUN, WATER_PULSE), MovesetRating.of("D3", "A1"));
        VAPOREON.movesetRanks.put(Moveset.of(WATER_GUN, AQUA_TAIL), MovesetRating.of("A2", "B2"));
        VAPOREON.movesetRanks = Collections.unmodifiableMap(VAPOREON.movesetRanks);

        JOLTEON.movesetRanks.put(Moveset.of(THUNDER_SHOCK, THUNDERBOLT), MovesetRating.of("A1", "A1"));
        JOLTEON.movesetRanks.put(Moveset.of(THUNDER_SHOCK, DISCHARGE), MovesetRating.of("D3", "A2"));
        JOLTEON.movesetRanks.put(Moveset.of(THUNDER_SHOCK, THUNDER), MovesetRating.of("A2", "C3"));
        JOLTEON.movesetRanks = Collections.unmodifiableMap(JOLTEON.movesetRanks);

        FLAREON.movesetRanks.put(Moveset.of(EMBER, FIRE_BLAST), MovesetRating.of("A1", "B2"));
        FLAREON.movesetRanks.put(Moveset.of(EMBER, HEAT_WAVE), MovesetRating.of("B3", "C3"));
        FLAREON.movesetRanks.put(Moveset.of(EMBER, FLAMETHROWER), MovesetRating.of("B2", "A1"));
        FLAREON.movesetRanks = Collections.unmodifiableMap(FLAREON.movesetRanks);

        PORYGON.movesetRanks.put(Moveset.of(TACKLE, DISCHARGE), MovesetRating.of("A2", "A3"));
        PORYGON.movesetRanks.put(Moveset.of(ZEN_HEADBUTT, PSYBEAM), MovesetRating.of("B5", "A4"));
        PORYGON.movesetRanks.put(Moveset.of(ZEN_HEADBUTT, SIGNAL_BEAM), MovesetRating.of("B6", "A5"));
        PORYGON.movesetRanks.put(Moveset.of(TACKLE, SIGNAL_BEAM), MovesetRating.of("A1", "A1"));
        PORYGON.movesetRanks.put(Moveset.of(ZEN_HEADBUTT, DISCHARGE), MovesetRating.of("B4", "B6"));
        PORYGON.movesetRanks.put(Moveset.of(TACKLE, PSYBEAM), MovesetRating.of("A3", "A2"));
        PORYGON.movesetRanks = Collections.unmodifiableMap(PORYGON.movesetRanks);

        OMANYTE.movesetRanks.put(Moveset.of(WATER_GUN, ANCIENT_POWER), MovesetRating.of(null, "A1"));
        OMANYTE.movesetRanks.put(Moveset.of(WATER_GUN, BRINE), MovesetRating.of("A1", null));
        OMANYTE.movesetRanks = Collections.unmodifiableMap(OMANYTE.movesetRanks);

        OMASTAR.movesetRanks.put(Moveset.of(WATER_GUN, ROCK_SLIDE), MovesetRating.of("C5", "B3"));
        OMASTAR.movesetRanks.put(Moveset.of(MUD_SHOT, ROCK_SLIDE), MovesetRating.of("D6", "C4"));
        OMASTAR.movesetRanks.put(Moveset.of(ROCK_THROW, ANCIENT_POWER), MovesetRating.of("D8", "B2"));
        OMASTAR.movesetRanks.put(Moveset.of(WATER_GUN, ANCIENT_POWER), MovesetRating.of("D7", "C5"));
        OMASTAR.movesetRanks.put(Moveset.of(ROCK_THROW, ROCK_SLIDE), MovesetRating.of("B2", "A1"));
        OMASTAR.movesetRanks.put(Moveset.of(WATER_GUN, HYDRO_PUMP), MovesetRating.of("A1", "F9"));
        OMASTAR.movesetRanks.put(Moveset.of(MUD_SHOT, ANCIENT_POWER), MovesetRating.of("F9", "D7"));
        OMASTAR.movesetRanks.put(Moveset.of(MUD_SHOT, HYDRO_PUMP), MovesetRating.of("C4", "F8"));
        OMASTAR.movesetRanks.put(Moveset.of(ROCK_THROW, HYDRO_PUMP), MovesetRating.of("B3", "C6"));
        OMASTAR.movesetRanks = Collections.unmodifiableMap(OMASTAR.movesetRanks);

        KABUTO.movesetRanks.put(Moveset.of(SCRATCH, AQUA_JET), MovesetRating.of("A1", null));
        KABUTO.movesetRanks.put(Moveset.of(SCRATCH, ANCIENT_POWER), MovesetRating.of(null, "A1"));
        KABUTO.movesetRanks = Collections.unmodifiableMap(KABUTO.movesetRanks);

        KABUTOPS.movesetRanks.put(Moveset.of(MUD_SHOT, WATER_PULSE), MovesetRating.of("C5", "A2"));
        KABUTOPS.movesetRanks.put(Moveset.of(FURY_CUTTER, WATER_PULSE), MovesetRating.of("C3", "A1"));
        KABUTOPS.movesetRanks.put(Moveset.of(MUD_SHOT, STONE_EDGE), MovesetRating.of("A1", "F6"));
        KABUTOPS.movesetRanks.put(Moveset.of(FURY_CUTTER, ANCIENT_POWER), MovesetRating.of("D6", "B3"));
        KABUTOPS.movesetRanks.put(Moveset.of(FURY_CUTTER, STONE_EDGE), MovesetRating.of("B2", "F5"));
        KABUTOPS.movesetRanks.put(Moveset.of(MUD_SHOT, ANCIENT_POWER), MovesetRating.of("C4", "B4"));
        KABUTOPS.movesetRanks = Collections.unmodifiableMap(KABUTOPS.movesetRanks);

        AERODACTYL.movesetRanks.put(Moveset.of(BITE, IRON_HEAD), MovesetRating.of("C4", "D6"));
        AERODACTYL.movesetRanks.put(Moveset.of(STEEL_WING, IRON_HEAD), MovesetRating.of("D5", "C4"));
        AERODACTYL.movesetRanks.put(Moveset.of(BITE, ANCIENT_POWER), MovesetRating.of("C3", "B2"));
        AERODACTYL.movesetRanks.put(Moveset.of(STEEL_WING, ANCIENT_POWER), MovesetRating.of("F6", "A1"));
        AERODACTYL.movesetRanks.put(Moveset.of(STEEL_WING, HYPER_BEAM), MovesetRating.of("B2", "B3"));
        AERODACTYL.movesetRanks.put(Moveset.of(BITE, HYPER_BEAM), MovesetRating.of("A1", "D5"));
        AERODACTYL.movesetRanks = Collections.unmodifiableMap(AERODACTYL.movesetRanks);

        SNORLAX.movesetRanks.put(Moveset.of(LICK, BODY_SLAM), MovesetRating.of("A2", "C4"));
        SNORLAX.movesetRanks.put(Moveset.of(ZEN_HEADBUTT, EARTHQUAKE), MovesetRating.of("C6", "C5"));
        SNORLAX.movesetRanks.put(Moveset.of(ZEN_HEADBUTT, BODY_SLAM), MovesetRating.of("B4", "A2"));
        SNORLAX.movesetRanks.put(Moveset.of(LICK, HYPER_BEAM), MovesetRating.of("A1", "B3"));
        SNORLAX.movesetRanks.put(Moveset.of(LICK, EARTHQUAKE), MovesetRating.of("C5", "D6"));
        SNORLAX.movesetRanks.put(Moveset.of(ZEN_HEADBUTT, HYPER_BEAM), MovesetRating.of("A3", "A1"));
        SNORLAX.movesetRanks = Collections.unmodifiableMap(SNORLAX.movesetRanks);

        ARTICUNO.movesetRanks.put(Moveset.of(FROST_BREATH, BLIZZARD), MovesetRating.of("A1", null));
        ARTICUNO.movesetRanks.put(Moveset.of(FROST_BREATH, ICE_BEAM), MovesetRating.of(null, "A1"));
        ARTICUNO.movesetRanks = Collections.unmodifiableMap(ARTICUNO.movesetRanks);

        ZAPDOS.movesetRanks.put(Moveset.of(THUNDER_SHOCK, THUNDER), MovesetRating.of("A1", null));
        ZAPDOS.movesetRanks.put(Moveset.of(THUNDER_SHOCK, THUNDERBOLT), MovesetRating.of(null, "A1"));
        ZAPDOS.movesetRanks = Collections.unmodifiableMap(ZAPDOS.movesetRanks);

        MOLTRES.movesetRanks.put(Moveset.of(EMBER, FIRE_BLAST), MovesetRating.of("A1", null));
        MOLTRES.movesetRanks.put(Moveset.of(EMBER, FLAMETHROWER), MovesetRating.of(null, "A1"));
        MOLTRES.movesetRanks = Collections.unmodifiableMap(MOLTRES.movesetRanks);

        DRATINI.movesetRanks.put(Moveset.of(DRAGON_BREATH, AQUA_TAIL), MovesetRating.of("A1", null));
        DRATINI.movesetRanks.put(Moveset.of(DRAGON_BREATH, TWISTER), MovesetRating.of(null, "A1"));
        DRATINI.movesetRanks = Collections.unmodifiableMap(DRATINI.movesetRanks);

        DRAGONAIR.movesetRanks.put(Moveset.of(DRAGON_BREATH, DRAGON_PULSE), MovesetRating.of("A1", "A1"));
        DRAGONAIR.movesetRanks = Collections.unmodifiableMap(DRAGONAIR.movesetRanks);

        DRAGONITE.movesetRanks.put(Moveset.of(STEEL_WING, HYPER_BEAM), MovesetRating.of("D6", "B2"));
        DRAGONITE.movesetRanks.put(Moveset.of(DRAGON_BREATH, DRAGON_PULSE), MovesetRating.of("B2", "B4"));
        DRAGONITE.movesetRanks.put(Moveset.of(DRAGON_BREATH, DRAGON_CLAW), MovesetRating.of("A1", "C6"));
        DRAGONITE.movesetRanks.put(Moveset.of(DRAGON_BREATH, HYPER_BEAM), MovesetRating.of("B3", "C5"));
        DRAGONITE.movesetRanks.put(Moveset.of(STEEL_WING, DRAGON_PULSE), MovesetRating.of("C5", "A1"));
        DRAGONITE.movesetRanks.put(Moveset.of(STEEL_WING, DRAGON_CLAW), MovesetRating.of("C4", "B3"));
        DRAGONITE.movesetRanks = Collections.unmodifiableMap(DRAGONITE.movesetRanks);

        MEWTWO.movesetRanks.put(Moveset.of(PSYCHO_CUT, Move.PSYCHIC), MovesetRating.of("A1", null));
        MEWTWO.movesetRanks.put(Moveset.of(CONFUSION, Move.PSYCHIC), MovesetRating.of(null, "A1"));
        MEWTWO.movesetRanks = Collections.unmodifiableMap(MEWTWO.movesetRanks);

        MEW.movesetRanks.put(Moveset.of(POUND, Move.PSYCHIC), MovesetRating.of("A1", "A1"));
        MEW.movesetRanks = Collections.unmodifiableMap(MEW.movesetRanks);
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
