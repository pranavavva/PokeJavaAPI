package io.github.pranavavva.pokejava.api;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import org.mockito.Mockito;

public class PokemonTest {

    private Move testMove = Mockito.mock(Move.class,
            Mockito.withSettings().useConstructor("Test move", Type.NORMAL, MoveCategory.PHYSICAL, 100, 100, 1.0)
                    .defaultAnswer(Mockito.CALLS_REAL_METHODS));

    private Pokemon testPokemon = Mockito
            .mock(Pokemon.class,
                    Mockito.withSettings().useConstructor("Test Pokemon", Type.NORMAL, Type.BUG, 100, 100, 100, 100,
                            100, 100, testMove, testMove, testMove, testMove)
                            .defaultAnswer(Mockito.CALLS_REAL_METHODS));

    @Test
    public void testGetName() {
        assertEquals("Test Pokemon", testPokemon.getName());
    }

    @Test
    public void testGetType1() {
        assertEquals(Type.NORMAL, testPokemon.getType1());
    }

    @Test
    public void testGetType2() {
        assertEquals(Type.BUG, testPokemon.getType2());
    }

    @Test
    public void testGetHealth() {
        assertEquals(100, testPokemon.getHealth());
    }

    @Test
    public void testSetHealth() {
        testPokemon.setHealth(50);
        assertEquals(50, testPokemon.getHealth());
    }

    @Test
    public void testGetAttack() {
        assertEquals(100, testPokemon.getAttack());
    }

    @Test
    public void testGetDefense() {
        assertEquals(100, testPokemon.getDefense());
    }

    @Test
    public void testGetSpAttack() {
        assertEquals(100, testPokemon.getSpAttack());
    }

    @Test
    public void testGetSpDefense() {
        assertEquals(100, testPokemon.getSpDefense());
    }

    @Test
    public void testGetSpeed() {
        assertEquals(100, testPokemon.getSpeed());
    }

    @Test
    public void testGetMove1() {
        assertEquals(testMove, testPokemon.getMove1());
    }

    @Test
    public void testGetMove2() {
        assertEquals(testMove, testPokemon.getMove2());
    }

    @Test
    public void testGetMove3() {
        assertEquals(testMove, testPokemon.getMove3());
    }

    @Test
    public void testGetMove4() {
        assertEquals(testMove, testPokemon.getMove4());
    }
}