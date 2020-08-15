package io.github.pranavavva.pokejavaapi;

/**
 * Determines which set of stats are used in damage calculation. PHYSICAL Moves
 * use the {@code attack} and {@code defense} stats of the Pokemon. SPECIAL
 * Moves use the {@code spAttack} and {@code spDefense} stats of the Pokemon.
 * STATUS Moves do not inflict damage, but they may impart a status effect.
 */
public enum MoveCategory {
    /**
     * PHYSICAL Moves use the {@code attack} and {@code defense} stats of the
     * Pokemon.
     */
    PHYSICAL,

    /**
     * SPECIAL Moves use the {@code spAttack} and {@code spDefense} stats of the
     * Pokemon.
     */
    SPECIAL,
    
    /**
     * STATUS Moves do not inflict damage, but they may impart a status effect.
     */
    STATUS;
}