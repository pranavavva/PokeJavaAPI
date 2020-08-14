package io.github.pranavavva.pokejava.api;

import java.io.Serializable;

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

    public String getName() {
        return this.name;
    }

    public Type getType1() {
        return this.type1;
    }

    public Type getType2() {
        return this.type2;
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttack() {
        return this.attack;
    }

    public int getDefense() {
        return this.defense;
    }

    public int getSpAttack() {
        return this.spAttack;
    }

    public int getSpDefense() {
        return this.spDefense;
    }

    public int getSpeed() {
        return this.speed;
    }

    public Move getMove1() {
        return this.move1;
    }

    public Move getMove2() {
        return this.move2;
    }

    public Move getMove3() {
        return this.move3;
    }

    public Move getMove4() {
        return this.move4;
    }

}