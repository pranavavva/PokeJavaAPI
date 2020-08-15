package io.github.pranavavva.pokejavaapi;

import java.io.Serializable;

/**
 * The Pokemon abstract class provides a foundation for Type-specific Pokemon
 * concrete classes.
 * 
 * Pokemon can have one or two Types. {@code type1} will never be null, whereas
 * {@code type2} may be null if the Pokemon only has one Type.
 * 
 * The fields, {@code health}, {@code attack}, {@code defense},
 * {@code spAttack}, spDefense, and {@code speed} are used in battle. The values
 * in a Pokemon object represent the "base" stat at Pokemon Lvl. 100. These base
 * stats can have modifiers applied to them (for example, as a by-product of
 * Moves, Abilities, or Items), however the value in the class itself may never
 * be directly changed. The effect of modifiers are accounted for in the damage
 * calculation equation.
 * 
 * The {@code attack} and {@code defense} fields are used in calcultaing damage
 * caused MoveCategory.PHYSICAL moves. {@code spAttack} and {@code spDefense}
 * are used in calculating damage caused by MoveCategory.SPECIAL moves.
 * {@code speed} is used in determining which Pokemon uses their chosen Move
 * first in a turn.
 * 
 * NOTE: Some moves may be listed as Type.PHYSICAL but may actually cause damage
 * using special stats.
 * 
 * The fields {@code move1}, {@code move2}, {@code move3}, and {@code move4}
 * contain references to the Moves the Pokemon knows and can use in battle.
 * Currently, these fields hold the actual move object, however in the future,
 * it may hold a database ID number to the Move it references, to better
 * facilitate storing Pokemon and Moves in a database.
 * 
 * @see Type
 * @see Move
 * @see MoveCategory
 */
public abstract class Pokemon implements Serializable {

    private static final long serialVersionUID = -6852096195746600870L;

    private final String name;
    private final Type type1;
    private final Type type2;
    private int health;
    private final int attack;
    private final int defense;
    private final int spAttack;
    private final int spDefense;
    private final int speed;
    private final Move move1;
    private final Move move2;
    private final Move move3;
    private final Move move4;

    /**
     * The Pokemon object constructor requires all 13 fields to be known in advance.
     * At this point in time, the constructor accepts the actual Move object for
     * {@code move1}, {@code move2}, {@code move3}, and {@code move4}, however in
     * the future, it will change to accept a database ID number to better
     * facilitate storing Pokemon and Moves in a database. This version of the
     * Pokemon constructor requries the actual Move object as an argument. A future
     * constructor will accept database references for the Moves.
     * 
     * The battle stats for the Pokemon ({@code health}, {@code attack},
     * {@code defense}, {@code spAttack}, {@code spDefense}, and {@code speed}) are
     * the corresponding values of the in-game Pokemon at Lvl. 100. This information
     * must be taken from Bulbapedia.
     * 
     * @param name      The name of the Pokemon
     * @param type1     The first (or main) Type of the Pokemon. This field may not
     *                  be null.
     * @param type2     The second Type of the Pokemon. If the Pokemon has only one
     *                  Type, this field may be null.
     * @param health    The health (HP) of the Pokemon at Lvl. 100.
     * @param attack    The physical attack stat of the Pokemon at Lvl. 100. This is
     *                  used to determine damage dealt by a MoveCategory.PHYSICAL
     *                  Move.
     * @param defense   The physical defense stat of the Pokemon at Lvl. 100. This
     *                  is used to determine damage received by a
     *                  MoveCategory.DEFENSE Move.
     * @param spAttack  The special attack stat of the Pokemon at Lvl. 100. This is
     *                  used to determine damage dealt by a MoveCategory.SPECIAL
     *                  Move.
     * @param spDefense The special defense stat of the Pokemon at Lvl. 100. This is
     *                  used to determine damage received by a MoveCategory.SPECIAL
     *                  Move.
     * @param speed     The speed of the Pokemon at Lvl. 100. This is only used to
     *                  determine which Pokemon moves first in a battle turn. While
     *                  speed can be affected by Moves and/or Items, it doesn't
     *                  affect the damage dealt or received.
     * @param move1     The first Move the Pokemon knows.
     * @param move2     The second Move the Pokemon knows.
     * @param move3     The third Move the Pokemon knows.
     * @param move4     The fourth Move the Pokemon knows.
     */
    public Pokemon(String name, Type type1, Type type2, int health, int attack, int defense, int spAttack,
            int spDefense, int speed, Move move1, Move move2, Move move3, Move move4) {
        this.name = name;
        this.type1 = type1;
        this.type2 = type2;
        this.health = health;
        this.attack = attack;
        this.defense = defense;
        this.spAttack = spAttack;
        this.spDefense = spDefense;
        this.speed = speed;
        this.move1 = move1;
        this.move2 = move2;
        this.move3 = move3;
        this.move4 = move4;
    }

    /**
     * Returns the name of the Pokemon.
     * 
     * @return The name of the Pokemon.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Returns the primary (first) Type of the Pokemon. All Pokemon have one or two
     * Types. This field will never be null.
     * 
     * @return The primary Type of the Pokemon. This field will never be null.
     */
    public Type getType1() {
        return this.type1;
    }

    /**
     * Returns the secondary Type of the Pokemon. Some Pokemon have a second Type,
     * while others do not. This field may be null if the Pokmeon does not have a
     * second Type.
     * 
     * @return The secondary Type of the Pokemon, if it exists, or null otherwise.
     */
    public Type getType2() {
        return this.type2;
    }

    /**
     * Returns the current health of the Pokemon. In battle, the Pokmeon is
     * considered "knocked-out" (defeated) when its health is zero.
     * 
     * @return The current health (HP) of the Pokemon.
     */
    public int getHealth() {
        return this.health;
    }

    /**
     * Changes the health (HP) of the Pokemon. Used after damage calculation.
     * 
     * @param health The new health of the Pokemon
     */
    public void setHealth(int health) {
        this.health = health;
    }

    /**
     * Returns the base physical attack stat of the Pokemon. This value is used in
     * determining damage dealt by a MoveCategory.PHYSICAL Move.
     * 
     * @return The physical attack stat of the Pokemon.
     */
    public int getAttack() {
        return this.attack;
    }

    /**
     * Returns the base physical defense stat of the Pokemon. This value is used in
     * determining the damage received by a MoveCategory.PHYSICAL Move.
     * 
     * @return The physical defense stat of the Pokemon.
     */
    public int getDefense() {
        return this.defense;
    }

    /**
     * Returns the base special attack stat of the Pokemon. This value is used in
     * determining damage dealt by a MoveCategory.SPECIAL Move.
     * 
     * @return The special attack stat of the Pokemon.
     */
    public int getSpAttack() {
        return this.spAttack;
    }

    /**
     * Returns the base special defense stat of the Pokemon. This value is used in
     * determining the damage received by a MoveCategory.SPECIAL Move.
     * 
     * @return The special defense stat of the Pokemon.
     */
    public int getSpDefense() {
        return this.spDefense;
    }

    /**
     * Returns the base speed f the Pokemon. This field is only used to determine
     * which Pokemon moves first in a battle turn. It has no effect on damage dealt
     * or received.
     * 
     * @return The speed of the Pokemon.
     */
    public int getSpeed() {
        return this.speed;
    }

    /**
     * Provides a direct object reference to the "first" move the Pokemon knows.
     * 
     * @return The Move in the first slot.
     */
    public Move getMove1() {
        return this.move1;
    }

    /**
     * Provides a direct object reference to the "second" move the Pokemon knows.
     * 
     * @return The Move in the second slot.
     */
    public Move getMove2() {
        return this.move2;
    }

    /**
     * Provides a direct object reference to the "third" move the Pokemon knows.
     * 
     * @return The Move in the third slot.
     */
    public Move getMove3() {
        return this.move3;
    }

    /**
     * Provides a direct object reference to the "fourth" move the Pokemon knows.
     * 
     * @return The Move in the fourth slot.
     */
    public Move getMove4() {
        return this.move4;
    }

}