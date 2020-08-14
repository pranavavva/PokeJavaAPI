package io.github.pranavavva.pokejava.api;

import java.io.Serializable;

public abstract class Pokemon implements Serializable {
    
    private static final long serialVersionUID = -6852096195746600870L;

    private final String name;
    private final Type type;
    private final int health;
    private final int attack;
    private final int defense;
    private final int spAttack;
    private final int spDefense;
    private final int speed;
    private final Move move1;
    private final Move move2;
    private final Move move3;
    private final Move move4;

    public Pokemon(String name, Type type, int health, int attack, int defense, int spAttack, int spDefense, int speed,
            Move move1, Move move2, Move move3, Move move4) {
        this.name = name;
        this.type = type;
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

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public int getHealth() {
        return health;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public int getSpAttack() {
        return spAttack;
    }

    public int getSpDefense() {
        return spDefense;
    }

    public int getSpeed() {
        return speed;
    }

    public Move getMove1() {
        return move1;
    }

    public Move getMove2() {
        return move2;
    }

    public Move getMove3() {
        return move3;
    }

    public Move getMove4() {
        return move4;
    }

    
}