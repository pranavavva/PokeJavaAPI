package io.github.pranavavva.pokejavaapi;

import java.io.Serializable;

/**
 * The Move abstract class provides a foundation for concrete Move classes.
 * 
 * All Moves have one and only one Type. All Moves additionally have a
 * MoveCategory which determines whether a Pokemon deals/receives PHYSICAL
 * damage, SPECIAL damage, or if the Move imparts a STATUS effect.
 * 
 * NOTE: Some moves may be listed as Type.PHYSICAL but may actually cause damage
 * using special stats.
 * 
 * {@code points} refers to the number of times a Move can be used in battle
 * (referred to as PP or Power Points). {@code power} refers to the damage power
 * of the Move. Moves that impart a status effect only will have a {@code power}
 * of zero. {@code accuracy} refers to the chance that a Move will succeed.
 * 
 * Move field values will never be directly updated. Modifier effects (from
 * Moves, Abilities, Items) are accounted for in the damage calculation
 * equation.
 * 
 * @author Pranav Avva
 * @see Pokemon
 * @see MoveCategory
 * @see Type
 */
public abstract class Move implements Serializable {

    private static final long serialVersionUID = 7292957301741555073L;

    private final String name;
    private final Type type;
    private final MoveCategory category;
    private final int points;
    private final int power;
    private final double accuracy;

    /**
     * The Move object constructor requires all 6 field values to be known in
     * advance. In the future, Moves will have an auto-generated database reference
     * ID to facilitate the storage of Moves in a database.
     */
    public Move(String name, Type type, MoveCategory category, int points, int power, double accuracy) {
        this.name = name;
        this.type = type;
        this.category = category;
        this.points = points;
        this.power = power;
        this.accuracy = accuracy;
    }

    /**
     * Returns the name of the Move
     * 
     * @return the name of the Move
     */
    public String getName() {
        return this.name;
    }

    /**
     * Returns the Type of the Move
     * 
     * @return the Type of the Move
     */
    public Type getType() {
        return this.type;
    }

    /**
     * Returns the MoveCategory of the Move. This will determine whether the
     * PHYSICAL or SPECIAL battle stats of the Pokemon are used in damage
     * calculation. STATUS moves will not impart damage, but they may impart a
     * status effect.
     * 
     * @return the MoveCategory of the Move
     */
    public MoveCategory getCategory() {
        return this.category;
    }

    /**
     * Returns the Power Points available for the Move. Power Points are the number
     * of uses a Move has in battle.
     * 
     * @return the number of uses in battle for the Move
     */
    public int getPoints() {
        return this.points;
    }

    /**
     * Returns the power (attacking strength of the Move). This is not the actual
     * amount of damage done, but it is a relative measure of how much damage moves
     * used by the same exact Pokemon will do. Various factors are taken into how
     * much damage is done, including the Types of both Pokemon, status effects, and
     * Abilities.
     * 
     * @return the power of the Move
     */
    public int getPower() {
        return this.power;
    }

    /**
     * Returns the accuracy of the Move. This does not determine how much damage is
     * done, but whether or not the move succeeds. A Move with an accuracy of 0.6
     * will succeed 60% of the time. A Move with an accuracy of 1.0 will always suceed.
     * 
     * @return the accuracy of the Move
     */
    public double getAccuracy() {
        return this.accuracy;
    }

}