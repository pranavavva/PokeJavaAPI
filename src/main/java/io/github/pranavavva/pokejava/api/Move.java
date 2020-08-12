package io.github.pranavavva.pokejava.api;

import java.io.Serializable;

public abstract class Move implements Serializable {

    private static final long serialVersionUID = 7292957301741555073L;

    private final String name; // Name of the move
    private final Type type; // Type of the move
    private final MoveCategory category; // Move category (physics, special, status)
    private final int points; // Number of uses a move has
    private final int power; // Power value of the move
    private final double accuracy; // Chance that a move will succeed

    public Move(String name, Type type, MoveCategory category, int points, int power, double accuracy) {
        this.name = name;
        this.type = type;
        this.category = category;
        this.points = points;
        this.power = power;
        this.accuracy = accuracy;
    }

    public String getName() {
        return this.name;
    }

    public Type getType() {
        return this.type;
    }

    public MoveCategory getCategory() {
        return this.category;
    }

    public int getPoints() {
        return this.points;
    }

    public int getPower() {
        return this.power;
    }

    public double getAccuracy() {
        return this.accuracy;
    }
    
}