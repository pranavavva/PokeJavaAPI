package io.github.pranavavva.pokejava.api;

/**
 * Defines the combat type of a Pokemon or Move. Pokemon can have one or two
 * Types, whereas Moves only have one Type. Type is used to determine attack
 * damage, Pokemon whose Type(s) are resistant to an attacking Move's Type
 * receive less damage than normal. Pokemon whose Type(s) are weak to an
 * attacking Move's Type receive more damage than normal. When attacking, a Move
 * used by a Pokemon who has a matching Type deals more damage.
 * 
 * @see Pokemon
 * @see Move
 */
public enum Type {
    NORMAL, FIGHT, FLYING, POISON, GROUND, ROCK, BUG, GHOST, STEEL, FIRE, WATER, GRASS, ELECTRIC, PSYCHIC, ICE, DRAGON,
    DARK, FAIRY;
}